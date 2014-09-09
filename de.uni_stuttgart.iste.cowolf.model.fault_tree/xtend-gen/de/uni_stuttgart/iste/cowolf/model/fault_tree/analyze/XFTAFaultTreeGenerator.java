package de.uni_stuttgart.iste.cowolf.model.fault_tree.analyze;

import com.google.common.collect.Iterables;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.BasicEvent;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.Event;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.Gate;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.Hazard;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.IntermediateEvent;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.UndevelopedEvent;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.analyze.XFTAGenerator;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class XFTAFaultTreeGenerator implements XFTAGenerator {
  public CharSequence doGenerateXFTAFile(final FaultTree root, final Map<String, Object> parameters) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _xFTAFaultTreeTemplate = this.xFTAFaultTreeTemplate(root);
    _builder.append(_xFTAFaultTreeTemplate, "");
    return _builder;
  }
  
  public CharSequence xFTAFaultTreeTemplate(final FaultTree r) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\"?>");
    _builder.newLine();
    _builder.append("<!DOCTYPE open-psa>");
    _builder.newLine();
    _builder.append("<open-psa>");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.append("<define-fault-tree name=\"");
    Hazard _hazard = r.getHazard();
    String _id = _hazard.getId();
    _builder.append(_id, "\t  ");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t  ");
    Hazard _hazard_1 = r.getHazard();
    CharSequence _processTopEvent = this.processTopEvent(_hazard_1);
    _builder.append(_processTopEvent, "\t  ");
    _builder.newLineIfNotEmpty();
    {
      EList<Gate> _gate = r.getGate();
      for(final Gate gate : _gate) {
        _builder.append("\t  ");
        CharSequence _processGateBasicDefinitions = this.processGateBasicDefinitions(gate);
        _builder.append(_processGateBasicDefinitions, "\t  ");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Event> _event = r.getEvent();
      Iterable<BasicEvent> _filter = Iterables.<BasicEvent>filter(_event, BasicEvent.class);
      for(final BasicEvent event : _filter) {
        _builder.append("\t  ");
        CharSequence _processEventBasicDefinitions = this.processEventBasicDefinitions(((BasicEvent) event));
        _builder.append(_processEventBasicDefinitions, "\t  ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t  ");
    _builder.append("</define-fault-tree>");
    _builder.newLine();
    _builder.append("</open-psa>");
    _builder.newLine();
    _builder.append("\t\t   ");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence processTopEvent(final Hazard hazard) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<define-gate name=\"");
    String _id = hazard.getId();
    _builder.append(_id, "");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append(" \t\t");
    _builder.append("<");
    Gate _inputGate = hazard.getInputGate();
    Class<? extends Gate> _class = _inputGate.getClass();
    Class<?>[] _interfaces = _class.getInterfaces();
    Class<?> _get = _interfaces[0];
    String _simpleName = _get.getSimpleName();
    String _lowerCase = _simpleName.toLowerCase();
    _builder.append(_lowerCase, " \t\t");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    {
      Gate _inputGate_1 = hazard.getInputGate();
      EList<Gate> _inputGates = _inputGate_1.getInputGates();
      for(final Gate g : _inputGates) {
        _builder.append(" \t\t");
        CharSequence _processGates = this.processGates(g);
        _builder.append(_processGates, " \t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Gate _inputGate_2 = hazard.getInputGate();
      EList<Event> _inputEvents = _inputGate_2.getInputEvents();
      for(final Event e : _inputEvents) {
        _builder.append(" \t\t");
        CharSequence _processBasicEvents = this.processBasicEvents(e);
        _builder.append(_processBasicEvents, " \t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append(" \t\t");
    _builder.append("</");
    Gate _inputGate_3 = hazard.getInputGate();
    Class<? extends Gate> _class_1 = _inputGate_3.getClass();
    Class<?>[] _interfaces_1 = _class_1.getInterfaces();
    Class<?> _get_1 = _interfaces_1[0];
    String _simpleName_1 = _get_1.getSimpleName();
    String _lowerCase_1 = _simpleName_1.toLowerCase();
    _builder.append(_lowerCase_1, " \t\t");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    _builder.append("</define-gate>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence processGateBasicDefinitions(final Gate gate) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<define-gate name=\"");
    String _id = gate.getId();
    _builder.append(_id, "");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("   ");
    _builder.append("<");
    Class<? extends Gate> _class = gate.getClass();
    Class<?>[] _interfaces = _class.getInterfaces();
    Class<?> _get = _interfaces[0];
    String _simpleName = _get.getSimpleName();
    String _lowerCase = _simpleName.toLowerCase();
    _builder.append(_lowerCase, "   ");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    {
      EList<Gate> _inputGates = gate.getInputGates();
      for(final Gate g : _inputGates) {
        CharSequence _processGates = this.processGates(g);
        _builder.append(_processGates, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Event> _inputEvents = gate.getInputEvents();
      final Function1<Event, Boolean> _function = new Function1<Event, Boolean>() {
        public Boolean apply(final Event e) {
          boolean _or = false;
          if (((e instanceof BasicEvent) || (e instanceof IntermediateEvent))) {
            _or = true;
          } else {
            _or = (e instanceof UndevelopedEvent);
          }
          return Boolean.valueOf(_or);
        }
      };
      Iterable<Event> _filter = IterableExtensions.<Event>filter(_inputEvents, _function);
      for(final Event e : _filter) {
        CharSequence _processBasicEvents = this.processBasicEvents(e);
        _builder.append(_processBasicEvents, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("   ");
    _builder.append("</");
    Class<? extends Gate> _class_1 = gate.getClass();
    Class<?>[] _interfaces_1 = _class_1.getInterfaces();
    Class<?> _get_1 = _interfaces_1[0];
    String _simpleName_1 = _get_1.getSimpleName();
    String _lowerCase_1 = _simpleName_1.toLowerCase();
    _builder.append(_lowerCase_1, "   ");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    _builder.append("</define-gate>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence processGates(final Gate gate) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<gate name=\"");
    String _id = gate.getId();
    _builder.append(_id, "");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence processBasicEvents(final Event event) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<basic-event name=\"");
    String _id = event.getId();
    _builder.append(_id, "");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence processEventBasicDefinitions(final BasicEvent event) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<define-basic-event name=\"");
    String _id = event.getId();
    _builder.append(_id, "");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<float value=\"");
    double _probability = event.getProbability();
    _builder.append(_probability, "\t");
    _builder.append("\" />\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("</define-basic-event>");
    _builder.newLine();
    return _builder;
  }
}
