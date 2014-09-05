/*
* generated by Xtext
*/
package de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.services.PCTLGrammarAccess;

public class PCTLParser extends AbstractContentAssistParser {
	
	@Inject
	private PCTLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.ui.contentassist.antlr.internal.InternalPCTLParser createParser() {
		de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.ui.contentassist.antlr.internal.InternalPCTLParser result = new de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.ui.contentassist.antlr.internal.InternalPCTLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getStartAccess().getAlternatives(), "rule__Start__Alternatives");
					put(grammarAccess.getStateAccess().getAlternatives(), "rule__State__Alternatives");
					put(grammarAccess.getLabelAccess().getAlternatives(), "rule__Label__Alternatives");
					put(grammarAccess.getStateOrLabelAccess().getAlternatives(), "rule__StateOrLabel__Alternatives");
					put(grammarAccess.getP1Access().getAlternatives_3(), "rule__P1__Alternatives_3");
					put(grammarAccess.getPAccess().getAlternatives_3(), "rule__P__Alternatives_3");
					put(grammarAccess.getUAccess().getAlternatives_1(), "rule__U__Alternatives_1");
					put(grammarAccess.getCompareAccess().getAlternatives(), "rule__Compare__Alternatives");
					put(grammarAccess.getCompareWithoutUnknownAccess().getAlternatives(), "rule__CompareWithoutUnknown__Alternatives");
					put(grammarAccess.getTimeBoundAccess().getAlternatives(), "rule__TimeBound__Alternatives");
					put(grammarAccess.getStateAccess().getGroup_0(), "rule__State__Group_0__0");
					put(grammarAccess.getStateAccess().getGroup_1(), "rule__State__Group_1__0");
					put(grammarAccess.getLabelAccess().getGroup_0(), "rule__Label__Group_0__0");
					put(grammarAccess.getLabelAccess().getGroup_1(), "rule__Label__Group_1__0");
					put(grammarAccess.getSAccess().getGroup(), "rule__S__Group__0");
					put(grammarAccess.getP1Access().getGroup(), "rule__P1__Group__0");
					put(grammarAccess.getP1Access().getGroup_3_5(), "rule__P1__Group_3_5__0");
					put(grammarAccess.getPAccess().getGroup(), "rule__P__Group__0");
					put(grammarAccess.getPAccess().getGroup_3_5(), "rule__P__Group_3_5__0");
					put(grammarAccess.getFAccess().getGroup(), "rule__F__Group__0");
					put(grammarAccess.getFAccess().getGroup_1(), "rule__F__Group_1__0");
					put(grammarAccess.getGAccess().getGroup(), "rule__G__Group__0");
					put(grammarAccess.getGAccess().getGroup_1(), "rule__G__Group_1__0");
					put(grammarAccess.getUAccess().getGroup(), "rule__U__Group__0");
					put(grammarAccess.getUAccess().getGroup_2(), "rule__U__Group_2__0");
					put(grammarAccess.getCompareWithoutUnknownAccess().getGroup_0(), "rule__CompareWithoutUnknown__Group_0__0");
					put(grammarAccess.getCompareWithoutUnknownAccess().getGroup_1(), "rule__CompareWithoutUnknown__Group_1__0");
					put(grammarAccess.getCompareWithoutUnknownAccess().getGroup_2(), "rule__CompareWithoutUnknown__Group_2__0");
					put(grammarAccess.getCompareWithoutUnknownAccess().getGroup_3(), "rule__CompareWithoutUnknown__Group_3__0");
					put(grammarAccess.getTimeBoundAccess().getGroup_0(), "rule__TimeBound__Group_0__0");
					put(grammarAccess.getTimeBoundAccess().getGroup_1(), "rule__TimeBound__Group_1__0");
					put(grammarAccess.getTimeBoundAccess().getGroup_2(), "rule__TimeBound__Group_2__0");
					put(grammarAccess.getTimeBoundAccess().getGroup_3(), "rule__TimeBound__Group_3__0");
					put(grammarAccess.getDECIMALAccess().getGroup(), "rule__DECIMAL__Group__0");
					put(grammarAccess.getDECIMALAccess().getGroup_1(), "rule__DECIMAL__Group_1__0");
					put(grammarAccess.getStartAccess().getStartAssignment_0(), "rule__Start__StartAssignment_0");
					put(grammarAccess.getStateAccess().getNameAssignment_0_2(), "rule__State__NameAssignment_0_2");
					put(grammarAccess.getStateAccess().getNameAssignment_1_1(), "rule__State__NameAssignment_1_1");
					put(grammarAccess.getLabelAccess().getNameAssignment_0_2(), "rule__Label__NameAssignment_0_2");
					put(grammarAccess.getLabelAccess().getNameAssignment_1_1(), "rule__Label__NameAssignment_1_1");
					put(grammarAccess.getFAccess().getRIGHTAssignment_2(), "rule__F__RIGHTAssignment_2");
					put(grammarAccess.getGAccess().getLEFTAssignment_3(), "rule__G__LEFTAssignment_3");
					put(grammarAccess.getGAccess().getRIGHTAssignment_5(), "rule__G__RIGHTAssignment_5");
					put(grammarAccess.getUAccess().getLEFTAssignment_0(), "rule__U__LEFTAssignment_0");
					put(grammarAccess.getUAccess().getRIGHTAssignment_3(), "rule__U__RIGHTAssignment_3");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.ui.contentassist.antlr.internal.InternalPCTLParser typedParser = (de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.ui.contentassist.antlr.internal.InternalPCTLParser) parser;
			typedParser.entryRuleStart();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public PCTLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(PCTLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
