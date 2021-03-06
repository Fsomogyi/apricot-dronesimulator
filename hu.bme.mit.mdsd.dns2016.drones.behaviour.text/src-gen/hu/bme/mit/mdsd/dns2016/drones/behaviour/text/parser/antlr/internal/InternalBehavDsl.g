/*
 * generated by Xtext 2.9.2
 */
grammar InternalBehavDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package hu.bme.mit.mdsd.dns2016.drones.behaviour.text.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package hu.bme.mit.mdsd.dns2016.drones.behaviour.text.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import hu.bme.mit.mdsd.dns2016.drones.behaviour.text.services.BehavDslGrammarAccess;

}

@parser::members {

 	private BehavDslGrammarAccess grammarAccess;

    public InternalBehavDslParser(TokenStream input, BehavDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "BehavDSL";
   	}

   	@Override
   	protected BehavDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleBehavDSL
entryRuleBehavDSL returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBehavDSLRule()); }
	iv_ruleBehavDSL=ruleBehavDSL
	{ $current=$iv_ruleBehavDSL.current; }
	EOF;

// Rule BehavDSL
ruleBehavDSL returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getBehavDSLAccess().getImportedMissionImportParserRuleCall_0_0());
				}
				lv_importedMission_0_0=ruleImport
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBehavDSLRule());
					}
					set(
						$current,
						"importedMission",
						lv_importedMission_0_0,
						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.Import");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getBehavDSLAccess().getBehavDroneBehaviourParserRuleCall_1_0());
				}
				lv_behav_1_0=ruleDroneBehaviour
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBehavDSLRule());
					}
					set(
						$current,
						"behav",
						lv_behav_1_0,
						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.DroneBehaviour");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleDroneBehaviour
entryRuleDroneBehaviour returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDroneBehaviourRule()); }
	iv_ruleDroneBehaviour=ruleDroneBehaviour
	{ $current=$iv_ruleDroneBehaviour.current; }
	EOF;

// Rule DroneBehaviour
ruleDroneBehaviour returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='behav'
		{
			newLeafNode(otherlv_0, grammarAccess.getDroneBehaviourAccess().getBehavKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDroneBehaviourAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDroneBehaviourRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getDroneBehaviourAccess().getLeftParenthesisKeyword_2());
		}
		otherlv_3='interrupt'
		{
			newLeafNode(otherlv_3, grammarAccess.getDroneBehaviourAccess().getInterruptKeyword_3());
		}
		otherlv_4='='
		{
			newLeafNode(otherlv_4, grammarAccess.getDroneBehaviourAccess().getEqualsSignKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDroneBehaviourAccess().getCanBeInterruptedEBooleanParserRuleCall_5_0());
				}
				lv_canBeInterrupted_5_0=ruleEBoolean
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDroneBehaviourRule());
					}
					set(
						$current,
						"canBeInterrupted",
						true,
						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.EBoolean");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getDroneBehaviourAccess().getRightParenthesisKeyword_6());
		}
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getDroneBehaviourAccess().getSemicolonKeyword_7());
		}
		otherlv_8='drones'
		{
			newLeafNode(otherlv_8, grammarAccess.getDroneBehaviourAccess().getDronesKeyword_8());
		}
		otherlv_9='{'
		{
			newLeafNode(otherlv_9, grammarAccess.getDroneBehaviourAccess().getLeftCurlyBracketKeyword_9());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDroneBehaviourRule());
					}
				}
				otherlv_10=RULE_ID
				{
					newLeafNode(otherlv_10, grammarAccess.getDroneBehaviourAccess().getDronesDroneCrossReference_10_0());
				}
			)
		)
		(
			otherlv_11=','
			{
				newLeafNode(otherlv_11, grammarAccess.getDroneBehaviourAccess().getCommaKeyword_11_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDroneBehaviourRule());
						}
					}
					otherlv_12=RULE_ID
					{
						newLeafNode(otherlv_12, grammarAccess.getDroneBehaviourAccess().getDronesDroneCrossReference_11_1_0());
					}
				)
			)
		)*
		otherlv_13='}'
		{
			newLeafNode(otherlv_13, grammarAccess.getDroneBehaviourAccess().getRightCurlyBracketKeyword_12());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDroneBehaviourAccess().getInstructionsInstructionParserRuleCall_13_0());
				}
				lv_instructions_14_0=ruleInstruction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDroneBehaviourRule());
					}
					add(
						$current,
						"instructions",
						lv_instructions_14_0,
						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.Instruction");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDroneBehaviourAccess().getInstructionsInstructionParserRuleCall_14_0());
				}
				lv_instructions_15_0=ruleInstruction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDroneBehaviourRule());
					}
					add(
						$current,
						"instructions",
						lv_instructions_15_0,
						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.Instruction");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleImport
entryRuleImport returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getImportRule()); }
	iv_ruleImport=ruleImport
	{ $current=$iv_ruleImport.current; }
	EOF;

// Rule Import
ruleImport returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='import'
		{
			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
		}
		(
			(
				lv_importName_1_0=RULE_STRING
				{
					newLeafNode(lv_importName_1_0, grammarAccess.getImportAccess().getImportNameSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getImportRule());
					}
					setWithLastConsumed(
						$current,
						"importName",
						lv_importName_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleInstruction
entryRuleInstruction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInstructionRule()); }
	iv_ruleInstruction=ruleInstruction
	{ $current=$iv_ruleInstruction.current; }
	EOF;

// Rule Instruction
ruleInstruction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getMoveToParserRuleCall_0());
		}
		this_MoveTo_0=ruleMoveTo
		{
			$current = $this_MoveTo_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getPauseParserRuleCall_1());
		}
		this_Pause_1=rulePause
		{
			$current = $this_Pause_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getPerformActionParserRuleCall_2());
		}
		this_PerformAction_2=rulePerformAction
		{
			$current = $this_PerformAction_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getChoiceParserRuleCall_3());
		}
		this_Choice_3=ruleChoice
		{
			$current = $this_Choice_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getWaitForMessageParserRuleCall_4());
		}
		this_WaitForMessage_4=ruleWaitForMessage
		{
			$current = $this_WaitForMessage_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getWhileParserRuleCall_5());
		}
		this_While_5=ruleWhile
		{
			$current = $this_While_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getLiftParserRuleCall_6());
		}
		this_Lift_6=ruleLift
		{
			$current = $this_Lift_6.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getPlaceObjectParserRuleCall_7());
		}
		this_PlaceObject_7=rulePlaceObject
		{
			$current = $this_PlaceObject_7.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getSendMessageParserRuleCall_8());
		}
		this_SendMessage_8=ruleSendMessage
		{
			$current = $this_SendMessage_8.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getInstructParserRuleCall_9());
		}
		this_Instruct_9=ruleInstruct
		{
			$current = $this_Instruct_9.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleMoveTo
entryRuleMoveTo returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMoveToRule()); }
	iv_ruleMoveTo=ruleMoveTo
	{ $current=$iv_ruleMoveTo.current; }
	EOF;

// Rule MoveTo
ruleMoveTo returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='moveto'
		{
			newLeafNode(otherlv_0, grammarAccess.getMoveToAccess().getMovetoKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMoveToRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getMoveToAccess().getFieldObjectFieldObjectCrossReference_1_0());
				}
			)
		)
		otherlv_2=';'
		{
			newLeafNode(otherlv_2, grammarAccess.getMoveToAccess().getSemicolonKeyword_2());
		}
	)
;

// Entry rule entryRulePause
entryRulePause returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPauseRule()); }
	iv_rulePause=rulePause
	{ $current=$iv_rulePause.current; }
	EOF;

// Rule Pause
rulePause returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='wait'
		{
			newLeafNode(otherlv_0, grammarAccess.getPauseAccess().getWaitKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPauseAccess().getDurationEFloatParserRuleCall_1_0());
				}
				lv_duration_1_0=ruleEFloat
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPauseRule());
					}
					set(
						$current,
						"duration",
						lv_duration_1_0,
						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.EFloat");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2=';'
		{
			newLeafNode(otherlv_2, grammarAccess.getPauseAccess().getSemicolonKeyword_2());
		}
	)
;

// Entry rule entryRulePerformAction
entryRulePerformAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPerformActionRule()); }
	iv_rulePerformAction=rulePerformAction
	{ $current=$iv_rulePerformAction.current; }
	EOF;

// Rule PerformAction
rulePerformAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='action'
		{
			newLeafNode(otherlv_0, grammarAccess.getPerformActionAccess().getActionKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPerformActionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getPerformActionAccess().getActionActionCrossReference_1_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='on'
		{
			newLeafNode(otherlv_2, grammarAccess.getPerformActionAccess().getOnKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPerformActionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getPerformActionAccess().getTargetFieldObjectCrossReference_3_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4=';'
		{
			newLeafNode(otherlv_4, grammarAccess.getPerformActionAccess().getSemicolonKeyword_4());
		}
	)
;

// Entry rule entryRuleChoice
entryRuleChoice returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getChoiceRule()); }
	iv_ruleChoice=ruleChoice
	{ $current=$iv_ruleChoice.current; }
	EOF;

// Rule Choice
ruleChoice returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='if'
		{
			newLeafNode(otherlv_0, grammarAccess.getChoiceAccess().getIfKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getChoiceAccess().getConditionConditionParserRuleCall_1_0());
				}
				lv_condition_1_0=ruleCondition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getChoiceRule());
					}
					set(
						$current,
						"condition",
						lv_condition_1_0,
						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.Condition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getChoiceAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getChoiceAccess().getTrueBranchInstructionParserRuleCall_3_0());
				}
				lv_trueBranch_3_0=ruleInstruction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getChoiceRule());
					}
					add(
						$current,
						"trueBranch",
						lv_trueBranch_3_0,
						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.Instruction");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getChoiceAccess().getTrueBranchInstructionParserRuleCall_4_0());
				}
				lv_trueBranch_4_0=ruleInstruction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getChoiceRule());
					}
					add(
						$current,
						"trueBranch",
						lv_trueBranch_4_0,
						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.Instruction");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getChoiceAccess().getRightCurlyBracketKeyword_5());
		}
		(
			otherlv_6='else'
			{
				newLeafNode(otherlv_6, grammarAccess.getChoiceAccess().getElseKeyword_6_0());
			}
			otherlv_7='{'
			{
				newLeafNode(otherlv_7, grammarAccess.getChoiceAccess().getLeftCurlyBracketKeyword_6_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getChoiceAccess().getFalseBranchInstructionParserRuleCall_6_2_0());
					}
					lv_falseBranch_8_0=ruleInstruction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getChoiceRule());
						}
						add(
							$current,
							"falseBranch",
							lv_falseBranch_8_0,
							"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.Instruction");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getChoiceAccess().getFalseBranchInstructionParserRuleCall_6_3_0());
					}
					lv_falseBranch_9_0=ruleInstruction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getChoiceRule());
						}
						add(
							$current,
							"falseBranch",
							lv_falseBranch_9_0,
							"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.Instruction");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_10='}'
			{
				newLeafNode(otherlv_10, grammarAccess.getChoiceAccess().getRightCurlyBracketKeyword_6_4());
			}
		)?
	)
;

// Entry rule entryRuleWaitForMessage
entryRuleWaitForMessage returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWaitForMessageRule()); }
	iv_ruleWaitForMessage=ruleWaitForMessage
	{ $current=$iv_ruleWaitForMessage.current; }
	EOF;

// Rule WaitForMessage
ruleWaitForMessage returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='waitfor'
		{
			newLeafNode(otherlv_0, grammarAccess.getWaitForMessageAccess().getWaitforKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWaitForMessageAccess().getTypeEStringParserRuleCall_1_0());
				}
				lv_type_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWaitForMessageRule());
					}
					set(
						$current,
						"type",
						lv_type_1_0,
						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getWaitForMessageAccess().getTimeoutEFloatParserRuleCall_2_0());
				}
				lv_timeout_2_0=ruleEFloat
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWaitForMessageRule());
					}
					set(
						$current,
						"timeout",
						lv_timeout_2_0,
						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.EFloat");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getWaitForMessageAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWaitForMessageAccess().getWhenArrivedInstructionParserRuleCall_4_0());
				}
				lv_whenArrived_4_0=ruleInstruction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWaitForMessageRule());
					}
					add(
						$current,
						"whenArrived",
						lv_whenArrived_4_0,
						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.Instruction");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getWaitForMessageAccess().getWhenArrivedInstructionParserRuleCall_5_0());
				}
				lv_whenArrived_5_0=ruleInstruction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWaitForMessageRule());
					}
					add(
						$current,
						"whenArrived",
						lv_whenArrived_5_0,
						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.Instruction");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getWaitForMessageAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_7='timeout'
		{
			newLeafNode(otherlv_7, grammarAccess.getWaitForMessageAccess().getTimeoutKeyword_7());
		}
		otherlv_8='{'
		{
			newLeafNode(otherlv_8, grammarAccess.getWaitForMessageAccess().getLeftCurlyBracketKeyword_8());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWaitForMessageAccess().getWhenLostInstructionParserRuleCall_9_0());
				}
				lv_whenLost_9_0=ruleInstruction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWaitForMessageRule());
					}
					add(
						$current,
						"whenLost",
						lv_whenLost_9_0,
						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.Instruction");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getWaitForMessageAccess().getWhenLostInstructionParserRuleCall_10_0());
				}
				lv_whenLost_10_0=ruleInstruction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWaitForMessageRule());
					}
					add(
						$current,
						"whenLost",
						lv_whenLost_10_0,
						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.Instruction");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_11='}'
		{
			newLeafNode(otherlv_11, grammarAccess.getWaitForMessageAccess().getRightCurlyBracketKeyword_11());
		}
	)
;

// Entry rule entryRuleWhile
entryRuleWhile returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWhileRule()); }
	iv_ruleWhile=ruleWhile
	{ $current=$iv_ruleWhile.current; }
	EOF;

// Rule While
ruleWhile returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='while'
		{
			newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWhileAccess().getConditionConditionParserRuleCall_1_0());
				}
				lv_condition_1_0=ruleCondition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWhileRule());
					}
					set(
						$current,
						"condition",
						lv_condition_1_0,
						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.Condition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getWhileAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWhileAccess().getInstructionsInstructionParserRuleCall_3_0());
				}
				lv_instructions_3_0=ruleInstruction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWhileRule());
					}
					add(
						$current,
						"instructions",
						lv_instructions_3_0,
						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.Instruction");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getWhileAccess().getInstructionsInstructionParserRuleCall_4_0());
				}
				lv_instructions_4_0=ruleInstruction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWhileRule());
					}
					add(
						$current,
						"instructions",
						lv_instructions_4_0,
						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.Instruction");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getWhileAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleLift
entryRuleLift returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLiftRule()); }
	iv_ruleLift=ruleLift
	{ $current=$iv_ruleLift.current; }
	EOF;

// Rule Lift
ruleLift returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='lift'
		{
			newLeafNode(otherlv_0, grammarAccess.getLiftAccess().getLiftKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLiftRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getLiftAccess().getTargetMovableObjectCrossReference_1_0());
				}
			)
		)
		otherlv_2=';'
		{
			newLeafNode(otherlv_2, grammarAccess.getLiftAccess().getSemicolonKeyword_2());
		}
	)
;

// Entry rule entryRulePlaceObject
entryRulePlaceObject returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPlaceObjectRule()); }
	iv_rulePlaceObject=rulePlaceObject
	{ $current=$iv_rulePlaceObject.current; }
	EOF;

// Rule PlaceObject
rulePlaceObject returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getPlaceObjectAccess().getPlaceObjectAction_0(),
					$current);
			}
		)
		otherlv_1='place'
		{
			newLeafNode(otherlv_1, grammarAccess.getPlaceObjectAccess().getPlaceKeyword_1());
		}
		otherlv_2='object'
		{
			newLeafNode(otherlv_2, grammarAccess.getPlaceObjectAccess().getObjectKeyword_2());
		}
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getPlaceObjectAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRuleInstruct
entryRuleInstruct returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInstructRule()); }
	iv_ruleInstruct=ruleInstruct
	{ $current=$iv_ruleInstruct.current; }
	EOF;

// Rule Instruct
ruleInstruct returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='send'
		{
			newLeafNode(otherlv_0, grammarAccess.getInstructAccess().getSendKeyword_0());
		}
		otherlv_1='instruct'
		{
			newLeafNode(otherlv_1, grammarAccess.getInstructAccess().getInstructKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getInstructAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getInstructAccess().getInstructionsInstructionParserRuleCall_3_0());
				}
				lv_instructions_3_0=ruleInstruction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInstructRule());
					}
					add(
						$current,
						"instructions",
						lv_instructions_3_0,
						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.Instruction");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getInstructAccess().getInstructionsInstructionParserRuleCall_4_0());
				}
				lv_instructions_4_0=ruleInstruction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInstructRule());
					}
					add(
						$current,
						"instructions",
						lv_instructions_4_0,
						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.Instruction");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getInstructAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleSendMessage
entryRuleSendMessage returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSendMessageRule()); }
	iv_ruleSendMessage=ruleSendMessage
	{ $current=$iv_ruleSendMessage.current; }
	EOF;

// Rule SendMessage
ruleSendMessage returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='send'
		{
			newLeafNode(otherlv_0, grammarAccess.getSendMessageAccess().getSendKeyword_0());
		}
		otherlv_1='msg'
		{
			newLeafNode(otherlv_1, grammarAccess.getSendMessageAccess().getMsgKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSendMessageAccess().getMessageTypeEStringParserRuleCall_2_0());
				}
				lv_messageType_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSendMessageRule());
					}
					set(
						$current,
						"messageType",
						lv_messageType_2_0,
						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getSendMessageAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRuleCondition
entryRuleCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConditionRule()); }
	iv_ruleCondition=ruleCondition
	{ $current=$iv_ruleCondition.current; }
	EOF;

// Rule Condition
ruleCondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getConditionAccess().getConditionAction_0(),
					$current);
			}
		)
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConditionRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getFieldObjectFieldObjectCrossReference_2_0());
				}
			)
		)
		otherlv_3='.'
		{
			newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getFullStopKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConditionAccess().getKeyEStringParserRuleCall_4_0());
				}
				lv_key_4_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConditionRule());
					}
					set(
						$current,
						"key",
						lv_key_4_0,
						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getConditionAccess().getOperationConditionKindEnumRuleCall_5_0());
				}
				lv_operation_5_0=ruleConditionKind
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConditionRule());
					}
					set(
						$current,
						"operation",
						lv_operation_5_0,
						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.ConditionKind");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getConditionAccess().getValueEStringParserRuleCall_6_0());
				}
				lv_value_6_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConditionRule());
					}
					set(
						$current,
						"value",
						lv_value_6_0,
						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7=')'
		{
			newLeafNode(otherlv_7, grammarAccess.getConditionAccess().getRightParenthesisKeyword_7());
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
		    |
		this_INT_2=RULE_INT
		{
			$current.merge(this_INT_2);
		}
		{
			newLeafNode(this_INT_2, grammarAccess.getEStringAccess().getINTTerminalRuleCall_2());
		}
		    |
		{
			newCompositeNode(grammarAccess.getEStringAccess().getEBooleanParserRuleCall_3());
		}
		this_EBoolean_3=ruleEBoolean
		{
			$current.merge(this_EBoolean_3);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleEFloat
entryRuleEFloat returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEFloatRule()); }
	iv_ruleEFloat=ruleEFloat
	{ $current=$iv_ruleEFloat.current.getText(); }
	EOF;

// Rule EFloat
ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			this_INT_0=RULE_INT
			{
				$current.merge(this_INT_0);
			}
			{
				newLeafNode(this_INT_0, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_0());
			}
		)?
		kw='.'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_1());
		}
		this_INT_2=RULE_INT
		{
			$current.merge(this_INT_2);
		}
		{
			newLeafNode(this_INT_2, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_2());
		}
		(
			(
				kw='E'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_3_0_0());
				}
				    |
				kw='e'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_3_0_1());
				}
			)
			(
				kw='-'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_3_1());
				}
			)?
			this_INT_6=RULE_INT
			{
				$current.merge(this_INT_6);
			}
			{
				newLeafNode(this_INT_6, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3_2());
			}
		)?
	)
;

// Entry rule entryRuleEBoolean
entryRuleEBoolean returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEBooleanRule()); }
	iv_ruleEBoolean=ruleEBoolean
	{ $current=$iv_ruleEBoolean.current.getText(); }
	EOF;

// Rule EBoolean
ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='true'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
		}
		    |
		kw='false'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
		}
	)
;

// Rule ConditionKind
ruleConditionKind returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='=='
			{
				$current = grammarAccess.getConditionKindAccess().getEQUALSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getConditionKindAccess().getEQUALSEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='!='
			{
				$current = grammarAccess.getConditionKindAccess().getNOT_EQUALSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getConditionKindAccess().getNOT_EQUALSEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='>'
			{
				$current = grammarAccess.getConditionKindAccess().getGREATER_THANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getConditionKindAccess().getGREATER_THANEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='<'
			{
				$current = grammarAccess.getConditionKindAccess().getLESSER_THANEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getConditionKindAccess().getLESSER_THANEnumLiteralDeclaration_3());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
