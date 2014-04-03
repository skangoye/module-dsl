package org.xtext.types;

import com.google.common.base.Objects;
import java.util.Arrays;
import org.xtext.moduleDsl.ADD;
import org.xtext.moduleDsl.AND;
import org.xtext.moduleDsl.COMPARISON;
import org.xtext.moduleDsl.DIV;
import org.xtext.moduleDsl.EQUAL_DIFF;
import org.xtext.moduleDsl.EXPRESSION;
import org.xtext.moduleDsl.MULT;
import org.xtext.moduleDsl.NOT;
import org.xtext.moduleDsl.OR;
import org.xtext.moduleDsl.SUB;
import org.xtext.moduleDsl.TYPE;
import org.xtext.moduleDsl.VAR_CST;
import org.xtext.moduleDsl.VarExpRef;
import org.xtext.moduleDsl.bitConstant;
import org.xtext.moduleDsl.boolConstant;
import org.xtext.moduleDsl.enumConstant;
import org.xtext.moduleDsl.hexConstant;
import org.xtext.moduleDsl.intConstant;
import org.xtext.moduleDsl.realConstant;
import org.xtext.moduleDsl.strConstant;

@SuppressWarnings("all")
public class ExpressionsTypeProvider {
  public final static String intType = "integer";
  
  public final static String realType = "real";
  
  public final static String boolType = "boolean";
  
  public final static String strType = "string";
  
  public final static String enumType = "enumeration";
  
  public final static String hexType = "hexadecimal";
  
  public final static String bitType = "bit";
  
  protected String _typeFor(final EXPRESSION e) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (e instanceof intConstant) {
        final intConstant _intConstant = (intConstant)e;
        _matched=true;
        _switchResult = ExpressionsTypeProvider.intType;
      }
    }
    if (!_matched) {
      if (e instanceof realConstant) {
        final realConstant _realConstant = (realConstant)e;
        _matched=true;
        _switchResult = ExpressionsTypeProvider.realType;
      }
    }
    if (!_matched) {
      if (e instanceof strConstant) {
        final strConstant _strConstant = (strConstant)e;
        _matched=true;
        _switchResult = ExpressionsTypeProvider.strType;
      }
    }
    if (!_matched) {
      if (e instanceof enumConstant) {
        final enumConstant _enumConstant = (enumConstant)e;
        _matched=true;
        _switchResult = ExpressionsTypeProvider.enumType;
      }
    }
    if (!_matched) {
      if (e instanceof boolConstant) {
        final boolConstant _boolConstant = (boolConstant)e;
        _matched=true;
        _switchResult = ExpressionsTypeProvider.boolType;
      }
    }
    if (!_matched) {
      if (e instanceof bitConstant) {
        final bitConstant _bitConstant = (bitConstant)e;
        _matched=true;
        _switchResult = ExpressionsTypeProvider.bitType;
      }
    }
    if (!_matched) {
      if (e instanceof hexConstant) {
        final hexConstant _hexConstant = (hexConstant)e;
        _matched=true;
        _switchResult = ExpressionsTypeProvider.hexType;
      }
    }
    if (!_matched) {
      if (e instanceof AND) {
        final AND _aND = (AND)e;
        _matched=true;
        _switchResult = ExpressionsTypeProvider.boolType;
      }
    }
    if (!_matched) {
      if (e instanceof OR) {
        final OR _oR = (OR)e;
        _matched=true;
        _switchResult = ExpressionsTypeProvider.boolType;
      }
    }
    if (!_matched) {
      if (e instanceof NOT) {
        final NOT _nOT = (NOT)e;
        _matched=true;
        _switchResult = ExpressionsTypeProvider.boolType;
      }
    }
    if (!_matched) {
      if (e instanceof EQUAL_DIFF) {
        final EQUAL_DIFF _eQUAL_DIFF = (EQUAL_DIFF)e;
        _matched=true;
        _switchResult = ExpressionsTypeProvider.boolType;
      }
    }
    if (!_matched) {
      if (e instanceof COMPARISON) {
        final COMPARISON _cOMPARISON = (COMPARISON)e;
        _matched=true;
        _switchResult = ExpressionsTypeProvider.boolType;
      }
    }
    return _switchResult;
  }
  
  protected String _typeFor(final MULT e) {
    String _typeFor = null;
    EXPRESSION _left = e.getLeft();
    if (_left!=null) {
      _typeFor=this.typeFor(_left);
    }
    final String leftType = _typeFor;
    String _typeFor_1 = null;
    EXPRESSION _left_1 = e.getLeft();
    if (_left_1!=null) {
      _typeFor_1=this.typeFor(_left_1);
    }
    final String rightType = _typeFor_1;
    boolean _and = false;
    boolean _equals = Objects.equal(leftType, ExpressionsTypeProvider.intType);
    if (!_equals) {
      _and = false;
    } else {
      boolean _equals_1 = Objects.equal(rightType, ExpressionsTypeProvider.intType);
      _and = (_equals && _equals_1);
    }
    if (_and) {
      return ExpressionsTypeProvider.intType;
    } else {
      boolean _or = false;
      boolean _and_1 = false;
      boolean _equals_2 = Objects.equal(leftType, ExpressionsTypeProvider.realType);
      if (!_equals_2) {
        _and_1 = false;
      } else {
        boolean _equals_3 = Objects.equal(rightType, ExpressionsTypeProvider.intType);
        _and_1 = (_equals_2 && _equals_3);
      }
      if (_and_1) {
        _or = true;
      } else {
        boolean _and_2 = false;
        boolean _equals_4 = Objects.equal(leftType, ExpressionsTypeProvider.intType);
        if (!_equals_4) {
          _and_2 = false;
        } else {
          boolean _equals_5 = Objects.equal(rightType, ExpressionsTypeProvider.realType);
          _and_2 = (_equals_4 && _equals_5);
        }
        _or = (_and_1 || _and_2);
      }
      if (_or) {
        return ExpressionsTypeProvider.realType;
      } else {
        return null;
      }
    }
  }
  
  protected String _typeFor(final DIV e) {
    String _typeFor = null;
    EXPRESSION _left = e.getLeft();
    if (_left!=null) {
      _typeFor=this.typeFor(_left);
    }
    final String leftType = _typeFor;
    String _typeFor_1 = null;
    EXPRESSION _left_1 = e.getLeft();
    if (_left_1!=null) {
      _typeFor_1=this.typeFor(_left_1);
    }
    final String rightType = _typeFor_1;
    boolean _and = false;
    boolean _equals = Objects.equal(leftType, ExpressionsTypeProvider.intType);
    if (!_equals) {
      _and = false;
    } else {
      boolean _equals_1 = Objects.equal(rightType, ExpressionsTypeProvider.intType);
      _and = (_equals && _equals_1);
    }
    if (_and) {
      return ExpressionsTypeProvider.intType;
    } else {
      boolean _or = false;
      boolean _and_1 = false;
      boolean _equals_2 = Objects.equal(leftType, ExpressionsTypeProvider.realType);
      if (!_equals_2) {
        _and_1 = false;
      } else {
        boolean _equals_3 = Objects.equal(rightType, ExpressionsTypeProvider.intType);
        _and_1 = (_equals_2 && _equals_3);
      }
      if (_and_1) {
        _or = true;
      } else {
        boolean _and_2 = false;
        boolean _equals_4 = Objects.equal(leftType, ExpressionsTypeProvider.intType);
        if (!_equals_4) {
          _and_2 = false;
        } else {
          boolean _equals_5 = Objects.equal(rightType, ExpressionsTypeProvider.realType);
          _and_2 = (_equals_4 && _equals_5);
        }
        _or = (_and_1 || _and_2);
      }
      if (_or) {
        return ExpressionsTypeProvider.realType;
      } else {
        return null;
      }
    }
  }
  
  protected String _typeFor(final SUB e) {
    String _typeFor = null;
    EXPRESSION _left = e.getLeft();
    if (_left!=null) {
      _typeFor=this.typeFor(_left);
    }
    final String leftType = _typeFor;
    String _typeFor_1 = null;
    EXPRESSION _left_1 = e.getLeft();
    if (_left_1!=null) {
      _typeFor_1=this.typeFor(_left_1);
    }
    final String rightType = _typeFor_1;
    boolean _and = false;
    boolean _equals = Objects.equal(leftType, ExpressionsTypeProvider.intType);
    if (!_equals) {
      _and = false;
    } else {
      boolean _equals_1 = Objects.equal(rightType, ExpressionsTypeProvider.intType);
      _and = (_equals && _equals_1);
    }
    if (_and) {
      return ExpressionsTypeProvider.intType;
    } else {
      boolean _or = false;
      boolean _and_1 = false;
      boolean _equals_2 = Objects.equal(leftType, ExpressionsTypeProvider.realType);
      if (!_equals_2) {
        _and_1 = false;
      } else {
        boolean _equals_3 = Objects.equal(rightType, ExpressionsTypeProvider.intType);
        _and_1 = (_equals_2 && _equals_3);
      }
      if (_and_1) {
        _or = true;
      } else {
        boolean _and_2 = false;
        boolean _equals_4 = Objects.equal(leftType, ExpressionsTypeProvider.intType);
        if (!_equals_4) {
          _and_2 = false;
        } else {
          boolean _equals_5 = Objects.equal(rightType, ExpressionsTypeProvider.realType);
          _and_2 = (_equals_4 && _equals_5);
        }
        _or = (_and_1 || _and_2);
      }
      if (_or) {
        return ExpressionsTypeProvider.realType;
      } else {
        return null;
      }
    }
  }
  
  protected String _typeFor(final ADD e) {
    String _typeFor = null;
    EXPRESSION _left = e.getLeft();
    if (_left!=null) {
      _typeFor=this.typeFor(_left);
    }
    final String leftType = _typeFor;
    String _typeFor_1 = null;
    EXPRESSION _left_1 = e.getLeft();
    if (_left_1!=null) {
      _typeFor_1=this.typeFor(_left_1);
    }
    final String rightType = _typeFor_1;
    boolean _and = false;
    boolean _equals = Objects.equal(leftType, ExpressionsTypeProvider.intType);
    if (!_equals) {
      _and = false;
    } else {
      boolean _equals_1 = Objects.equal(rightType, ExpressionsTypeProvider.intType);
      _and = (_equals && _equals_1);
    }
    if (_and) {
      return ExpressionsTypeProvider.intType;
    } else {
      boolean _or = false;
      boolean _and_1 = false;
      boolean _equals_2 = Objects.equal(leftType, ExpressionsTypeProvider.realType);
      if (!_equals_2) {
        _and_1 = false;
      } else {
        boolean _equals_3 = Objects.equal(rightType, ExpressionsTypeProvider.intType);
        _and_1 = (_equals_2 && _equals_3);
      }
      if (_and_1) {
        _or = true;
      } else {
        boolean _and_2 = false;
        boolean _equals_4 = Objects.equal(leftType, ExpressionsTypeProvider.intType);
        if (!_equals_4) {
          _and_2 = false;
        } else {
          boolean _equals_5 = Objects.equal(rightType, ExpressionsTypeProvider.realType);
          _and_2 = (_equals_4 && _equals_5);
        }
        _or = (_and_1 || _and_2);
      }
      if (_or) {
        return ExpressionsTypeProvider.realType;
      } else {
        boolean _and_3 = false;
        boolean _equals_6 = Objects.equal(leftType, ExpressionsTypeProvider.strType);
        if (!_equals_6) {
          _and_3 = false;
        } else {
          boolean _equals_7 = Objects.equal(rightType, ExpressionsTypeProvider.strType);
          _and_3 = (_equals_6 && _equals_7);
        }
        if (_and_3) {
          return ExpressionsTypeProvider.strType;
        } else {
          boolean _and_4 = false;
          boolean _equals_8 = Objects.equal(leftType, ExpressionsTypeProvider.bitType);
          if (!_equals_8) {
            _and_4 = false;
          } else {
            boolean _equals_9 = Objects.equal(rightType, ExpressionsTypeProvider.bitType);
            _and_4 = (_equals_8 && _equals_9);
          }
          if (_and_4) {
            return ExpressionsTypeProvider.bitType;
          } else {
            boolean _and_5 = false;
            boolean _equals_10 = Objects.equal(leftType, ExpressionsTypeProvider.hexType);
            if (!_equals_10) {
              _and_5 = false;
            } else {
              boolean _equals_11 = Objects.equal(rightType, ExpressionsTypeProvider.hexType);
              _and_5 = (_equals_10 && _equals_11);
            }
            if (_and_5) {
              return ExpressionsTypeProvider.hexType;
            } else {
              return null;
            }
          }
        }
      }
    }
  }
  
  protected String _typeFor(final VarExpRef e) {
    String _xifexpression = null;
    VAR_CST _vref = e.getVref();
    boolean _equals = Objects.equal(_vref, null);
    if (_equals) {
      return null;
    } else {
      VAR_CST _vref_1 = e.getVref();
      String _VarTypeProvider = this.VarTypeProvider(_vref_1);
      _xifexpression = _VarTypeProvider;
    }
    return _xifexpression;
  }
  
  public String VarTypeProvider(final VAR_CST varcst) {
    String _xblockexpression = null;
    {
      TYPE _type = varcst.getType();
      String _type_1 = null;
      if (_type!=null) {
        _type_1=_type.getType();
      }
      final String typ = _type_1;
      String _switchResult = null;
      boolean _matched = false;
      if (!_matched) {
        boolean _equals = Objects.equal(typ, "int");
        if (_equals) {
          _matched=true;
          _switchResult = ExpressionsTypeProvider.intType;
        }
      }
      if (!_matched) {
        boolean _equals_1 = Objects.equal(typ, "real");
        if (_equals_1) {
          _matched=true;
          _switchResult = ExpressionsTypeProvider.realType;
        }
      }
      if (!_matched) {
        boolean _equals_2 = Objects.equal(typ, "bool");
        if (_equals_2) {
          _matched=true;
          _switchResult = ExpressionsTypeProvider.boolType;
        }
      }
      if (!_matched) {
        boolean _equals_3 = Objects.equal(typ, "enum");
        if (_equals_3) {
          _matched=true;
          _switchResult = ExpressionsTypeProvider.enumType;
        }
      }
      if (!_matched) {
        boolean _equals_4 = Objects.equal(typ, "str");
        if (_equals_4) {
          _matched=true;
          _switchResult = ExpressionsTypeProvider.strType;
        }
      }
      if (!_matched) {
        boolean _equals_5 = Objects.equal(typ, "bit");
        if (_equals_5) {
          _matched=true;
          _switchResult = ExpressionsTypeProvider.bitType;
        }
      }
      if (!_matched) {
        boolean _equals_6 = Objects.equal(typ, "hex");
        if (_equals_6) {
          _matched=true;
          _switchResult = ExpressionsTypeProvider.hexType;
        }
      }
      if (!_matched) {
        _switchResult = null;
      }
      _xblockexpression = (_switchResult);
    }
    return _xblockexpression;
  }
  
  public String typeFor(final EXPRESSION e) {
    if (e instanceof ADD) {
      return _typeFor((ADD)e);
    } else if (e instanceof DIV) {
      return _typeFor((DIV)e);
    } else if (e instanceof MULT) {
      return _typeFor((MULT)e);
    } else if (e instanceof SUB) {
      return _typeFor((SUB)e);
    } else if (e instanceof VarExpRef) {
      return _typeFor((VarExpRef)e);
    } else if (e != null) {
      return _typeFor(e);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(e).toString());
    }
  }
}
