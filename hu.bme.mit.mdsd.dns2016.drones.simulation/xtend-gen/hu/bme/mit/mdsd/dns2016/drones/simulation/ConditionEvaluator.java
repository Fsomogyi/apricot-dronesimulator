package hu.bme.mit.mdsd.dns2016.drones.simulation;

import com.google.common.base.Objects;
import hu.bme.mit.mdsd.dns2016.behaviour.Condition;
import hu.bme.mit.mdsd.dns2016.behaviour.ConditionKind;
import hu.bme.mit.mdsd.dns2016.drones.FieldObject;
import hu.bme.mit.mdsd.dns2016.drones.Mission;
import hu.bme.mit.mdsd.dns2016.drones.Parameter;
import hu.bme.mit.mdsd.dns2016.drones.simulation.exceptions.InvalidConditionExpressionException;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ConditionEvaluator {
  private Mission _mission;
  
  private static Logger logger = Logger.getLogger(ConditionEvaluator.class);
  
  private static ConditionEvaluator INSTANCE;
  
  public static ConditionEvaluator getInstance(final Mission mission) {
    ConditionEvaluator _xblockexpression = null;
    {
      boolean _equals = Objects.equal(ConditionEvaluator.INSTANCE, null);
      if (_equals) {
        ConditionEvaluator _conditionEvaluator = new ConditionEvaluator(mission);
        ConditionEvaluator.INSTANCE = _conditionEvaluator;
      }
      _xblockexpression = ConditionEvaluator.INSTANCE;
    }
    return _xblockexpression;
  }
  
  private ConditionEvaluator(final Mission mission) {
    this._mission = mission;
  }
  
  public String conditionToString(final Condition condition) {
    String operator = "";
    ConditionKind _operation = condition.getOperation();
    if (_operation != null) {
      switch (_operation) {
        case EQUALS:
          operator = "==";
          break;
        case GREATER_THAN:
          operator = ">";
          break;
        case LESSER_THAN:
          operator = "<";
          break;
        case NOT_EQUALS:
          operator = "!=";
          break;
        default:
          break;
      }
    }
    FieldObject _fieldObject = condition.getFieldObject();
    String _name = _fieldObject.getName();
    String _plus = (_name + ".");
    String _key = condition.getKey();
    String _plus_1 = (_plus + _key);
    String _plus_2 = (_plus_1 + " ");
    String _plus_3 = (_plus_2 + operator);
    String _plus_4 = (_plus_3 + " ");
    String _value = condition.getValue();
    String expr = (_plus_4 + _value);
    return (("Condition \'" + expr) + "\'");
  }
  
  public boolean evaluate(final Condition condition) {
    try {
      final FieldObject target = condition.getFieldObject();
      final String property = condition.getKey();
      String value = null;
      EList<Parameter> _parameters = target.getParameters();
      final Function1<Parameter, Boolean> _function = (Parameter p) -> {
        String _key = p.getKey();
        return Boolean.valueOf(_key.equals(property));
      };
      Parameter _findFirst = IterableExtensions.<Parameter>findFirst(_parameters, _function);
      String _value = null;
      if (_findFirst!=null) {
        _value=_findFirst.getValue();
      }
      value = _value;
      if ((value == null)) {
        EClass _eClass = target.eClass();
        EList<EAttribute> _eAllAttributes = _eClass.getEAllAttributes();
        final Function1<EAttribute, Boolean> _function_1 = (EAttribute eAttr) -> {
          String _name = eAttr.getName();
          return Boolean.valueOf(_name.equals(property));
        };
        EAttribute feature = IterableExtensions.<EAttribute>findFirst(_eAllAttributes, _function_1);
        boolean _equals = Objects.equal(feature, null);
        if (_equals) {
          throw new InvalidConditionExpressionException((("Could not read FieldObject property: \'" + property) + "\'!"));
        }
        Object _eGet = target.eGet(feature);
        String _string = _eGet.toString();
        value = _string;
      }
      boolean result = false;
      ConditionKind _operation = condition.getOperation();
      if (_operation != null) {
        switch (_operation) {
          case EQUALS:
            String _value_1 = condition.getValue();
            boolean _equals_1 = value.equals(_value_1);
            result = _equals_1;
            break;
          case GREATER_THAN:
            try {
              float _parseFloat = Float.parseFloat(value);
              float _floatValue = Float.valueOf(_parseFloat).floatValue();
              String _value_2 = condition.getValue();
              float _parseFloat_1 = Float.parseFloat(_value_2);
              boolean _greaterThan = (_floatValue > _parseFloat_1);
              result = _greaterThan;
            } catch (final Throwable _t) {
              if (_t instanceof NumberFormatException) {
                final NumberFormatException e = (NumberFormatException)_t;
                throw new InvalidConditionExpressionException((("Key \'" + property) + "\' or condition value is not a number!"));
              } else {
                throw Exceptions.sneakyThrow(_t);
              }
            }
            break;
          case LESSER_THAN:
            try {
              float _parseFloat_2 = Float.parseFloat(value);
              float _floatValue_1 = Float.valueOf(_parseFloat_2).floatValue();
              String _value_3 = condition.getValue();
              float _parseFloat_3 = Float.parseFloat(_value_3);
              boolean _lessThan = (_floatValue_1 < _parseFloat_3);
              result = _lessThan;
            } catch (final Throwable _t_1) {
              if (_t_1 instanceof NumberFormatException) {
                final NumberFormatException e_1 = (NumberFormatException)_t_1;
                throw new InvalidConditionExpressionException((("Key \'" + property) + "\' or condition value is not a number!"));
              } else {
                throw Exceptions.sneakyThrow(_t_1);
              }
            }
            break;
          case NOT_EQUALS:
            String _value_4 = condition.getValue();
            boolean _equals_2 = value.equals(_value_4);
            boolean _not = (!_equals_2);
            result = _not;
            break;
          default:
            break;
        }
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Evaluation trace: ");
      String _conditionToString = this.conditionToString(condition);
      _builder.append(_conditionToString, "");
      _builder.append("  (");
      _builder.append(value, "");
      _builder.append(") -> ");
      _builder.append(result, "");
      ConditionEvaluator.logger.info(_builder);
      return result;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
