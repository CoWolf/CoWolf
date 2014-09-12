/*******************************************************************************
 * Copyright (c) 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.dsl.uml2.design.services;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.business.api.helper.graphicalfilters.HideFilterHelper;
import org.eclipse.sirius.diagram.business.api.query.DDiagramElementQuery;
import org.eclipse.sirius.diagram.business.internal.helper.task.operations.CreateViewTask;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DNodeContainerSpec;
import org.eclipse.sirius.diagram.description.AbstractNodeMapping;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.diagram.description.tool.CreateView;
import org.eclipse.sirius.diagram.description.tool.ToolFactory;
import org.eclipse.sirius.ecore.extender.business.api.accessor.ModelAccessor;
import org.eclipse.sirius.ecore.extender.business.api.accessor.exception.FeatureNotFoundException;
import org.eclipse.sirius.ecore.extender.business.api.accessor.exception.MetaClassNotFoundException;
import org.eclipse.sirius.tools.api.command.CommandContext;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UseCase;
import org.obeonetwork.dsl.uml2.design.UMLDesignerPlugin;
import org.obeonetwork.dsl.uml2.design.ui.wizards.newmodel.Messages;

import com.google.common.collect.Lists;

/**
 * Services to handle UI concerns.
 * 
 * @author Stephane Thibaudeau <a href="mailto:stephane.thibaudeau@obeo.fr">stephane .thibaudeau@obeo.fr</a>
 * @author Melanie Bats <a href="mailto:melanie.bats@obeo.fr">melanie.bats@obeo.fr</a>
 */
public class UIServices {

	/**
	 * Refresh a representation. This service has been created to handle a bug on the generic tool : the force
	 * refresh option does not work as expected
	 * 
	 * @param representation
	 *            Representation to be refreshed
	 * @return the specified representation
	 */
	public DRepresentation refreshDiagram(DRepresentation representation) {
		DialectManager.INSTANCE.refresh(representation, new NullProgressMonitor());
		return representation;
	}

	/**
	 * Paste a semantic element and create the corresponding view in the given container
	 * 
	 * @param container
	 *            Semantic container
	 * @param semanticElement
	 *            Element to paste
	 * @param containerView
	 *            Container view
	 */
	public void paste(final Element container, final Element semanticElement,
			final DSemanticDecorator elementView, final DSemanticDecorator containerView) {
		// Paste the semantic element from the clipboard to the selected
		// container
		final Session session = SessionManager.INSTANCE.getSession(container);
		TransactionalEditingDomain domain = session.getTransactionalEditingDomain();
		// The feature is set to null because the domain will deduce it
		Command cmd = AddCommand.create(domain, container, null, semanticElement);
		if (cmd.canExecute()) {
			cmd.execute();
		}
		// Mark for auto size
		markForAutosize(semanticElement);
		// Create the view for the pasted element
		createView(semanticElement, containerView, session, "containerView");
	}

	/**
	 * Drop a semantic element and create the corresponding view in the given container
	 * 
	 * @param newContainer
	 *            Semantic container
	 * @param semanticElement
	 *            Element to drop
	 * @param containerView
	 *            Container view
	 * @param moveSemanticElement
	 *            True to move the dropped semantic element or false to just show the element on a diagram
	 */
	private void drop(final Element newContainer, final Element semanticElement,
			final DSemanticDecorator containerView, boolean moveSemanticElement) {
		final Session session = SessionManager.INSTANCE.getSession(newContainer);
		Element oldContainer = semanticElement.getOwner();
		if (moveSemanticElement && oldContainer != newContainer) {
			// Move the semantic element to the selected container
			TransactionalEditingDomain domain = session.getTransactionalEditingDomain();
			// The feature is set to null because the domain will deduce it
			Command cmd = AddCommand.create(domain, newContainer, null, semanticElement);
			if (cmd.canExecute()) {
				cmd.execute();
			}
			cmd = RemoveCommand.create(domain, oldContainer, null, semanticElement);
			if (cmd.canExecute()) {
				cmd.execute();
			}

			if (semanticElement instanceof UseCase) {
				// Reset the current element as subject
				cmd = SetCommand.create(domain, semanticElement, UMLPackage.Literals.USE_CASE__SUBJECT,
						SetCommand.UNSET_VALUE);
				if (cmd.canExecute()) {
					cmd.execute();
				}
				List<Element> subjects = new ArrayList<Element>();
				subjects.add(newContainer);
				cmd = SetCommand.create(domain, semanticElement, UMLPackage.Literals.USE_CASE__SUBJECT,
						subjects);
				if (cmd.canExecute()) {
					cmd.execute();
				}
			}
		}

		// Show the semantic element on the diagram
		showView(semanticElement, containerView, session, "newContainerView");
	}

	/**
	 * Show the given semantic element on the diagram. If the element already exists but is hidden juste
	 * reveal it, otherwise create a new view.
	 * 
	 * @param semanticElement
	 *            Semantic element
	 * @param containerView
	 *            Container view
	 * @param session
	 *            Session
	 */
	private void showView(final EObject semanticElement, final DSemanticDecorator containerView,
			final Session session, String containerViewVariable) {
		// Check if the dropped element already exists in the diagram but is hidden
		List<DDiagramElement> hiddenDiagramElements = getHiddenExistingDiagramElements(semanticElement,
				containerView);
		if (!hiddenDiagramElements.isEmpty()) {
			// Just reveal the elements
			for (DDiagramElement existingDiagramElement : hiddenDiagramElements) {
				HideFilterHelper.INSTANCE.reveal(existingDiagramElement);
			}
		} else {
			// Else create a new element
			// Create the view for the dropped element
			createView(semanticElement, containerView, session, containerViewVariable);
		}
	}

	/**
	 * Get all the hidden existing diagram elements related to a semantic element.
	 * 
	 * @param semanticElement
	 *            Semantic element
	 * @param containerView
	 *            Container view
	 * @return List of all existing diagram elements for the given semantic element which are currently hidden
	 *         in the diagram
	 */
	private List<DDiagramElement> getHiddenExistingDiagramElements(EObject semanticElement,
			DSemanticDecorator containerView) {
		List<DDiagramElement> existingDiagramElements = Lists.newArrayList();
		if (containerView instanceof DSemanticDiagram) {
			for (DDiagramElement element : ((DSemanticDiagram)containerView).getDiagramElements()) {
				if (semanticElement.equals(element.getTarget())) {
					DDiagramElementQuery query = new DDiagramElementQuery(element);
					if (query.isHidden()) {
						existingDiagramElements.add(element);
					}
					// Get the hidden parent container of the element to reveal, in order to reveal all the
					// hierarchy
					existingDiagramElements.addAll(getHiddenParentContainerViews(element));
				}
			}
		}
		return existingDiagramElements;
	}

	/**
	 * Get all the hidden diagram element in the hierarchy of a given diagram element.
	 * 
	 * @param diagramElement
	 *            Diagram element
	 * @return List of all the hidden parent container element
	 */
	private List<DDiagramElement> getHiddenParentContainerViews(DDiagramElement diagramElement) {
		List<DDiagramElement> containerViews = Lists.newArrayList();
		EObject containerView = diagramElement.eContainer();
		while (!(containerView instanceof DDiagram) && containerView instanceof DDiagramElement) {
			DDiagramElementQuery query = new DDiagramElementQuery((DDiagramElement)containerView);
			if (query.isHidden()) {
				containerViews.add((DDiagramElement)containerView);
			}
			containerView = containerView.eContainer();
		}
		return containerViews;
	}

	/**
	 * Drop a semantic element from a diagram and create the corresponding view in the given container
	 * 
	 * @param newContainer
	 *            Semantic container
	 * @param semanticElement
	 *            Element to drop
	 * @param containerView
	 *            Container view
	 */
	public void dropFromDiagram(final Element newContainer, final Element semanticElement,
			final DSemanticDecorator containerView) {
		drop(newContainer, semanticElement, containerView, true);
	}

	/**
	 * Drop a semantic element and create the corresponding view in the given container
	 * 
	 * @param newContainer
	 *            Semantic container
	 * @param semanticElement
	 *            Element to drop
	 * @param containerView
	 *            Container view
	 */
	public void dropFromModel(final Element newContainer, final Element semanticElement,
			final DSemanticDecorator containerView) {
		drop(newContainer, semanticElement, containerView, !(containerView instanceof DSemanticDiagram));
	}

	/**
	 * Check if a semantic element can be represented in a given container view.
	 * 
	 * @param container
	 *            Semantic container
	 * @param semanticElement
	 *            Element to test
	 * @param containerView
	 *            Container view
	 */
	public boolean isValidElementForContainerView(final Element container, final Element semanticElement,
			final DSemanticDecorator containerView) {
		final Session session = SessionManager.INSTANCE.getSession(container);

		// Get all available mappings applicable for the selected element in the
		// current container
		List<DiagramElementMapping> semanticElementMappings = getMappings(semanticElement,
				(DSemanticDecorator)containerView, session);

		return semanticElementMappings.size() > 0;
	}

	/**
	 * Check if an element is a container.
	 * 
	 * @param container
	 *            Semantic container
	 * @param containerView
	 *            Container view
	 */
	public boolean existValidElementsForContainerView(final EObject container, final EObject containerView) {
		if (container instanceof Element && containerView instanceof DSemanticDecorator) {
			final Session session = SessionManager.INSTANCE.getSession(container);
			// Get all available mappings applicable for the selected element in the
			// current container
			List<DiagramElementMapping> semanticElementMappings = getMappings(
					(DSemanticDecorator)containerView, session);

			return semanticElementMappings.size() > 0;
		}
		return false;
	}

	public void addExistingElements(final EObject containerView, final List<EObject> semanticElementList) {
		if (!(containerView instanceof DSemanticDecorator) || semanticElementList == null
				|| semanticElementList.isEmpty())
			return;
		final Session session = SessionManager.INSTANCE.getSession(semanticElementList.get(0));
		for (EObject semanticElement : semanticElementList) {
			// Mark for auto-size
			markForAutosize(semanticElement);

			// Show the added element on the diagram
			showView(semanticElement, (DSemanticDecorator)containerView, session, "containerView");
		}
	}

	/**
	 * Create view.
	 * 
	 * @param semanticElement
	 *            Semantic element
	 * @param containerView
	 *            Container view
	 * @param session
	 *            Session
	 * @param containerViewVariable
	 *            Name of the container view variable
	 */
	private void createView(final EObject semanticElement, final DSemanticDecorator containerView,
			final Session session, final String containerViewVariable) {
		// Get all available mappings applicable for the copiedElement in the
		// current container
		List<DiagramElementMapping> semanticElementMappings = getMappings(semanticElement, containerView,
				session);

		// Build a createView tool
		final CreateView createViewOp = ToolFactory.eINSTANCE.createCreateView();
		for (DiagramElementMapping copiedElementMapping : semanticElementMappings) {
			final DiagramElementMapping tmpCopiedElementMapping = copiedElementMapping;
			createViewOp.setMapping(tmpCopiedElementMapping);
			final String containerViewExpression = "var:" + containerViewVariable;
			createViewOp.setContainerViewExpression(containerViewExpression);

			session.getTransactionalEditingDomain().getCommandStack()
					.execute(new RecordingCommand(session.getTransactionalEditingDomain()) {

						@SuppressWarnings("restriction")
						@Override
						protected void doExecute() {
							try {
								// Get the command context
								DRepresentation representation = null;
								if (containerView instanceof DRepresentation) {
									representation = (DRepresentation)containerView;
								} else if (containerView instanceof DDiagramElement) {
									representation = ((DDiagramElement)containerView).getParentDiagram();
								}

								final CommandContext context = new CommandContext(semanticElement,
										representation);

								// Execute the create view task
								CreateViewTask task = new CreateViewTask(context, session.getModelAccessor(),
										createViewOp, session.getInterpreter());
								task.execute();

								Object createdView = session.getInterpreter().getVariable(
										createViewOp.getVariableName());
								if (createdView instanceof DDiagramElement) {
									DDiagramElement element = (DDiagramElement)createdView;
									HideFilterHelper.INSTANCE.reveal(element);
								}
							} catch (MetaClassNotFoundException e) {
								UMLDesignerPlugin.log(IStatus.ERROR, Messages
										.bind(Messages.UmlModelWizard_UI_ErrorMsg_BadFileExtension,
												semanticElement), e);
							} catch (FeatureNotFoundException e) {
								UMLDesignerPlugin.log(IStatus.ERROR, Messages
										.bind(Messages.UmlModelWizard_UI_ErrorMsg_BadFileExtension,
												semanticElement), e);
							}
						}
					});
		}
	}

	/**
	 * Get mappings available for a semantic element and a given container view.
	 * 
	 * @param semanticElement
	 *            Semantic element
	 * @param containerView
	 *            Container view
	 * @param session
	 *            Session
	 * @return List of mappings which could not be null
	 */
	@SuppressWarnings("restriction")
	private List<DiagramElementMapping> getMappings(final EObject semanticElement,
			final DSemanticDecorator containerView, Session session) {
		ModelAccessor modelAccessor = session.getModelAccessor();
		List<DiagramElementMapping> mappings = new ArrayList<DiagramElementMapping>();

		if (containerView instanceof DSemanticDiagram) {

			for (DiagramElementMapping mapping : (((DSemanticDiagram)containerView).getDescription()
					.getAllContainerMappings())) {
				String domainClass = ((AbstractNodeMapping)mapping).getDomainClass();
				if (modelAccessor.eInstanceOf(semanticElement, domainClass) && !mapping.isCreateElements()) {
					mappings.add(mapping);
				}
			}
			for (DiagramElementMapping mapping : (((DSemanticDiagram)containerView).getDescription()
					.getAllNodeMappings())) {
				String domainClass = ((AbstractNodeMapping)mapping).getDomainClass();
				if (modelAccessor.eInstanceOf(semanticElement, domainClass) && !mapping.isCreateElements()) {
					mappings.add(mapping);
				}
			}
		} else if (containerView instanceof DNodeContainerSpec) {
			for (DiagramElementMapping mapping : (((DNodeContainerSpec)containerView).getActualMapping()
					.getAllContainerMappings())) {
				String domainClass = ((AbstractNodeMapping)mapping).getDomainClass();
				if (modelAccessor.eInstanceOf(semanticElement, domainClass) && !mapping.isCreateElements()) {
					mappings.add(mapping);
				}
			}
			for (DiagramElementMapping mapping : (((DNodeContainerSpec)containerView).getActualMapping()
					.getAllNodeMappings())) {
				String domainClass = ((AbstractNodeMapping)mapping).getDomainClass();
				if (modelAccessor.eInstanceOf(semanticElement, domainClass) && !mapping.isCreateElements()) {
					mappings.add(mapping);
				}
			}
		}
		return mappings;
	}

	/**
	 * Get mappings available for a given container view.
	 * 
	 * @param containerView
	 *            Container view
	 * @param session
	 *            Session
	 * @return List of mappings which could not be null
	 */
	@SuppressWarnings("restriction")
	private List<DiagramElementMapping> getMappings(final DSemanticDecorator containerView, Session session) {
		List<DiagramElementMapping> mappings = new ArrayList<DiagramElementMapping>();

		if (containerView instanceof DSemanticDiagram) {

			for (DiagramElementMapping mapping : (((DSemanticDiagram)containerView).getDescription()
					.getAllContainerMappings())) {
				if (!mapping.isCreateElements()) {
					mappings.add(mapping);
				}
			}
			for (DiagramElementMapping mapping : (((DSemanticDiagram)containerView).getDescription()
					.getAllNodeMappings())) {
				if (!mapping.isCreateElements()) {
					mappings.add(mapping);
				}
			}
		} else if (containerView instanceof DNodeContainerSpec) {
			for (DiagramElementMapping mapping : (((DNodeContainerSpec)containerView).getActualMapping()
					.getAllContainerMappings())) {
				if (!mapping.isCreateElements()) {
					mappings.add(mapping);
				}
			}
			for (DiagramElementMapping mapping : (((DNodeContainerSpec)containerView).getActualMapping()
					.getAllNodeMappings())) {
				if (!mapping.isCreateElements()) {
					mappings.add(mapping);
				}
			}
		}
		return mappings;
	}

	public EObject markForAutosize(EObject any) {
		if (any != null) {
			any.eAdapters().add(AutosizeTrigger.AUTO_SIZE_MARKER);
		}
		return any;
	}

	public int defaultHeight(EObject any) {
		return 10;
	}

	public int defaultWidth(EObject any) {
		return 12;
	}
}
