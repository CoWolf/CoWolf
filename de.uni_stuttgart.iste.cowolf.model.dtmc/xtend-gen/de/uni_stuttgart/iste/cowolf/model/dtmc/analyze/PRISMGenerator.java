package de.uni_stuttgart.iste.cowolf.model.dtmc.analyze;

import de.uni_stuttgart.iste.cowolf.model.dtmc.State;
import de.uni_stuttgart.iste.cowolf.model.dtmc.Transition;
import de.uni_stuttgart.iste.cowolf.model.dtmc.impl.RootImpl;
import java.util.HashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IntegerRange;

@SuppressWarnings("all")
public class PRISMGenerator {
  private HashMap<Object, Object> nameToIDMap = CollectionLiterals.<Object, Object>newHashMap();
  
  public CharSequence generatePM(final Resource resource) {
    CharSequence _xifexpression = null;
    boolean _and = false;
    EList<EObject> _contents = resource.getContents();
    int _size = _contents.size();
    boolean _greaterThan = (_size > 0);
    if (!_greaterThan) {
      _and = false;
    } else {
      EList<EObject> _contents_1 = resource.getContents();
      EObject _get = _contents_1.get(0);
      _and = (_get instanceof RootImpl);
    }
    if (_and) {
      CharSequence _xblockexpression = null;
      {
        EList<EObject> _contents_2 = resource.getContents();
        EObject _get_1 = _contents_2.get(0);
        RootImpl e = ((RootImpl) _get_1);
        this.addStatesToMap(e);
        StringConcatenation _builder = new StringConcatenation();
        CharSequence _compilePM = this.compilePM(e);
        _builder.append(_compilePM, "");
        _xblockexpression = _builder;
      }
      _xifexpression = _xblockexpression;
    } else {
      StringConcatenation _builder = new StringConcatenation();
      _xifexpression = _builder;
    }
    return _xifexpression;
  }
  
  public CharSequence generatePCTL(final Resource resource) {
    String result = "";
    boolean _and = false;
    EList<EObject> _contents = resource.getContents();
    int _size = _contents.size();
    boolean _greaterThan = (_size > 0);
    if (!_greaterThan) {
      _and = false;
    } else {
      EList<EObject> _contents_1 = resource.getContents();
      EObject _get = _contents_1.get(0);
      _and = (_get instanceof RootImpl);
    }
    if (_and) {
      EList<EObject> _contents_2 = resource.getContents();
      EObject _get_1 = _contents_2.get(0);
      RootImpl e = ((RootImpl) _get_1);
      this.addStatesToMap(e);
      EList<State> _states = e.getStates();
      for (final State state : _states) {
        boolean _isIsEnd = state.isIsEnd();
        if (_isIsEnd) {
          String _result = result;
          CharSequence _iD = this.getID(state);
          String _plus = ("P=? [ F s=" + _iD);
          String _plus_1 = (_plus + " ]\n");
          result = (_result + _plus_1);
        }
      }
    } else {
      return "";
    }
    return result;
  }
  
  public CharSequence addStatesToMap(final RootImpl e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("nameToIDMap = newHashMap()");
    _builder.newLine();
    {
      EList<State> _states = e.getStates();
      int _size = _states.size();
      int _minus = (_size - 1);
      IntegerRange _upTo = new IntegerRange(0, _minus);
      for(final Integer i : _upTo) {
        EList<State> _states_1 = e.getStates();
        State _get = _states_1.get((i).intValue());
        String _name = _get.getName();
        Object _put = this.nameToIDMap.put(_name, i);
        _builder.append(_put, "");
        _builder.append("\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<State> _states_2 = e.getStates();
      int _size_1 = _states_2.size();
      int _minus_1 = (_size_1 - 1);
      IntegerRange _upTo_1 = new IntegerRange(0, _minus_1);
      for(final Integer i_1 : _upTo_1) {
        {
          EList<State> _states_3 = e.getStates();
          State _get_1 = _states_3.get((i_1).intValue());
          String _name_1 = _get_1.getName();
          boolean _containsKey = this.nameToIDMap.containsKey(_name_1);
          if (_containsKey) {
            EList<State> _states_4 = e.getStates();
            State _get_2 = _states_4.get((i_1).intValue());
            String _name_2 = _get_2.getName();
            Object _get_3 = this.nameToIDMap.get(_name_2);
            _builder.append(_get_3, "");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence getID(final State e) {
    try {
      CharSequence _xifexpression = null;
      String _name = e.getName();
      boolean _containsKey = this.nameToIDMap.containsKey(_name);
      if (_containsKey) {
        StringConcatenation _builder = new StringConcatenation();
        String _name_1 = e.getName();
        Object _get = this.nameToIDMap.get(_name_1);
        _builder.append(_get, "");
        _xifexpression = _builder;
      } else {
        throw new Exception("Unknown state found.");
      }
      return _xifexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public CharSequence getStart(final RootImpl e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<State> _states = e.getStates();
      for(final State s : _states) {
        {
          boolean _isIsStart = s.isIsStart();
          if (_isIsStart) {
            CharSequence _iD = this.getID(s);
            _builder.append(_iD, "");
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence compilePM(final RootImpl e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("dtmc ");
    _builder.newLine();
    _builder.append("module test");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("s : [0..");
    EList<State> _states = e.getStates();
    int _size = _states.size();
    int _minus = (_size - 1);
    _builder.append(_minus, "\t");
    _builder.append("] init ");
    CharSequence _start = this.getStart(e);
    _builder.append(_start, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t ");
    _builder.newLine();
    {
      EList<State> _states_1 = e.getStates();
      for(final State f : _states_1) {
        {
          EList<Transition> _outGoing = f.getOutGoing();
          int _size_1 = _outGoing.size();
          boolean _greaterThan = (_size_1 > 0);
          if (_greaterThan) {
            _builder.append("\t");
            _builder.append("[] s=");
            CharSequence _iD = this.getID(f);
            _builder.append(_iD, "\t");
            _builder.append(" -> ");
            CharSequence _compilePM = this.compilePM(f);
            _builder.append(_compilePM, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("endmodule");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compilePM(final State e) {
    CharSequence _xifexpression = null;
    EList<Transition> _outGoing = e.getOutGoing();
    int _size = _outGoing.size();
    boolean _greaterThan = (_size > 1);
    if (_greaterThan) {
      StringConcatenation _builder = new StringConcatenation();
      {
        EList<Transition> _outGoing_1 = e.getOutGoing();
        int _size_1 = _outGoing_1.size();
        int _minus = (_size_1 - 2);
        IntegerRange _upTo = new IntegerRange(0, _minus);
        for(final Integer i : _upTo) {
          EList<Transition> _outGoing_2 = e.getOutGoing();
          Transition _get = _outGoing_2.get((i).intValue());
          float _transProb = _get.getTransProb();
          _builder.append(_transProb, "");
          _builder.append(" : (s\'=");
          EList<Transition> _outGoing_3 = e.getOutGoing();
          Transition _get_1 = _outGoing_3.get((i).intValue());
          State _to = _get_1.getTo();
          CharSequence _iD = this.getID(_to);
          _builder.append(_iD, "");
          _builder.append(") + ");
        }
      }
      EList<Transition> _outGoing_4 = e.getOutGoing();
      EList<Transition> _outGoing_5 = e.getOutGoing();
      int _size_2 = _outGoing_5.size();
      int _minus_1 = (_size_2 - 1);
      Transition _get_2 = _outGoing_4.get(_minus_1);
      float _transProb_1 = _get_2.getTransProb();
      _builder.append(_transProb_1, "");
      _builder.append(" : (s\'=");
      EList<Transition> _outGoing_6 = e.getOutGoing();
      EList<Transition> _outGoing_7 = e.getOutGoing();
      int _size_3 = _outGoing_7.size();
      int _minus_2 = (_size_3 - 1);
      Transition _get_3 = _outGoing_6.get(_minus_2);
      State _to_1 = _get_3.getTo();
      CharSequence _iD_1 = this.getID(_to_1);
      _builder.append(_iD_1, "");
      _builder.append(");");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("(s\'=");
      EList<Transition> _outGoing_8 = e.getOutGoing();
      Transition _get_4 = _outGoing_8.get(0);
      State _to_2 = _get_4.getTo();
      CharSequence _iD_2 = this.getID(_to_2);
      _builder_1.append(_iD_2, "");
      _builder_1.append(");");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
}
