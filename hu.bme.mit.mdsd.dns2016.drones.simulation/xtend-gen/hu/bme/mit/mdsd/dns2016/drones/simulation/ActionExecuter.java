package hu.bme.mit.mdsd.dns2016.drones.simulation;

import com.google.common.base.Objects;
import hu.bme.mit.mdsd.dns2016.behaviour.PerformAction;
import hu.bme.mit.mdsd.dns2016.drones.Action;
import hu.bme.mit.mdsd.dns2016.drones.ActionKind;
import hu.bme.mit.mdsd.dns2016.drones.Drone;
import hu.bme.mit.mdsd.dns2016.drones.FieldObject;
import hu.bme.mit.mdsd.dns2016.drones.Mission;
import hu.bme.mit.mdsd.dns2016.drones.Parameter;
import hu.bme.mit.mdsd.dns2016.drones.simulation.exceptions.DroneActionNotSupportedException;
import hu.bme.mit.mdsd.dns2016.drones.simulation.exceptions.InvalidActionExpressionException;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ActionExecuter {
  private Mission _mission;
  
  private Drone _drone;
  
  private static Logger logger = Logger.getLogger(ActionExecuter.class);
  
  private static ActionExecuter INSTANCE;
  
  public static ActionExecuter getInstance(final Mission mission) {
    ActionExecuter _xblockexpression = null;
    {
      boolean _equals = Objects.equal(ActionExecuter.INSTANCE, null);
      if (_equals) {
        ActionExecuter _actionExecuter = new ActionExecuter(mission);
        ActionExecuter.INSTANCE = _actionExecuter;
      }
      _xblockexpression = ActionExecuter.INSTANCE;
    }
    return _xblockexpression;
  }
  
  private ActionExecuter(final Mission mission) {
    this._mission = mission;
  }
  
  public String actionToString(final PerformAction pa) {
    String operator = "";
    Action _action = pa.getAction();
    ActionKind _operation = _action.getOperation();
    if (_operation != null) {
      switch (_operation) {
        case SET:
          operator = "=";
          break;
        case ADD:
          operator = "+=";
          break;
        case SUBTRACT:
          operator = "-=";
          break;
        default:
          break;
      }
    }
    FieldObject _target = pa.getTarget();
    String _name = _target.getName();
    String _plus = (_name + ".");
    Action _action_1 = pa.getAction();
    String _key = _action_1.getKey();
    String _plus_1 = (_plus + _key);
    String _plus_2 = (_plus_1 + " ");
    String _plus_3 = (_plus_2 + operator);
    String _plus_4 = (_plus_3 + " ");
    Action _action_2 = pa.getAction();
    String _value = _action_2.getValue();
    String expr = (_plus_4 + _value);
    return (("Action \'" + expr) + "\'");
  }
  
  public void execute(final PerformAction pa, final Drone drone) {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Executing action: \'");
      String _actionToString = this.actionToString(pa);
      _builder.append(_actionToString, "");
      _builder.append("\' ");
      ActionExecuter.logger.info(_builder);
      EList<Action> _supportedActions = drone.getSupportedActions();
      Action _action = pa.getAction();
      boolean _contains = _supportedActions.contains(_action);
      boolean _not = (!_contains);
      if (_not) {
        Action _action_1 = pa.getAction();
        String _name = _action_1.getName();
        String _plus = ("Action " + _name);
        String _plus_1 = (_plus + " for Drone ");
        String _name_1 = drone.getName();
        String _plus_2 = (_plus_1 + _name_1);
        String _plus_3 = (_plus_2 + " is not supported");
        throw new DroneActionNotSupportedException(_plus_3);
      }
      final FieldObject target = pa.getTarget();
      Action _action_2 = pa.getAction();
      final String key = _action_2.getKey();
      Action _action_3 = pa.getAction();
      final String value = _action_3.getValue();
      EList<Parameter> _parameters = target.getParameters();
      final Function1<Parameter, Boolean> _function = (Parameter p) -> {
        String _key = p.getKey();
        return Boolean.valueOf(_key.equals(key));
      };
      final Parameter param = IterableExtensions.<Parameter>findFirst(_parameters, _function);
      boolean _notEquals = (!Objects.equal(param, null));
      if (_notEquals) {
        Action _action_4 = pa.getAction();
        ActionKind _operation = _action_4.getOperation();
        if (_operation != null) {
          switch (_operation) {
            case SET:
              param.setValue(value);
              break;
            case ADD:
              try {
                String _value = param.getValue();
                Float floatParamValue = Float.valueOf(Float.parseFloat(_value));
                Float floatValue = Float.valueOf(Float.parseFloat(value));
                Float result = Float.valueOf(((floatParamValue).floatValue() + (floatValue).floatValue()));
                String _string = result.toString();
                param.setValue(_string);
              } catch (final Throwable _t) {
                if (_t instanceof NumberFormatException) {
                  final NumberFormatException e = (NumberFormatException)_t;
                  String _name_2 = target.getName();
                  String _plus_4 = ((("Parameter \'" + key) + "\' on target \'") + _name_2);
                  String _plus_5 = (_plus_4 + "\'");
                  String _plus_6 = (_plus_5 + " is not a number!");
                  throw new InvalidActionExpressionException(_plus_6);
                } else {
                  throw Exceptions.sneakyThrow(_t);
                }
              }
              break;
            case SUBTRACT:
              try {
                String _value_1 = param.getValue();
                Float floatParamValue_1 = Float.valueOf(Float.parseFloat(_value_1));
                Float floatValue_1 = Float.valueOf(Float.parseFloat(value));
                Float result_1 = Float.valueOf(((floatParamValue_1).floatValue() - (floatValue_1).floatValue()));
                String _string_1 = result_1.toString();
                param.setValue(_string_1);
              } catch (final Throwable _t_1) {
                if (_t_1 instanceof NumberFormatException) {
                  final NumberFormatException e_1 = (NumberFormatException)_t_1;
                  String _name_3 = target.getName();
                  String _plus_7 = ((("Parameter \'" + key) + "\' on target \'") + _name_3);
                  String _plus_8 = (_plus_7 + "\'");
                  String _plus_9 = (_plus_8 + " is not a number!");
                  throw new InvalidActionExpressionException(_plus_9);
                } else {
                  throw Exceptions.sneakyThrow(_t_1);
                }
              }
              break;
            default:
              break;
          }
        }
      } else {
        String _name_4 = target.getName();
        String _plus_10 = ((("Parameter \'" + key) + "\' not found on target \'") + _name_4);
        String _plus_11 = (_plus_10 + "\'!");
        throw new InvalidActionExpressionException(_plus_11);
      }
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(" ");
      _builder_1.append("Execution successful ");
      ActionExecuter.logger.info(_builder_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
