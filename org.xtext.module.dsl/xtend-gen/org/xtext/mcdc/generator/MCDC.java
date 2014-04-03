package org.xtext.mcdc.generator;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.helper.Couple;
import org.xtext.helper.Triple;
import org.xtext.moduleDsl.AND;
import org.xtext.moduleDsl.COMPARISON;
import org.xtext.moduleDsl.EQUAL_DIFF;
import org.xtext.moduleDsl.EXPRESSION;
import org.xtext.moduleDsl.NOT;
import org.xtext.moduleDsl.OR;
import org.xtext.moduleDsl.VarExpRef;

@SuppressWarnings("all")
public class MCDC {
  private int notCount = 0;
  
  private String firstOperator = "";
  
  public int notCount() {
    return this.notCount;
  }
  
  public String firstOperator() {
    return this.firstOperator;
  }
  
  public void mcdcList(final EXPRESSION exp, final List<List<Triple>> resultList) {
    try {
      if ((exp instanceof AND)) {
        ArrayList<Triple> _arrayList = new ArrayList<Triple>();
        ArrayList<Triple> leftList = _arrayList;
        ArrayList<Triple> _arrayList_1 = new ArrayList<Triple>();
        ArrayList<Triple> rightList = _arrayList_1;
        this.firstOperator = "and";
        Triple _triple = new Triple("T", "1", "1");
        leftList.add(_triple);
        Triple _triple_1 = new Triple("T", "2", "1");
        leftList.add(_triple_1);
        Triple _triple_2 = new Triple("F", "3", "1");
        leftList.add(_triple_2);
        Triple _triple_3 = new Triple("T", "1", "0");
        rightList.add(_triple_3);
        Triple _triple_4 = new Triple("F", "2", "0");
        rightList.add(_triple_4);
        Triple _triple_5 = new Triple("T", "3", "0");
        rightList.add(_triple_5);
        final AND andExp = ((AND) exp);
        EXPRESSION _left = andExp.getLeft();
        this.enumMcdc(_left, leftList, resultList);
        EXPRESSION _right = andExp.getRight();
        this.enumMcdc(_right, rightList, resultList);
      } else {
        if ((exp instanceof OR)) {
          ArrayList<Triple> _arrayList_2 = new ArrayList<Triple>();
          ArrayList<Triple> leftList_1 = _arrayList_2;
          ArrayList<Triple> _arrayList_3 = new ArrayList<Triple>();
          ArrayList<Triple> rightList_1 = _arrayList_3;
          this.firstOperator = "or";
          Triple _triple_6 = new Triple("T", "1", "1");
          leftList_1.add(_triple_6);
          Triple _triple_7 = new Triple("F", "2", "1");
          leftList_1.add(_triple_7);
          Triple _triple_8 = new Triple("F", "3", "1");
          leftList_1.add(_triple_8);
          Triple _triple_9 = new Triple("F", "1", "0");
          rightList_1.add(_triple_9);
          Triple _triple_10 = new Triple("T", "2", "0");
          rightList_1.add(_triple_10);
          Triple _triple_11 = new Triple("F", "3", "0");
          rightList_1.add(_triple_11);
          final OR orExp = ((OR) exp);
          EXPRESSION _left_1 = orExp.getLeft();
          this.enumMcdc(_left_1, leftList_1, resultList);
          EXPRESSION _right_1 = orExp.getRight();
          this.enumMcdc(_right_1, rightList_1, resultList);
        } else {
          if ((exp instanceof NOT)) {
            final NOT notExp = ((NOT) exp);
            int _plus = (this.notCount + 1);
            this.notCount = _plus;
            EXPRESSION _exp = notExp.getExp();
            this.mcdcList(_exp, resultList);
          } else {
            boolean _or = false;
            boolean _or_1 = false;
            if ((exp instanceof EQUAL_DIFF)) {
              _or_1 = true;
            } else {
              _or_1 = ((exp instanceof EQUAL_DIFF) || (exp instanceof COMPARISON));
            }
            if (_or_1) {
              _or = true;
            } else {
              _or = (_or_1 || (exp instanceof VarExpRef));
            }
            if (_or) {
              ArrayList<Triple> _arrayList_4 = new ArrayList<Triple>();
              ArrayList<Triple> list = _arrayList_4;
              Triple _triple_12 = new Triple("T", "1", "-1");
              list.add(_triple_12);
              Triple _triple_13 = new Triple("F", "2", "-1");
              list.add(_triple_13);
              resultList.add(list);
            } else {
            }
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void enumMcdc(final EXPRESSION exp, final List<Triple> list, final List<List<Triple>> result) {
    try {
      if ((exp instanceof AND)) {
        ArrayList<Triple> _arrayList = new ArrayList<Triple>();
        ArrayList<Triple> leftList = _arrayList;
        ArrayList<Triple> _arrayList_1 = new ArrayList<Triple>();
        ArrayList<Triple> rightList = _arrayList_1;
        this.doAndEval(list, leftList, rightList);
        EXPRESSION _left = ((AND) exp).getLeft();
        this.enumMcdc(_left, leftList, result);
        EXPRESSION _right = ((AND) exp).getRight();
        this.enumMcdc(_right, rightList, result);
      } else {
        if ((exp instanceof OR)) {
          ArrayList<Triple> _arrayList_2 = new ArrayList<Triple>();
          ArrayList<Triple> leftList_1 = _arrayList_2;
          ArrayList<Triple> _arrayList_3 = new ArrayList<Triple>();
          ArrayList<Triple> rightList_1 = _arrayList_3;
          this.doOrEval(list, leftList_1, rightList_1);
          EXPRESSION _left_1 = ((OR) exp).getLeft();
          this.enumMcdc(_left_1, leftList_1, result);
          EXPRESSION _right_1 = ((OR) exp).getRight();
          this.enumMcdc(_right_1, rightList_1, result);
        } else {
          if ((exp instanceof NOT)) {
            ArrayList<Triple> _arrayList_4 = new ArrayList<Triple>();
            ArrayList<Triple> notList = _arrayList_4;
            this.doNotEval(list, notList);
            EXPRESSION _exp = ((NOT) exp).getExp();
            this.enumMcdc(_exp, notList, result);
          } else {
            boolean _or = false;
            boolean _or_1 = false;
            if ((exp instanceof EQUAL_DIFF)) {
              _or_1 = true;
            } else {
              _or_1 = ((exp instanceof EQUAL_DIFF) || (exp instanceof COMPARISON));
            }
            if (_or_1) {
              _or = true;
            } else {
              _or = (_or_1 || (exp instanceof VarExpRef));
            }
            if (_or) {
              this.doEqCompVarEval(list, result);
            } else {
              Exception _exception = new Exception();
              throw _exception;
            }
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void doAndEval(final List<Triple> triples, final List<Triple> left, final List<Triple> right) {
    try {
      for (final Triple t : triples) {
        String _value = t.getValue();
        String _string = _value.toString();
        boolean _equals = Objects.equal(_string, "T");
        if (_equals) {
          String _index = t.getIndex();
          String _plus = (_index + "1");
          String _position = t.getPosition();
          String _plus_1 = (_position + "1");
          Triple _triple = new Triple("T", _plus, _plus_1);
          left.add(_triple);
          String _index_1 = t.getIndex();
          String _plus_2 = (_index_1 + "1");
          String _position_1 = t.getPosition();
          String _plus_3 = (_position_1 + "0");
          Triple _triple_1 = new Triple("T", _plus_2, _plus_3);
          right.add(_triple_1);
        } else {
          String _value_1 = t.getValue();
          String _string_1 = _value_1.toString();
          boolean _equals_1 = Objects.equal(_string_1, "F");
          if (_equals_1) {
            String _index_2 = t.getIndex();
            String _plus_4 = (_index_2 + "1");
            String _position_2 = t.getPosition();
            String _plus_5 = (_position_2 + "1");
            Triple _triple_2 = new Triple("T", _plus_4, _plus_5);
            left.add(_triple_2);
            String _index_3 = t.getIndex();
            String _plus_6 = (_index_3 + "1");
            String _position_3 = t.getPosition();
            String _plus_7 = (_position_3 + "0");
            Triple _triple_3 = new Triple("F", _plus_6, _plus_7);
            right.add(_triple_3);
            String _index_4 = t.getIndex();
            String _plus_8 = (_index_4 + "2");
            String _position_4 = t.getPosition();
            String _plus_9 = (_position_4 + "1");
            Triple _triple_4 = new Triple("F", _plus_8, _plus_9);
            left.add(_triple_4);
            String _index_5 = t.getIndex();
            String _plus_10 = (_index_5 + "2");
            String _position_5 = t.getPosition();
            String _plus_11 = (_position_5 + "0");
            Triple _triple_5 = new Triple("T", _plus_10, _plus_11);
            right.add(_triple_5);
          } else {
            Exception _exception = new Exception("Illegal argument");
            throw _exception;
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void doOrEval(final List<Triple> triples, final List<Triple> left, final List<Triple> right) {
    try {
      for (final Triple t : triples) {
        String _value = t.getValue();
        String _string = _value.toString();
        boolean _equals = Objects.equal(_string, "F");
        if (_equals) {
          String _index = t.getIndex();
          String _plus = (_index + "1");
          String _position = t.getPosition();
          String _plus_1 = (_position + "1");
          Triple _triple = new Triple("F", _plus, _plus_1);
          left.add(_triple);
          String _index_1 = t.getIndex();
          String _plus_2 = (_index_1 + "1");
          String _position_1 = t.getPosition();
          String _plus_3 = (_position_1 + "0");
          Triple _triple_1 = new Triple("F", _plus_2, _plus_3);
          right.add(_triple_1);
        } else {
          String _value_1 = t.getValue();
          String _string_1 = _value_1.toString();
          boolean _equals_1 = Objects.equal(_string_1, "T");
          if (_equals_1) {
            String _index_2 = t.getIndex();
            String _plus_4 = (_index_2 + "1");
            String _position_2 = t.getPosition();
            String _plus_5 = (_position_2 + "1");
            Triple _triple_2 = new Triple("T", _plus_4, _plus_5);
            left.add(_triple_2);
            String _index_3 = t.getIndex();
            String _plus_6 = (_index_3 + "1");
            String _position_3 = t.getPosition();
            String _plus_7 = (_position_3 + "0");
            Triple _triple_3 = new Triple("F", _plus_6, _plus_7);
            right.add(_triple_3);
            String _index_4 = t.getIndex();
            String _plus_8 = (_index_4 + "2");
            String _position_4 = t.getPosition();
            String _plus_9 = (_position_4 + "1");
            Triple _triple_4 = new Triple("F", _plus_8, _plus_9);
            left.add(_triple_4);
            String _index_5 = t.getIndex();
            String _plus_10 = (_index_5 + "2");
            String _position_5 = t.getPosition();
            String _plus_11 = (_position_5 + "0");
            Triple _triple_5 = new Triple("T", _plus_10, _plus_11);
            right.add(_triple_5);
          } else {
            Exception _exception = new Exception("Illegal argument");
            throw _exception;
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void doNotEval(final List<Triple> triples, final List<Triple> notlist) {
    try {
      for (final Triple t : triples) {
        String _value = t.getValue();
        String _string = _value.toString();
        boolean _equals = Objects.equal(_string, "F");
        if (_equals) {
          String _index = t.getIndex();
          String _position = t.getPosition();
          Triple _triple = new Triple("T", _index, _position);
          notlist.add(_triple);
        } else {
          String _value_1 = t.getValue();
          String _string_1 = _value_1.toString();
          boolean _equals_1 = Objects.equal(_string_1, "T");
          if (_equals_1) {
            String _index_1 = t.getIndex();
            String _position_1 = t.getPosition();
            Triple _triple_1 = new Triple("F", _index_1, _position_1);
            notlist.add(_triple_1);
          } else {
            Exception _exception = new Exception("Illegal argument");
            throw _exception;
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void doEqCompVarEval(final List<Triple> triples, final List<List<Triple>> result) {
    result.add(triples);
  }
  
  public Boolean addIndepVector(final Couple<String,Integer> cp1, final Couple<String,Integer> cp2, final List<List<Couple<String,String>>> list) {
    try {
      Boolean _xblockexpression = null;
      {
        String _first = cp1.getFirst();
        final char[] a1 = _first.toCharArray();
        String _first_1 = cp2.getFirst();
        final char[] a2 = _first_1.toCharArray();
        String _first_2 = cp1.getFirst();
        final int size = _first_2.length();
        Integer _second = cp1.getSecond();
        final int val1 = _second.intValue();
        Integer _second_1 = cp2.getSecond();
        final int val2 = _second_1.intValue();
        String a = "";
        boolean compatible = false;
        int index = (-1);
        Boolean _xifexpression = null;
        boolean _or = false;
        String _first_3 = cp1.getFirst();
        int _length = _first_3.length();
        String _first_4 = cp2.getFirst();
        int _length_1 = _first_4.length();
        boolean _notEquals = (_length != _length_1);
        if (_notEquals) {
          _or = true;
        } else {
          String _first_5 = cp1.getFirst();
          String _first_6 = cp2.getFirst();
          boolean _equals = Objects.equal(_first_5, _first_6);
          _or = (_notEquals || _equals);
        }
        if (_or) {
          Exception _exception = new Exception("Illegal arguments");
          throw _exception;
        } else {
          Boolean _xblockexpression_1 = null;
          {
            int i = 0;
            boolean _dowhile = false;
            do {
              char _get = a1[i];
              char _get_1 = a2[i];
              boolean _equals_1 = (_get == _get_1);
              if (_equals_1) {
                String _plus = (a + "0");
                a = _plus;
              } else {
                String _plus_1 = (a + "1");
                a = _plus_1;
              }
              int _plus_2 = (i + 1);
              int _i = i = _plus_2;
              boolean _lessThan = (_i < size);
              _dowhile = _lessThan;
            } while(_dowhile);
            int j = 0;
            int cnt = 0;
            int asize = a.length();
            boolean _dowhile_1 = false;
            do {
              char _charAt = a.charAt(j);
              String _string = Character.valueOf(_charAt).toString();
              boolean _equals_2 = Objects.equal(_string, "1");
              if (_equals_2) {
                int _plus_3 = (cnt + 1);
                cnt = _plus_3;
                index = j;
              }
              int _plus_4 = (j + 1);
              int _j = j = _plus_4;
              boolean _lessThan_1 = (_j < asize);
              _dowhile_1 = _lessThan_1;
            } while(_dowhile_1);
            Boolean _xifexpression_1 = null;
            boolean _equals_3 = (cnt == 1);
            if (_equals_3) {
              boolean _xblockexpression_2 = false;
              {
                compatible = true;
                int _plus_5 = (val1 + 1);
                cp1.setSecond(Integer.valueOf(_plus_5));
                int _plus_6 = (val2 + 1);
                cp2.setSecond(Integer.valueOf(_plus_6));
                List<Couple<String,String>> _get_2 = list.get(index);
                String _first_7 = cp1.getFirst();
                String _first_8 = cp2.getFirst();
                Couple<String,String> _couple = new Couple<String,String>(_first_7, _first_8);
                boolean _add = _get_2.add(_couple);
                _xblockexpression_2 = (_add);
              }
              _xifexpression_1 = Boolean.valueOf(_xblockexpression_2);
            }
            _xblockexpression_1 = (_xifexpression_1);
          }
          _xifexpression = _xblockexpression_1;
        }
        _xblockexpression = (_xifexpression);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String deleteLast(final String str) {
    final int strSize = str.length();
    String myStr = "";
    boolean _greaterThan = (strSize > 0);
    if (_greaterThan) {
      int _minus = (strSize - 1);
      String _substring = str.substring(0, _minus);
      myStr = _substring;
    }
    return myStr;
  }
  
  public String deleteIfSup1(final String str) {
    final int strSize = str.length();
    boolean _or = false;
    boolean _equals = (strSize == 1);
    if (_equals) {
      _or = true;
    } else {
      boolean _equals_1 = (strSize == 0);
      _or = (_equals || _equals_1);
    }
    if (_or) {
      return str;
    } else {
      int _minus = (strSize - 1);
      final String myStr = str.substring(0, _minus);
      return myStr;
    }
  }
  
  public String lastChar(final String str) {
    final int strSize = str.length();
    String myStr = "";
    boolean _greaterThan = (strSize > 0);
    if (_greaterThan) {
      int _minus = (strSize - 1);
      char _charAt = str.charAt(_minus);
      String _string = Character.valueOf(_charAt).toString();
      myStr = _string;
    }
    return myStr;
  }
  
  public List<Triple> merge(final List<Triple> left, final List<Triple> right) {
    try {
      ArrayList<Triple> _arrayList = new ArrayList<Triple>();
      final ArrayList<Triple> list = _arrayList;
      for (final Triple t1 : left) {
        {
          String index = t1.getIndex();
          String position = t1.getPosition();
          for (final Triple t2 : right) {
            String _index = t2.getIndex();
            boolean _equals = Objects.equal(index, _index);
            if (_equals) {
              String _value = t1.getValue();
              String _value_1 = t2.getValue();
              String _plus = (_value + _value_1);
              String _deleteIfSup1 = this.deleteIfSup1(index);
              String _deleteLast = this.deleteLast(position);
              Triple _triple = new Triple(_plus, _deleteIfSup1, _deleteLast);
              list.add(_triple);
            }
          }
        }
      }
      return list;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public List<Triple> linkValues(final List<List<Triple>> resultList) {
    try {
      List<Triple> _xblockexpression = null;
      {
        List<List<Triple>> myList = resultList;
        int _size = myList.size();
        boolean _equals = (_size == 0);
        if (_equals) {
          Exception _exception = new Exception("List is empty");
          throw _exception;
        }
        int i = 0;
        boolean _dowhile = false;
        do {
          {
            int _size_1 = myList.size();
            boolean _equals_1 = (_size_1 == 1);
            if (_equals_1) {
              return myList.get(0);
            }
            final List<Triple> tmpList = myList.get(i);
            Triple _get = tmpList.get(0);
            String _position = _get.getPosition();
            final String delPosition = this.deleteLast(_position);
            Triple _get_1 = tmpList.get(0);
            String _position_1 = _get_1.getPosition();
            String _lastChar = this.lastChar(_position_1);
            final int n1 = Integer.parseInt(_lastChar);
            final Function1<List<Triple>,Boolean> _function = new Function1<List<Triple>,Boolean>() {
                public Boolean apply(final List<Triple> it) {
                  boolean _and = false;
                  boolean _and_1 = false;
                  boolean _notEquals = (!Objects.equal(it, tmpList));
                  if (!_notEquals) {
                    _and_1 = false;
                  } else {
                    Triple _get = it.get(0);
                    String _position = _get.getPosition();
                    String _deleteLast = MCDC.this.deleteLast(_position);
                    boolean _equals = Objects.equal(_deleteLast, delPosition);
                    _and_1 = (_notEquals && _equals);
                  }
                  if (!_and_1) {
                    _and = false;
                  } else {
                    Triple _get_1 = it.get(0);
                    String _position_1 = _get_1.getPosition();
                    String _lastChar = MCDC.this.lastChar(_position_1);
                    int _parseInt = Integer.parseInt(_lastChar);
                    int _minus = (n1 - _parseInt);
                    boolean _equals_1 = (_minus == 1);
                    _and = (_and_1 && _equals_1);
                  }
                  return Boolean.valueOf(_and);
                }
              };
            final List<Triple> cmp = IterableExtensions.<List<Triple>>findFirst(myList, _function);
            boolean _notEquals = (!Objects.equal(cmp, null));
            if (_notEquals) {
              List<Triple> _merge = this.merge(tmpList, cmp);
              myList.set(i, _merge);
              myList.remove(cmp);
            }
          }
          int _plus = (i + 1);
          int _i = i = _plus;
          int _size_1 = myList.size();
          boolean _lessThan = (_i < _size_1);
          _dowhile = _lessThan;
        } while(_dowhile);
        List<Triple> _linkValues = this.linkValues(myList);
        _xblockexpression = (_linkValues);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void printList(final List<Triple> list) {
    System.out.print("[ ");
    for (final Triple t : list) {
      String _value = t.getValue();
      String _plus = ("(" + _value);
      String _plus_1 = (_plus + ", ");
      String _index = t.getIndex();
      String _plus_2 = (_plus_1 + _index);
      String _plus_3 = (_plus_2 + ", ");
      String _position = t.getPosition();
      String _plus_4 = (_plus_3 + _position);
      String _plus_5 = (_plus_4 + ") ");
      System.out.println(_plus_5);
    }
    System.out.println("] ");
  }
  
  public void printListofList(final List<List<Triple>> listOfList) {
    System.out.print("[ ");
    for (final List<Triple> t : listOfList) {
      this.printList(t);
    }
    System.out.println("] ");
  }
  
  public String evalOperation(final Triple t) {
    String _xblockexpression = null;
    {
      String eval = "";
      String _xifexpression = null;
      int _modulo = (this.notCount % 2);
      boolean _equals = (_modulo == 0);
      if (_equals) {
        String _xifexpression_1 = null;
        boolean _equals_1 = Objects.equal(this.firstOperator, "and");
        if (_equals_1) {
          String _xifexpression_2 = null;
          String _index = t.getIndex();
          boolean _equals_2 = Objects.equal(_index, "1");
          if (_equals_2) {
            String _eval = eval = "T";
            _xifexpression_2 = _eval;
          } else {
            String _xifexpression_3 = null;
            boolean _or = false;
            String _index_1 = t.getIndex();
            boolean _equals_3 = Objects.equal(_index_1, "2");
            if (_equals_3) {
              _or = true;
            } else {
              String _index_2 = t.getIndex();
              boolean _equals_4 = Objects.equal(_index_2, "3");
              _or = (_equals_3 || _equals_4);
            }
            if (_or) {
              String _eval_1 = eval = "F";
              _xifexpression_3 = _eval_1;
            }
            _xifexpression_2 = _xifexpression_3;
          }
          _xifexpression_1 = _xifexpression_2;
        } else {
          String _xifexpression_4 = null;
          boolean _equals_5 = Objects.equal(this.firstOperator, "or");
          if (_equals_5) {
            String _xifexpression_5 = null;
            String _index_3 = t.getIndex();
            boolean _equals_6 = Objects.equal(_index_3, "3");
            if (_equals_6) {
              String _eval_2 = eval = "F";
              _xifexpression_5 = _eval_2;
            } else {
              String _xifexpression_6 = null;
              boolean _or_1 = false;
              String _index_4 = t.getIndex();
              boolean _equals_7 = Objects.equal(_index_4, "1");
              if (_equals_7) {
                _or_1 = true;
              } else {
                String _index_5 = t.getIndex();
                boolean _equals_8 = Objects.equal(_index_5, "2");
                _or_1 = (_equals_7 || _equals_8);
              }
              if (_or_1) {
                String _eval_3 = eval = "T";
                _xifexpression_6 = _eval_3;
              }
              _xifexpression_5 = _xifexpression_6;
            }
            _xifexpression_4 = _xifexpression_5;
          } else {
            String _value = t.getValue();
            String _eval_4 = eval = _value;
            _xifexpression_4 = _eval_4;
          }
          _xifexpression_1 = _xifexpression_4;
        }
        _xifexpression = _xifexpression_1;
      } else {
        String _xifexpression_7 = null;
        boolean _equals_9 = Objects.equal(this.firstOperator, "and");
        if (_equals_9) {
          String _xifexpression_8 = null;
          String _index_6 = t.getIndex();
          boolean _equals_10 = Objects.equal(_index_6, "1");
          if (_equals_10) {
            String _eval_5 = eval = "F";
            _xifexpression_8 = _eval_5;
          } else {
            String _xifexpression_9 = null;
            boolean _or_2 = false;
            String _index_7 = t.getIndex();
            boolean _equals_11 = Objects.equal(_index_7, "2");
            if (_equals_11) {
              _or_2 = true;
            } else {
              String _index_8 = t.getIndex();
              boolean _equals_12 = Objects.equal(_index_8, "3");
              _or_2 = (_equals_11 || _equals_12);
            }
            if (_or_2) {
              String _eval_6 = eval = "T";
              _xifexpression_9 = _eval_6;
            }
            _xifexpression_8 = _xifexpression_9;
          }
          _xifexpression_7 = _xifexpression_8;
        } else {
          String _xifexpression_10 = null;
          boolean _equals_13 = Objects.equal(this.firstOperator, "or");
          if (_equals_13) {
            String _xifexpression_11 = null;
            String _index_9 = t.getIndex();
            boolean _equals_14 = Objects.equal(_index_9, "3");
            if (_equals_14) {
              String _eval_7 = eval = "T";
              _xifexpression_11 = _eval_7;
            } else {
              String _xifexpression_12 = null;
              boolean _or_3 = false;
              String _index_10 = t.getIndex();
              boolean _equals_15 = Objects.equal(_index_10, "1");
              if (_equals_15) {
                _or_3 = true;
              } else {
                String _index_11 = t.getIndex();
                boolean _equals_16 = Objects.equal(_index_11, "2");
                _or_3 = (_equals_15 || _equals_16);
              }
              if (_or_3) {
                String _eval_8 = eval = "F";
                _xifexpression_12 = _eval_8;
              }
              _xifexpression_11 = _xifexpression_12;
            }
            _xifexpression_10 = _xifexpression_11;
          } else {
            String _xifexpression_13 = null;
            String _value_1 = t.getValue();
            boolean _equals_17 = Objects.equal(_value_1, "F");
            if (_equals_17) {
              String _eval_9 = eval = "T";
              _xifexpression_13 = _eval_9;
            } else {
              String _eval_10 = eval = "F";
              _xifexpression_13 = _eval_10;
            }
            _xifexpression_10 = _xifexpression_13;
          }
          _xifexpression_7 = _xifexpression_10;
        }
        _xifexpression = _xifexpression_7;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
}
