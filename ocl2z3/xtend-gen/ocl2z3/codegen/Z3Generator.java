package ocl2z3.codegen;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ecore.BooleanLiteralExp;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.IfExp;
import org.eclipse.ocl.ecore.IntegerLiteralExp;
import org.eclipse.ocl.ecore.IteratorExp;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.ecore.OCL.Query;
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.ecore.OperationCallExp;
import org.eclipse.ocl.ecore.PropertyCallExp;
import org.eclipse.ocl.ecore.RealLiteralExp;
import org.eclipse.ocl.expressions.Variable;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class Z3Generator {
  private static String CONFIG_ANNO_SOURCE = "config";
  
  private static String DOMAIN_ANNO_KEY = "domain";
  
  private OCL ocl = new Function0<OCL>() {
    public OCL apply() {
      OCL _newInstance = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
      return _newInstance;
    }
  }.apply();
  
  private Helper helper = new Function0<Helper>() {
    public Helper apply() {
      Helper _createOCLHelper = Z3Generator.this.ocl.createOCLHelper();
      return _createOCLHelper;
    }
  }.apply();
  
  private Map<String,String> PrimitiveOperand = new Function0<Map<String,String>>() {
    public Map<String,String> apply() {
      Pair<String,String> _mappedTo = Pair.<String, String>of("<", "<");
      Pair<String,String> _mappedTo_1 = Pair.<String, String>of(">", ">");
      Pair<String,String> _mappedTo_2 = Pair.<String, String>of("<=", "<=");
      Pair<String,String> _mappedTo_3 = Pair.<String, String>of(">=", ">=");
      Pair<String,String> _mappedTo_4 = Pair.<String, String>of("<>", "!=");
      Pair<String,String> _mappedTo_5 = Pair.<String, String>of("+", "+");
      Pair<String,String> _mappedTo_6 = Pair.<String, String>of("-", "-");
      Pair<String,String> _mappedTo_7 = Pair.<String, String>of("*", "*");
      Pair<String,String> _mappedTo_8 = Pair.<String, String>of("/", "/");
      Pair<String,String> _mappedTo_9 = Pair.<String, String>of("=", "==");
      HashMap<String,String> _newHashMap = CollectionLiterals.<String, String>newHashMap(_mappedTo, _mappedTo_1, _mappedTo_2, _mappedTo_3, _mappedTo_4, _mappedTo_5, _mappedTo_6, _mappedTo_7, _mappedTo_8, _mappedTo_9);
      return _newHashMap;
    }
  }.apply();
  
  private Map<String,String> PrimitiveBooleanOperand = new Function0<Map<String,String>>() {
    public Map<String,String> apply() {
      Pair<String,String> _mappedTo = Pair.<String, String>of("and", "And");
      Pair<String,String> _mappedTo_1 = Pair.<String, String>of("or", "Or");
      Pair<String,String> _mappedTo_2 = Pair.<String, String>of("implies", "Implies");
      HashMap<String,String> _newHashMap = CollectionLiterals.<String, String>newHashMap(_mappedTo, _mappedTo_1, _mappedTo_2);
      return _newHashMap;
    }
  }.apply();
  
  private Set<String> StructuralOperation = new Function0<Set<String>>() {
    public Set<String> apply() {
      HashSet<String> _newHashSet = CollectionLiterals.<String>newHashSet("size");
      return _newHashSet;
    }
  }.apply();
  
  public int variableCount = 0;
  
  public int goalCount = 0;
  
  public int constraintCount = 0;
  
  public int configCount = 0;
  
  public String generateVariables(final List<EObject> objects) {
    ArrayList<Pair<String,String>> _arrayList = new ArrayList<Pair<String,String>>();
    final ArrayList<Pair<String,String>> varNames = _arrayList;
    ArrayList<String> _arrayList_1 = new ArrayList<String>();
    final ArrayList<String> configNames = _arrayList_1;
    ArrayList<String> _arrayList_2 = new ArrayList<String>();
    final ArrayList<String> contextNames = _arrayList_2;
    HashMap<String,String> _hashMap = new HashMap<String,String>();
    final HashMap<String,String> attrValueMap = _hashMap;
    for (final EObject obj : objects) {
      EClass _eClass = obj.eClass();
      EList<EAttribute> _eAllAttributes = _eClass.getEAllAttributes();
      for (final EAttribute attr : _eAllAttributes) {
        {
          final String objName = this.getEObjectPath(obj);
          boolean _canBeVariable = this.canBeVariable(attr);
          if (_canBeVariable) {
            String _switchResult = null;
            EClassifier _eType = attr.getEType();
            String _name = _eType.getName();
            final String _switchValue = _name;
            boolean _matched = false;
            if (!_matched) {
              if (Objects.equal(_switchValue,"EInt")) {
                _matched=true;
                _switchResult = "Int";
              }
            }
            if (!_matched) {
              if (Objects.equal(_switchValue,"EDouble")) {
                _matched=true;
                _switchResult = "Real";
              }
            }
            if (!_matched) {
              if (Objects.equal(_switchValue,"EBigDecimal")) {
                _matched=true;
                _switchResult = "Real";
              }
            }
            if (!_matched) {
              if (Objects.equal(_switchValue,"EBigInteger")) {
                _matched=true;
                _switchResult = "Int";
              }
            }
            if (!_matched) {
              if (Objects.equal(_switchValue,"EBoolean")) {
                _matched=true;
                _switchResult = "Bool";
              }
            }
            if (!_matched) {
              _switchResult = "Undefined";
            }
            String z3Type = _switchResult;
            String _plus = (objName + ".");
            String _name_1 = attr.getName();
            final String attrFullName = (_plus + _name_1);
            Pair<String,String> _pair = new Pair<String,String>(attrFullName, z3Type);
            varNames.add(_pair);
            EAnnotation _eAnnotation = attr.getEAnnotation(Z3Generator.CONFIG_ANNO_SOURCE);
            boolean _equals = Objects.equal(_eAnnotation, null);
            if (_equals) {
              contextNames.add(attrFullName);
            } else {
              configNames.add(attrFullName);
            }
            final Object attrValue = obj.eGet(attr);
            String _switchResult_1 = null;
            boolean _matched_1 = false;
            if (!_matched_1) {
              if (attrValue instanceof Boolean) {
                final Boolean _boolean = (Boolean)attrValue;
                boolean _booleanValue = _boolean.booleanValue();
                if (_booleanValue) {
                  _matched_1=true;
                  _switchResult_1 = "True";
                }
              }
            }
            if (!_matched_1) {
              if (attrValue instanceof Boolean) {
                final Boolean _boolean = (Boolean)attrValue;
                boolean _booleanValue = _boolean.booleanValue();
                boolean _not = (!_booleanValue);
                if (_not) {
                  _matched_1=true;
                  _switchResult_1 = "False";
                }
              }
            }
            if (!_matched_1) {
              String _xtrycatchfinallyexpression = null;
              try {
                String _string = attrValue.toString();
                _xtrycatchfinallyexpression = _string;
              } catch (final Throwable _t) {
                if (_t instanceof Exception) {
                  final Exception e = (Exception)_t;
                  System.out.println(attrFullName);
                  e.printStackTrace();
                } else {
                  throw Exceptions.sneakyThrow(_t);
                }
              }
              _switchResult_1 = _xtrycatchfinallyexpression;
            }
            final String attrNormalValue = _switchResult_1;
            attrValueMap.put(attrFullName, attrNormalValue);
          }
        }
      }
    }
    int _size = varNames.size();
    this.variableCount = _size;
    int _size_1 = configNames.size();
    this.configCount = _size_1;
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("variables = {");
    _builder.newLine();
    {
      for(final Pair<String,String> varName : varNames) {
        _builder.append("\t");
        _builder.append("\'");
        String _key = varName.getKey();
        _builder.append(_key, "	");
        _builder.append("\': ");
        String _value = varName.getValue();
        _builder.append(_value, "	");
        _builder.append("(\'");
        String _key_1 = varName.getKey();
        _builder.append(_key_1, "	");
        _builder.append("\'),");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    String _string = _builder.toString();
    final String variableState = this.removeLastSplitter(_string, ",");
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("config_para = [");
    _builder_1.newLine();
    {
      for(final String varName_1 : configNames) {
        _builder_1.append("\t");
        _builder_1.append("variables[\'");
        _builder_1.append(varName_1, "	");
        _builder_1.append("\'],");
        _builder_1.newLineIfNotEmpty();
      }
    }
    _builder_1.append("]");
    _builder_1.newLine();
    String _string_1 = _builder_1.toString();
    final String configParaState = this.removeLastSplitter(_string_1, ",");
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("context_para = [");
    _builder_2.newLine();
    {
      for(final String varName_2 : contextNames) {
        _builder_2.append("\t");
        _builder_2.append("variables[\'");
        _builder_2.append(varName_2, "	");
        _builder_2.append("\'],");
        _builder_2.newLineIfNotEmpty();
      }
    }
    _builder_2.append("]");
    _builder_2.newLine();
    String _string_2 = _builder_2.toString();
    final String contextParaState = this.removeLastSplitter(_string_2, ",");
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("config = {");
    _builder_3.newLine();
    {
      for(final String varName_3 : configNames) {
        _builder_3.append("\t");
        _builder_3.append("\'");
        _builder_3.append(varName_3, "	");
        _builder_3.append("\': ");
        String _get = attrValueMap.get(varName_3);
        _builder_3.append(_get, "	");
        _builder_3.append(",");
        _builder_3.newLineIfNotEmpty();
      }
    }
    _builder_3.append("}");
    _builder_3.newLine();
    String _string_3 = _builder_3.toString();
    final String configState = this.removeLastSplitter(_string_3, ",");
    StringConcatenation _builder_4 = new StringConcatenation();
    _builder_4.append("context = {");
    _builder_4.newLine();
    {
      for(final String varName_4 : contextNames) {
        _builder_4.append("\t");
        _builder_4.append("\'");
        _builder_4.append(varName_4, "	");
        _builder_4.append("\': ");
        String _get_1 = attrValueMap.get(varName_4);
        _builder_4.append(_get_1, "	");
        _builder_4.append(",");
        _builder_4.newLineIfNotEmpty();
      }
    }
    _builder_4.append("}");
    _builder_4.newLine();
    String _string_4 = _builder_4.toString();
    final String contextState = this.removeLastSplitter(_string_4, ",");
    String _plus = (variableState + configParaState);
    String _plus_1 = (_plus + contextParaState);
    String _plus_2 = (_plus_1 + configState);
    return (_plus_2 + contextState);
  }
  
  public String generateConstraints(final List<EObject> objects) {
    try {
      ArrayList<String> _arrayList = new ArrayList<String>();
      final ArrayList<String> goals = _arrayList;
      ArrayList<String> _arrayList_1 = new ArrayList<String>();
      final ArrayList<String> domains = _arrayList_1;
      ArrayList<ArrayList<String>> _arrayList_2 = new ArrayList<ArrayList<String>>();
      final ArrayList<ArrayList<String>> users = _arrayList_2;
      for (final EObject obj : objects) {
        {
          EClass _eClass = obj.eClass();
          this.helper.setContext(_eClass);
          EClass _eClass_1 = obj.eClass();
          final EAnnotation oclanno = _eClass_1.getEAnnotation("http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot");
          boolean _notEquals = (!Objects.equal(oclanno, null));
          if (_notEquals) {
            EMap<String,String> _details = oclanno.getDetails();
            Set<String> _keySet = _details.keySet();
            for (final String key : _keySet) {
              boolean _startsWith = key.startsWith("User__");
              boolean _not = (!_startsWith);
              if (_not) {
                try {
                  this.userflag = false;
                  EMap<String,String> _details_1 = oclanno.getDetails();
                  String _get = _details_1.get(key);
                  final OCLExpression query = this.helper.createQuery(_get);
                  try {
                    HashMap<String,Object> _hashMap = new HashMap<String,Object>();
                    final String z3expr = this.getZ3Expression(query, obj, _hashMap);
                    boolean _and = false;
                    boolean _and_1 = false;
                    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(z3expr);
                    boolean _not_1 = (!_isNullOrEmpty);
                    if (!_not_1) {
                      _and_1 = false;
                    } else {
                      boolean _notEquals_1 = (!Objects.equal(z3expr, "True"));
                      _and_1 = (_not_1 && _notEquals_1);
                    }
                    if (!_and_1) {
                      _and = false;
                    } else {
                      boolean _notEquals_2 = (!Objects.equal(z3expr, "False"));
                      _and = (_and_1 && _notEquals_2);
                    }
                    if (_and) {
                      boolean _startsWith_1 = key.startsWith("Domain__");
                      if (_startsWith_1) {
                        domains.add(z3expr);
                      } else {
                        goals.add(z3expr);
                      }
                    }
                  } catch (final Throwable _t) {
                    if (_t instanceof Exception) {
                      final Exception e = (Exception)_t;
                      System.out.println(query);
                      e.printStackTrace();
                    } else {
                      throw Exceptions.sneakyThrow(_t);
                    }
                  }
                } catch (final Throwable _t_1) {
                  if (_t_1 instanceof Exception) {
                    final Exception e_1 = (Exception)_t_1;
                    String _plus = (key + ": ");
                    EMap<String,String> _details_2 = oclanno.getDetails();
                    String _get_1 = _details_2.get(key);
                    String _plus_1 = (_plus + _get_1);
                    System.out.println(_plus_1);
                    e_1.printStackTrace();
                  } else {
                    throw Exceptions.sneakyThrow(_t_1);
                  }
                }
              } else {
                this.userflag = true;
                EMap<String,String> _details_3 = oclanno.getDetails();
                String _get_2 = _details_3.get(key);
                final OCLExpression query_1 = this.helper.createQuery(_get_2);
                try {
                  boolean _matched = false;
                  if (!_matched) {
                    if (query_1 instanceof OperationCallExp) {
                      final OperationCallExp _operationCallExp = (OperationCallExp)query_1;
                      _matched=true;
                      org.eclipse.ocl.expressions.OCLExpression<EClassifier> _source = _operationCallExp.getSource();
                      final OCLExpression source = ((OCLExpression) _source);
                      EList<org.eclipse.ocl.expressions.OCLExpression<EClassifier>> _argument = _operationCallExp.getArgument();
                      final org.eclipse.ocl.expressions.OCLExpression<EClassifier> arg = _argument.get(0);
                      org.eclipse.ocl.expressions.OCLExpression<EClassifier> _source_1 = ((OperationCallExp) arg).getSource();
                      final OCLExpression argleft = ((OCLExpression) _source_1);
                      EList<org.eclipse.ocl.expressions.OCLExpression<EClassifier>> _argument_1 = ((OperationCallExp) arg).getArgument();
                      org.eclipse.ocl.expressions.OCLExpression<EClassifier> _get_3 = _argument_1.get(0);
                      final OCLExpression argright = ((OCLExpression) _get_3);
                      ArrayList<String> _arrayList_3 = new ArrayList<String>(3);
                      final ArrayList<String> triple = _arrayList_3;
                      HashMap<String,Object> _hashMap_1 = new HashMap<String,Object>();
                      String _z3Expression = this.getZ3Expression(source, obj, _hashMap_1);
                      triple.add(_z3Expression);
                      HashMap<String,Object> _hashMap_2 = new HashMap<String,Object>();
                      final String leftStr = this.getZ3Expression(argleft, obj, _hashMap_2);
                      int _length = leftStr.length();
                      int _minus = (_length - 1);
                      String _substring = leftStr.substring(5, _minus);
                      triple.add(_substring);
                      HashMap<String,Object> _hashMap_3 = new HashMap<String,Object>();
                      String _z3Expression_1 = this.getZ3Expression(argright, obj, _hashMap_3);
                      triple.add(_z3Expression_1);
                      String _get_4 = triple.get(0);
                      boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(_get_4);
                      boolean _not_2 = (!_isNullOrEmpty_1);
                      if (_not_2) {
                        users.add(triple);
                      }
                    }
                  }
                } catch (final Throwable _t_2) {
                  if (_t_2 instanceof Exception) {
                    final Exception e_2 = (Exception)_t_2;
                    System.out.println(query_1);
                    e_2.printStackTrace();
                  } else {
                    throw Exceptions.sneakyThrow(_t_2);
                  }
                } finally {
                  this.userflag = false;
                }
              }
            }
          }
          EClass _eClass_2 = obj.eClass();
          EList<EAttribute> _eAllAttributes = _eClass_2.getEAllAttributes();
          for (final EAttribute attr : _eAllAttributes) {
            {
              final String objPath = this.getEObjectPath(obj);
              final EAnnotation domainAnno = attr.getEAnnotation(Z3Generator.CONFIG_ANNO_SOURCE);
              boolean _notEquals_3 = (!Objects.equal(domainAnno, null));
              if (_notEquals_3) {
                EMap<String,String> _details_4 = domainAnno.getDetails();
                String _get_3 = _details_4.get(Z3Generator.DOMAIN_ANNO_KEY);
                final String dom = ((String) _get_3);
                boolean _notEquals_4 = (!Objects.equal(dom, null));
                if (_notEquals_4) {
                  try {
                    final String[] vals = dom.split("\\.\\.");
                    String _plus_2 = (objPath + ".");
                    String _name = attr.getName();
                    final String attrName = (_plus_2 + _name);
                    StringConcatenation _builder = new StringConcatenation();
                    _builder.append("And(variables[\'");
                    _builder.append(attrName, "");
                    _builder.append("\'] >= ");
                    String _get_4 = ((List<String>)Conversions.doWrapArray(vals)).get(0);
                    _builder.append(_get_4, "");
                    _builder.append(", variables[\'");
                    _builder.append(attrName, "");
                    _builder.append("\'] <= ");
                    String _get_5 = ((List<String>)Conversions.doWrapArray(vals)).get(1);
                    _builder.append(_get_5, "");
                    _builder.append(")");
                    String _string = _builder.toString();
                    domains.add(_string);
                  } catch (final Throwable _t_3) {
                    if (_t_3 instanceof Exception) {
                      final Exception e_3 = (Exception)_t_3;
                      System.out.println(dom);
                      e_3.printStackTrace();
                      StringConcatenation _builder_1 = new StringConcatenation();
                      _builder_1.append("domain ");
                      _builder_1.append(dom, "");
                      _builder_1.append(" not supported");
                      RuntimeException _runtimeException = new RuntimeException(_builder_1.toString());
                      throw _runtimeException;
                    } else {
                      throw Exceptions.sneakyThrow(_t_3);
                    }
                  }
                }
              }
            }
          }
        }
      }
      int _size = goals.size();
      this.goalCount = _size;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("goals = [");
      _builder.newLine();
      {
        for(final String goal : goals) {
          _builder.append("\t");
          _builder.append(goal, "	");
          _builder.append(",");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("]");
      _builder.newLine();
      final String goalState = _builder.toString();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("domains = [");
      _builder_1.newLine();
      {
        for(final String domain : domains) {
          _builder_1.append("\t");
          _builder_1.append(domain, "	");
          _builder_1.append(",");
          _builder_1.newLineIfNotEmpty();
        }
      }
      _builder_1.append("]");
      _builder_1.newLine();
      final String domainState = _builder_1.toString();
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("users = [");
      _builder_2.newLine();
      {
        for(final ArrayList<String> user : users) {
          _builder_2.append("\t");
          _builder_2.append("(lambda cont,conf:");
          String _get = user.get(0);
          _builder_2.append(_get, "	");
          _builder_2.append(" , ");
          String _get_1 = user.get(1);
          _builder_2.append(_get_1, "	");
          _builder_2.append(", ");
          String _get_2 = user.get(2);
          _builder_2.append(_get_2, "	");
          _builder_2.append("),");
          _builder_2.newLineIfNotEmpty();
        }
      }
      _builder_2.append("]");
      _builder_2.newLine();
      final String userState = _builder_2.toString();
      String _removeLastSplitter = this.removeLastSplitter(goalState, ",");
      String _removeLastSplitter_1 = this.removeLastSplitter(domainState, ",");
      String _plus = (_removeLastSplitter + _removeLastSplitter_1);
      String _removeLastSplitter_2 = this.removeLastSplitter(userState, ",");
      return (_plus + _removeLastSplitter_2);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private boolean userflag;
  
  public String getZ3Expression(final OCLExpression oclexpr, final EObject context, final Map<String,Object> evEnv) {
    boolean _matched = false;
    if (!_matched) {
      if (oclexpr instanceof PropertyCallExp) {
        final PropertyCallExp _propertyCallExp = (PropertyCallExp)oclexpr;
        EStructuralFeature _referredProperty = _propertyCallExp.getReferredProperty();
        if ((_referredProperty instanceof EAttribute)) {
          _matched=true;
          org.eclipse.ocl.expressions.OCLExpression<EClassifier> _source = _propertyCallExp.getSource();
          Object _queryResult = this.getQueryResult(((OCLExpression) _source), context, evEnv);
          final EObject source = ((EObject) _queryResult);
          boolean _equals = Objects.equal(source, null);
          if (_equals) {
            return "";
          }
          String _eObjectPath = this.getEObjectPath(source);
          String _plus = (_eObjectPath + ".");
          EStructuralFeature _referredProperty_1 = _propertyCallExp.getReferredProperty();
          String _name = _referredProperty_1.getName();
          final String vname = (_plus + _name);
          if (this.userflag) {
            EStructuralFeature _referredProperty_2 = _propertyCallExp.getReferredProperty();
            EAnnotation _eAnnotation = _referredProperty_2.getEAnnotation(Z3Generator.CONFIG_ANNO_SOURCE);
            boolean _notEquals = (!Objects.equal(_eAnnotation, null));
            if (_notEquals) {
              StringConcatenation _builder = new StringConcatenation();
              _builder.append("conf[\'");
              _builder.append(vname, "");
              _builder.append("\']");
              return _builder.toString();
            } else {
              StringConcatenation _builder_1 = new StringConcatenation();
              _builder_1.append("cont[\'");
              _builder_1.append(vname, "");
              _builder_1.append("\'] ");
              return _builder_1.toString();
            }
          } else {
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append("variables[\'");
            _builder_2.append(vname, "");
            _builder_2.append("\']");
            return _builder_2.toString();
          }
        }
      }
    }
    if (!_matched) {
      if (oclexpr instanceof OperationCallExp) {
        final OperationCallExp _operationCallExp = (OperationCallExp)oclexpr;
        _matched=true;
        final EOperation operation = _operationCallExp.getReferredOperation();
        org.eclipse.ocl.expressions.OCLExpression<EClassifier> _source = _operationCallExp.getSource();
        final OCLExpression source = ((OCLExpression) _source);
        final EList<org.eclipse.ocl.expressions.OCLExpression<EClassifier>> argument = _operationCallExp.getArgument();
        boolean _or = false;
        Set<String> _keySet = this.PrimitiveOperand.keySet();
        String _name = operation.getName();
        boolean _contains = _keySet.contains(_name);
        if (_contains) {
          _or = true;
        } else {
          Set<String> _keySet_1 = this.PrimitiveBooleanOperand.keySet();
          String _name_1 = operation.getName();
          boolean _contains_1 = _keySet_1.contains(_name_1);
          _or = (_contains || _contains_1);
        }
        if (_or) {
          final String sourceString = this.getZ3Expression(source, context, evEnv);
          String argString = "";
          boolean _isEmpty = argument.isEmpty();
          if (_isEmpty) {
            argString = "";
          } else {
            org.eclipse.ocl.expressions.OCLExpression<EClassifier> _get = argument.get(0);
            String _z3Expression = this.getZ3Expression(((OCLExpression) _get), context, evEnv);
            argString = _z3Expression;
          }
          String _name_2 = operation.getName();
          final String opMath = this.PrimitiveOperand.get(_name_2);
          boolean _notEquals = (!Objects.equal(opMath, null));
          if (_notEquals) {
            boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(sourceString);
            if (_isNullOrEmpty) {
              return "";
            } else {
              boolean _notEquals_1 = (!Objects.equal(argString, ""));
              if (_notEquals_1) {
                StringConcatenation _builder = new StringConcatenation();
                _builder.append("(");
                _builder.append(sourceString, "");
                _builder.append(") ");
                _builder.append(opMath, "");
                _builder.append(" (");
                _builder.append(argString, "");
                _builder.append(")");
                return _builder.toString();
              } else {
                boolean _and = false;
                boolean _isEmpty_1 = argument.isEmpty();
                if (!_isEmpty_1) {
                  _and = false;
                } else {
                  boolean _equals = Objects.equal(opMath, "-");
                  _and = (_isEmpty_1 && _equals);
                }
                if (_and) {
                  StringConcatenation _builder_1 = new StringConcatenation();
                  _builder_1.append("-");
                  _builder_1.append(sourceString, "");
                  return _builder_1.toString();
                } else {
                  StringConcatenation _builder_2 = new StringConcatenation();
                  _builder_2.append(_operationCallExp, "");
                  _builder_2.append(" not supported");
                  RuntimeException _runtimeException = new RuntimeException(_builder_2.toString());
                  throw _runtimeException;
                }
              }
            }
          }
          String _name_3 = operation.getName();
          final String opBoolean = this.PrimitiveBooleanOperand.get(_name_3);
          boolean _or_1 = false;
          boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(sourceString);
          if (_isNullOrEmpty_1) {
            _or_1 = true;
          } else {
            boolean _isNullOrEmpty_2 = StringExtensions.isNullOrEmpty(argString);
            _or_1 = (_isNullOrEmpty_1 || _isNullOrEmpty_2);
          }
          if (_or_1) {
            boolean _equals_1 = Objects.equal(opBoolean, "Implies");
            if (_equals_1) {
              return "";
            }
            StringConcatenation _builder_3 = new StringConcatenation();
            _builder_3.append(sourceString, "");
            _builder_3.append(argString, "");
            return _builder_3.toString();
          } else {
            boolean _not = (!this.userflag);
            if (_not) {
              StringConcatenation _builder_4 = new StringConcatenation();
              _builder_4.append(opBoolean, "");
              _builder_4.append("(");
              _builder_4.append(sourceString, "");
              _builder_4.append(", ");
              _builder_4.append(argString, "");
              _builder_4.append(")");
              return _builder_4.toString();
            } else {
              StringConcatenation _builder_5 = new StringConcatenation();
              _builder_5.append(" ");
              _builder_5.append(sourceString, " ");
              _builder_5.append(" ");
              String _name_4 = operation.getName();
              _builder_5.append(_name_4, " ");
              _builder_5.append(" ");
              _builder_5.append(argString, " ");
              _builder_5.append(" ");
              return _builder_5.toString();
            }
          }
        }
        String _name_5 = operation.getName();
        boolean _equals_2 = Objects.equal(_name_5, "not");
        if (_equals_2) {
          final String sourceString_1 = this.getZ3Expression(source, context, evEnv);
          boolean _isNullOrEmpty_3 = StringExtensions.isNullOrEmpty(sourceString_1);
          if (_isNullOrEmpty_3) {
            return "";
          }
          StringConcatenation _builder_6 = new StringConcatenation();
          _builder_6.append("Not(");
          _builder_6.append(sourceString_1, "");
          _builder_6.append(")");
          return _builder_6.toString();
        }
        boolean _and_1 = false;
        boolean _and_2 = false;
        String _name_6 = _operationCallExp.getName();
        boolean _equals_3 = Objects.equal(_name_6, null);
        if (!_equals_3) {
          _and_2 = false;
        } else {
          EOperation _referredOperation = _operationCallExp.getReferredOperation();
          boolean _notEquals_2 = (!Objects.equal(_referredOperation, null));
          _and_2 = (_equals_3 && _notEquals_2);
        }
        if (!_and_2) {
          _and_1 = false;
        } else {
          EOperation _referredOperation_1 = _operationCallExp.getReferredOperation();
          String _name_7 = _referredOperation_1.getName();
          boolean _equals_4 = Objects.equal(_name_7, "sum");
          _and_1 = (_and_2 && _equals_4);
        }
        if (_and_1) {
          String _name_8 = source.getName();
          boolean _equals_5 = Objects.equal(_name_8, "collect");
          if (_equals_5) {
            final IteratorExp itsource = ((IteratorExp) source);
            final ArrayList<String> results = this.resolveIteratorSourceList(itsource, context, evEnv);
            int _size = results.size();
            boolean _equals_6 = (_size == 0);
            if (_equals_6) {
              return "";
            }
            StringConcatenation _builder_7 = new StringConcatenation();
            {
              for(final String result : results) {
                _builder_7.append(result, "");
                _builder_7.append(" + ");
              }
            }
            final String final_ = _builder_7.toString();
            return this.removeLastSplitter(final_, "+ ");
          }
        }
        boolean _and_3 = false;
        boolean _and_4 = false;
        String _name_9 = _operationCallExp.getName();
        boolean _equals_7 = Objects.equal(_name_9, null);
        if (!_equals_7) {
          _and_4 = false;
        } else {
          EOperation _referredOperation_2 = _operationCallExp.getReferredOperation();
          boolean _notEquals_3 = (!Objects.equal(_referredOperation_2, null));
          _and_4 = (_equals_7 && _notEquals_3);
        }
        if (!_and_4) {
          _and_3 = false;
        } else {
          EOperation _referredOperation_3 = _operationCallExp.getReferredOperation();
          String _name_10 = _referredOperation_3.getName();
          boolean _contains_2 = this.StructuralOperation.contains(_name_10);
          _and_3 = (_and_4 && _contains_2);
        }
        if (_and_3) {
          final Object value = this.getQueryResult(_operationCallExp, context, evEnv);
          boolean _notEquals_4 = (!Objects.equal(value, null));
          if (_notEquals_4) {
            return value.toString();
          }
        } else {
          StringConcatenation _builder_8 = new StringConcatenation();
          _builder_8.append(_operationCallExp, "");
          _builder_8.append(" not supported!");
          RuntimeException _runtimeException_1 = new RuntimeException(_builder_8.toString());
          throw _runtimeException_1;
        }
      }
    }
    if (!_matched) {
      if (oclexpr instanceof IteratorExp) {
        final IteratorExp _iteratorExp = (IteratorExp)oclexpr;
        _matched=true;
        boolean _or = false;
        String _name = _iteratorExp.getName();
        boolean _equals = Objects.equal(_name, "forAll");
        if (_equals) {
          _or = true;
        } else {
          String _name_1 = _iteratorExp.getName();
          boolean _equals_1 = Objects.equal(_name_1, "exists");
          _or = (_equals || _equals_1);
        }
        if (_or) {
          final ArrayList<String> results = this.resolveIteratorSourceList(_iteratorExp, context, evEnv);
          int _size = results.size();
          boolean _equals_2 = (_size == 0);
          if (_equals_2) {
            return "";
          }
          String _xifexpression = null;
          String _name_2 = _iteratorExp.getName();
          boolean _equals_3 = Objects.equal(_name_2, "forAll");
          if (_equals_3) {
            _xifexpression = "And";
          } else {
            _xifexpression = "Or";
          }
          final String op = _xifexpression;
          StringConcatenation _builder = new StringConcatenation();
          _builder.append(op, "");
          _builder.append("(");
          {
            for(final String result : results) {
              _builder.append(result, "");
              _builder.append(", ");
            }
          }
          _builder.append(")");
          final String final_ = _builder.toString();
          return this.removeLastSplitter(final_, ", ");
        }
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("iterator ");
        String _name_3 = _iteratorExp.getName();
        _builder_1.append(_name_3, "");
        _builder_1.append(" not supported!");
        RuntimeException _runtimeException = new RuntimeException(_builder_1.toString());
        throw _runtimeException;
      }
    }
    if (!_matched) {
      if (oclexpr instanceof IfExp) {
        final IfExp _ifExp = (IfExp)oclexpr;
        _matched=true;
        org.eclipse.ocl.expressions.OCLExpression<EClassifier> _condition = _ifExp.getCondition();
        Object _queryResult = this.getQueryResult(((OCLExpression) _condition), context, evEnv);
        final Boolean cond = ((Boolean) _queryResult);
        boolean _booleanValue = cond.booleanValue();
        if (_booleanValue) {
          org.eclipse.ocl.expressions.OCLExpression<EClassifier> _thenExpression = _ifExp.getThenExpression();
          String _z3Expression = this.getZ3Expression(((OCLExpression) _thenExpression), context, evEnv);
          return _z3Expression.toString();
        } else {
          org.eclipse.ocl.expressions.OCLExpression<EClassifier> _elseExpression = _ifExp.getElseExpression();
          String _z3Expression_1 = this.getZ3Expression(((OCLExpression) _elseExpression), context, evEnv);
          return _z3Expression_1.toString();
        }
      }
    }
    if (!_matched) {
      if (oclexpr instanceof BooleanLiteralExp) {
        final BooleanLiteralExp _booleanLiteralExp = (BooleanLiteralExp)oclexpr;
        _matched=true;
        String _string = _booleanLiteralExp.toString();
        boolean _equals = Objects.equal(_string, "true");
        if (_equals) {
          return "True";
        } else {
          return "False";
        }
      }
    }
    if (!_matched) {
      if (oclexpr instanceof IntegerLiteralExp) {
        final IntegerLiteralExp _integerLiteralExp = (IntegerLiteralExp)oclexpr;
        _matched=true;
        return _integerLiteralExp.toString();
      }
    }
    if (!_matched) {
      if (oclexpr instanceof RealLiteralExp) {
        final RealLiteralExp _realLiteralExp = (RealLiteralExp)oclexpr;
        _matched=true;
        return _realLiteralExp.toString();
      }
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(oclexpr, "");
    _builder.append(" not supported!");
    RuntimeException _runtimeException = new RuntimeException(_builder.toString());
    throw _runtimeException;
  }
  
  public Object getQueryResult(final OCLExpression oclexpr, final EObject context, final Map<String,Object> evEnv) {
    Object _xblockexpression = null;
    {
      final Query query = this.ocl.createQuery(oclexpr);
      Set<String> _keySet = evEnv.keySet();
      for (final String s : _keySet) {
        {
          final Object value = evEnv.get(s);
          boolean _notEquals = (!Objects.equal(value, null));
          if (_notEquals) {
            EvaluationEnvironment<EClassifier,? extends Object,? extends Object,EClass,EObject> _evaluationEnvironment = query.getEvaluationEnvironment();
            _evaluationEnvironment.add(s, value);
          }
        }
      }
      Object _evaluate = query.evaluate(context);
      _xblockexpression = (_evaluate);
    }
    return _xblockexpression;
  }
  
  public String getEObjectName(final EObject obj) {
    EClass _eClass = obj.eClass();
    EList<EAttribute> _eAllAttributes = _eClass.getEAllAttributes();
    for (final EAttribute attr : _eAllAttributes) {
      boolean _isID = attr.isID();
      if (_isID) {
        Object _eGet = obj.eGet(attr);
        return _eGet.toString();
      }
    }
    EObject _eContainer = obj.eContainer();
    EStructuralFeature _eContainingFeature = obj.eContainingFeature();
    Object _eGet_1 = _eContainer.eGet(_eContainingFeature);
    final EList list = ((EList) _eGet_1);
    int _indexOf = list.indexOf(obj);
    return Integer.valueOf(_indexOf).toString();
  }
  
  public String getEObjectPath(final EObject obj) {
    String _xifexpression = null;
    EObject _eContainer = obj.eContainer();
    boolean _equals = Objects.equal(_eContainer, null);
    if (_equals) {
      String _eObjectName = this.getEObjectName(obj);
      String _plus = ("/" + _eObjectName);
      _xifexpression = _plus;
    } else {
      String _xifexpression_1 = null;
      EStructuralFeature _eContainingFeature = obj.eContainingFeature();
      int _upperBound = _eContainingFeature.getUpperBound();
      boolean _equals_1 = (_upperBound == 1);
      if (_equals_1) {
        EObject _eContainer_1 = obj.eContainer();
        String _eObjectPath = this.getEObjectPath(_eContainer_1);
        String _plus_1 = (_eObjectPath + "/");
        EStructuralFeature _eContainingFeature_1 = obj.eContainingFeature();
        String _name = _eContainingFeature_1.getName();
        String _plus_2 = (_plus_1 + _name);
        _xifexpression_1 = _plus_2;
      } else {
        EObject _eContainer_2 = obj.eContainer();
        String _eObjectPath_1 = this.getEObjectPath(_eContainer_2);
        String _plus_3 = (_eObjectPath_1 + "/");
        EStructuralFeature _eContainingFeature_2 = obj.eContainingFeature();
        String _name_1 = _eContainingFeature_2.getName();
        String _plus_4 = (_plus_3 + _name_1);
        String _plus_5 = (_plus_4 + 
          "#");
        String _eObjectName_1 = this.getEObjectName(obj);
        String _plus_6 = (_plus_5 + _eObjectName_1);
        _xifexpression_1 = _plus_6;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public boolean canBeVariable(final EAttribute attr) {
    boolean _isID = attr.isID();
    if (_isID) {
      return false;
    }
    return true;
  }
  
  public Object getZ3Type(final EAttribute attr) {
    return null;
  }
  
  public String removeLastSplitter(final String s, final String splitter) {
    final int lastComma = s.lastIndexOf(splitter);
    boolean _greaterThan = (lastComma > 0);
    if (_greaterThan) {
      String _substring = s.substring(0, lastComma);
      int _plus = (lastComma + 1);
      String _substring_1 = s.substring(_plus);
      return (_substring + _substring_1);
    } else {
      return s;
    }
  }
  
  public ArrayList<String> resolveIteratorSourceList(final IteratorExp oclexpr, final EObject context, final Map<String,Object> evEnv) {
    ArrayList<String> _xblockexpression = null;
    {
      org.eclipse.ocl.expressions.OCLExpression<EClassifier> _source = oclexpr.getSource();
      Object _queryResult = this.getQueryResult(((OCLExpression) _source), context, evEnv);
      final Collection lst = ((Collection) _queryResult);
      ArrayList<String> _arrayList = new ArrayList<String>();
      final ArrayList<String> results = _arrayList;
      for (final Object itelement : lst) {
        EList<Variable<EClassifier,EParameter>> _iterator = oclexpr.getIterator();
        for (final Variable<EClassifier,EParameter> itvar : _iterator) {
          {
            final String varname = itvar.getName();
            final Object original = evEnv.get(varname);
            evEnv.put(varname, itelement);
            org.eclipse.ocl.expressions.OCLExpression<EClassifier> _body = oclexpr.getBody();
            final String res = this.getZ3Expression(((OCLExpression) _body), context, evEnv);
            boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(res);
            boolean _not = (!_isNullOrEmpty);
            if (_not) {
              results.add(res);
            }
            evEnv.put(varname, original);
          }
        }
      }
      _xblockexpression = (results);
    }
    return _xblockexpression;
  }
}
