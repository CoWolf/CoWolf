package de.uni_stuttgart.iste.cowolf.model.fault_tree.analyze;

import com.google.common.base.Objects;
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
    CharSequence _processHazard = this.processHazard(_hazard_1);
    _builder.append(_processHazard, "\t  ");
    _builder.newLineIfNotEmpty();
    {
      EList<Gate> _gate = r.getGate();
      final Function1<Gate, Boolean> _function = new Function1<Gate, Boolean>() {
        public Boolean apply(final Gate g) {
          String _id = g.getId();
          Hazard _hazard = r.getHazard();
          Gate _inputGate = _hazard.getInputGate();
          String _id_1 = _inputGate.getId();
          return Boolean.valueOf((!Objects.equal(_id, _id_1)));
        }
      };
      Iterable<Gate> _filter = IterableExtensions.<Gate>filter(_gate, _function);
      for(final Gate gate : _filter) {
        _builder.append("\t  ");
        CharSequence _processGateBasicDefinitions = this.processGateBasicDefinitions(gate);
        _builder.append(_processGateBasicDefinitions, "\t  ");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Event> _event = r.getEvent();
      final Function1<Event, Boolean> _function_1 = new Function1<Event, Boolean>() {
        public Boolean apply(final Event e) {
          boolean _and = false;
          boolean _and_1 = false;
          if (!(e instanceof IntermediateEvent)) {
            _and_1 = false;
          } else {
            Event _outEvent = ((IntermediateEvent) e).getOutEvent();
            boolean _equals = Objects.equal(_outEvent, null);
            _and_1 = _equals;
          }
          if (!_and_1) {
            _and = false;
          } else {
            Gate _inputGate = ((IntermediateEvent) e).getInputGate();
            boolean _notEquals = (!Objects.equal(_inputGate, null));
            _and = _notEquals;
          }
          return Boolean.valueOf(_and);
        }
      };
      Iterable<Event> _filter_1 = IterableExtensions.<Event>filter(_event, _function_1);
      for(final Event event : _filter_1) {
        _builder.append("\t  ");
        CharSequence _processEventAsGate = this.processEventAsGate(((IntermediateEvent) event));
        _builder.append(_processEventAsGate, "\t  ");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Event> _event_1 = r.getEvent();
      Iterable<BasicEvent> _filter_2 = Iterables.<BasicEvent>filter(_event_1, BasicEvent.class);
      for(final BasicEvent event_1 : _filter_2) {
        _builder.append("\t  ");
        CharSequence _processEventBasicDefinitions = this.processEventBasicDefinitions(((BasicEvent) event_1));
        _builder.append(_processEventBasicDefinitions, "\t  ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t  ");
    _builder.append("</define-fault-tree>");
    _builder.newLine();
    _builder.append("</open-psa>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence processHazard(final Hazard hazard) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<define-gate name=\"");
    String _id = hazard.getId();
    _builder.append(_id, "");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    Gate _inputGate = hazard.getInputGate();
    CharSequence _fillGateContent = this.fillGateContent(_inputGate);
    _builder.append(_fillGateContent, "");
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
    CharSequence _fillGateContent = this.fillGateContent(gate);
    _builder.append(_fillGateContent, "");
    _builder.newLineIfNotEmpty();
    _builder.append("</define-gate>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence processEventAsGate(final IntermediateEvent e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<define-gate name=\"");
    String _id = e.getId();
    _builder.append(_id, "");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    Gate _inputGate = e.getInputGate();
    CharSequence _fillGateContent = this.fillGateContent(_inputGate);
    _builder.append(_fillGateContent, "");
    _builder.newLineIfNotEmpty();
    _builder.append("</define-gate>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence processEvent(final Event e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((e instanceof BasicEvent)) {
        CharSequence _processBasicEvent = this.processBasicEvent(e);
        _builder.append(_processBasicEvent, "");
        _builder.newLineIfNotEmpty();
      } else {
        if ((e instanceof IntermediateEvent)) {
          CharSequence _processIntermediateEvent = this.processIntermediateEvent(((IntermediateEvent) e));
          _builder.append(_processIntermediateEvent, "");
          _builder.newLineIfNotEmpty();
        } else {
          if ((e instanceof UndevelopedEvent)) {
            CharSequence _processUndevelopedEvent = this.processUndevelopedEvent(((UndevelopedEvent) e));
            _builder.append(_processUndevelopedEvent, "");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence processGate(final Gate gate) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<gate name=\"");
    String _id = gate.getId();
    _builder.append(_id, "");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence processBasicEvent(final Event event) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<basic-event name=\"");
    String _id = event.getId();
    _builder.append(_id, "");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence processIntermediateEvent(final IntermediateEvent event) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Event _outEvent = event.getOutEvent();
      boolean _equals = Objects.equal(_outEvent, null);
      if (_equals) {
        _builder.append("<event name=\"");
        String _id = event.getId();
        _builder.append(_id, "");
        _builder.append("\"/>");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence processUndevelopedEvent(final UndevelopedEvent event) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<event name=\"");
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
  
  public CharSequence fillGateContent(final Gate gate) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("   \t");
    _builder.append("<");
    Class<? extends Gate> _class = gate.getClass();
    Class<?>[] _interfaces = _class.getInterfaces();
    Class<?> _get = _interfaces[0];
    String _simpleName = _get.getSimpleName();
    String _lowerCase = _simpleName.toLowerCase();
    _builder.append(_lowerCase, "   \t");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    {
      EList<Gate> _inputGates = gate.getInputGates();
      for(final Gate g : _inputGates) {
        CharSequence _processGate = this.processGate(g);
        _builder.append(_processGate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Event> _inputEvents = gate.getInputEvents();
      for(final Event e : _inputEvents) {
        CharSequence _processEvent = this.processEvent(e);
        _builder.append(_processEvent, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("   \t");
    _builder.append("</");
    Class<? extends Gate> _class_1 = gate.getClass();
    Class<?>[] _interfaces_1 = _class_1.getInterfaces();
    Class<?> _get_1 = _interfaces_1[0];
    String _simpleName_1 = _get_1.getSimpleName();
    String _lowerCase_1 = _simpleName_1.toLowerCase();
    _builder.append(_lowerCase_1, "   \t");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
