package hu.bme.mit.mdsd.dns2016.drones.simulation;

import com.google.common.base.Objects;
import hu.bme.mit.mdsd.dns2016.behaviour.Choice;
import hu.bme.mit.mdsd.dns2016.behaviour.Instruct;
import hu.bme.mit.mdsd.dns2016.behaviour.Instruction;
import hu.bme.mit.mdsd.dns2016.behaviour.Lift;
import hu.bme.mit.mdsd.dns2016.behaviour.MoveTo;
import hu.bme.mit.mdsd.dns2016.behaviour.Pause;
import hu.bme.mit.mdsd.dns2016.behaviour.PerformAction;
import hu.bme.mit.mdsd.dns2016.behaviour.PlaceObject;
import hu.bme.mit.mdsd.dns2016.behaviour.SendMessage;
import hu.bme.mit.mdsd.dns2016.behaviour.WaitForMessage;
import hu.bme.mit.mdsd.dns2016.behaviour.While;
import hu.bme.mit.mdsd.dns2016.drones.Action;
import hu.bme.mit.mdsd.dns2016.drones.Drone;
import hu.bme.mit.mdsd.dns2016.drones.FieldObject;
import hu.bme.mit.mdsd.dns2016.drones.MovableObject;
import hu.bme.mit.mdsd.dns2016.drones.simulation.DronesSimulationModel;
import hu.bme.mit.mdsd.dns2016.drones.simulation.entities.DroneEntity;
import hu.bme.mit.mdsd.dns2016.drones.simulation.events.ChoiceEvent;
import hu.bme.mit.mdsd.dns2016.drones.simulation.events.InstructionEvent;
import hu.bme.mit.mdsd.dns2016.drones.simulation.events.LiftEvent;
import hu.bme.mit.mdsd.dns2016.drones.simulation.events.MoveStartedEvent;
import hu.bme.mit.mdsd.dns2016.drones.simulation.events.PauseEvent;
import hu.bme.mit.mdsd.dns2016.drones.simulation.events.PerformActionEvent;
import hu.bme.mit.mdsd.dns2016.drones.simulation.events.PlaceObjectEvent;
import hu.bme.mit.mdsd.dns2016.drones.simulation.events.SendInstructionEvent;
import hu.bme.mit.mdsd.dns2016.drones.simulation.events.SendMessageEvent;
import hu.bme.mit.mdsd.dns2016.drones.simulation.events.WaitForMessageEvent;
import hu.bme.mit.mdsd.dns2016.drones.simulation.events.WhileEvent;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class BehaviourEventGenerator {
  private ListIterator<Instruction> _ip;
  
  private DronesSimulationModel _model;
  
  private DroneEntity _drone;
  
  private static Logger logger = Logger.getLogger(BehaviourEventGenerator.class);
  
  public BehaviourEventGenerator(final DronesSimulationModel owner, final DroneEntity de) {
    EList<Instruction> _instructions = de.behaviour.getInstructions();
    ListIterator<Instruction> _listIterator = _instructions.listIterator();
    this._ip = _listIterator;
    this._model = owner;
    this._drone = de;
  }
  
  public InstructionEvent getFirstEvent() {
    Instruction _nextInstruction = this.getNextInstruction();
    final InstructionEvent firstEvent = this.buildEvent(_nextInstruction);
    return firstEvent;
  }
  
  public InstructionEvent buildEvent(final Instruction i) {
    boolean _equals = Objects.equal(i, null);
    if (_equals) {
      return null;
    }
    final InstructionEvent event = this.getEvent(i);
    Instruction _nextInstruction = this.getNextInstruction();
    InstructionEvent _buildEvent = this.buildEvent(_nextInstruction);
    event.setNextInstruction(_buildEvent);
    return event;
  }
  
  public Instruction getNextInstruction() {
    Instruction nextInstruction = null;
    boolean _hasNext = this._ip.hasNext();
    if (_hasNext) {
      Instruction _next = this._ip.next();
      nextInstruction = _next;
    }
    return nextInstruction;
  }
  
  public List<InstructionEvent> getEventBlock(final List<Instruction> source) {
    List<InstructionEvent> _xblockexpression = null;
    {
      final List<InstructionEvent> result = CollectionLiterals.<InstructionEvent>newArrayList();
      InstructionEvent prev = null;
      for (final Instruction i : source) {
        {
          final InstructionEvent event = this.getEvent(i);
          boolean _notEquals = (!Objects.equal(prev, null));
          if (_notEquals) {
            prev.setNextInstruction(event);
          }
          result.add(event);
          prev = event;
        }
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  protected InstructionEvent _getEvent(final MoveTo i) {
    MoveStartedEvent _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      Drone _get = this._drone.get();
      String _name = _get.getName();
      _builder.append(_name, "");
      _builder.append(" MoveTo fieldObject \"");
      FieldObject _fieldObject = i.getFieldObject();
      String _name_1 = _fieldObject.getName();
      _builder.append(_name_1, "");
      _builder.append("\" at (");
      FieldObject _fieldObject_1 = i.getFieldObject();
      float _x = _fieldObject_1.getX();
      _builder.append(_x, "");
      _builder.append(", ");
      FieldObject _fieldObject_2 = i.getFieldObject();
      float _y = _fieldObject_2.getY();
      _builder.append(_y, "");
      _builder.append(", ");
      FieldObject _fieldObject_3 = i.getFieldObject();
      float _z = _fieldObject_3.getZ();
      _builder.append(_z, "");
      _builder.append(")");
      BehaviourEventGenerator.logger.debug(_builder);
      Drone _get_1 = this._drone.get();
      String _name_2 = _get_1.getName();
      String _plus = (_name_2 + " move to ");
      FieldObject _fieldObject_4 = i.getFieldObject();
      String _name_3 = _fieldObject_4.getName();
      String _plus_1 = (_plus + _name_3);
      _xblockexpression = new MoveStartedEvent(this._model, _plus_1, true, i);
    }
    return _xblockexpression;
  }
  
  protected InstructionEvent _getEvent(final Lift i) {
    LiftEvent _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      Drone _get = this._drone.get();
      String _name = _get.getName();
      _builder.append(_name, "");
      _builder.append(" Attempting to Lift fieldObject \"");
      MovableObject _target = i.getTarget();
      String _name_1 = _target.getName();
      _builder.append(_name_1, "");
      _builder.append("\" at (");
      MovableObject _target_1 = i.getTarget();
      float _x = _target_1.getX();
      _builder.append(_x, "");
      _builder.append(", ");
      MovableObject _target_2 = i.getTarget();
      float _y = _target_2.getY();
      _builder.append(_y, "");
      _builder.append(", ");
      MovableObject _target_3 = i.getTarget();
      float _z = _target_3.getZ();
      _builder.append(_z, "");
      _builder.append(")");
      BehaviourEventGenerator.logger.debug(_builder);
      Drone _get_1 = this._drone.get();
      String _name_2 = _get_1.getName();
      String _plus = (_name_2 + " lift ");
      MovableObject _target_4 = i.getTarget();
      String _name_3 = _target_4.getName();
      String _plus_1 = (_plus + _name_3);
      _xblockexpression = new LiftEvent(this._model, _plus_1, true, i);
    }
    return _xblockexpression;
  }
  
  protected InstructionEvent _getEvent(final Pause i) {
    PauseEvent _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      Drone _get = this._drone.get();
      String _name = _get.getName();
      _builder.append(_name, "");
      _builder.append(" pausing for ");
      float _duration = i.getDuration();
      _builder.append(_duration, "");
      BehaviourEventGenerator.logger.debug(_builder);
      Drone _get_1 = this._drone.get();
      String _name_1 = _get_1.getName();
      String _plus = (_name_1 + " pause ");
      float _duration_1 = i.getDuration();
      String _plus_1 = (_plus + Float.valueOf(_duration_1));
      _xblockexpression = new PauseEvent(this._model, _plus_1, true, i);
    }
    return _xblockexpression;
  }
  
  protected InstructionEvent _getEvent(final Choice i) {
    ChoiceEvent _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      Drone _get = this._drone.get();
      String _name = _get.getName();
      _builder.append(_name, "");
      _builder.append(" Evaluating condition ");
      BehaviourEventGenerator.logger.debug(_builder);
      EList<Instruction> _trueBranch = i.getTrueBranch();
      final List<InstructionEvent> trueInstructions = this.getEventBlock(_trueBranch);
      EList<Instruction> _falseBranch = i.getFalseBranch();
      final List<InstructionEvent> falseInstructions = this.getEventBlock(_falseBranch);
      Drone _get_1 = this._drone.get();
      String _name_1 = _get_1.getName();
      String _plus = (_name_1 + " choice ");
      _xblockexpression = new ChoiceEvent(this._model, _plus, true, i, trueInstructions, falseInstructions);
    }
    return _xblockexpression;
  }
  
  protected InstructionEvent _getEvent(final While i) {
    WhileEvent _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      Drone _get = this._drone.get();
      String _name = _get.getName();
      _builder.append(_name, "");
      _builder.append(" While loop ");
      BehaviourEventGenerator.logger.debug(_builder);
      EList<Instruction> _instructions = i.getInstructions();
      List<InstructionEvent> loopInstructions = this.getEventBlock(_instructions);
      Drone _get_1 = this._drone.get();
      String _name_1 = _get_1.getName();
      String _plus = (_name_1 + " while ");
      _xblockexpression = new WhileEvent(this._model, _plus, true, i, loopInstructions);
    }
    return _xblockexpression;
  }
  
  protected InstructionEvent _getEvent(final Instruct i) {
    SendInstructionEvent _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      Drone _get = this._drone.get();
      String _name = _get.getName();
      _builder.append(_name, "");
      _builder.append(" Sending instruction message ");
      _builder.append(i, "");
      BehaviourEventGenerator.logger.debug(_builder);
      EList<Instruction> _instructions = i.getInstructions();
      List<InstructionEvent> instructions = this.getEventBlock(_instructions);
      Drone _get_1 = this._drone.get();
      String _name_1 = _get_1.getName();
      String _plus = (_name_1 + " sent message ");
      String _plus_1 = (_plus + i);
      _xblockexpression = new SendInstructionEvent(this._model, _plus_1, true, i, instructions, this._drone);
    }
    return _xblockexpression;
  }
  
  protected InstructionEvent _getEvent(final WaitForMessage i) {
    WaitForMessageEvent _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      Drone _get = this._drone.get();
      String _name = _get.getName();
      _builder.append(_name, "");
      _builder.append(" Waiting for message ");
      String _type = i.getType();
      _builder.append(_type, "");
      _builder.append(" w timeout ");
      float _timeout = i.getTimeout();
      _builder.append(_timeout, "");
      BehaviourEventGenerator.logger.debug(_builder);
      EList<Instruction> _whenArrived = i.getWhenArrived();
      final List<InstructionEvent> whenArrivedInstructions = this.getEventBlock(_whenArrived);
      EList<Instruction> _whenLost = i.getWhenLost();
      final List<InstructionEvent> whenLostInstructions = this.getEventBlock(_whenLost);
      Drone _get_1 = this._drone.get();
      String _name_1 = _get_1.getName();
      String _plus = (_name_1 + " waiting for message ");
      String _type_1 = i.getType();
      String _plus_1 = (_plus + _type_1);
      _xblockexpression = new WaitForMessageEvent(this._model, _plus_1, true, i, this._drone, whenArrivedInstructions, whenLostInstructions);
    }
    return _xblockexpression;
  }
  
  protected InstructionEvent _getEvent(final SendMessage i) {
    SendMessageEvent _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      Drone _get = this._drone.get();
      String _name = _get.getName();
      _builder.append(_name, "");
      _builder.append(" Sending  message of type ");
      String _messageType = i.getMessageType();
      _builder.append(_messageType, "");
      _builder.append(" ");
      BehaviourEventGenerator.logger.debug(_builder);
      Drone _get_1 = this._drone.get();
      String _name_1 = _get_1.getName();
      String _plus = (_name_1 + " sending message");
      String _messageType_1 = i.getMessageType();
      String _plus_1 = (_plus + _messageType_1);
      _xblockexpression = new SendMessageEvent(this._model, _plus_1, true, i, this._drone);
    }
    return _xblockexpression;
  }
  
  protected InstructionEvent _getEvent(final PlaceObject i) {
    PlaceObjectEvent _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      Drone _get = this._drone.get();
      String _name = _get.getName();
      _builder.append(_name, "");
      _builder.append(" Attempting to place carried object at (");
      Drone _get_1 = this._drone.get();
      float _x = _get_1.getX();
      _builder.append(_x, "");
      _builder.append(", ");
      Drone _get_2 = this._drone.get();
      float _y = _get_2.getY();
      _builder.append(_y, "");
      _builder.append(", ");
      Drone _get_3 = this._drone.get();
      float _z = _get_3.getZ();
      _builder.append(_z, "");
      _builder.append(")");
      BehaviourEventGenerator.logger.debug(_builder);
      Drone _get_4 = this._drone.get();
      String _name_1 = _get_4.getName();
      String _plus = (_name_1 + " place carried object ");
      _xblockexpression = new PlaceObjectEvent(this._model, _plus, true);
    }
    return _xblockexpression;
  }
  
  protected InstructionEvent _getEvent(final PerformAction i) {
    PerformActionEvent _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      Drone _get = this._drone.get();
      String _name = _get.getName();
      _builder.append(_name, "");
      _builder.append(" performing action ");
      Action _action = i.getAction();
      String _name_1 = _action.getName();
      _builder.append(_name_1, "");
      _builder.append(" on target ");
      FieldObject _target = i.getTarget();
      String _name_2 = _target.getName();
      _builder.append(_name_2, "");
      BehaviourEventGenerator.logger.debug(_builder);
      Drone _get_1 = this._drone.get();
      String _name_3 = _get_1.getName();
      String _plus = (_name_3 + " perform action ");
      Action _action_1 = i.getAction();
      String _name_4 = _action_1.getName();
      String _plus_1 = (_plus + _name_4);
      _xblockexpression = new PerformActionEvent(this._model, _plus_1, true, i);
    }
    return _xblockexpression;
  }
  
  public InstructionEvent getEvent(final Instruction i) {
    if (i instanceof Choice) {
      return _getEvent((Choice)i);
    } else if (i instanceof Instruct) {
      return _getEvent((Instruct)i);
    } else if (i instanceof Lift) {
      return _getEvent((Lift)i);
    } else if (i instanceof MoveTo) {
      return _getEvent((MoveTo)i);
    } else if (i instanceof Pause) {
      return _getEvent((Pause)i);
    } else if (i instanceof PerformAction) {
      return _getEvent((PerformAction)i);
    } else if (i instanceof PlaceObject) {
      return _getEvent((PlaceObject)i);
    } else if (i instanceof SendMessage) {
      return _getEvent((SendMessage)i);
    } else if (i instanceof WaitForMessage) {
      return _getEvent((WaitForMessage)i);
    } else if (i instanceof While) {
      return _getEvent((While)i);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(i).toString());
    }
  }
}
