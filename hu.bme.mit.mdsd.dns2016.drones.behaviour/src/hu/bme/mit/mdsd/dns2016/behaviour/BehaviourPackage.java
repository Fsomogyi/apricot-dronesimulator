/**
 */
package hu.bme.mit.mdsd.dns2016.behaviour;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.bme.mit.mdsd.dns2016.behaviour.BehaviourFactory
 * @model kind="package"
 * @generated
 */
public interface BehaviourPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "behaviour";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "hu.bme.mit.mdsd.dns2016.drones.behaviour";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "behaviour";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviourPackage eINSTANCE = hu.bme.mit.mdsd.dns2016.behaviour.impl.BehaviourPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.mdsd.dns2016.behaviour.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.NamedElementImpl
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.BehaviourPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.mdsd.dns2016.behaviour.impl.DroneBehaviourImpl <em>Drone Behaviour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.DroneBehaviourImpl
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.BehaviourPackageImpl#getDroneBehaviour()
	 * @generated
	 */
	int DRONE_BEHAVIOUR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_BEHAVIOUR__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_BEHAVIOUR__INSTRUCTIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Drones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_BEHAVIOUR__DRONES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Can Be Interrupted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_BEHAVIOUR__CAN_BE_INTERRUPTED = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Drone Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_BEHAVIOUR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Drone Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_BEHAVIOUR_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.mdsd.dns2016.behaviour.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.InstructionImpl
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.BehaviourPackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 2;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.mdsd.dns2016.behaviour.impl.MoveToImpl <em>Move To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.MoveToImpl
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.BehaviourPackageImpl#getMoveTo()
	 * @generated
	 */
	int MOVE_TO = 3;

	/**
	 * The feature id for the '<em><b>Field Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_TO__FIELD_OBJECT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Move To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_TO_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Move To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_TO_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.mdsd.dns2016.behaviour.impl.PauseImpl <em>Pause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.PauseImpl
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.BehaviourPackageImpl#getPause()
	 * @generated
	 */
	int PAUSE = 4;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSE__DURATION = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSE_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.mdsd.dns2016.behaviour.impl.PerformActionImpl <em>Perform Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.PerformActionImpl
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.BehaviourPackageImpl#getPerformAction()
	 * @generated
	 */
	int PERFORM_ACTION = 5;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_ACTION__ACTION = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_ACTION__TARGET = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Perform Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_ACTION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Perform Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_ACTION_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.mdsd.dns2016.behaviour.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.ChoiceImpl
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.BehaviourPackageImpl#getChoice()
	 * @generated
	 */
	int CHOICE = 6;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__CONDITION = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>True Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__TRUE_BRANCH = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>False Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__FALSE_BRANCH = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.mdsd.dns2016.behaviour.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.ConditionImpl
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.BehaviourPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 7;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Field Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__FIELD_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__KEY = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__VALUE = 3;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.mdsd.dns2016.behaviour.impl.WaitForMessageImpl <em>Wait For Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.WaitForMessageImpl
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.BehaviourPackageImpl#getWaitForMessage()
	 * @generated
	 */
	int WAIT_FOR_MESSAGE = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FOR_MESSAGE__TYPE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FOR_MESSAGE__TIMEOUT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>When Arrived</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FOR_MESSAGE__WHEN_ARRIVED = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>When Lost</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FOR_MESSAGE__WHEN_LOST = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Wait For Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FOR_MESSAGE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Wait For Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FOR_MESSAGE_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.mdsd.dns2016.behaviour.impl.WhileImpl <em>While</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.WhileImpl
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.BehaviourPackageImpl#getWhile()
	 * @generated
	 */
	int WHILE = 9;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__INSTRUCTIONS = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__CONDITION = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.mdsd.dns2016.behaviour.impl.InstructImpl <em>Instruct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.InstructImpl
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.BehaviourPackageImpl#getInstruct()
	 * @generated
	 */
	int INSTRUCT = 10;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCT__INSTRUCTIONS = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instruct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCT_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Instruct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCT_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.mdsd.dns2016.behaviour.impl.LiftImpl <em>Lift</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.LiftImpl
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.BehaviourPackageImpl#getLift()
	 * @generated
	 */
	int LIFT = 11;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFT__TARGET = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lift</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFT_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Lift</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFT_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.mdsd.dns2016.behaviour.impl.PlaceObjectImpl <em>Place Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.PlaceObjectImpl
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.BehaviourPackageImpl#getPlaceObject()
	 * @generated
	 */
	int PLACE_OBJECT = 12;

	/**
	 * The number of structural features of the '<em>Place Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_OBJECT_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Place Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_OBJECT_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.mdsd.dns2016.behaviour.impl.SendMessageImpl <em>Send Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.SendMessageImpl
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.BehaviourPackageImpl#getSendMessage()
	 * @generated
	 */
	int SEND_MESSAGE = 13;

	/**
	 * The feature id for the '<em><b>Message Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE__MESSAGE_TYPE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Send Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Send Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.mdsd.dns2016.behaviour.ConditionKind <em>Condition Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.ConditionKind
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.BehaviourPackageImpl#getConditionKind()
	 * @generated
	 */
	int CONDITION_KIND = 14;


	/**
	 * Returns the meta object for class '{@link hu.bme.mit.mdsd.dns2016.behaviour.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.mdsd.dns2016.behaviour.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.mdsd.dns2016.behaviour.DroneBehaviour <em>Drone Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drone Behaviour</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.DroneBehaviour
	 * @generated
	 */
	EClass getDroneBehaviour();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.mdsd.dns2016.behaviour.DroneBehaviour#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.DroneBehaviour#getInstructions()
	 * @see #getDroneBehaviour()
	 * @generated
	 */
	EReference getDroneBehaviour_Instructions();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.mdsd.dns2016.behaviour.DroneBehaviour#getDrones <em>Drones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Drones</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.DroneBehaviour#getDrones()
	 * @see #getDroneBehaviour()
	 * @generated
	 */
	EReference getDroneBehaviour_Drones();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.mdsd.dns2016.behaviour.DroneBehaviour#isCanBeInterrupted <em>Can Be Interrupted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Be Interrupted</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.DroneBehaviour#isCanBeInterrupted()
	 * @see #getDroneBehaviour()
	 * @generated
	 */
	EAttribute getDroneBehaviour_CanBeInterrupted();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.mdsd.dns2016.behaviour.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.mdsd.dns2016.behaviour.MoveTo <em>Move To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move To</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.MoveTo
	 * @generated
	 */
	EClass getMoveTo();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.mdsd.dns2016.behaviour.MoveTo#getFieldObject <em>Field Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field Object</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.MoveTo#getFieldObject()
	 * @see #getMoveTo()
	 * @generated
	 */
	EReference getMoveTo_FieldObject();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.mdsd.dns2016.behaviour.Pause <em>Pause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pause</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.Pause
	 * @generated
	 */
	EClass getPause();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.mdsd.dns2016.behaviour.Pause#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.Pause#getDuration()
	 * @see #getPause()
	 * @generated
	 */
	EAttribute getPause_Duration();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.mdsd.dns2016.behaviour.PerformAction <em>Perform Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perform Action</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.PerformAction
	 * @generated
	 */
	EClass getPerformAction();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.mdsd.dns2016.behaviour.PerformAction#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.PerformAction#getAction()
	 * @see #getPerformAction()
	 * @generated
	 */
	EReference getPerformAction_Action();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.mdsd.dns2016.behaviour.PerformAction#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.PerformAction#getTarget()
	 * @see #getPerformAction()
	 * @generated
	 */
	EReference getPerformAction_Target();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.mdsd.dns2016.behaviour.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.Choice
	 * @generated
	 */
	EClass getChoice();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.mdsd.dns2016.behaviour.Choice#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.Choice#getCondition()
	 * @see #getChoice()
	 * @generated
	 */
	EReference getChoice_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.mdsd.dns2016.behaviour.Choice#getTrueBranch <em>True Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>True Branch</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.Choice#getTrueBranch()
	 * @see #getChoice()
	 * @generated
	 */
	EReference getChoice_TrueBranch();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.mdsd.dns2016.behaviour.Choice#getFalseBranch <em>False Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>False Branch</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.Choice#getFalseBranch()
	 * @see #getChoice()
	 * @generated
	 */
	EReference getChoice_FalseBranch();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.mdsd.dns2016.behaviour.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.mdsd.dns2016.behaviour.Condition#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.Condition#getOperation()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Operation();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.mdsd.dns2016.behaviour.Condition#getFieldObject <em>Field Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field Object</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.Condition#getFieldObject()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_FieldObject();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.mdsd.dns2016.behaviour.Condition#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.Condition#getKey()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Key();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.mdsd.dns2016.behaviour.Condition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.Condition#getValue()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Value();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.mdsd.dns2016.behaviour.WaitForMessage <em>Wait For Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wait For Message</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.WaitForMessage
	 * @generated
	 */
	EClass getWaitForMessage();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.mdsd.dns2016.behaviour.WaitForMessage#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.WaitForMessage#getType()
	 * @see #getWaitForMessage()
	 * @generated
	 */
	EAttribute getWaitForMessage_Type();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.mdsd.dns2016.behaviour.WaitForMessage#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.WaitForMessage#getTimeout()
	 * @see #getWaitForMessage()
	 * @generated
	 */
	EAttribute getWaitForMessage_Timeout();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.mdsd.dns2016.behaviour.WaitForMessage#getWhenArrived <em>When Arrived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>When Arrived</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.WaitForMessage#getWhenArrived()
	 * @see #getWaitForMessage()
	 * @generated
	 */
	EReference getWaitForMessage_WhenArrived();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.mdsd.dns2016.behaviour.WaitForMessage#getWhenLost <em>When Lost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>When Lost</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.WaitForMessage#getWhenLost()
	 * @see #getWaitForMessage()
	 * @generated
	 */
	EReference getWaitForMessage_WhenLost();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.mdsd.dns2016.behaviour.While <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.While
	 * @generated
	 */
	EClass getWhile();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.mdsd.dns2016.behaviour.While#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.While#getInstructions()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_Instructions();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.mdsd.dns2016.behaviour.While#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.While#getCondition()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_Condition();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.mdsd.dns2016.behaviour.Instruct <em>Instruct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruct</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.Instruct
	 * @generated
	 */
	EClass getInstruct();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.mdsd.dns2016.behaviour.Instruct#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.Instruct#getInstructions()
	 * @see #getInstruct()
	 * @generated
	 */
	EReference getInstruct_Instructions();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.mdsd.dns2016.behaviour.Lift <em>Lift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lift</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.Lift
	 * @generated
	 */
	EClass getLift();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.mdsd.dns2016.behaviour.Lift#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.Lift#getTarget()
	 * @see #getLift()
	 * @generated
	 */
	EReference getLift_Target();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.mdsd.dns2016.behaviour.PlaceObject <em>Place Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Object</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.PlaceObject
	 * @generated
	 */
	EClass getPlaceObject();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.mdsd.dns2016.behaviour.SendMessage <em>Send Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Message</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.SendMessage
	 * @generated
	 */
	EClass getSendMessage();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.mdsd.dns2016.behaviour.SendMessage#getMessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Type</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.SendMessage#getMessageType()
	 * @see #getSendMessage()
	 * @generated
	 */
	EAttribute getSendMessage_MessageType();

	/**
	 * Returns the meta object for enum '{@link hu.bme.mit.mdsd.dns2016.behaviour.ConditionKind <em>Condition Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Kind</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.ConditionKind
	 * @generated
	 */
	EEnum getConditionKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BehaviourFactory getBehaviourFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hu.bme.mit.mdsd.dns2016.behaviour.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.NamedElementImpl
		 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.BehaviourPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.mdsd.dns2016.behaviour.impl.DroneBehaviourImpl <em>Drone Behaviour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.DroneBehaviourImpl
		 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.BehaviourPackageImpl#getDroneBehaviour()
		 * @generated
		 */
		EClass DRONE_BEHAVIOUR = eINSTANCE.getDroneBehaviour();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONE_BEHAVIOUR__INSTRUCTIONS = eINSTANCE.getDroneBehaviour_Instructions();

		/**
		 * The meta object literal for the '<em><b>Drones</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONE_BEHAVIOUR__DRONES = eINSTANCE.getDroneBehaviour_Drones();

		/**
		 * The meta object literal for the '<em><b>Can Be Interrupted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONE_BEHAVIOUR__CAN_BE_INTERRUPTED = eINSTANCE.getDroneBehaviour_CanBeInterrupted();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.mdsd.dns2016.behaviour.impl.InstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.InstructionImpl
		 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.BehaviourPackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.mdsd.dns2016.behaviour.impl.MoveToImpl <em>Move To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.MoveToImpl
		 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.BehaviourPackageImpl#getMoveTo()
		 * @generated
		 */
		EClass MOVE_TO = eINSTANCE.getMoveTo();

		/**
		 * The meta object literal for the '<em><b>Field Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE_TO__FIELD_OBJECT = eINSTANCE.getMoveTo_FieldObject();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.mdsd.dns2016.behaviour.impl.PauseImpl <em>Pause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.PauseImpl
		 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.BehaviourPackageImpl#getPause()
		 * @generated
		 */
		EClass PAUSE = eINSTANCE.getPause();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAUSE__DURATION = eINSTANCE.getPause_Duration();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.mdsd.dns2016.behaviour.impl.PerformActionImpl <em>Perform Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.PerformActionImpl
		 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.BehaviourPackageImpl#getPerformAction()
		 * @generated
		 */
		EClass PERFORM_ACTION = eINSTANCE.getPerformAction();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORM_ACTION__ACTION = eINSTANCE.getPerformAction_Action();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORM_ACTION__TARGET = eINSTANCE.getPerformAction_Target();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.mdsd.dns2016.behaviour.impl.ChoiceImpl <em>Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.ChoiceImpl
		 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.BehaviourPackageImpl#getChoice()
		 * @generated
		 */
		EClass CHOICE = eINSTANCE.getChoice();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOICE__CONDITION = eINSTANCE.getChoice_Condition();

		/**
		 * The meta object literal for the '<em><b>True Branch</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOICE__TRUE_BRANCH = eINSTANCE.getChoice_TrueBranch();

		/**
		 * The meta object literal for the '<em><b>False Branch</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOICE__FALSE_BRANCH = eINSTANCE.getChoice_FalseBranch();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.mdsd.dns2016.behaviour.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.ConditionImpl
		 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.BehaviourPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__OPERATION = eINSTANCE.getCondition_Operation();

		/**
		 * The meta object literal for the '<em><b>Field Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__FIELD_OBJECT = eINSTANCE.getCondition_FieldObject();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__KEY = eINSTANCE.getCondition_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__VALUE = eINSTANCE.getCondition_Value();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.mdsd.dns2016.behaviour.impl.WaitForMessageImpl <em>Wait For Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.WaitForMessageImpl
		 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.BehaviourPackageImpl#getWaitForMessage()
		 * @generated
		 */
		EClass WAIT_FOR_MESSAGE = eINSTANCE.getWaitForMessage();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAIT_FOR_MESSAGE__TYPE = eINSTANCE.getWaitForMessage_Type();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAIT_FOR_MESSAGE__TIMEOUT = eINSTANCE.getWaitForMessage_Timeout();

		/**
		 * The meta object literal for the '<em><b>When Arrived</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAIT_FOR_MESSAGE__WHEN_ARRIVED = eINSTANCE.getWaitForMessage_WhenArrived();

		/**
		 * The meta object literal for the '<em><b>When Lost</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAIT_FOR_MESSAGE__WHEN_LOST = eINSTANCE.getWaitForMessage_WhenLost();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.mdsd.dns2016.behaviour.impl.WhileImpl <em>While</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.WhileImpl
		 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.BehaviourPackageImpl#getWhile()
		 * @generated
		 */
		EClass WHILE = eINSTANCE.getWhile();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE__INSTRUCTIONS = eINSTANCE.getWhile_Instructions();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE__CONDITION = eINSTANCE.getWhile_Condition();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.mdsd.dns2016.behaviour.impl.InstructImpl <em>Instruct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.InstructImpl
		 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.BehaviourPackageImpl#getInstruct()
		 * @generated
		 */
		EClass INSTRUCT = eINSTANCE.getInstruct();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCT__INSTRUCTIONS = eINSTANCE.getInstruct_Instructions();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.mdsd.dns2016.behaviour.impl.LiftImpl <em>Lift</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.LiftImpl
		 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.BehaviourPackageImpl#getLift()
		 * @generated
		 */
		EClass LIFT = eINSTANCE.getLift();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFT__TARGET = eINSTANCE.getLift_Target();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.mdsd.dns2016.behaviour.impl.PlaceObjectImpl <em>Place Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.PlaceObjectImpl
		 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.BehaviourPackageImpl#getPlaceObject()
		 * @generated
		 */
		EClass PLACE_OBJECT = eINSTANCE.getPlaceObject();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.mdsd.dns2016.behaviour.impl.SendMessageImpl <em>Send Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.SendMessageImpl
		 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.BehaviourPackageImpl#getSendMessage()
		 * @generated
		 */
		EClass SEND_MESSAGE = eINSTANCE.getSendMessage();

		/**
		 * The meta object literal for the '<em><b>Message Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND_MESSAGE__MESSAGE_TYPE = eINSTANCE.getSendMessage_MessageType();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.mdsd.dns2016.behaviour.ConditionKind <em>Condition Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.mdsd.dns2016.behaviour.ConditionKind
		 * @see hu.bme.mit.mdsd.dns2016.behaviour.impl.BehaviourPackageImpl#getConditionKind()
		 * @generated
		 */
		EEnum CONDITION_KIND = eINSTANCE.getConditionKind();

	}

} //BehaviourPackage
