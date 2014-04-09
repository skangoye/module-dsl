package org.xtext.mcdc.generator;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.helper.Couple;
import org.xtext.helper.Triplet;
import org.xtext.moduleDsl.ADD;
import org.xtext.moduleDsl.AND;
import org.xtext.moduleDsl.ASSIGN_INSTR;
import org.xtext.moduleDsl.COMPARISON;
import org.xtext.moduleDsl.DIV;
import org.xtext.moduleDsl.EQUAL_DIFF;
import org.xtext.moduleDsl.ERROR_INSTR;
import org.xtext.moduleDsl.EXPRESSION;
import org.xtext.moduleDsl.IF_INSTR;
import org.xtext.moduleDsl.INSTRUCTION;
import org.xtext.moduleDsl.LOOP_INSTR;
import org.xtext.moduleDsl.MULT;
import org.xtext.moduleDsl.NOT;
import org.xtext.moduleDsl.NULL_INSTR;
import org.xtext.moduleDsl.OR;
import org.xtext.moduleDsl.SUB;
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
public class MCDC_GEN {
  private int notCount = 0;
  
  private String firstOperator = "";
  
  /**
   * This method counts the the number of "not" operator crossed before getting a first operator of type "and/or" in the parse tree
   * Ex: this expression <not (a and b)> returns notCount = 1 while < not a and not b> returns 0 as notCount value.
   */
  public int notCount() {
    return this.notCount;
  }
  
  /**
   * This methods returns the first crossed operator of type "and/or" in the parse tree
   */
  public String firstOperator() {
    return this.firstOperator;
  }
  
  /**
   * This method stores in the list "resultList" the parse tree's leaf values, as well as theirs corresponding sequences of crossed operator
   * and theirs different positions in the parse tree
   * It is a top down approach based on a depth-first-search
   */
  public void mcdcGen(final EXPRESSION exp, final List<List<Couple<Couple<String,String>,Couple<String,String>>>> resultList) {
    try {
      if ((exp instanceof AND)) {
        Couple<String,String> _couple = new Couple<String,String>("", "");
        Couple<String,String> _couple_1 = new Couple<String,String>("1", "a");
        Couple<Couple<String,String>,Couple<String,String>> _couple_2 = new Couple<Couple<String,String>,Couple<String,String>>(_couple, _couple_1);
        Couple<Couple<String,String>,Couple<String,String>> leftCouple = _couple_2;
        Couple<String,String> _couple_3 = new Couple<String,String>("", "");
        Couple<String,String> _couple_4 = new Couple<String,String>("0", "a");
        Couple<Couple<String,String>,Couple<String,String>> _couple_5 = new Couple<Couple<String,String>,Couple<String,String>>(_couple_3, _couple_4);
        Couple<Couple<String,String>,Couple<String,String>> rightCouple = _couple_5;
        this.firstOperator = "and";
        final AND andExp = ((AND) exp);
        EXPRESSION _left = andExp.getLeft();
        this.enumMcdc(_left, leftCouple, resultList);
        EXPRESSION _right = andExp.getRight();
        this.enumMcdc(_right, rightCouple, resultList);
      } else {
        if ((exp instanceof OR)) {
          Couple<String,String> _couple_6 = new Couple<String,String>("", "");
          Couple<String,String> _couple_7 = new Couple<String,String>("1", "o");
          Couple<Couple<String,String>,Couple<String,String>> _couple_8 = new Couple<Couple<String,String>,Couple<String,String>>(_couple_6, _couple_7);
          Couple<Couple<String,String>,Couple<String,String>> leftCouple_1 = _couple_8;
          Couple<String,String> _couple_9 = new Couple<String,String>("", "");
          Couple<String,String> _couple_10 = new Couple<String,String>("0", "o");
          Couple<Couple<String,String>,Couple<String,String>> _couple_11 = new Couple<Couple<String,String>,Couple<String,String>>(_couple_9, _couple_10);
          Couple<Couple<String,String>,Couple<String,String>> rightCouple_1 = _couple_11;
          this.firstOperator = "or";
          final OR orExp = ((OR) exp);
          EXPRESSION _left_1 = orExp.getLeft();
          this.enumMcdc(_left_1, leftCouple_1, resultList);
          EXPRESSION _right_1 = orExp.getRight();
          this.enumMcdc(_right_1, rightCouple_1, resultList);
        } else {
          if ((exp instanceof NOT)) {
            final NOT notExp = ((NOT) exp);
            int _plus = (this.notCount + 1);
            this.notCount = _plus;
            EXPRESSION _exp = notExp.getExp();
            this.mcdcGen(_exp, resultList);
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
              ArrayList<Couple<Couple<String,String>,Couple<String,String>>> _arrayList = new ArrayList<Couple<Couple<String,String>,Couple<String,String>>>();
              ArrayList<Couple<Couple<String,String>,Couple<String,String>>> list = _arrayList;
              Couple<String,String> _couple_12 = new Couple<String,String>("F", "F");
              Couple<String,String> _couple_13 = new Couple<String,String>("", "");
              Couple<Couple<String,String>,Couple<String,String>> _couple_14 = new Couple<Couple<String,String>,Couple<String,String>>(_couple_12, _couple_13);
              list.add(_couple_14);
              Couple<String,String> _couple_15 = new Couple<String,String>("T", "T");
              Couple<String,String> _couple_16 = new Couple<String,String>("", "");
              Couple<Couple<String,String>,Couple<String,String>> _couple_17 = new Couple<Couple<String,String>,Couple<String,String>>(_couple_15, _couple_16);
              list.add(_couple_17);
              resultList.add(list);
            } else {
              Exception _exception = new Exception("Illegal boolean expression");
              throw _exception;
            }
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void enumMcdc(final EXPRESSION exp, final Couple<Couple<String,String>,Couple<String,String>> couple, final List<List<Couple<Couple<String,String>,Couple<String,String>>>> result) {
    try {
      if ((exp instanceof AND)) {
        Couple<String,String> _second = couple.getSecond();
        final String position = _second.getFirst();
        Couple<String,String> _second_1 = couple.getSecond();
        final String parent = _second_1.getSecond();
        Couple<String,String> _couple = new Couple<String,String>("", "");
        String _plus = (position + "1");
        String _plus_1 = ("a" + parent);
        Couple<String,String> _couple_1 = new Couple<String,String>(_plus, _plus_1);
        Couple<Couple<String,String>,Couple<String,String>> _couple_2 = new Couple<Couple<String,String>,Couple<String,String>>(_couple, _couple_1);
        Couple<Couple<String,String>,Couple<String,String>> leftCouple = _couple_2;
        Couple<String,String> _couple_3 = new Couple<String,String>("", "");
        String _plus_2 = (position + "0");
        String _plus_3 = ("a" + parent);
        Couple<String,String> _couple_4 = new Couple<String,String>(_plus_2, _plus_3);
        Couple<Couple<String,String>,Couple<String,String>> _couple_5 = new Couple<Couple<String,String>,Couple<String,String>>(_couple_3, _couple_4);
        Couple<Couple<String,String>,Couple<String,String>> rightCouple = _couple_5;
        EXPRESSION _left = ((AND) exp).getLeft();
        this.enumMcdc(_left, leftCouple, result);
        EXPRESSION _right = ((AND) exp).getRight();
        this.enumMcdc(_right, rightCouple, result);
      } else {
        if ((exp instanceof OR)) {
          Couple<String,String> _second_2 = couple.getSecond();
          final String position_1 = _second_2.getFirst();
          Couple<String,String> _second_3 = couple.getSecond();
          final String parent_1 = _second_3.getSecond();
          Couple<String,String> _couple_6 = new Couple<String,String>("", "");
          String _plus_4 = (position_1 + "1");
          String _plus_5 = ("o" + parent_1);
          Couple<String,String> _couple_7 = new Couple<String,String>(_plus_4, _plus_5);
          Couple<Couple<String,String>,Couple<String,String>> _couple_8 = new Couple<Couple<String,String>,Couple<String,String>>(_couple_6, _couple_7);
          Couple<Couple<String,String>,Couple<String,String>> leftCouple_1 = _couple_8;
          Couple<String,String> _couple_9 = new Couple<String,String>("", "");
          String _plus_6 = (position_1 + "0");
          String _plus_7 = ("o" + parent_1);
          Couple<String,String> _couple_10 = new Couple<String,String>(_plus_6, _plus_7);
          Couple<Couple<String,String>,Couple<String,String>> _couple_11 = new Couple<Couple<String,String>,Couple<String,String>>(_couple_9, _couple_10);
          Couple<Couple<String,String>,Couple<String,String>> rightCouple_1 = _couple_11;
          EXPRESSION _left_1 = ((OR) exp).getLeft();
          this.enumMcdc(_left_1, leftCouple_1, result);
          EXPRESSION _right_1 = ((OR) exp).getRight();
          this.enumMcdc(_right_1, rightCouple_1, result);
        } else {
          if ((exp instanceof NOT)) {
            Couple<String,String> _second_4 = couple.getSecond();
            final String position_2 = _second_4.getFirst();
            Couple<String,String> _second_5 = couple.getSecond();
            final String parent_2 = _second_5.getSecond();
            Couple<String,String> _couple_12 = new Couple<String,String>("", "");
            String _plus_8 = ("n" + parent_2);
            Couple<String,String> _couple_13 = new Couple<String,String>(position_2, _plus_8);
            Couple<Couple<String,String>,Couple<String,String>> _couple_14 = new Couple<Couple<String,String>,Couple<String,String>>(_couple_12, _couple_13);
            Couple<Couple<String,String>,Couple<String,String>> notCouple = _couple_14;
            EXPRESSION _exp = ((NOT) exp).getExp();
            this.enumMcdc(_exp, notCouple, result);
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
              Couple<String,String> _second_6 = couple.getSecond();
              final String position_3 = _second_6.getFirst();
              Couple<String,String> _second_7 = couple.getSecond();
              final String parent_3 = _second_7.getSecond();
              ArrayList<Couple<Couple<String,String>,Couple<String,String>>> _arrayList = new ArrayList<Couple<Couple<String,String>,Couple<String,String>>>();
              ArrayList<Couple<Couple<String,String>,Couple<String,String>>> list = _arrayList;
              Couple<String,String> _couple_15 = new Couple<String,String>("F", "F");
              Couple<String,String> _couple_16 = new Couple<String,String>(position_3, parent_3);
              Couple<Couple<String,String>,Couple<String,String>> _couple_17 = new Couple<Couple<String,String>,Couple<String,String>>(_couple_15, _couple_16);
              list.add(_couple_17);
              Couple<String,String> _couple_18 = new Couple<String,String>("T", "T");
              Couple<String,String> _couple_19 = new Couple<String,String>(position_3, parent_3);
              Couple<Couple<String,String>,Couple<String,String>> _couple_20 = new Couple<Couple<String,String>,Couple<String,String>>(_couple_18, _couple_19);
              list.add(_couple_20);
              result.add(list);
            } else {
              Exception _exception = new Exception("Illegal boolean expression");
              throw _exception;
            }
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * This method is a bottom up approach. It merges the parse tree siblings values until reaching its root.
   * The merging policy is
   */
  public List<Couple<Couple<String,String>,Couple<String,String>>> linkValues(final List<List<Couple<Couple<String,String>,Couple<String,String>>>> resultList) {
    try {
      List<Couple<Couple<String,String>,Couple<String,String>>> _xblockexpression = null;
      {
        List<List<Couple<Couple<String,String>,Couple<String,String>>>> myList = resultList;
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
              int _modulo = (this.notCount % 2);
              boolean _equals_2 = (_modulo == 0);
              if (_equals_2) {
                return myList.get(0);
              } else {
                List<Couple<Couple<String,String>,Couple<String,String>>> _get = myList.get(0);
                return this.invertValues(_get);
              }
            }
            final List<Couple<Couple<String,String>,Couple<String,String>>> tmpList = myList.get(i);
            Couple<Couple<String,String>,Couple<String,String>> _get_1 = tmpList.get(0);
            Couple<String,String> _second = _get_1.getSecond();
            final String position = _second.getFirst();
            final String parentPosition = this.deleteLastChar(position);
            String _lastChar = this.getLastChar(position);
            final int toInt = Integer.parseInt(_lastChar);
            final Function1<List<Couple<Couple<String,String>,Couple<String,String>>>,Boolean> _function = new Function1<List<Couple<Couple<String,String>,Couple<String,String>>>,Boolean>() {
                public Boolean apply(final List<Couple<Couple<String,String>,Couple<String,String>>> it) {
                  boolean _and = false;
                  boolean _and_1 = false;
                  boolean _notEquals = (!Objects.equal(it, tmpList));
                  if (!_notEquals) {
                    _and_1 = false;
                  } else {
                    Couple<Couple<String,String>,Couple<String,String>> _get = it.get(0);
                    Couple<String,String> _second = _get.getSecond();
                    String _first = _second.getFirst();
                    String _deleteLastChar = MCDC_GEN.this.deleteLastChar(_first);
                    boolean _equals = Objects.equal(_deleteLastChar, parentPosition);
                    _and_1 = (_notEquals && _equals);
                  }
                  if (!_and_1) {
                    _and = false;
                  } else {
                    Couple<Couple<String,String>,Couple<String,String>> _get_1 = it.get(0);
                    Couple<String,String> _second_1 = _get_1.getSecond();
                    String _first_1 = _second_1.getFirst();
                    String _lastChar = MCDC_GEN.this.getLastChar(_first_1);
                    int _parseInt = Integer.parseInt(_lastChar);
                    int _minus = (toInt - _parseInt);
                    boolean _equals_1 = (_minus == 1);
                    _and = (_and_1 && _equals_1);
                  }
                  return Boolean.valueOf(_and);
                }
              };
            final List<Couple<Couple<String,String>,Couple<String,String>>> cmp = IterableExtensions.<List<Couple<Couple<String,String>,Couple<String,String>>>>findFirst(myList, _function);
            boolean _notEquals = (!Objects.equal(cmp, null));
            if (_notEquals) {
              List<Couple<Couple<String,String>,Couple<String,String>>> _mergeResults = this.mergeResults(tmpList, cmp);
              myList.set(i, _mergeResults);
              myList.remove(cmp);
            }
          }
          int _plus = (i + 1);
          int _i = i = _plus;
          int _size_1 = myList.size();
          boolean _lessThan = (_i < _size_1);
          _dowhile = _lessThan;
        } while(_dowhile);
        List<Couple<Couple<String,String>,Couple<String,String>>> _linkValues = this.linkValues(myList);
        _xblockexpression = (_linkValues);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * This method merge the results of two sequences (Typically two siblings'results)
   */
  public List<Couple<Couple<String,String>,Couple<String,String>>> mergeResults(final List<Couple<Couple<String,String>,Couple<String,String>>> left, final List<Couple<Couple<String,String>,Couple<String,String>>> right) {
    List<Couple<Couple<String,String>,Couple<String,String>>> listLeft = left;
    List<Couple<Couple<String,String>,Couple<String,String>>> listRight = right;
    Couple<Couple<String,String>,Couple<String,String>> _get = listLeft.get(0);
    Couple<String,String> _second = _get.getSecond();
    String _second_1 = _second.getSecond();
    char list1NextParent = _second_1.charAt(0);
    String _string = Character.valueOf(list1NextParent).toString();
    boolean _equals = Objects.equal(_string, "n");
    boolean _while = _equals;
    while (_while) {
      {
        List<Couple<Couple<String,String>,Couple<String,String>>> _invertValues = this.invertValues(listLeft);
        listLeft = _invertValues;
        Couple<Couple<String,String>,Couple<String,String>> _get_1 = listLeft.get(0);
        Couple<String,String> _second_2 = _get_1.getSecond();
        String _second_3 = _second_2.getSecond();
        char _charAt = _second_3.charAt(0);
        list1NextParent = _charAt;
      }
      String _string_1 = Character.valueOf(list1NextParent).toString();
      boolean _equals_1 = Objects.equal(_string_1, "n");
      _while = _equals_1;
    }
    Couple<Couple<String,String>,Couple<String,String>> _get_1 = listRight.get(0);
    Couple<String,String> _second_2 = _get_1.getSecond();
    String _second_3 = _second_2.getSecond();
    char list2NextParent = _second_3.charAt(0);
    String _string_1 = Character.valueOf(list2NextParent).toString();
    boolean _equals_1 = Objects.equal(_string_1, "n");
    boolean _while_1 = _equals_1;
    while (_while_1) {
      {
        List<Couple<Couple<String,String>,Couple<String,String>>> _invertValues = this.invertValues(listRight);
        listRight = _invertValues;
        Couple<Couple<String,String>,Couple<String,String>> _get_2 = listRight.get(0);
        Couple<String,String> _second_4 = _get_2.getSecond();
        String _second_5 = _second_4.getSecond();
        char _charAt = _second_5.charAt(0);
        list2NextParent = _charAt;
      }
      String _string_2 = Character.valueOf(list2NextParent).toString();
      boolean _equals_2 = Objects.equal(_string_2, "n");
      _while_1 = _equals_2;
    }
    Couple<Couple<String,String>,Couple<String,String>> _get_2 = listLeft.get(0);
    Couple<String,String> _second_4 = _get_2.getSecond();
    String _first = _second_4.getFirst();
    final String position = this.deleteLastChar(_first);
    Couple<Couple<String,String>,Couple<String,String>> _get_3 = listLeft.get(0);
    Couple<String,String> _second_5 = _get_3.getSecond();
    String _second_6 = _second_5.getSecond();
    final String parent = this.deleteFisrtChar(_second_6);
    String _string_2 = Character.valueOf(list1NextParent).toString();
    String _string_3 = Character.valueOf(list2NextParent).toString();
    return this.optimMerge(listLeft, listRight, _string_2, _string_3, position, parent);
  }
  
  public ArrayList<Couple<Couple<String,String>,Couple<String,String>>> optimMerge(final List<Couple<Couple<String,String>,Couple<String,String>>> l1, final List<Couple<Couple<String,String>,Couple<String,String>>> l2, final String p1, final String p2, final String position, final String parent) {
    try {
      final Function1<Couple<Couple<String,String>,Couple<String,String>>,Boolean> _function = new Function1<Couple<Couple<String,String>,Couple<String,String>>,Boolean>() {
          public Boolean apply(final Couple<Couple<String,String>,Couple<String,String>> it) {
            Couple<String,String> _first = it.getFirst();
            String _second = _first.getSecond();
            boolean _equals = Objects.equal(_second, "T");
            return Boolean.valueOf(_equals);
          }
        };
      Iterable<Couple<Couple<String,String>,Couple<String,String>>> leftTrue = IterableExtensions.<Couple<Couple<String,String>,Couple<String,String>>>filter(l1, _function);
      final Function1<Couple<Couple<String,String>,Couple<String,String>>,Boolean> _function_1 = new Function1<Couple<Couple<String,String>,Couple<String,String>>,Boolean>() {
          public Boolean apply(final Couple<Couple<String,String>,Couple<String,String>> it) {
            Couple<String,String> _first = it.getFirst();
            String _second = _first.getSecond();
            boolean _equals = Objects.equal(_second, "F");
            return Boolean.valueOf(_equals);
          }
        };
      Iterable<Couple<Couple<String,String>,Couple<String,String>>> leftFalse = IterableExtensions.<Couple<Couple<String,String>,Couple<String,String>>>filter(l1, _function_1);
      ArrayList<Couple<String,String>> _arrayList = new ArrayList<Couple<String,String>>();
      ArrayList<Couple<String,String>> leftCouple = _arrayList;
      ArrayList<Couple<Couple<String,String>,Couple<String,String>>> _arrayList_1 = new ArrayList<Couple<Couple<String,String>,Couple<String,String>>>();
      final ArrayList<Couple<Couple<String,String>,Couple<String,String>>> resultList = _arrayList_1;
      for (final Couple<Couple<String,String>,Couple<String,String>> i : leftFalse) {
        for (final Couple<Couple<String,String>,Couple<String,String>> j : leftTrue) {
          Couple<String,String> _first = i.getFirst();
          String _first_1 = _first.getFirst();
          Couple<String,String> _first_2 = j.getFirst();
          String _first_3 = _first_2.getFirst();
          boolean _independantPairs = this.independantPairs(_first_1, _first_3);
          if (_independantPairs) {
            Couple<String,String> _first_4 = i.getFirst();
            String _first_5 = _first_4.getFirst();
            Couple<String,String> _first_6 = j.getFirst();
            String _first_7 = _first_6.getFirst();
            Couple<String,String> _couple = new Couple<String,String>(_first_5, _first_7);
            leftCouple.add(_couple);
          }
        }
      }
      final Function1<Couple<Couple<String,String>,Couple<String,String>>,Boolean> _function_2 = new Function1<Couple<Couple<String,String>,Couple<String,String>>,Boolean>() {
          public Boolean apply(final Couple<Couple<String,String>,Couple<String,String>> it) {
            Couple<String,String> _first = it.getFirst();
            String _second = _first.getSecond();
            boolean _equals = Objects.equal(_second, "T");
            return Boolean.valueOf(_equals);
          }
        };
      Iterable<Couple<Couple<String,String>,Couple<String,String>>> rightTrue = IterableExtensions.<Couple<Couple<String,String>,Couple<String,String>>>filter(l2, _function_2);
      final Function1<Couple<Couple<String,String>,Couple<String,String>>,Boolean> _function_3 = new Function1<Couple<Couple<String,String>,Couple<String,String>>,Boolean>() {
          public Boolean apply(final Couple<Couple<String,String>,Couple<String,String>> it) {
            Couple<String,String> _first = it.getFirst();
            String _second = _first.getSecond();
            boolean _equals = Objects.equal(_second, "F");
            return Boolean.valueOf(_equals);
          }
        };
      Iterable<Couple<Couple<String,String>,Couple<String,String>>> rightFalse = IterableExtensions.<Couple<Couple<String,String>,Couple<String,String>>>filter(l2, _function_3);
      ArrayList<Couple<String,String>> _arrayList_2 = new ArrayList<Couple<String,String>>();
      ArrayList<Couple<String,String>> rightCouple = _arrayList_2;
      for (final Couple<Couple<String,String>,Couple<String,String>> ii : rightFalse) {
        for (final Couple<Couple<String,String>,Couple<String,String>> jj : rightTrue) {
          Couple<String,String> _first_8 = ii.getFirst();
          String _first_9 = _first_8.getFirst();
          Couple<String,String> _first_10 = jj.getFirst();
          String _first_11 = _first_10.getFirst();
          boolean _independantPairs_1 = this.independantPairs(_first_9, _first_11);
          if (_independantPairs_1) {
            Couple<String,String> _first_12 = ii.getFirst();
            String _first_13 = _first_12.getFirst();
            Couple<String,String> _first_14 = jj.getFirst();
            String _first_15 = _first_14.getFirst();
            Couple<String,String> _couple_1 = new Couple<String,String>(_first_13, _first_15);
            rightCouple.add(_couple_1);
          }
        }
      }
      TreeSet<String> _treeSet = new TreeSet<String>();
      final TreeSet<String> setWithTrue = _treeSet;
      TreeSet<String> _treeSet_1 = new TreeSet<String>();
      final TreeSet<String> setWithFalse = _treeSet_1;
      boolean _notEquals = (!Objects.equal(p1, p2));
      if (_notEquals) {
        Exception _exception = new Exception("Parent mismatch");
        throw _exception;
      } else {
        this.compute(leftCouple, rightCouple, setWithFalse, setWithTrue, p1);
        for (final String st : setWithTrue) {
          Couple<String,String> _couple_2 = new Couple<String,String>(st, "T");
          Couple<String,String> _couple_3 = new Couple<String,String>(position, parent);
          Couple<Couple<String,String>,Couple<String,String>> _couple_4 = new Couple<Couple<String,String>,Couple<String,String>>(_couple_2, _couple_3);
          resultList.add(_couple_4);
        }
        for (final String sf : setWithFalse) {
          Couple<String,String> _couple_5 = new Couple<String,String>(sf, "F");
          Couple<String,String> _couple_6 = new Couple<String,String>(position, parent);
          Couple<Couple<String,String>,Couple<String,String>> _couple_7 = new Couple<Couple<String,String>,Couple<String,String>>(_couple_5, _couple_6);
          resultList.add(_couple_7);
        }
      }
      return resultList;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Compute the merging approach according to the next parent (and/or) and mcdc independent pairs
   */
  public void compute(final ArrayList<Couple<String,String>> list1, final ArrayList<Couple<String,String>> list2, final Set<String> setF, final Set<String> setT, final String nextParent) {
    try {
      boolean _equals = Objects.equal(nextParent, "a");
      if (_equals) {
        Couple<String,String> _get = list2.get(0);
        final String trueVal = _get.getSecond();
        for (final Couple<String,String> i : list1) {
          {
            String _first = i.getFirst();
            String _plus = (_first + trueVal);
            setF.add(_plus);
            String _second = i.getSecond();
            String _plus_1 = (_second + trueVal);
            setT.add(_plus_1);
          }
        }
        Couple<String,String> _get_1 = list1.get(0);
        final String tValue = _get_1.getSecond();
        for (final Couple<String,String> j : list2) {
          {
            String _first = j.getFirst();
            String _plus = (tValue + _first);
            setF.add(_plus);
            String _second = j.getSecond();
            String _plus_1 = (tValue + _second);
            setT.add(_plus_1);
          }
        }
      } else {
        boolean _equals_1 = Objects.equal(nextParent, "o");
        if (_equals_1) {
          Couple<String,String> _get_2 = list2.get(0);
          final String falseVal = _get_2.getFirst();
          for (final Couple<String,String> i_1 : list1) {
            {
              String _first = i_1.getFirst();
              String _plus = (_first + falseVal);
              setF.add(_plus);
              String _second = i_1.getSecond();
              String _plus_1 = (_second + falseVal);
              setT.add(_plus_1);
            }
          }
          Couple<String,String> _get_3 = list1.get(0);
          final String fVal = _get_3.getFirst();
          for (final Couple<String,String> j_1 : list2) {
            {
              String _first = j_1.getFirst();
              String _plus = (fVal + _first);
              setF.add(_plus);
              String _second = j_1.getSecond();
              String _plus_1 = (fVal + _second);
              setT.add(_plus_1);
            }
          }
        } else {
          Exception _exception = new Exception("Invalid parent");
          throw _exception;
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Checks whether or not, two string sequences form an independent pair
   * returns True if two sequences form an independent pair
   */
  public boolean independantPairs(final String str1, final String str2) {
    try {
      final char[] a1 = str1.toCharArray();
      final char[] a2 = str2.toCharArray();
      final int size = str1.length();
      String a = "";
      boolean compatible = false;
      int index = (-1);
      boolean _equals = Objects.equal(str1, str2);
      if (_equals) {
        Exception _exception = new Exception("Illegal arguments");
        throw _exception;
      } else {
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
        boolean _equals_3 = (cnt == 1);
        if (_equals_3) {
          compatible = true;
        }
      }
      return compatible;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * This method inverts the outcome value of a sequence and deletes the first character (typically "not") of its parent sequence
   */
  public List<Couple<Couple<String,String>,Couple<String,String>>> invertValues(final List<Couple<Couple<String,String>,Couple<String,String>>> list) {
    try {
      List<Couple<Couple<String,String>,Couple<String,String>>> tmp = list;
      for (final Couple<Couple<String,String>,Couple<String,String>> c : tmp) {
        {
          Couple<String,String> _second = c.getSecond();
          String parent = _second.getSecond();
          Couple<String,String> _first = c.getFirst();
          String _second_1 = _first.getSecond();
          boolean _equals = Objects.equal(_second_1, "F");
          if (_equals) {
            Couple<String,String> _first_1 = c.getFirst();
            _first_1.setSecond("T");
            Couple<String,String> _second_2 = c.getSecond();
            String _deleteFisrtChar = this.deleteFisrtChar(parent);
            _second_2.setSecond(_deleteFisrtChar);
          } else {
            Couple<String,String> _first_2 = c.getFirst();
            String _second_3 = _first_2.getSecond();
            boolean _equals_1 = Objects.equal(_second_3, "T");
            if (_equals_1) {
              Couple<String,String> _first_3 = c.getFirst();
              _first_3.setSecond("F");
              Couple<String,String> _second_4 = c.getSecond();
              String _deleteFisrtChar_1 = this.deleteFisrtChar(parent);
              _second_4.setSecond(_deleteFisrtChar_1);
            } else {
              Exception _exception = new Exception("Illegal Boolean value");
              throw _exception;
            }
          }
        }
      }
      return tmp;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Compute the mcdc of a boolean expression
   * @param boolExp: The boolean expression for the mcdc criterion generation
   * @return list<Couple<String, String>> that contains test sequences w.r.t mcdc criterion
   */
  public List<Couple<String,String>> mcdcOfBooleanExp(final EXPRESSION boolExp) {
    ArrayList<List<Couple<Couple<String,String>,Couple<String,String>>>> _arrayList = new ArrayList<List<Couple<Couple<String,String>,Couple<String,String>>>>();
    final ArrayList<List<Couple<Couple<String,String>,Couple<String,String>>>> genValues = _arrayList;
    ArrayList<Couple<String,String>> _arrayList_1 = new ArrayList<Couple<String,String>>();
    final ArrayList<Couple<String,String>> result = _arrayList_1;
    this.mcdcGen(boolExp, genValues);
    final List<Couple<Couple<String,String>,Couple<String,String>>> linkResult = this.linkValues(genValues);
    for (final Couple<Couple<String,String>,Couple<String,String>> i : linkResult) {
      Couple<String,String> _first = i.getFirst();
      result.add(_first);
    }
    return result;
  }
  
  private int identifier = new Function0<Integer>() {
    public Integer apply() {
      int _minus = (-1);
      return _minus;
    }
  }.apply();
  
  public void mcdcOfInstruction(final INSTRUCTION instr, final List<EXPRESSION> condList, final List<Triplet<List<Couple<String,String>>,List<String>,String>> list, final List<Triplet<List<String>,List<String>,String>> shouldBeCoveredList, final List<List<Triplet<List<Couple<String,String>>,List<String>,String>>> resultList) {
    try {
      if ((instr instanceof IF_INSTR)) {
        int _plus = (this.identifier + 1);
        this.identifier = _plus;
        final IF_INSTR myInstr = ((IF_INSTR) instr);
        final EXPRESSION cond = myInstr.getIfcond();
        condList.add(this.identifier, cond);
        final List<Couple<String,String>> mcdcEvalOfCond = this.mcdcOfBooleanExp(cond);
        ArrayList<String> _arrayList = new ArrayList<String>();
        final List<String> listOfValues = _arrayList;
        final Procedure1<Couple<String,String>> _function = new Procedure1<Couple<String,String>>() {
            public void apply(final Couple<String,String> t) {
              String _first = t.getFirst();
              listOfValues.add(_first);
            }
          };
        IterableExtensions.<Couple<String,String>>forEach(mcdcEvalOfCond, _function);
        final Function1<Couple<String,String>,Boolean> _function_1 = new Function1<Couple<String,String>,Boolean>() {
            public Boolean apply(final Couple<String,String> it) {
              String _second = it.getSecond();
              boolean _equals = Objects.equal(_second, "F");
              return Boolean.valueOf(_equals);
            }
          };
        Iterable<Couple<String,String>> _filter = IterableExtensions.<Couple<String,String>>filter(mcdcEvalOfCond, _function_1);
        final List<Couple<String,String>> falseEvalOfMcdc = IterableExtensions.<Couple<String,String>>toList(_filter);
        final Function1<Couple<String,String>,Boolean> _function_2 = new Function1<Couple<String,String>,Boolean>() {
            public Boolean apply(final Couple<String,String> it) {
              String _second = it.getSecond();
              boolean _equals = Objects.equal(_second, "T");
              return Boolean.valueOf(_equals);
            }
          };
        Iterable<Couple<String,String>> _filter_1 = IterableExtensions.<Couple<String,String>>filter(mcdcEvalOfCond, _function_2);
        final List<Couple<String,String>> trueEvalOfMcdc = IterableExtensions.<Couple<String,String>>toList(_filter_1);
        ArrayList<String> _arrayList_1 = new ArrayList<String>();
        List<String> varInCond = _arrayList_1;
        this.stringReprOfVar(cond, varInCond);
        String _string = Integer.valueOf(this.identifier).toString();
        Triplet<List<String>,List<String>,String> _triplet = new Triplet<List<String>,List<String>,String>(varInCond, listOfValues, _string);
        shouldBeCoveredList.add(_triplet);
        ArrayList<Triplet<List<Couple<String,String>>,List<String>,String>> _arrayList_2 = new ArrayList<Triplet<List<Couple<String,String>>,List<String>,String>>();
        ArrayList<Triplet<List<Couple<String,String>>,List<String>,String>> listT = _arrayList_2;
        ArrayList<Triplet<List<Couple<String,String>>,List<String>,String>> _arrayList_3 = new ArrayList<Triplet<List<Couple<String,String>>,List<String>,String>>();
        ArrayList<Triplet<List<Couple<String,String>>,List<String>,String>> listF = _arrayList_3;
        for (final Triplet<List<Couple<String,String>>,List<String>,String> i : list) {
          {
            listT.add(i);
            listF.add(i);
          }
        }
        String _string_1 = Integer.valueOf(this.identifier).toString();
        Triplet<List<Couple<String,String>>,List<String>,String> _triplet_1 = new Triplet<List<Couple<String,String>>,List<String>,String>(trueEvalOfMcdc, varInCond, _string_1);
        listT.add(_triplet_1);
        String _string_2 = Integer.valueOf(this.identifier).toString();
        Triplet<List<Couple<String,String>>,List<String>,String> _triplet_2 = new Triplet<List<Couple<String,String>>,List<String>,String>(falseEvalOfMcdc, varInCond, _string_2);
        listF.add(_triplet_2);
        INSTRUCTION _ifst = myInstr.getIfst();
        this.mcdcOfInstruction(_ifst, condList, listT, shouldBeCoveredList, resultList);
        INSTRUCTION _elst = myInstr.getElst();
        this.mcdcOfInstruction(_elst, condList, listF, shouldBeCoveredList, resultList);
      } else {
        if ((instr instanceof ASSIGN_INSTR)) {
          ListExtensions.<Triplet<List<Couple<String,String>>,List<String>,String>>reverse(list);
          resultList.add(list);
        } else {
          boolean _or = false;
          if ((instr instanceof ERROR_INSTR)) {
            _or = true;
          } else {
            _or = ((instr instanceof ERROR_INSTR) || (instr instanceof NULL_INSTR));
          }
          if (_or) {
            ListExtensions.<Triplet<List<Couple<String,String>>,List<String>,String>>reverse(list);
            resultList.add(list);
          } else {
            if ((instr instanceof LOOP_INSTR)) {
            } else {
              Exception _exception = new Exception("Illegal Instruction type");
              throw _exception;
            }
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void composeMcdcWithinIstruction(final List<List<Triplet<List<Couple<String,String>>,List<String>,String>>> srcList, final List<Triplet<List<Couple<String,String>>,List<String>,String>> resultList) {
    try {
      for (final List<Triplet<List<Couple<String,String>>,List<String>,String>> r : srcList) {
        {
          int _size = r.size();
          boolean _equals = (_size == 0);
          if (_equals) {
            Exception _exception = new Exception("List cannot be empty");
            throw _exception;
          }
          int _size_1 = r.size();
          boolean _equals_1 = (_size_1 == 1);
          if (_equals_1) {
            Triplet<List<Couple<String,String>>,List<String>,String> _get = r.get(0);
            resultList.add(_get);
          } else {
            Triplet<List<Couple<String,String>>,List<String>,String> v1 = r.get(1);
            Triplet<List<Couple<String,String>>,List<String>,String> v2 = r.get(0);
            List<Couple<String,String>> list1 = v1.getFirst();
            List<Couple<String,String>> list2 = v2.getFirst();
            List<String> ListOfVarInV1 = v1.getSecond();
            List<String> ListOfVarInV2 = v2.getSecond();
            String identOfV1 = v1.getThird();
            String identOfV2 = v2.getThird();
            List<String> inCommon = this.varInCommon(ListOfVarInV1, ListOfVarInV2);
            List<Couple<Integer,Integer>> index = this.indexOfCommonVar(ListOfVarInV1, ListOfVarInV2, inCommon);
            ArrayList<String> _arrayList = new ArrayList<String>();
            List<String> varUnion = _arrayList;
            varUnion.addAll(ListOfVarInV1);
            varUnion.add(">");
            varUnion.addAll(ListOfVarInV2);
            int _size_2 = r.size();
            boolean _equals_2 = (_size_2 == 2);
            if (_equals_2) {
              int _size_3 = inCommon.size();
              boolean _equals_3 = (_size_3 == 0);
              if (_equals_3) {
                final List<Couple<String,String>> simpleCompo = this.simpleComposition(list1, list2);
                String _plus = (identOfV1 + ">");
                String _plus_1 = (_plus + identOfV2);
                Triplet<List<Couple<String,String>>,List<String>,String> _triplet = new Triplet<List<Couple<String,String>>,List<String>,String>(simpleCompo, varUnion, _plus_1);
                resultList.add(_triplet);
              } else {
                final List<Couple<String,String>> ConstraintCompo1 = this.ExhaustiveCompositionWithConstraints(list1, list2, index);
                String _plus_2 = (identOfV1 + ">");
                String _plus_3 = (_plus_2 + identOfV2);
                Triplet<List<Couple<String,String>>,List<String>,String> _triplet_1 = new Triplet<List<Couple<String,String>>,List<String>,String>(ConstraintCompo1, varUnion, _plus_3);
                resultList.add(_triplet_1);
              }
            } else {
              ArrayList<Triplet<List<Couple<String,String>>,List<String>,String>> _arrayList_1 = new ArrayList<Triplet<List<Couple<String,String>>,List<String>,String>>();
              ArrayList<Triplet<List<Couple<String,String>>,List<String>,String>> myList = _arrayList_1;
              for (final Triplet<List<Couple<String,String>>,List<String>,String> e : r) {
                myList.add(e);
              }
              boolean _noCommonVar = this.noCommonVar(myList);
              if (_noCommonVar) {
                int _size_4 = myList.size();
                boolean _notEquals = (_size_4 != 1);
                boolean _while = _notEquals;
                while (_while) {
                  {
                    List<Couple<String,String>> simple = this.simpleComposition(list1, list2);
                    String _plus_4 = (identOfV1 + ">");
                    String _plus_5 = (_plus_4 + identOfV2);
                    Triplet<List<Couple<String,String>>,List<String>,String> _triplet_2 = new Triplet<List<Couple<String,String>>,List<String>,String>(simple, varUnion, _plus_5);
                    myList.set(0, _triplet_2);
                    myList.remove(1);
                    int _size_5 = myList.size();
                    boolean _notEquals_1 = (_size_5 != 1);
                    if (_notEquals_1) {
                      Triplet<List<Couple<String,String>>,List<String>,String> _get_1 = myList.get(1);
                      List<Couple<String,String>> _first = _get_1.getFirst();
                      list1 = _first;
                      Triplet<List<Couple<String,String>>,List<String>,String> _get_2 = myList.get(0);
                      List<Couple<String,String>> _first_1 = _get_2.getFirst();
                      list2 = _first_1;
                      ArrayList<String> _arrayList_2 = new ArrayList<String>();
                      varUnion = _arrayList_2;
                      Triplet<List<Couple<String,String>>,List<String>,String> _get_3 = myList.get(1);
                      List<String> _second = _get_3.getSecond();
                      varUnion.addAll(_second);
                      varUnion.add(">");
                      Triplet<List<Couple<String,String>>,List<String>,String> _get_4 = myList.get(0);
                      List<String> _second_1 = _get_4.getSecond();
                      varUnion.addAll(_second_1);
                      Triplet<List<Couple<String,String>>,List<String>,String> _get_5 = myList.get(1);
                      String _third = _get_5.getThird();
                      identOfV1 = _third;
                      Triplet<List<Couple<String,String>>,List<String>,String> _get_6 = myList.get(0);
                      String _third_1 = _get_6.getThird();
                      identOfV2 = _third_1;
                    }
                  }
                  int _size_5 = myList.size();
                  boolean _notEquals_1 = (_size_5 != 1);
                  _while = _notEquals_1;
                }
              } else {
                int _size_5 = myList.size();
                boolean _notEquals_1 = (_size_5 != 1);
                boolean _while_1 = _notEquals_1;
                while (_while_1) {
                  {
                    int _size_6 = myList.size();
                    boolean _equals_4 = (_size_6 == 0);
                    if (_equals_4) {
                      Exception _exception_1 = new Exception("List cannot be empty");
                      throw _exception_1;
                    }
                    List<Couple<String,String>> ConstraintCompo = this.ExhaustiveCompositionWithConstraints(list1, list2, index);
                    String _plus_4 = (identOfV1 + ">");
                    String _plus_5 = (_plus_4 + identOfV2);
                    Triplet<List<Couple<String,String>>,List<String>,String> _triplet_2 = new Triplet<List<Couple<String,String>>,List<String>,String>(ConstraintCompo, varUnion, _plus_5);
                    myList.set(0, _triplet_2);
                    myList.remove(1);
                    int _size_7 = myList.size();
                    boolean _notEquals_2 = (_size_7 != 1);
                    if (_notEquals_2) {
                      Triplet<List<Couple<String,String>>,List<String>,String> _get_1 = myList.get(1);
                      List<Couple<String,String>> _first = _get_1.getFirst();
                      list1 = _first;
                      Triplet<List<Couple<String,String>>,List<String>,String> _get_2 = myList.get(0);
                      List<Couple<String,String>> _first_1 = _get_2.getFirst();
                      list2 = _first_1;
                      Triplet<List<Couple<String,String>>,List<String>,String> _get_3 = myList.get(1);
                      List<String> _second = _get_3.getSecond();
                      ListOfVarInV1 = _second;
                      Triplet<List<Couple<String,String>>,List<String>,String> _get_4 = myList.get(0);
                      List<String> _second_1 = _get_4.getSecond();
                      ListOfVarInV2 = _second_1;
                      List<String> _varInCommon = this.varInCommon(ListOfVarInV1, ListOfVarInV2);
                      inCommon = _varInCommon;
                      List<Couple<Integer,Integer>> _indexOfCommonVar = this.indexOfCommonVar(ListOfVarInV1, ListOfVarInV2, inCommon);
                      index = _indexOfCommonVar;
                      ArrayList<String> _arrayList_2 = new ArrayList<String>();
                      varUnion = _arrayList_2;
                      varUnion.addAll(ListOfVarInV1);
                      varUnion.add(">");
                      varUnion.addAll(ListOfVarInV2);
                      Triplet<List<Couple<String,String>>,List<String>,String> _get_5 = myList.get(1);
                      String _third = _get_5.getThird();
                      identOfV1 = _third;
                      Triplet<List<Couple<String,String>>,List<String>,String> _get_6 = myList.get(0);
                      String _third_1 = _get_6.getThird();
                      identOfV2 = _third_1;
                    }
                  }
                  int _size_6 = myList.size();
                  boolean _notEquals_2 = (_size_6 != 1);
                  _while_1 = _notEquals_2;
                }
              }
              Triplet<List<Couple<String,String>>,List<String>,String> _get_1 = myList.get(0);
              resultList.add(_get_1);
            }
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public List<Couple<String,String>> simpleComposition(final List<Couple<String,String>> l1, final List<Couple<String,String>> l2) {
    try {
      ArrayList<Couple<String,String>> _arrayList = new ArrayList<Couple<String,String>>();
      final ArrayList<Couple<String,String>> result = _arrayList;
      final int size1 = l1.size();
      final int size2 = l2.size();
      boolean _or = false;
      boolean _equals = (size1 == 0);
      if (_equals) {
        _or = true;
      } else {
        boolean _equals_1 = (size2 == 0);
        _or = (_equals || _equals_1);
      }
      if (_or) {
        Exception _exception = new Exception("List cannot be empty");
        throw _exception;
      }
      final int minSize = Math.min(size1, size2);
      final int maxSize = Math.max(size1, size2);
      int ii = 0;
      boolean _dowhile = false;
      do {
        {
          Couple<String,String> _get = l1.get(ii);
          final String v11 = _get.getFirst();
          Couple<String,String> _get_1 = l1.get(ii);
          final String v12 = _get_1.getSecond();
          Couple<String,String> _get_2 = l2.get(ii);
          final String v21 = _get_2.getFirst();
          Couple<String,String> _get_3 = l2.get(ii);
          final String v22 = _get_3.getSecond();
          String _plus = (v11 + ">");
          String _plus_1 = (_plus + v21);
          String _plus_2 = (v12 + v22);
          Couple<String,String> _couple = new Couple<String,String>(_plus_1, _plus_2);
          result.add(_couple);
        }
        int _plus = (ii + 1);
        int _ii = ii = _plus;
        boolean _lessThan = (_ii < minSize);
        _dowhile = _lessThan;
      } while(_dowhile);
      boolean _lessThan_1 = (size1 < size2);
      if (_lessThan_1) {
        int jj = minSize;
        boolean _dowhile_1 = false;
        do {
          {
            double _random = Math.random();
            double _multiply = (_random * minSize);
            final int index = Double.valueOf(_multiply).intValue();
            Couple<String,String> _get = l1.get(index);
            final String v11 = _get.getFirst();
            Couple<String,String> _get_1 = l1.get(index);
            final String v12 = _get_1.getSecond();
            Couple<String,String> _get_2 = l2.get(jj);
            final String v21 = _get_2.getFirst();
            Couple<String,String> _get_3 = l2.get(jj);
            final String v22 = _get_3.getSecond();
            String _plus_1 = (v11 + ">");
            String _plus_2 = (_plus_1 + v21);
            String _plus_3 = (v12 + v22);
            Couple<String,String> _couple = new Couple<String,String>(_plus_2, _plus_3);
            result.add(_couple);
          }
          int _plus_1 = (jj + 1);
          int _jj = jj = _plus_1;
          boolean _lessThan_2 = (_jj < maxSize);
          _dowhile_1 = _lessThan_2;
        } while(_dowhile_1);
      } else {
        boolean _greaterThan = (size1 > size2);
        if (_greaterThan) {
          int kk = minSize;
          boolean _dowhile_2 = false;
          do {
            {
              double _random = Math.random();
              double _multiply = (_random * minSize);
              final int index = Double.valueOf(_multiply).intValue();
              Couple<String,String> _get = l1.get(kk);
              final String v11 = _get.getFirst();
              Couple<String,String> _get_1 = l1.get(kk);
              final String v12 = _get_1.getSecond();
              Couple<String,String> _get_2 = l2.get(index);
              final String v21 = _get_2.getFirst();
              Couple<String,String> _get_3 = l2.get(index);
              final String v22 = _get_3.getSecond();
              String _plus_2 = (v11 + ">");
              String _plus_3 = (_plus_2 + v21);
              String _plus_4 = (v12 + v22);
              Couple<String,String> _couple = new Couple<String,String>(_plus_3, _plus_4);
              result.add(_couple);
            }
            int _plus_2 = (kk + 1);
            int _kk = kk = _plus_2;
            boolean _lessThan_3 = (_kk < maxSize);
            _dowhile_2 = _lessThan_3;
          } while(_dowhile_2);
        }
      }
      return result;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public List<Couple<String,String>> ExhaustiveCompositionWithConstraints(final List<Couple<String,String>> list1, final List<Couple<String,String>> list2, final List<Couple<Integer,Integer>> indexOfCommonVar) {
    ArrayList<Couple<String,String>> _arrayList = new ArrayList<Couple<String,String>>();
    final List<Couple<String,String>> result = _arrayList;
    for (final Couple<String,String> e1 : list1) {
      {
        final String v11 = e1.getFirst();
        final String v12 = e1.getSecond();
        for (final Couple<String,String> e2 : list2) {
          {
            final String v21 = e2.getFirst();
            final String v22 = e2.getSecond();
            boolean _meetConstraints = this.meetConstraints(v11, v21, indexOfCommonVar);
            if (_meetConstraints) {
              String _plus = (v11 + ">");
              String _plus_1 = (_plus + v21);
              String _plus_2 = (v12 + v22);
              Couple<String,String> _couple = new Couple<String,String>(_plus_1, _plus_2);
              result.add(_couple);
            }
          }
        }
      }
    }
    return result;
  }
  
  public void mcdcCoverageVerdict(final List<Triplet<List<Couple<String,String>>,List<String>,String>> actualCoverage, final List<Triplet<List<String>,List<String>,String>> ExpectedCoverage, final List<List<Triplet<List<Couple<String,String>>,List<String>,String>>> listOfList) {
    try {
      ArrayList<Triplet<List<String>,List<String>,String>> _arrayList = new ArrayList<Triplet<List<String>,List<String>,String>>();
      final ArrayList<Triplet<List<String>,List<String>,String>> listOfActualValAndVar = _arrayList;
      final Procedure1<Triplet<List<Couple<String,String>>,List<String>,String>> _function = new Procedure1<Triplet<List<Couple<String,String>>,List<String>,String>>() {
          public void apply(final Triplet<List<Couple<String,String>>,List<String>,String> t) {
            ArrayList<String> _arrayList = new ArrayList<String>();
            final List<String> list = _arrayList;
            List<Couple<String,String>> _first = t.getFirst();
            final Procedure1<Couple<String,String>> _function = new Procedure1<Couple<String,String>>() {
                public void apply(final Couple<String,String> tt) {
                  String _first = tt.getFirst();
                  list.add(_first);
                }
              };
            IterableExtensions.<Couple<String,String>>forEach(_first, _function);
            List<String> _second = t.getSecond();
            String _third = t.getThird();
            Triplet<List<String>,List<String>,String> _triplet = new Triplet<List<String>,List<String>,String>(_second, list, _third);
            listOfActualValAndVar.add(_triplet);
          }
        };
      IterableExtensions.<Triplet<List<Couple<String,String>>,List<String>,String>>forEach(actualCoverage, _function);
      ArrayList<Triplet<List<String>,Set<String>,String>> _arrayList_1 = new ArrayList<Triplet<List<String>,Set<String>,String>>();
      final ArrayList<Triplet<List<String>,Set<String>,String>> listOfCoverageResults = _arrayList_1;
      for (final Triplet<List<String>,List<String>,String> l : listOfActualValAndVar) {
        {
          ArrayList<Couple<Integer,Integer>> _arrayList_2 = new ArrayList<Couple<Integer,Integer>>();
          ArrayList<Couple<Integer,Integer>> valIndexList = _arrayList_2;
          ArrayList<Couple<Integer,Integer>> _arrayList_3 = new ArrayList<Couple<Integer,Integer>>();
          ArrayList<Couple<Integer,Integer>> identIndexList = _arrayList_3;
          final List<String> v1 = l.getFirst();
          int cptV1 = 0;
          int indexV1 = 0;
          String _third = l.getThird();
          char[] _charArray = _third.toCharArray();
          final List<Character> v3 = IterableExtensions.<Character>toList(((Iterable<Character>)Conversions.doWrapArray(_charArray)));
          int indexV3 = 0;
          int cptV3 = 0;
          final int sizeV1 = v1.size();
          for (final String e : v1) {
            {
              boolean _equals = Objects.equal(e, ">");
              if (_equals) {
                int _minus = (indexV1 - 1);
                Couple<Integer,Integer> _couple = new Couple<Integer,Integer>(Integer.valueOf(cptV1), Integer.valueOf(_minus));
                valIndexList.add(_couple);
                int _plus = (indexV1 + 1);
                cptV1 = _plus;
              }
              int _minus_1 = (sizeV1 - 1);
              boolean _equals_1 = (indexV1 == _minus_1);
              if (_equals_1) {
                int _minus_2 = (sizeV1 - 1);
                Couple<Integer,Integer> _couple_1 = new Couple<Integer,Integer>(Integer.valueOf(cptV1), Integer.valueOf(_minus_2));
                valIndexList.add(_couple_1);
              }
              int _plus_1 = (indexV1 + 1);
              indexV1 = _plus_1;
            }
          }
          final int sizeV3 = v3.size();
          for (final Character e_1 : v3) {
            {
              String _string = e_1.toString();
              boolean _equals = Objects.equal(_string, ">");
              if (_equals) {
                int _minus = (indexV3 - 1);
                Couple<Integer,Integer> _couple = new Couple<Integer,Integer>(Integer.valueOf(cptV3), Integer.valueOf(_minus));
                identIndexList.add(_couple);
                int _plus = (indexV3 + 1);
                cptV3 = _plus;
              }
              int _minus_1 = (sizeV3 - 1);
              boolean _equals_1 = (indexV3 == _minus_1);
              if (_equals_1) {
                int _minus_2 = (sizeV3 - 1);
                Couple<Integer,Integer> _couple_1 = new Couple<Integer,Integer>(Integer.valueOf(cptV3), Integer.valueOf(_minus_2));
                identIndexList.add(_couple_1);
              }
              int _plus_1 = (indexV3 + 1);
              indexV3 = _plus_1;
            }
          }
          int _size = valIndexList.size();
          int _size_1 = identIndexList.size();
          boolean _notEquals = (_size != _size_1);
          if (_notEquals) {
            Exception _exception = new Exception("List size mismatch");
            throw _exception;
          }
          final List<String> v2 = l.getSecond();
          int iter = 0;
          for (final Couple<Integer,Integer> j : valIndexList) {
            {
              final Integer val1 = j.getFirst();
              final Integer val2 = j.getSecond();
              Couple<Integer,Integer> _get = identIndexList.get(iter);
              final Integer id1 = _get.getFirst();
              Couple<Integer,Integer> _get_1 = identIndexList.get(iter);
              final Integer id2 = _get_1.getSecond();
              int _plus = ((val2).intValue() + 1);
              final List<String> subList = v1.subList((val1).intValue(), _plus);
              TreeSet<String> _treeSet = new TreeSet<String>();
              final Set<String> subStrList = _treeSet;
              final Procedure1<String> _function_1 = new Procedure1<String>() {
                  public void apply(final String t) {
                    int _plus = ((val2).intValue() + 1);
                    String _substring = t.substring((val1).intValue(), _plus);
                    subStrList.add(_substring);
                  }
                };
              IterableExtensions.<String>forEach(v2, _function_1);
              String _third_1 = l.getThird();
              int _plus_1 = ((id2).intValue() + 1);
              final String ident = _third_1.substring((id1).intValue(), _plus_1);
              Triplet<List<String>,Set<String>,String> _triplet = new Triplet<List<String>,Set<String>,String>(subList, subStrList, ident);
              listOfCoverageResults.add(_triplet);
              int _plus_2 = (iter + 1);
              iter = _plus_2;
            }
          }
        }
      }
      int cpt = 0;
      boolean _dowhile = false;
      do {
        {
          final Triplet<List<String>,Set<String>,String> tmp = listOfCoverageResults.get(cpt);
          final Function1<Triplet<List<String>,Set<String>,String>,Boolean> _function_1 = new Function1<Triplet<List<String>,Set<String>,String>,Boolean>() {
              public Boolean apply(final Triplet<List<String>,Set<String>,String> it) {
                boolean _and = false;
                boolean _and_1 = false;
                boolean _notEquals = (!Objects.equal(it, tmp));
                if (!_notEquals) {
                  _and_1 = false;
                } else {
                  List<String> _first = it.getFirst();
                  List<String> _first_1 = tmp.getFirst();
                  boolean _equals = _first.equals(_first_1);
                  _and_1 = (_notEquals && _equals);
                }
                if (!_and_1) {
                  _and = false;
                } else {
                  String _third = it.getThird();
                  String _third_1 = tmp.getThird();
                  boolean _equals_1 = Objects.equal(_third, _third_1);
                  _and = (_and_1 && _equals_1);
                }
                return Boolean.valueOf(_and);
              }
            };
          final Triplet<List<String>,Set<String>,String> dup = IterableExtensions.<Triplet<List<String>,Set<String>,String>>findFirst(listOfCoverageResults, _function_1);
          boolean _notEquals = (!Objects.equal(dup, null));
          if (_notEquals) {
            Set<String> _second = tmp.getSecond();
            Set<String> _second_1 = dup.getSecond();
            _second.addAll(_second_1);
            listOfCoverageResults.remove(dup);
            int _minus = (cpt - 1);
            cpt = _minus;
          }
        }
        int _plus = (cpt + 1);
        int _cpt = cpt = _plus;
        int _size = listOfCoverageResults.size();
        boolean _lessThan = (_cpt < _size);
        _dowhile = _lessThan;
      } while(_dowhile);
      ArrayList<Triplet<List<String>,List<String>,String>> _arrayList_2 = new ArrayList<Triplet<List<String>,List<String>,String>>();
      final ArrayList<Triplet<List<String>,List<String>,String>> notCoveredValues = _arrayList_2;
      for (final Triplet<List<String>,List<String>,String> e : ExpectedCoverage) {
        {
          final String ident = e.getThird();
          final List<String> listOfVAr = e.getFirst();
          final Function1<Triplet<List<String>,Set<String>,String>,Boolean> _function_1 = new Function1<Triplet<List<String>,Set<String>,String>,Boolean>() {
              public Boolean apply(final Triplet<List<String>,Set<String>,String> it) {
                boolean _and = false;
                boolean _and_1 = false;
                boolean _notEquals = (!Objects.equal(it, e));
                if (!_notEquals) {
                  _and_1 = false;
                } else {
                  String _third = it.getThird();
                  boolean _equals = Objects.equal(_third, ident);
                  _and_1 = (_notEquals && _equals);
                }
                if (!_and_1) {
                  _and = false;
                } else {
                  List<String> _first = it.getFirst();
                  boolean _equals_1 = _first.equals(listOfVAr);
                  _and = (_and_1 && _equals_1);
                }
                return Boolean.valueOf(_and);
              }
            };
          final Triplet<List<String>,Set<String>,String> idem = IterableExtensions.<Triplet<List<String>,Set<String>,String>>findFirst(listOfCoverageResults, _function_1);
          boolean _notEquals = (!Objects.equal(idem, null));
          if (_notEquals) {
            final List<String> expValues = e.getSecond();
            final Set<String> actValues = idem.getSecond();
            ArrayList<String> _arrayList_3 = new ArrayList<String>();
            final List<String> tmpList = _arrayList_3;
            for (final String exp : expValues) {
              boolean _contains = actValues.contains(exp);
              boolean _not = (!_contains);
              if (_not) {
                tmpList.add(exp);
              }
            }
            int _size_1 = tmpList.size();
            boolean _notEquals_1 = (_size_1 != 0);
            if (_notEquals_1) {
              Triplet<List<String>,List<String>,String> _triplet = new Triplet<List<String>,List<String>,String>(listOfVAr, tmpList, ident);
              notCoveredValues.add(_triplet);
            }
          }
        }
      }
      System.out.println("Actual Coverage");
      for (final Triplet<List<String>,Set<String>,String> ss : listOfCoverageResults) {
        List<String> _first = ss.getFirst();
        String _string = _first.toString();
        String _plus_1 = (_string + " => ");
        Set<String> _second = ss.getSecond();
        String _string_1 = _second.toString();
        String _plus_2 = (_plus_1 + _string_1);
        String _plus_3 = (_plus_2 + " => ");
        String _third = ss.getThird();
        String _plus_4 = (_plus_3 + _third);
        System.out.println(_plus_4);
      }
      System.out.println();
      System.out.println("Missing Coverage");
      for (final Triplet<List<String>,List<String>,String> jj : notCoveredValues) {
        List<String> _first_1 = jj.getFirst();
        String _string_2 = _first_1.toString();
        String _plus_5 = (_string_2 + " => ");
        List<String> _second_1 = jj.getSecond();
        String _string_3 = _second_1.toString();
        String _plus_6 = (_plus_5 + _string_3);
        String _plus_7 = (_plus_6 + " => ");
        String _third_1 = jj.getThird();
        String _plus_8 = (_plus_7 + _third_1);
        System.out.println(_plus_8);
      }
      System.out.println();
      this.addMissingValues(notCoveredValues, listOfList);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void addMissingValues(final List<Triplet<List<String>,List<String>,String>> notCoveredValues, final List<List<Triplet<List<Couple<String,String>>,List<String>,String>>> listOfList) {
    for (final Triplet<List<String>,List<String>,String> e : notCoveredValues) {
      {
        final List<String> listOfVar = e.getFirst();
        final List<String> values = e.getSecond();
        final String ident = e.getThird();
        for (final String v : values) {
          final Procedure1<List<Triplet<List<Couple<String,String>>,List<String>,String>>> _function = new Procedure1<List<Triplet<List<Couple<String,String>>,List<String>,String>>>() {
              public void apply(final List<Triplet<List<Couple<String,String>>,List<String>,String>> t) {
                try {
                  final Function1<Triplet<List<Couple<String,String>>,List<String>,String>,Boolean> _function = new Function1<Triplet<List<Couple<String,String>>,List<String>,String>,Boolean>() {
                      public Boolean apply(final Triplet<List<Couple<String,String>>,List<String>,String> it) {
                        boolean _and = false;
                        boolean _and_1 = false;
                        String _third = it.getThird();
                        boolean _equals = Objects.equal(_third, ident);
                        if (!_equals) {
                          _and_1 = false;
                        } else {
                          List<String> _second = it.getSecond();
                          boolean _equals_1 = _second.equals(listOfVar);
                          _and_1 = (_equals && _equals_1);
                        }
                        if (!_and_1) {
                          _and = false;
                        } else {
                          List<Couple<String,String>> _first = it.getFirst();
                          boolean _containThisValue = MCDC_GEN.this.containThisValue(_first, v);
                          _and = (_and_1 && _containThisValue);
                        }
                        return Boolean.valueOf(_and);
                      }
                    };
                  final Triplet<List<Couple<String,String>>,List<String>,String> elem = IterableExtensions.<Triplet<List<Couple<String,String>>,List<String>,String>>findFirst(t, _function);
                  boolean _notEquals = (!Objects.equal(elem, null));
                  if (_notEquals) {
                    ArrayList<Triplet<Couple<String,String>,List<String>,String>> _arrayList = new ArrayList<Triplet<Couple<String,String>,List<String>,String>>();
                    final List<Triplet<Couple<String,String>,List<String>,String>> list = _arrayList;
                    int indexOfTarget = (-1);
                    for (final Triplet<List<Couple<String,String>>,List<String>,String> i : t) {
                      {
                        List<Couple<String,String>> _first = i.getFirst();
                        Couple<String,String> _get = _first.get(0);
                        final String outcome = _get.getSecond();
                        final List<String> myVarList = i.getSecond();
                        final String myIdent = i.getThird();
                        boolean _notEquals_1 = (!Objects.equal(ident, myIdent));
                        if (_notEquals_1) {
                          int _size = myVarList.size();
                          String _unknownStringVector = MCDC_GEN.this.unknownStringVector(_size);
                          Couple<String,String> _couple = new Couple<String,String>(_unknownStringVector, outcome);
                          Triplet<Couple<String,String>,List<String>,String> _triplet = new Triplet<Couple<String,String>,List<String>,String>(_couple, myVarList, myIdent);
                          list.add(_triplet);
                        } else {
                          Couple<String,String> _couple_1 = new Couple<String,String>(v, outcome);
                          Triplet<Couple<String,String>,List<String>,String> _triplet_1 = new Triplet<Couple<String,String>,List<String>,String>(_couple_1, myVarList, myIdent);
                          final Triplet<Couple<String,String>,List<String>,String> target = _triplet_1;
                          list.add(target);
                          int _indexOf = list.indexOf(target);
                          indexOfTarget = _indexOf;
                        }
                      }
                    }
                    int _minus = (-1);
                    boolean _equals = (indexOfTarget == _minus);
                    if (_equals) {
                      Exception _exception = new Exception("Bad Index Value");
                      throw _exception;
                    }
                    int cpt = 0;
                    int size = list.size();
                    final Triplet<Couple<String,String>,List<String>,String> targetTriplet = list.get(indexOfTarget);
                    final List<String> targetListOfVar = targetTriplet.getSecond();
                    final Couple<String,String> targetCouple = targetTriplet.getFirst();
                    boolean _dowhile = false;
                    do {
                      boolean _notEquals_1 = (cpt != indexOfTarget);
                      if (_notEquals_1) {
                        final Triplet<Couple<String,String>,List<String>,String> currTriplet = list.get(cpt);
                        final List<String> currListOfVar1 = currTriplet.getSecond();
                        final List<String> varInCommon = MCDC_GEN.this.varInCommon(targetListOfVar, currListOfVar1);
                        int _size = varInCommon.size();
                        boolean _greaterThan = (_size > 0);
                        if (_greaterThan) {
                          final List<Couple<Integer,Integer>> indexOfCommonVar = MCDC_GEN.this.indexOfCommonVar(targetListOfVar, currListOfVar1, varInCommon);
                          final Couple<String,String> currCouple = currTriplet.getFirst();
                          for (final Couple<Integer,Integer> ii : indexOfCommonVar) {
                            {
                              String _first = currCouple.getFirst();
                              Integer _second = ii.getSecond();
                              String _first_1 = targetCouple.getFirst();
                              Integer _first_2 = ii.getFirst();
                              char _charAt = _first_1.charAt((_first_2).intValue());
                              final String str = MCDC_GEN.this.setCharAt(_first, (_second).intValue(), _charAt);
                              currCouple.setFirst(str);
                            }
                          }
                        }
                      }
                      int _plus = (cpt + 1);
                      int _cpt = cpt = _plus;
                      boolean _lessThan = (_cpt < size);
                      _dowhile = _lessThan;
                    } while(_dowhile);
                    System.out.println("To be tested");
                    String _string = Integer.valueOf(indexOfTarget).toString();
                    String _plus_1 = ("Index Of target: " + _string);
                    System.out.println(_plus_1);
                    for (final Triplet<Couple<String,String>,List<String>,String> ll : list) {
                      {
                        Couple<String,String> _first = ll.getFirst();
                        String _first_1 = _first.getFirst();
                        String _plus_2 = ("(" + _first_1);
                        String _plus_3 = (_plus_2 + ", ");
                        Couple<String,String> _first_2 = ll.getFirst();
                        String _second = _first_2.getSecond();
                        String _plus_4 = (_plus_3 + _second);
                        String _plus_5 = (_plus_4 + ")");
                        System.out.print(_plus_5);
                        System.out.print(" => ");
                        List<String> _second_1 = ll.getSecond();
                        String _string_1 = _second_1.toString();
                        System.out.print(_string_1);
                        System.out.print(" => ");
                        String _third = ll.getThird();
                        System.out.print(_third);
                        System.out.println();
                      }
                    }
                  }
                } catch (Throwable _e) {
                  throw Exceptions.sneakyThrow(_e);
                }
              }
            };
          IterableExtensions.<List<Triplet<List<Couple<String,String>>,List<String>,String>>>forEach(listOfList, _function);
        }
      }
    }
  }
  
  public CharSequence solveEquation(final List<EXPRESSION> condList, final List<Triplet<Couple<String,String>,List<String>,String>> listOfEquations) {
    try {
      CharSequence _xblockexpression = null;
      {
        ArrayList<Couple<String,String>> _arrayList = new ArrayList<Couple<String,String>>();
        final List<Couple<String,String>> listOfVarAndVal = _arrayList;
        ArrayList<Couple<EXPRESSION,String>> _arrayList_1 = new ArrayList<Couple<EXPRESSION,String>>();
        final List<Couple<EXPRESSION,String>> listOfCondAndResults = _arrayList_1;
        for (final Triplet<Couple<String,String>,List<String>,String> t : listOfEquations) {
          {
            final Couple<String,String> couple = t.getFirst();
            final String values = couple.getFirst();
            final List<String> variables = t.getSecond();
            String _third = t.getThird();
            final int indexInteger = Integer.parseInt(_third);
            EXPRESSION _get = condList.get(indexInteger);
            String _second = couple.getSecond();
            Couple<EXPRESSION,String> _couple = new Couple<EXPRESSION,String>(_get, _second);
            listOfCondAndResults.add(_couple);
            int size = variables.size();
            int _length = values.length();
            boolean _notEquals = (_length != size);
            if (_notEquals) {
              Exception _exception = new Exception("size mismatch");
              throw _exception;
            }
            int cpt = 0;
            boolean _dowhile = false;
            do {
              {
                final String variable = variables.get(cpt);
                boolean _containThisValue = this.containThisValue(listOfVarAndVal, variable);
                boolean _not = (!_containThisValue);
                if (_not) {
                  char _charAt = values.charAt(cpt);
                  String _string = Character.valueOf(_charAt).toString();
                  Couple<String,String> _couple_1 = new Couple<String,String>(variable, _string);
                  listOfVarAndVal.add(_couple_1);
                }
              }
              int _plus = (cpt + 1);
              int _cpt = cpt = _plus;
              boolean _lessThan = (_cpt < size);
              _dowhile = _lessThan;
            } while(_dowhile);
          }
        }
        CharSequence _chocoRepr = this.chocoRepr(listOfVarAndVal, listOfCondAndResults);
        _xblockexpression = (_chocoRepr);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public boolean containThisValue(final List<Couple<String,String>> list, final String str) {
    for (final Couple<String,String> e : list) {
      String _first = e.getFirst();
      boolean _equals = Objects.equal(_first, str);
      if (_equals) {
        return true;
      }
    }
    return false;
  }
  
  public CharSequence chocoRepr(final List<Couple<String,String>> variables, final List<Couple<EXPRESSION,String>> condAndRes) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//Choco model");
    _builder.newLine();
    _builder.append("CPModel model = new CPModel();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("//Create variables and add them in the model\t");
    _builder.newLine();
    {
      for(final Couple<String,String> v : variables) {
        _builder.newLine();
        {
          String _second = v.getSecond();
          boolean _equals = Objects.equal(_second, "*");
          if (_equals) {
            _builder.append("IntegerVariable ");
            String _first = v.getFirst();
            _builder.append(_first, "");
            _builder.append(" = Choco.makeIntVar(\"");
            String _first_1 = v.getFirst();
            _builder.append(_first_1, "");
            _builder.append("\", 0, 1);");
            _builder.newLineIfNotEmpty();
            _builder.append("model.addVariable(");
            String _first_2 = v.getFirst();
            _builder.append(_first_2, "");
            _builder.append("); ");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.newLine();
        {
          String _second_1 = v.getSecond();
          boolean _equals_1 = Objects.equal(_second_1, "F");
          if (_equals_1) {
            _builder.append("IntegerVariable ");
            String _first_3 = v.getFirst();
            _builder.append(_first_3, "");
            _builder.append(" = Choco.makeIntVar(\"");
            String _first_4 = v.getFirst();
            _builder.append(_first_4, "");
            _builder.append("\", 0, 0); ");
            _builder.newLineIfNotEmpty();
            _builder.append("model.addVariable(");
            String _first_5 = v.getFirst();
            _builder.append(_first_5, "");
            _builder.append("); ");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.newLine();
        {
          String _second_2 = v.getSecond();
          boolean _equals_2 = Objects.equal(_second_2, "T");
          if (_equals_2) {
            _builder.append("IntegerVariable ");
            String _first_6 = v.getFirst();
            _builder.append(_first_6, "");
            _builder.append(" = Choco.makeIntVar(\"");
            String _first_7 = v.getFirst();
            _builder.append(_first_7, "");
            _builder.append("\", 1, 1); ");
            _builder.newLineIfNotEmpty();
            _builder.append("model.addVariable(");
            String _first_8 = v.getFirst();
            _builder.append(_first_8, "");
            _builder.append("); ");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t\t\t");
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("//Expressions and constraints");
    _builder.newLine();
    {
      for(final Couple<EXPRESSION,String> c : condAndRes) {
        _builder.newLine();
        _builder.append("\t");
        _builder.append("IntegerExpressionVariable ");
        int _indexOf = condAndRes.indexOf(c);
        String _plus = ("exp" + Integer.valueOf(_indexOf));
        _builder.append(_plus, "	");
        _builder.append(" = ");
        EXPRESSION _first_9 = c.getFirst();
        String _chocoStringReprOfCondition = this.chocoStringReprOfCondition(_first_9);
        _builder.append(_chocoStringReprOfCondition, "	");
        _builder.append(" ;");
        _builder.newLineIfNotEmpty();
        {
          String _second_3 = c.getSecond();
          boolean _equals_3 = Objects.equal(_second_3, "F");
          if (_equals_3) {
            _builder.append("\t");
            _builder.append("Constraint ");
            int _indexOf_1 = condAndRes.indexOf(c);
            String _plus_1 = ("ctr" + Integer.valueOf(_indexOf_1));
            _builder.append(_plus_1, "	");
            _builder.append(" = Choco.eq(");
            int _indexOf_2 = condAndRes.indexOf(c);
            String _plus_2 = ("exp" + Integer.valueOf(_indexOf_2));
            _builder.append(_plus_2, "	");
            _builder.append(", 0); ");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.newLine();
        {
          String _second_4 = c.getSecond();
          boolean _equals_4 = Objects.equal(_second_4, "T");
          if (_equals_4) {
            _builder.append("\t");
            _builder.append("Constraint ");
            int _indexOf_3 = condAndRes.indexOf(c);
            String _plus_3 = ("ctr" + Integer.valueOf(_indexOf_3));
            _builder.append(_plus_3, "	");
            _builder.append(" = Choco.geq(");
            int _indexOf_4 = condAndRes.indexOf(c);
            String _plus_4 = ("exp" + Integer.valueOf(_indexOf_4));
            _builder.append(_plus_4, "	");
            _builder.append(", 1);");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("Constraint ");
            int _indexOf_5 = condAndRes.indexOf(c);
            String _plus_5 = ("ctr" + Integer.valueOf(_indexOf_5));
            String _plus_6 = (_plus_5 + "_");
            _builder.append(_plus_6, "	");
            _builder.append(" = Choco.leq(");
            int _indexOf_6 = condAndRes.indexOf(c);
            String _plus_7 = ("exp" + Integer.valueOf(_indexOf_6));
            _builder.append(_plus_7, "	");
            _builder.append(", ");
            EXPRESSION _first_10 = c.getFirst();
            _builder.append(_first_10, "	");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("//Constraints");
    _builder.newLine();
    return _builder;
  }
  
  private String chocoStringReprOfCondition(final EXPRESSION exp) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (exp instanceof OR) {
        final OR _oR = (OR)exp;
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(" ");
        _builder.append("Choco.plus( ");
        EXPRESSION _left = _oR.getLeft();
        String _chocoStringReprOfCondition = this.chocoStringReprOfCondition(_left);
        _builder.append(_chocoStringReprOfCondition, " ");
        _builder.append(",  ");
        EXPRESSION _right = _oR.getRight();
        String _chocoStringReprOfCondition_1 = this.chocoStringReprOfCondition(_right);
        _builder.append(_chocoStringReprOfCondition_1, " ");
        _builder.append(") ");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (exp instanceof AND) {
        final AND _aND = (AND)exp;
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(" ");
        _builder.append("Choco.mult( ");
        EXPRESSION _left = _aND.getLeft();
        String _chocoStringReprOfCondition = this.chocoStringReprOfCondition(_left);
        _builder.append(_chocoStringReprOfCondition, " ");
        _builder.append(",  ");
        EXPRESSION _right = _aND.getRight();
        String _chocoStringReprOfCondition_1 = this.chocoStringReprOfCondition(_right);
        _builder.append(_chocoStringReprOfCondition_1, " ");
        _builder.append(") ");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (exp instanceof NOT) {
        final NOT _nOT = (NOT)exp;
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(" ");
        _builder.append("Choco.minus( 1 ,  ");
        String _chocoStringReprOfCondition = this.chocoStringReprOfCondition(_nOT);
        _builder.append(_chocoStringReprOfCondition, " ");
        _builder.append(") ");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (exp instanceof COMPARISON) {
        final COMPARISON _cOMPARISON = (COMPARISON)exp;
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(" ");
        EXPRESSION _left = _cOMPARISON.getLeft();
        String _relBoolRepr = this.relBoolRepr(_left);
        _builder.append(_relBoolRepr, " ");
        _builder.append(" + ");
        String _op = _cOMPARISON.getOp();
        _builder.append(_op, " ");
        _builder.append(" + ");
        EXPRESSION _right = _cOMPARISON.getRight();
        String _relBoolRepr_1 = this.relBoolRepr(_right);
        _builder.append(_relBoolRepr_1, " ");
        _builder.append(" ");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (exp instanceof EQUAL_DIFF) {
        final EQUAL_DIFF _eQUAL_DIFF = (EQUAL_DIFF)exp;
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(" ");
        EXPRESSION _left = _eQUAL_DIFF.getLeft();
        String _relBoolRepr = this.relBoolRepr(_left);
        _builder.append(_relBoolRepr, " ");
        _builder.append(" + ");
        String _op = _eQUAL_DIFF.getOp();
        _builder.append(_op, " ");
        _builder.append(" + ");
        EXPRESSION _right = _eQUAL_DIFF.getRight();
        String _relBoolRepr_1 = this.relBoolRepr(_right);
        _builder.append(_relBoolRepr_1, " ");
        _builder.append(" ");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (exp instanceof VarExpRef) {
        final VarExpRef _varExpRef = (VarExpRef)exp;
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(" ");
        VAR_CST _vref = _varExpRef.getVref();
        String _name = _vref.getName();
        _builder.append(_name, " ");
        _builder.append(" ");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(" ");
      _switchResult = _builder.toString();
    }
    return _switchResult;
  }
  
  public boolean meetConstraints(final String str1, final String str2, final List<Couple<Integer,Integer>> indexOfCommonVar) {
    final char[] str1ToArray = str1.toCharArray();
    final char[] str2ToArray = str2.toCharArray();
    for (final Couple<Integer,Integer> ic : indexOfCommonVar) {
      Integer _first = ic.getFirst();
      int _intValue = _first.intValue();
      char _get = str1ToArray[_intValue];
      String _string = Character.valueOf(_get).toString();
      Integer _second = ic.getSecond();
      int _intValue_1 = _second.intValue();
      char _get_1 = str2ToArray[_intValue_1];
      String _string_1 = Character.valueOf(_get_1).toString();
      boolean _notEquals = (!Objects.equal(_string, _string_1));
      if (_notEquals) {
        return false;
      }
    }
    return true;
  }
  
  /**
   * This method stores all variables that are involved in the expression
   * Note: A relational condition (e.g (a<4)) is considered as a single variable
   * @param exp The expression in which we want to extract all variables
   * @param list All variables will be stored in this list
   */
  public void stringReprOfVar(final EXPRESSION exp, final List<String> list) {
    boolean _matched = false;
    if (!_matched) {
      if (exp instanceof AND) {
        final AND _aND = (AND)exp;
        _matched=true;
        EXPRESSION _left = _aND.getLeft();
        this.stringReprOfVar(_left, list);
        EXPRESSION _right = _aND.getRight();
        this.stringReprOfVar(_right, list);
      }
    }
    if (!_matched) {
      if (exp instanceof OR) {
        final OR _oR = (OR)exp;
        _matched=true;
        EXPRESSION _left = _oR.getLeft();
        this.stringReprOfVar(_left, list);
        EXPRESSION _right = _oR.getRight();
        this.stringReprOfVar(_right, list);
      }
    }
    if (!_matched) {
      if (exp instanceof EQUAL_DIFF) {
        final EQUAL_DIFF _eQUAL_DIFF = (EQUAL_DIFF)exp;
        _matched=true;
        EXPRESSION _left = _eQUAL_DIFF.getLeft();
        String _relBoolRepr = this.relBoolRepr(_left);
        String _op = _eQUAL_DIFF.getOp();
        String _plus = (_relBoolRepr + _op);
        EXPRESSION _right = _eQUAL_DIFF.getRight();
        String _relBoolRepr_1 = this.relBoolRepr(_right);
        String _plus_1 = (_plus + _relBoolRepr_1);
        list.add(_plus_1);
      }
    }
    if (!_matched) {
      if (exp instanceof NOT) {
        final NOT _nOT = (NOT)exp;
        _matched=true;
        EXPRESSION _exp = _nOT.getExp();
        this.stringReprOfVar(_exp, list);
      }
    }
    if (!_matched) {
      if (exp instanceof COMPARISON) {
        final COMPARISON _cOMPARISON = (COMPARISON)exp;
        _matched=true;
        EXPRESSION _left = _cOMPARISON.getLeft();
        String _relBoolRepr = this.relBoolRepr(_left);
        String _op = _cOMPARISON.getOp();
        String _plus = (_relBoolRepr + _op);
        EXPRESSION _right = _cOMPARISON.getRight();
        String _relBoolRepr_1 = this.relBoolRepr(_right);
        String _plus_1 = (_plus + _relBoolRepr_1);
        list.add(_plus_1);
      }
    }
    if (!_matched) {
      if (exp instanceof VarExpRef) {
        final VarExpRef _varExpRef = (VarExpRef)exp;
        _matched=true;
        VAR_CST _vref = _varExpRef.getVref();
        String _name = _vref.getName();
        list.add(_name);
      }
    }
  }
  
  /**
   * This method is a sub-method of the method "stringReprOfVar". It deals specially with relational
   * conditions.
   * @param exp Expression to be represented in string form
   * @return String that represents the relational condition
   */
  public String relBoolRepr(final EXPRESSION exp) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (exp instanceof ADD) {
        final ADD _aDD = (ADD)exp;
        _matched=true;
        EXPRESSION _left = _aDD.getLeft();
        String _relBoolRepr = this.relBoolRepr(_left);
        String _plus = ("(" + _relBoolRepr);
        String _plus_1 = (_plus + "+");
        EXPRESSION _right = _aDD.getRight();
        String _relBoolRepr_1 = this.relBoolRepr(_right);
        String _plus_2 = (_plus_1 + _relBoolRepr_1);
        String _plus_3 = (_plus_2 + ")");
        _switchResult = _plus_3;
      }
    }
    if (!_matched) {
      if (exp instanceof SUB) {
        final SUB _sUB = (SUB)exp;
        _matched=true;
        EXPRESSION _left = _sUB.getLeft();
        String _relBoolRepr = this.relBoolRepr(_left);
        String _plus = ("(" + _relBoolRepr);
        String _plus_1 = (_plus + "-");
        EXPRESSION _right = _sUB.getRight();
        String _relBoolRepr_1 = this.relBoolRepr(_right);
        String _plus_2 = (_plus_1 + _relBoolRepr_1);
        String _plus_3 = (_plus_2 + ")");
        _switchResult = _plus_3;
      }
    }
    if (!_matched) {
      if (exp instanceof MULT) {
        final MULT _mULT = (MULT)exp;
        _matched=true;
        EXPRESSION _left = _mULT.getLeft();
        String _relBoolRepr = this.relBoolRepr(_left);
        String _plus = ("(" + _relBoolRepr);
        String _plus_1 = (_plus + "*");
        EXPRESSION _right = _mULT.getRight();
        String _relBoolRepr_1 = this.relBoolRepr(_right);
        String _plus_2 = (_plus_1 + _relBoolRepr_1);
        String _plus_3 = (_plus_2 + ")");
        _switchResult = _plus_3;
      }
    }
    if (!_matched) {
      if (exp instanceof DIV) {
        final DIV _dIV = (DIV)exp;
        _matched=true;
        EXPRESSION _left = _dIV.getLeft();
        String _relBoolRepr = this.relBoolRepr(_left);
        String _plus = ("(" + _relBoolRepr);
        String _plus_1 = (_plus + "/");
        EXPRESSION _right = _dIV.getRight();
        String _relBoolRepr_1 = this.relBoolRepr(_right);
        String _plus_2 = (_plus_1 + _relBoolRepr_1);
        String _plus_3 = (_plus_2 + ")");
        _switchResult = _plus_3;
      }
    }
    if (!_matched) {
      if (exp instanceof intConstant) {
        final intConstant _intConstant = (intConstant)exp;
        _matched=true;
        int _value = _intConstant.getValue();
        String _string = Integer.valueOf(_value).toString();
        _switchResult = _string;
      }
    }
    if (!_matched) {
      if (exp instanceof realConstant) {
        final realConstant _realConstant = (realConstant)exp;
        _matched=true;
        double _value = _realConstant.getValue();
        String _string = Double.valueOf(_value).toString();
        _switchResult = _string;
      }
    }
    if (!_matched) {
      if (exp instanceof strConstant) {
        final strConstant _strConstant = (strConstant)exp;
        _matched=true;
        String _value = _strConstant.getValue();
        String _string = _value.toString();
        _switchResult = _string;
      }
    }
    if (!_matched) {
      if (exp instanceof enumConstant) {
        final enumConstant _enumConstant = (enumConstant)exp;
        _matched=true;
        String _value = _enumConstant.getValue();
        String _string = _value.toString();
        _switchResult = _string;
      }
    }
    if (!_matched) {
      if (exp instanceof boolConstant) {
        final boolConstant _boolConstant = (boolConstant)exp;
        _matched=true;
        boolean _isValue = _boolConstant.isValue();
        String _string = Boolean.valueOf(_isValue).toString();
        _switchResult = _string;
      }
    }
    if (!_matched) {
      if (exp instanceof bitConstant) {
        final bitConstant _bitConstant = (bitConstant)exp;
        _matched=true;
        String _value = _bitConstant.getValue();
        String _string = _value.toString();
        _switchResult = _string;
      }
    }
    if (!_matched) {
      if (exp instanceof hexConstant) {
        final hexConstant _hexConstant = (hexConstant)exp;
        _matched=true;
        String _value = _hexConstant.getValue();
        String _string = _value.toString();
        _switchResult = _string;
      }
    }
    if (!_matched) {
      if (exp instanceof VarExpRef) {
        final VarExpRef _varExpRef = (VarExpRef)exp;
        _matched=true;
        VAR_CST _vref = _varExpRef.getVref();
        String _name = _vref.getName();
        String _string = _name.toString();
        _switchResult = _string;
      }
    }
    if (!_matched) {
      _switchResult = "";
    }
    return _switchResult;
  }
  
  /**
   * This method checks whether or not in the given path (of if instruct) there are no repeated variables
   */
  public boolean noCommonVar(final List<Triplet<List<Couple<String,String>>,List<String>,String>> myList) {
    ArrayList<String> _arrayList = new ArrayList<String>();
    ArrayList<String> union = _arrayList;
    ArrayList<String> _arrayList_1 = new ArrayList<String>();
    List<String> intersection = _arrayList_1;
    for (final Triplet<List<Couple<String,String>>,List<String>,String> e : myList) {
      {
        List<String> _second = e.getSecond();
        List<String> _varInCommon = this.varInCommon(union, _second);
        intersection = _varInCommon;
        int _size = intersection.size();
        boolean _greaterThan = (_size > 0);
        if (_greaterThan) {
          return false;
        }
        union.add(">");
        List<String> _second_1 = e.getSecond();
        union.addAll(_second_1);
      }
    }
    return true;
  }
  
  public List<Couple<Integer,Integer>> indexOfCommonVar(final List<String> list1, final List<String> list2, final List<String> inCommon) {
    ArrayList<Couple<Integer,Integer>> _arrayList = new ArrayList<Couple<Integer,Integer>>();
    final ArrayList<Couple<Integer,Integer>> listOfCommonVar = _arrayList;
    for (final String c : inCommon) {
      {
        final int i = list1.indexOf(c);
        final int j = list2.indexOf(c);
        Couple<Integer,Integer> _couple = new Couple<Integer,Integer>(Integer.valueOf(i), Integer.valueOf(j));
        listOfCommonVar.add(_couple);
      }
    }
    return listOfCommonVar;
  }
  
  public String setCharAt(final String str, final int index, final char r) {
    try {
      final int size = str.length();
      boolean _greaterEqualsThan = (index >= size);
      if (_greaterEqualsThan) {
        Exception _exception = new Exception("Index Out of range");
        throw _exception;
      }
      final char[] toCharList = str.toCharArray();
      toCharList[index] = r;
      String newStr = "";
      for (final char e : toCharList) {
        String _string = Character.valueOf(e).toString();
        String _plus = (newStr + _string);
        newStr = _plus;
      }
      return newStr;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String unknownStringVector(final int length) {
    try {
      boolean _lessThan = (length < 1);
      if (_lessThan) {
        Exception _exception = new Exception("The length has to be greater than 0");
        throw _exception;
      }
      int i = 0;
      String tmpStr = "";
      boolean _dowhile = false;
      do {
        String _plus = (tmpStr + "*");
        tmpStr = _plus;
        int _plus_1 = (i + 1);
        int _i = i = _plus_1;
        boolean _lessThan_1 = (_i < length);
        _dowhile = _lessThan_1;
      } while(_dowhile);
      return tmpStr;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * This method returns strings that the two lists have in common
   * @param list1: list of String
   * @param list2: list of string
   * @return list: new list that contains all strings that appear both in list1 and list2
   */
  public List<String> varInCommon(final List<String> list1, final List<String> list2) {
    ArrayList<String> _arrayList = new ArrayList<String>();
    final ArrayList<String> commonList = _arrayList;
    boolean _or = false;
    int _size = list1.size();
    boolean _equals = (_size == 0);
    if (_equals) {
      _or = true;
    } else {
      int _size_1 = list2.size();
      boolean _equals_1 = (_size_1 == 0);
      _or = (_equals || _equals_1);
    }
    if (_or) {
      return commonList;
    }
    for (final String i : list1) {
      for (final String j : list2) {
        boolean _and = false;
        boolean _equals_2 = Objects.equal(i, j);
        if (!_equals_2) {
          _and = false;
        } else {
          boolean _notEquals = (!Objects.equal(j, ">"));
          _and = (_equals_2 && _notEquals);
        }
        if (_and) {
          commonList.add(j);
        }
      }
    }
    return commonList;
  }
  
  /**
   * This method deletes the last character of a string and returns the new string
   * @param str The subject string i.e the string we want to delete its last character
   * @return substring of @param str without its last character
   */
  public String deleteLastChar(final String str) {
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
  
  /**
   * delete the first string's character and returns a new string
   */
  public String deleteFisrtChar(final String str) {
    final int strSize = str.length();
    String myStr = "";
    boolean _greaterThan = (strSize > 0);
    if (_greaterThan) {
      String _substring = str.substring(1);
      myStr = _substring;
    }
    return myStr;
  }
  
  /**
   * returns the last character of the string
   */
  public String getLastChar(final String str) {
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
}
