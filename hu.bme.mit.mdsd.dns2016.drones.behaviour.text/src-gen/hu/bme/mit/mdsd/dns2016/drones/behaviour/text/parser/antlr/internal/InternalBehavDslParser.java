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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBehavDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'behav'", "'('", "'interrupt'", "'='", "')'", "';'", "'drones'", "'{'", "','", "'}'", "'import'", "'moveto'", "'wait'", "'action'", "'on'", "'if'", "'else'", "'waitfor'", "'timeout'", "'while'", "'lift'", "'place'", "'object'", "'send'", "'instruct'", "'msg'", "'.'", "'E'", "'e'", "'-'", "'true'", "'false'", "'=='", "'!='", "'>'", "'<'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalBehavDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBehavDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBehavDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBehavDsl.g"; }



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




    // $ANTLR start "entryRuleBehavDSL"
    // InternalBehavDsl.g:65:1: entryRuleBehavDSL returns [EObject current=null] : iv_ruleBehavDSL= ruleBehavDSL EOF ;
    public final EObject entryRuleBehavDSL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehavDSL = null;


        try {
            // InternalBehavDsl.g:65:49: (iv_ruleBehavDSL= ruleBehavDSL EOF )
            // InternalBehavDsl.g:66:2: iv_ruleBehavDSL= ruleBehavDSL EOF
            {
             newCompositeNode(grammarAccess.getBehavDSLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehavDSL=ruleBehavDSL();

            state._fsp--;

             current =iv_ruleBehavDSL; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBehavDSL"


    // $ANTLR start "ruleBehavDSL"
    // InternalBehavDsl.g:72:1: ruleBehavDSL returns [EObject current=null] : ( ( (lv_importedMission_0_0= ruleImport ) ) ( (lv_behav_1_0= ruleDroneBehaviour ) ) ) ;
    public final EObject ruleBehavDSL() throws RecognitionException {
        EObject current = null;

        EObject lv_importedMission_0_0 = null;

        EObject lv_behav_1_0 = null;



        	enterRule();

        try {
            // InternalBehavDsl.g:78:2: ( ( ( (lv_importedMission_0_0= ruleImport ) ) ( (lv_behav_1_0= ruleDroneBehaviour ) ) ) )
            // InternalBehavDsl.g:79:2: ( ( (lv_importedMission_0_0= ruleImport ) ) ( (lv_behav_1_0= ruleDroneBehaviour ) ) )
            {
            // InternalBehavDsl.g:79:2: ( ( (lv_importedMission_0_0= ruleImport ) ) ( (lv_behav_1_0= ruleDroneBehaviour ) ) )
            // InternalBehavDsl.g:80:3: ( (lv_importedMission_0_0= ruleImport ) ) ( (lv_behav_1_0= ruleDroneBehaviour ) )
            {
            // InternalBehavDsl.g:80:3: ( (lv_importedMission_0_0= ruleImport ) )
            // InternalBehavDsl.g:81:4: (lv_importedMission_0_0= ruleImport )
            {
            // InternalBehavDsl.g:81:4: (lv_importedMission_0_0= ruleImport )
            // InternalBehavDsl.g:82:5: lv_importedMission_0_0= ruleImport
            {

            					newCompositeNode(grammarAccess.getBehavDSLAccess().getImportedMissionImportParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_importedMission_0_0=ruleImport();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBehavDSLRule());
            					}
            					set(
            						current,
            						"importedMission",
            						lv_importedMission_0_0,
            						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.Import");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehavDsl.g:99:3: ( (lv_behav_1_0= ruleDroneBehaviour ) )
            // InternalBehavDsl.g:100:4: (lv_behav_1_0= ruleDroneBehaviour )
            {
            // InternalBehavDsl.g:100:4: (lv_behav_1_0= ruleDroneBehaviour )
            // InternalBehavDsl.g:101:5: lv_behav_1_0= ruleDroneBehaviour
            {

            					newCompositeNode(grammarAccess.getBehavDSLAccess().getBehavDroneBehaviourParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_behav_1_0=ruleDroneBehaviour();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBehavDSLRule());
            					}
            					set(
            						current,
            						"behav",
            						lv_behav_1_0,
            						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.DroneBehaviour");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBehavDSL"


    // $ANTLR start "entryRuleDroneBehaviour"
    // InternalBehavDsl.g:122:1: entryRuleDroneBehaviour returns [EObject current=null] : iv_ruleDroneBehaviour= ruleDroneBehaviour EOF ;
    public final EObject entryRuleDroneBehaviour() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDroneBehaviour = null;


        try {
            // InternalBehavDsl.g:122:55: (iv_ruleDroneBehaviour= ruleDroneBehaviour EOF )
            // InternalBehavDsl.g:123:2: iv_ruleDroneBehaviour= ruleDroneBehaviour EOF
            {
             newCompositeNode(grammarAccess.getDroneBehaviourRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDroneBehaviour=ruleDroneBehaviour();

            state._fsp--;

             current =iv_ruleDroneBehaviour; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDroneBehaviour"


    // $ANTLR start "ruleDroneBehaviour"
    // InternalBehavDsl.g:129:1: ruleDroneBehaviour returns [EObject current=null] : (otherlv_0= 'behav' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' otherlv_3= 'interrupt' otherlv_4= '=' ( (lv_canBeInterrupted_5_0= ruleEBoolean ) ) otherlv_6= ')' otherlv_7= ';' otherlv_8= 'drones' otherlv_9= '{' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= '}' ( (lv_instructions_14_0= ruleInstruction ) ) ( (lv_instructions_15_0= ruleInstruction ) )* ) ;
    public final EObject ruleDroneBehaviour() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_canBeInterrupted_5_0 = null;

        EObject lv_instructions_14_0 = null;

        EObject lv_instructions_15_0 = null;



        	enterRule();

        try {
            // InternalBehavDsl.g:135:2: ( (otherlv_0= 'behav' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' otherlv_3= 'interrupt' otherlv_4= '=' ( (lv_canBeInterrupted_5_0= ruleEBoolean ) ) otherlv_6= ')' otherlv_7= ';' otherlv_8= 'drones' otherlv_9= '{' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= '}' ( (lv_instructions_14_0= ruleInstruction ) ) ( (lv_instructions_15_0= ruleInstruction ) )* ) )
            // InternalBehavDsl.g:136:2: (otherlv_0= 'behav' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' otherlv_3= 'interrupt' otherlv_4= '=' ( (lv_canBeInterrupted_5_0= ruleEBoolean ) ) otherlv_6= ')' otherlv_7= ';' otherlv_8= 'drones' otherlv_9= '{' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= '}' ( (lv_instructions_14_0= ruleInstruction ) ) ( (lv_instructions_15_0= ruleInstruction ) )* )
            {
            // InternalBehavDsl.g:136:2: (otherlv_0= 'behav' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' otherlv_3= 'interrupt' otherlv_4= '=' ( (lv_canBeInterrupted_5_0= ruleEBoolean ) ) otherlv_6= ')' otherlv_7= ';' otherlv_8= 'drones' otherlv_9= '{' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= '}' ( (lv_instructions_14_0= ruleInstruction ) ) ( (lv_instructions_15_0= ruleInstruction ) )* )
            // InternalBehavDsl.g:137:3: otherlv_0= 'behav' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' otherlv_3= 'interrupt' otherlv_4= '=' ( (lv_canBeInterrupted_5_0= ruleEBoolean ) ) otherlv_6= ')' otherlv_7= ';' otherlv_8= 'drones' otherlv_9= '{' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= '}' ( (lv_instructions_14_0= ruleInstruction ) ) ( (lv_instructions_15_0= ruleInstruction ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDroneBehaviourAccess().getBehavKeyword_0());
            		
            // InternalBehavDsl.g:141:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBehavDsl.g:142:4: (lv_name_1_0= ruleEString )
            {
            // InternalBehavDsl.g:142:4: (lv_name_1_0= ruleEString )
            // InternalBehavDsl.g:143:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDroneBehaviourAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDroneBehaviourRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDroneBehaviourAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getDroneBehaviourAccess().getInterruptKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getDroneBehaviourAccess().getEqualsSignKeyword_4());
            		
            // InternalBehavDsl.g:172:3: ( (lv_canBeInterrupted_5_0= ruleEBoolean ) )
            // InternalBehavDsl.g:173:4: (lv_canBeInterrupted_5_0= ruleEBoolean )
            {
            // InternalBehavDsl.g:173:4: (lv_canBeInterrupted_5_0= ruleEBoolean )
            // InternalBehavDsl.g:174:5: lv_canBeInterrupted_5_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getDroneBehaviourAccess().getCanBeInterruptedEBooleanParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_canBeInterrupted_5_0=ruleEBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDroneBehaviourRule());
            					}
            					set(
            						current,
            						"canBeInterrupted",
            						true,
            						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.EBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getDroneBehaviourAccess().getRightParenthesisKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getDroneBehaviourAccess().getSemicolonKeyword_7());
            		
            otherlv_8=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getDroneBehaviourAccess().getDronesKeyword_8());
            		
            otherlv_9=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getDroneBehaviourAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalBehavDsl.g:207:3: ( (otherlv_10= RULE_ID ) )
            // InternalBehavDsl.g:208:4: (otherlv_10= RULE_ID )
            {
            // InternalBehavDsl.g:208:4: (otherlv_10= RULE_ID )
            // InternalBehavDsl.g:209:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDroneBehaviourRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_10, grammarAccess.getDroneBehaviourAccess().getDronesDroneCrossReference_10_0());
            				

            }


            }

            // InternalBehavDsl.g:220:3: (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBehavDsl.g:221:4: otherlv_11= ',' ( (otherlv_12= RULE_ID ) )
            	    {
            	    otherlv_11=(Token)match(input,19,FOLLOW_12); 

            	    				newLeafNode(otherlv_11, grammarAccess.getDroneBehaviourAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalBehavDsl.g:225:4: ( (otherlv_12= RULE_ID ) )
            	    // InternalBehavDsl.g:226:5: (otherlv_12= RULE_ID )
            	    {
            	    // InternalBehavDsl.g:226:5: (otherlv_12= RULE_ID )
            	    // InternalBehavDsl.g:227:6: otherlv_12= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDroneBehaviourRule());
            	    						}
            	    					
            	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_13); 

            	    						newLeafNode(otherlv_12, grammarAccess.getDroneBehaviourAccess().getDronesDroneCrossReference_11_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_13=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_13, grammarAccess.getDroneBehaviourAccess().getRightCurlyBracketKeyword_12());
            		
            // InternalBehavDsl.g:243:3: ( (lv_instructions_14_0= ruleInstruction ) )
            // InternalBehavDsl.g:244:4: (lv_instructions_14_0= ruleInstruction )
            {
            // InternalBehavDsl.g:244:4: (lv_instructions_14_0= ruleInstruction )
            // InternalBehavDsl.g:245:5: lv_instructions_14_0= ruleInstruction
            {

            					newCompositeNode(grammarAccess.getDroneBehaviourAccess().getInstructionsInstructionParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_15);
            lv_instructions_14_0=ruleInstruction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDroneBehaviourRule());
            					}
            					add(
            						current,
            						"instructions",
            						lv_instructions_14_0,
            						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.Instruction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehavDsl.g:262:3: ( (lv_instructions_15_0= ruleInstruction ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=22 && LA2_0<=24)||LA2_0==26||LA2_0==28||(LA2_0>=30 && LA2_0<=32)||LA2_0==34) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalBehavDsl.g:263:4: (lv_instructions_15_0= ruleInstruction )
            	    {
            	    // InternalBehavDsl.g:263:4: (lv_instructions_15_0= ruleInstruction )
            	    // InternalBehavDsl.g:264:5: lv_instructions_15_0= ruleInstruction
            	    {

            	    					newCompositeNode(grammarAccess.getDroneBehaviourAccess().getInstructionsInstructionParserRuleCall_14_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_instructions_15_0=ruleInstruction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDroneBehaviourRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instructions",
            	    						lv_instructions_15_0,
            	    						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.Instruction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDroneBehaviour"


    // $ANTLR start "entryRuleImport"
    // InternalBehavDsl.g:285:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalBehavDsl.g:285:47: (iv_ruleImport= ruleImport EOF )
            // InternalBehavDsl.g:286:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalBehavDsl.g:292:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importName_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importName_1_0=null;


        	enterRule();

        try {
            // InternalBehavDsl.g:298:2: ( (otherlv_0= 'import' ( (lv_importName_1_0= RULE_STRING ) ) ) )
            // InternalBehavDsl.g:299:2: (otherlv_0= 'import' ( (lv_importName_1_0= RULE_STRING ) ) )
            {
            // InternalBehavDsl.g:299:2: (otherlv_0= 'import' ( (lv_importName_1_0= RULE_STRING ) ) )
            // InternalBehavDsl.g:300:3: otherlv_0= 'import' ( (lv_importName_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalBehavDsl.g:304:3: ( (lv_importName_1_0= RULE_STRING ) )
            // InternalBehavDsl.g:305:4: (lv_importName_1_0= RULE_STRING )
            {
            // InternalBehavDsl.g:305:4: (lv_importName_1_0= RULE_STRING )
            // InternalBehavDsl.g:306:5: lv_importName_1_0= RULE_STRING
            {
            lv_importName_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_importName_1_0, grammarAccess.getImportAccess().getImportNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"importName",
            						lv_importName_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleInstruction"
    // InternalBehavDsl.g:326:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalBehavDsl.g:326:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalBehavDsl.g:327:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalBehavDsl.g:333:1: ruleInstruction returns [EObject current=null] : (this_MoveTo_0= ruleMoveTo | this_Pause_1= rulePause | this_PerformAction_2= rulePerformAction | this_Choice_3= ruleChoice | this_WaitForMessage_4= ruleWaitForMessage | this_While_5= ruleWhile | this_Lift_6= ruleLift | this_PlaceObject_7= rulePlaceObject | this_SendMessage_8= ruleSendMessage | this_Instruct_9= ruleInstruct ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_MoveTo_0 = null;

        EObject this_Pause_1 = null;

        EObject this_PerformAction_2 = null;

        EObject this_Choice_3 = null;

        EObject this_WaitForMessage_4 = null;

        EObject this_While_5 = null;

        EObject this_Lift_6 = null;

        EObject this_PlaceObject_7 = null;

        EObject this_SendMessage_8 = null;

        EObject this_Instruct_9 = null;



        	enterRule();

        try {
            // InternalBehavDsl.g:339:2: ( (this_MoveTo_0= ruleMoveTo | this_Pause_1= rulePause | this_PerformAction_2= rulePerformAction | this_Choice_3= ruleChoice | this_WaitForMessage_4= ruleWaitForMessage | this_While_5= ruleWhile | this_Lift_6= ruleLift | this_PlaceObject_7= rulePlaceObject | this_SendMessage_8= ruleSendMessage | this_Instruct_9= ruleInstruct ) )
            // InternalBehavDsl.g:340:2: (this_MoveTo_0= ruleMoveTo | this_Pause_1= rulePause | this_PerformAction_2= rulePerformAction | this_Choice_3= ruleChoice | this_WaitForMessage_4= ruleWaitForMessage | this_While_5= ruleWhile | this_Lift_6= ruleLift | this_PlaceObject_7= rulePlaceObject | this_SendMessage_8= ruleSendMessage | this_Instruct_9= ruleInstruct )
            {
            // InternalBehavDsl.g:340:2: (this_MoveTo_0= ruleMoveTo | this_Pause_1= rulePause | this_PerformAction_2= rulePerformAction | this_Choice_3= ruleChoice | this_WaitForMessage_4= ruleWaitForMessage | this_While_5= ruleWhile | this_Lift_6= ruleLift | this_PlaceObject_7= rulePlaceObject | this_SendMessage_8= ruleSendMessage | this_Instruct_9= ruleInstruct )
            int alt3=10;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalBehavDsl.g:341:3: this_MoveTo_0= ruleMoveTo
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getMoveToParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MoveTo_0=ruleMoveTo();

                    state._fsp--;


                    			current = this_MoveTo_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBehavDsl.g:350:3: this_Pause_1= rulePause
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getPauseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Pause_1=rulePause();

                    state._fsp--;


                    			current = this_Pause_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBehavDsl.g:359:3: this_PerformAction_2= rulePerformAction
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getPerformActionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PerformAction_2=rulePerformAction();

                    state._fsp--;


                    			current = this_PerformAction_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBehavDsl.g:368:3: this_Choice_3= ruleChoice
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getChoiceParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Choice_3=ruleChoice();

                    state._fsp--;


                    			current = this_Choice_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalBehavDsl.g:377:3: this_WaitForMessage_4= ruleWaitForMessage
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getWaitForMessageParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_WaitForMessage_4=ruleWaitForMessage();

                    state._fsp--;


                    			current = this_WaitForMessage_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalBehavDsl.g:386:3: this_While_5= ruleWhile
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getWhileParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_While_5=ruleWhile();

                    state._fsp--;


                    			current = this_While_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalBehavDsl.g:395:3: this_Lift_6= ruleLift
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getLiftParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Lift_6=ruleLift();

                    state._fsp--;


                    			current = this_Lift_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalBehavDsl.g:404:3: this_PlaceObject_7= rulePlaceObject
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getPlaceObjectParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlaceObject_7=rulePlaceObject();

                    state._fsp--;


                    			current = this_PlaceObject_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalBehavDsl.g:413:3: this_SendMessage_8= ruleSendMessage
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getSendMessageParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_SendMessage_8=ruleSendMessage();

                    state._fsp--;


                    			current = this_SendMessage_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalBehavDsl.g:422:3: this_Instruct_9= ruleInstruct
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getInstructParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Instruct_9=ruleInstruct();

                    state._fsp--;


                    			current = this_Instruct_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleMoveTo"
    // InternalBehavDsl.g:434:1: entryRuleMoveTo returns [EObject current=null] : iv_ruleMoveTo= ruleMoveTo EOF ;
    public final EObject entryRuleMoveTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveTo = null;


        try {
            // InternalBehavDsl.g:434:47: (iv_ruleMoveTo= ruleMoveTo EOF )
            // InternalBehavDsl.g:435:2: iv_ruleMoveTo= ruleMoveTo EOF
            {
             newCompositeNode(grammarAccess.getMoveToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoveTo=ruleMoveTo();

            state._fsp--;

             current =iv_ruleMoveTo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMoveTo"


    // $ANTLR start "ruleMoveTo"
    // InternalBehavDsl.g:441:1: ruleMoveTo returns [EObject current=null] : (otherlv_0= 'moveto' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleMoveTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalBehavDsl.g:447:2: ( (otherlv_0= 'moveto' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalBehavDsl.g:448:2: (otherlv_0= 'moveto' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalBehavDsl.g:448:2: (otherlv_0= 'moveto' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            // InternalBehavDsl.g:449:3: otherlv_0= 'moveto' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveToAccess().getMovetoKeyword_0());
            		
            // InternalBehavDsl.g:453:3: ( (otherlv_1= RULE_ID ) )
            // InternalBehavDsl.g:454:4: (otherlv_1= RULE_ID )
            {
            // InternalBehavDsl.g:454:4: (otherlv_1= RULE_ID )
            // InternalBehavDsl.g:455:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveToRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_1, grammarAccess.getMoveToAccess().getFieldObjectFieldObjectCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getMoveToAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMoveTo"


    // $ANTLR start "entryRulePause"
    // InternalBehavDsl.g:474:1: entryRulePause returns [EObject current=null] : iv_rulePause= rulePause EOF ;
    public final EObject entryRulePause() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePause = null;


        try {
            // InternalBehavDsl.g:474:46: (iv_rulePause= rulePause EOF )
            // InternalBehavDsl.g:475:2: iv_rulePause= rulePause EOF
            {
             newCompositeNode(grammarAccess.getPauseRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePause=rulePause();

            state._fsp--;

             current =iv_rulePause; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePause"


    // $ANTLR start "rulePause"
    // InternalBehavDsl.g:481:1: rulePause returns [EObject current=null] : (otherlv_0= 'wait' ( (lv_duration_1_0= ruleEFloat ) ) otherlv_2= ';' ) ;
    public final EObject rulePause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_duration_1_0 = null;



        	enterRule();

        try {
            // InternalBehavDsl.g:487:2: ( (otherlv_0= 'wait' ( (lv_duration_1_0= ruleEFloat ) ) otherlv_2= ';' ) )
            // InternalBehavDsl.g:488:2: (otherlv_0= 'wait' ( (lv_duration_1_0= ruleEFloat ) ) otherlv_2= ';' )
            {
            // InternalBehavDsl.g:488:2: (otherlv_0= 'wait' ( (lv_duration_1_0= ruleEFloat ) ) otherlv_2= ';' )
            // InternalBehavDsl.g:489:3: otherlv_0= 'wait' ( (lv_duration_1_0= ruleEFloat ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getPauseAccess().getWaitKeyword_0());
            		
            // InternalBehavDsl.g:493:3: ( (lv_duration_1_0= ruleEFloat ) )
            // InternalBehavDsl.g:494:4: (lv_duration_1_0= ruleEFloat )
            {
            // InternalBehavDsl.g:494:4: (lv_duration_1_0= ruleEFloat )
            // InternalBehavDsl.g:495:5: lv_duration_1_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getPauseAccess().getDurationEFloatParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_duration_1_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPauseRule());
            					}
            					set(
            						current,
            						"duration",
            						lv_duration_1_0,
            						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getPauseAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePause"


    // $ANTLR start "entryRulePerformAction"
    // InternalBehavDsl.g:520:1: entryRulePerformAction returns [EObject current=null] : iv_rulePerformAction= rulePerformAction EOF ;
    public final EObject entryRulePerformAction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerformAction = null;


        try {
            // InternalBehavDsl.g:520:54: (iv_rulePerformAction= rulePerformAction EOF )
            // InternalBehavDsl.g:521:2: iv_rulePerformAction= rulePerformAction EOF
            {
             newCompositeNode(grammarAccess.getPerformActionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePerformAction=rulePerformAction();

            state._fsp--;

             current =iv_rulePerformAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePerformAction"


    // $ANTLR start "rulePerformAction"
    // InternalBehavDsl.g:527:1: rulePerformAction returns [EObject current=null] : (otherlv_0= 'action' ( ( ruleEString ) ) otherlv_2= 'on' ( ( ruleEString ) ) otherlv_4= ';' ) ;
    public final EObject rulePerformAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalBehavDsl.g:533:2: ( (otherlv_0= 'action' ( ( ruleEString ) ) otherlv_2= 'on' ( ( ruleEString ) ) otherlv_4= ';' ) )
            // InternalBehavDsl.g:534:2: (otherlv_0= 'action' ( ( ruleEString ) ) otherlv_2= 'on' ( ( ruleEString ) ) otherlv_4= ';' )
            {
            // InternalBehavDsl.g:534:2: (otherlv_0= 'action' ( ( ruleEString ) ) otherlv_2= 'on' ( ( ruleEString ) ) otherlv_4= ';' )
            // InternalBehavDsl.g:535:3: otherlv_0= 'action' ( ( ruleEString ) ) otherlv_2= 'on' ( ( ruleEString ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPerformActionAccess().getActionKeyword_0());
            		
            // InternalBehavDsl.g:539:3: ( ( ruleEString ) )
            // InternalBehavDsl.g:540:4: ( ruleEString )
            {
            // InternalBehavDsl.g:540:4: ( ruleEString )
            // InternalBehavDsl.g:541:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPerformActionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPerformActionAccess().getActionActionCrossReference_1_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPerformActionAccess().getOnKeyword_2());
            		
            // InternalBehavDsl.g:559:3: ( ( ruleEString ) )
            // InternalBehavDsl.g:560:4: ( ruleEString )
            {
            // InternalBehavDsl.g:560:4: ( ruleEString )
            // InternalBehavDsl.g:561:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPerformActionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPerformActionAccess().getTargetFieldObjectCrossReference_3_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPerformActionAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePerformAction"


    // $ANTLR start "entryRuleChoice"
    // InternalBehavDsl.g:583:1: entryRuleChoice returns [EObject current=null] : iv_ruleChoice= ruleChoice EOF ;
    public final EObject entryRuleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoice = null;


        try {
            // InternalBehavDsl.g:583:47: (iv_ruleChoice= ruleChoice EOF )
            // InternalBehavDsl.g:584:2: iv_ruleChoice= ruleChoice EOF
            {
             newCompositeNode(grammarAccess.getChoiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChoice=ruleChoice();

            state._fsp--;

             current =iv_ruleChoice; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChoice"


    // $ANTLR start "ruleChoice"
    // InternalBehavDsl.g:590:1: ruleChoice returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_trueBranch_3_0= ruleInstruction ) ) ( (lv_trueBranch_4_0= ruleInstruction ) )* otherlv_5= '}' (otherlv_6= 'else' otherlv_7= '{' ( (lv_falseBranch_8_0= ruleInstruction ) ) ( (lv_falseBranch_9_0= ruleInstruction ) )* otherlv_10= '}' )? ) ;
    public final EObject ruleChoice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        EObject lv_condition_1_0 = null;

        EObject lv_trueBranch_3_0 = null;

        EObject lv_trueBranch_4_0 = null;

        EObject lv_falseBranch_8_0 = null;

        EObject lv_falseBranch_9_0 = null;



        	enterRule();

        try {
            // InternalBehavDsl.g:596:2: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_trueBranch_3_0= ruleInstruction ) ) ( (lv_trueBranch_4_0= ruleInstruction ) )* otherlv_5= '}' (otherlv_6= 'else' otherlv_7= '{' ( (lv_falseBranch_8_0= ruleInstruction ) ) ( (lv_falseBranch_9_0= ruleInstruction ) )* otherlv_10= '}' )? ) )
            // InternalBehavDsl.g:597:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_trueBranch_3_0= ruleInstruction ) ) ( (lv_trueBranch_4_0= ruleInstruction ) )* otherlv_5= '}' (otherlv_6= 'else' otherlv_7= '{' ( (lv_falseBranch_8_0= ruleInstruction ) ) ( (lv_falseBranch_9_0= ruleInstruction ) )* otherlv_10= '}' )? )
            {
            // InternalBehavDsl.g:597:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_trueBranch_3_0= ruleInstruction ) ) ( (lv_trueBranch_4_0= ruleInstruction ) )* otherlv_5= '}' (otherlv_6= 'else' otherlv_7= '{' ( (lv_falseBranch_8_0= ruleInstruction ) ) ( (lv_falseBranch_9_0= ruleInstruction ) )* otherlv_10= '}' )? )
            // InternalBehavDsl.g:598:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_trueBranch_3_0= ruleInstruction ) ) ( (lv_trueBranch_4_0= ruleInstruction ) )* otherlv_5= '}' (otherlv_6= 'else' otherlv_7= '{' ( (lv_falseBranch_8_0= ruleInstruction ) ) ( (lv_falseBranch_9_0= ruleInstruction ) )* otherlv_10= '}' )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getChoiceAccess().getIfKeyword_0());
            		
            // InternalBehavDsl.g:602:3: ( (lv_condition_1_0= ruleCondition ) )
            // InternalBehavDsl.g:603:4: (lv_condition_1_0= ruleCondition )
            {
            // InternalBehavDsl.g:603:4: (lv_condition_1_0= ruleCondition )
            // InternalBehavDsl.g:604:5: lv_condition_1_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getChoiceAccess().getConditionConditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_condition_1_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChoiceRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getChoiceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBehavDsl.g:625:3: ( (lv_trueBranch_3_0= ruleInstruction ) )
            // InternalBehavDsl.g:626:4: (lv_trueBranch_3_0= ruleInstruction )
            {
            // InternalBehavDsl.g:626:4: (lv_trueBranch_3_0= ruleInstruction )
            // InternalBehavDsl.g:627:5: lv_trueBranch_3_0= ruleInstruction
            {

            					newCompositeNode(grammarAccess.getChoiceAccess().getTrueBranchInstructionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_trueBranch_3_0=ruleInstruction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChoiceRule());
            					}
            					add(
            						current,
            						"trueBranch",
            						lv_trueBranch_3_0,
            						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.Instruction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehavDsl.g:644:3: ( (lv_trueBranch_4_0= ruleInstruction ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=22 && LA4_0<=24)||LA4_0==26||LA4_0==28||(LA4_0>=30 && LA4_0<=32)||LA4_0==34) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBehavDsl.g:645:4: (lv_trueBranch_4_0= ruleInstruction )
            	    {
            	    // InternalBehavDsl.g:645:4: (lv_trueBranch_4_0= ruleInstruction )
            	    // InternalBehavDsl.g:646:5: lv_trueBranch_4_0= ruleInstruction
            	    {

            	    					newCompositeNode(grammarAccess.getChoiceAccess().getTrueBranchInstructionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_trueBranch_4_0=ruleInstruction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getChoiceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"trueBranch",
            	    						lv_trueBranch_4_0,
            	    						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.Instruction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,20,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getChoiceAccess().getRightCurlyBracketKeyword_5());
            		
            // InternalBehavDsl.g:667:3: (otherlv_6= 'else' otherlv_7= '{' ( (lv_falseBranch_8_0= ruleInstruction ) ) ( (lv_falseBranch_9_0= ruleInstruction ) )* otherlv_10= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBehavDsl.g:668:4: otherlv_6= 'else' otherlv_7= '{' ( (lv_falseBranch_8_0= ruleInstruction ) ) ( (lv_falseBranch_9_0= ruleInstruction ) )* otherlv_10= '}'
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_11); 

                    				newLeafNode(otherlv_6, grammarAccess.getChoiceAccess().getElseKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_7, grammarAccess.getChoiceAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalBehavDsl.g:676:4: ( (lv_falseBranch_8_0= ruleInstruction ) )
                    // InternalBehavDsl.g:677:5: (lv_falseBranch_8_0= ruleInstruction )
                    {
                    // InternalBehavDsl.g:677:5: (lv_falseBranch_8_0= ruleInstruction )
                    // InternalBehavDsl.g:678:6: lv_falseBranch_8_0= ruleInstruction
                    {

                    						newCompositeNode(grammarAccess.getChoiceAccess().getFalseBranchInstructionParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_falseBranch_8_0=ruleInstruction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getChoiceRule());
                    						}
                    						add(
                    							current,
                    							"falseBranch",
                    							lv_falseBranch_8_0,
                    							"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.Instruction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehavDsl.g:695:4: ( (lv_falseBranch_9_0= ruleInstruction ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>=22 && LA5_0<=24)||LA5_0==26||LA5_0==28||(LA5_0>=30 && LA5_0<=32)||LA5_0==34) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalBehavDsl.g:696:5: (lv_falseBranch_9_0= ruleInstruction )
                    	    {
                    	    // InternalBehavDsl.g:696:5: (lv_falseBranch_9_0= ruleInstruction )
                    	    // InternalBehavDsl.g:697:6: lv_falseBranch_9_0= ruleInstruction
                    	    {

                    	    						newCompositeNode(grammarAccess.getChoiceAccess().getFalseBranchInstructionParserRuleCall_6_3_0());
                    	    					
                    	    pushFollow(FOLLOW_19);
                    	    lv_falseBranch_9_0=ruleInstruction();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getChoiceRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"falseBranch",
                    	    							lv_falseBranch_9_0,
                    	    							"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.Instruction");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getChoiceAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChoice"


    // $ANTLR start "entryRuleWaitForMessage"
    // InternalBehavDsl.g:723:1: entryRuleWaitForMessage returns [EObject current=null] : iv_ruleWaitForMessage= ruleWaitForMessage EOF ;
    public final EObject entryRuleWaitForMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWaitForMessage = null;


        try {
            // InternalBehavDsl.g:723:55: (iv_ruleWaitForMessage= ruleWaitForMessage EOF )
            // InternalBehavDsl.g:724:2: iv_ruleWaitForMessage= ruleWaitForMessage EOF
            {
             newCompositeNode(grammarAccess.getWaitForMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWaitForMessage=ruleWaitForMessage();

            state._fsp--;

             current =iv_ruleWaitForMessage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWaitForMessage"


    // $ANTLR start "ruleWaitForMessage"
    // InternalBehavDsl.g:730:1: ruleWaitForMessage returns [EObject current=null] : (otherlv_0= 'waitfor' ( (lv_type_1_0= ruleEString ) ) ( (lv_timeout_2_0= ruleEFloat ) ) otherlv_3= '{' ( (lv_whenArrived_4_0= ruleInstruction ) ) ( (lv_whenArrived_5_0= ruleInstruction ) )* otherlv_6= '}' otherlv_7= 'timeout' otherlv_8= '{' ( (lv_whenLost_9_0= ruleInstruction ) ) ( (lv_whenLost_10_0= ruleInstruction ) )* otherlv_11= '}' ) ;
    public final EObject ruleWaitForMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_timeout_2_0 = null;

        EObject lv_whenArrived_4_0 = null;

        EObject lv_whenArrived_5_0 = null;

        EObject lv_whenLost_9_0 = null;

        EObject lv_whenLost_10_0 = null;



        	enterRule();

        try {
            // InternalBehavDsl.g:736:2: ( (otherlv_0= 'waitfor' ( (lv_type_1_0= ruleEString ) ) ( (lv_timeout_2_0= ruleEFloat ) ) otherlv_3= '{' ( (lv_whenArrived_4_0= ruleInstruction ) ) ( (lv_whenArrived_5_0= ruleInstruction ) )* otherlv_6= '}' otherlv_7= 'timeout' otherlv_8= '{' ( (lv_whenLost_9_0= ruleInstruction ) ) ( (lv_whenLost_10_0= ruleInstruction ) )* otherlv_11= '}' ) )
            // InternalBehavDsl.g:737:2: (otherlv_0= 'waitfor' ( (lv_type_1_0= ruleEString ) ) ( (lv_timeout_2_0= ruleEFloat ) ) otherlv_3= '{' ( (lv_whenArrived_4_0= ruleInstruction ) ) ( (lv_whenArrived_5_0= ruleInstruction ) )* otherlv_6= '}' otherlv_7= 'timeout' otherlv_8= '{' ( (lv_whenLost_9_0= ruleInstruction ) ) ( (lv_whenLost_10_0= ruleInstruction ) )* otherlv_11= '}' )
            {
            // InternalBehavDsl.g:737:2: (otherlv_0= 'waitfor' ( (lv_type_1_0= ruleEString ) ) ( (lv_timeout_2_0= ruleEFloat ) ) otherlv_3= '{' ( (lv_whenArrived_4_0= ruleInstruction ) ) ( (lv_whenArrived_5_0= ruleInstruction ) )* otherlv_6= '}' otherlv_7= 'timeout' otherlv_8= '{' ( (lv_whenLost_9_0= ruleInstruction ) ) ( (lv_whenLost_10_0= ruleInstruction ) )* otherlv_11= '}' )
            // InternalBehavDsl.g:738:3: otherlv_0= 'waitfor' ( (lv_type_1_0= ruleEString ) ) ( (lv_timeout_2_0= ruleEFloat ) ) otherlv_3= '{' ( (lv_whenArrived_4_0= ruleInstruction ) ) ( (lv_whenArrived_5_0= ruleInstruction ) )* otherlv_6= '}' otherlv_7= 'timeout' otherlv_8= '{' ( (lv_whenLost_9_0= ruleInstruction ) ) ( (lv_whenLost_10_0= ruleInstruction ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getWaitForMessageAccess().getWaitforKeyword_0());
            		
            // InternalBehavDsl.g:742:3: ( (lv_type_1_0= ruleEString ) )
            // InternalBehavDsl.g:743:4: (lv_type_1_0= ruleEString )
            {
            // InternalBehavDsl.g:743:4: (lv_type_1_0= ruleEString )
            // InternalBehavDsl.g:744:5: lv_type_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWaitForMessageAccess().getTypeEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_type_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWaitForMessageRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehavDsl.g:761:3: ( (lv_timeout_2_0= ruleEFloat ) )
            // InternalBehavDsl.g:762:4: (lv_timeout_2_0= ruleEFloat )
            {
            // InternalBehavDsl.g:762:4: (lv_timeout_2_0= ruleEFloat )
            // InternalBehavDsl.g:763:5: lv_timeout_2_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getWaitForMessageAccess().getTimeoutEFloatParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_timeout_2_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWaitForMessageRule());
            					}
            					set(
            						current,
            						"timeout",
            						lv_timeout_2_0,
            						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getWaitForMessageAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBehavDsl.g:784:3: ( (lv_whenArrived_4_0= ruleInstruction ) )
            // InternalBehavDsl.g:785:4: (lv_whenArrived_4_0= ruleInstruction )
            {
            // InternalBehavDsl.g:785:4: (lv_whenArrived_4_0= ruleInstruction )
            // InternalBehavDsl.g:786:5: lv_whenArrived_4_0= ruleInstruction
            {

            					newCompositeNode(grammarAccess.getWaitForMessageAccess().getWhenArrivedInstructionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_19);
            lv_whenArrived_4_0=ruleInstruction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWaitForMessageRule());
            					}
            					add(
            						current,
            						"whenArrived",
            						lv_whenArrived_4_0,
            						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.Instruction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehavDsl.g:803:3: ( (lv_whenArrived_5_0= ruleInstruction ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=22 && LA7_0<=24)||LA7_0==26||LA7_0==28||(LA7_0>=30 && LA7_0<=32)||LA7_0==34) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBehavDsl.g:804:4: (lv_whenArrived_5_0= ruleInstruction )
            	    {
            	    // InternalBehavDsl.g:804:4: (lv_whenArrived_5_0= ruleInstruction )
            	    // InternalBehavDsl.g:805:5: lv_whenArrived_5_0= ruleInstruction
            	    {

            	    					newCompositeNode(grammarAccess.getWaitForMessageAccess().getWhenArrivedInstructionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_whenArrived_5_0=ruleInstruction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWaitForMessageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"whenArrived",
            	    						lv_whenArrived_5_0,
            	    						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.Instruction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,20,FOLLOW_21); 

            			newLeafNode(otherlv_6, grammarAccess.getWaitForMessageAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,29,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getWaitForMessageAccess().getTimeoutKeyword_7());
            		
            otherlv_8=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_8, grammarAccess.getWaitForMessageAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalBehavDsl.g:834:3: ( (lv_whenLost_9_0= ruleInstruction ) )
            // InternalBehavDsl.g:835:4: (lv_whenLost_9_0= ruleInstruction )
            {
            // InternalBehavDsl.g:835:4: (lv_whenLost_9_0= ruleInstruction )
            // InternalBehavDsl.g:836:5: lv_whenLost_9_0= ruleInstruction
            {

            					newCompositeNode(grammarAccess.getWaitForMessageAccess().getWhenLostInstructionParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_19);
            lv_whenLost_9_0=ruleInstruction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWaitForMessageRule());
            					}
            					add(
            						current,
            						"whenLost",
            						lv_whenLost_9_0,
            						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.Instruction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehavDsl.g:853:3: ( (lv_whenLost_10_0= ruleInstruction ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=22 && LA8_0<=24)||LA8_0==26||LA8_0==28||(LA8_0>=30 && LA8_0<=32)||LA8_0==34) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBehavDsl.g:854:4: (lv_whenLost_10_0= ruleInstruction )
            	    {
            	    // InternalBehavDsl.g:854:4: (lv_whenLost_10_0= ruleInstruction )
            	    // InternalBehavDsl.g:855:5: lv_whenLost_10_0= ruleInstruction
            	    {

            	    					newCompositeNode(grammarAccess.getWaitForMessageAccess().getWhenLostInstructionParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_whenLost_10_0=ruleInstruction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWaitForMessageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"whenLost",
            	    						lv_whenLost_10_0,
            	    						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.Instruction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_11=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getWaitForMessageAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWaitForMessage"


    // $ANTLR start "entryRuleWhile"
    // InternalBehavDsl.g:880:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // InternalBehavDsl.g:880:46: (iv_ruleWhile= ruleWhile EOF )
            // InternalBehavDsl.g:881:2: iv_ruleWhile= ruleWhile EOF
            {
             newCompositeNode(grammarAccess.getWhileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhile=ruleWhile();

            state._fsp--;

             current =iv_ruleWhile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // InternalBehavDsl.g:887:1: ruleWhile returns [EObject current=null] : (otherlv_0= 'while' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_instructions_3_0= ruleInstruction ) ) ( (lv_instructions_4_0= ruleInstruction ) )* otherlv_5= '}' ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_condition_1_0 = null;

        EObject lv_instructions_3_0 = null;

        EObject lv_instructions_4_0 = null;



        	enterRule();

        try {
            // InternalBehavDsl.g:893:2: ( (otherlv_0= 'while' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_instructions_3_0= ruleInstruction ) ) ( (lv_instructions_4_0= ruleInstruction ) )* otherlv_5= '}' ) )
            // InternalBehavDsl.g:894:2: (otherlv_0= 'while' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_instructions_3_0= ruleInstruction ) ) ( (lv_instructions_4_0= ruleInstruction ) )* otherlv_5= '}' )
            {
            // InternalBehavDsl.g:894:2: (otherlv_0= 'while' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_instructions_3_0= ruleInstruction ) ) ( (lv_instructions_4_0= ruleInstruction ) )* otherlv_5= '}' )
            // InternalBehavDsl.g:895:3: otherlv_0= 'while' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_instructions_3_0= ruleInstruction ) ) ( (lv_instructions_4_0= ruleInstruction ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
            		
            // InternalBehavDsl.g:899:3: ( (lv_condition_1_0= ruleCondition ) )
            // InternalBehavDsl.g:900:4: (lv_condition_1_0= ruleCondition )
            {
            // InternalBehavDsl.g:900:4: (lv_condition_1_0= ruleCondition )
            // InternalBehavDsl.g:901:5: lv_condition_1_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getWhileAccess().getConditionConditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_condition_1_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getWhileAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBehavDsl.g:922:3: ( (lv_instructions_3_0= ruleInstruction ) )
            // InternalBehavDsl.g:923:4: (lv_instructions_3_0= ruleInstruction )
            {
            // InternalBehavDsl.g:923:4: (lv_instructions_3_0= ruleInstruction )
            // InternalBehavDsl.g:924:5: lv_instructions_3_0= ruleInstruction
            {

            					newCompositeNode(grammarAccess.getWhileAccess().getInstructionsInstructionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_instructions_3_0=ruleInstruction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileRule());
            					}
            					add(
            						current,
            						"instructions",
            						lv_instructions_3_0,
            						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.Instruction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehavDsl.g:941:3: ( (lv_instructions_4_0= ruleInstruction ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=22 && LA9_0<=24)||LA9_0==26||LA9_0==28||(LA9_0>=30 && LA9_0<=32)||LA9_0==34) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalBehavDsl.g:942:4: (lv_instructions_4_0= ruleInstruction )
            	    {
            	    // InternalBehavDsl.g:942:4: (lv_instructions_4_0= ruleInstruction )
            	    // InternalBehavDsl.g:943:5: lv_instructions_4_0= ruleInstruction
            	    {

            	    					newCompositeNode(grammarAccess.getWhileAccess().getInstructionsInstructionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_instructions_4_0=ruleInstruction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWhileRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instructions",
            	    						lv_instructions_4_0,
            	    						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.Instruction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getWhileAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleLift"
    // InternalBehavDsl.g:968:1: entryRuleLift returns [EObject current=null] : iv_ruleLift= ruleLift EOF ;
    public final EObject entryRuleLift() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLift = null;


        try {
            // InternalBehavDsl.g:968:45: (iv_ruleLift= ruleLift EOF )
            // InternalBehavDsl.g:969:2: iv_ruleLift= ruleLift EOF
            {
             newCompositeNode(grammarAccess.getLiftRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLift=ruleLift();

            state._fsp--;

             current =iv_ruleLift; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLift"


    // $ANTLR start "ruleLift"
    // InternalBehavDsl.g:975:1: ruleLift returns [EObject current=null] : (otherlv_0= 'lift' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleLift() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalBehavDsl.g:981:2: ( (otherlv_0= 'lift' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalBehavDsl.g:982:2: (otherlv_0= 'lift' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalBehavDsl.g:982:2: (otherlv_0= 'lift' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            // InternalBehavDsl.g:983:3: otherlv_0= 'lift' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getLiftAccess().getLiftKeyword_0());
            		
            // InternalBehavDsl.g:987:3: ( (otherlv_1= RULE_ID ) )
            // InternalBehavDsl.g:988:4: (otherlv_1= RULE_ID )
            {
            // InternalBehavDsl.g:988:4: (otherlv_1= RULE_ID )
            // InternalBehavDsl.g:989:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLiftRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_1, grammarAccess.getLiftAccess().getTargetMovableObjectCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getLiftAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLift"


    // $ANTLR start "entryRulePlaceObject"
    // InternalBehavDsl.g:1008:1: entryRulePlaceObject returns [EObject current=null] : iv_rulePlaceObject= rulePlaceObject EOF ;
    public final EObject entryRulePlaceObject() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlaceObject = null;


        try {
            // InternalBehavDsl.g:1008:52: (iv_rulePlaceObject= rulePlaceObject EOF )
            // InternalBehavDsl.g:1009:2: iv_rulePlaceObject= rulePlaceObject EOF
            {
             newCompositeNode(grammarAccess.getPlaceObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlaceObject=rulePlaceObject();

            state._fsp--;

             current =iv_rulePlaceObject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlaceObject"


    // $ANTLR start "rulePlaceObject"
    // InternalBehavDsl.g:1015:1: rulePlaceObject returns [EObject current=null] : ( () otherlv_1= 'place' otherlv_2= 'object' otherlv_3= ';' ) ;
    public final EObject rulePlaceObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalBehavDsl.g:1021:2: ( ( () otherlv_1= 'place' otherlv_2= 'object' otherlv_3= ';' ) )
            // InternalBehavDsl.g:1022:2: ( () otherlv_1= 'place' otherlv_2= 'object' otherlv_3= ';' )
            {
            // InternalBehavDsl.g:1022:2: ( () otherlv_1= 'place' otherlv_2= 'object' otherlv_3= ';' )
            // InternalBehavDsl.g:1023:3: () otherlv_1= 'place' otherlv_2= 'object' otherlv_3= ';'
            {
            // InternalBehavDsl.g:1023:3: ()
            // InternalBehavDsl.g:1024:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPlaceObjectAccess().getPlaceObjectAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getPlaceObjectAccess().getPlaceKeyword_1());
            		
            otherlv_2=(Token)match(input,33,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getPlaceObjectAccess().getObjectKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPlaceObjectAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlaceObject"


    // $ANTLR start "entryRuleInstruct"
    // InternalBehavDsl.g:1046:1: entryRuleInstruct returns [EObject current=null] : iv_ruleInstruct= ruleInstruct EOF ;
    public final EObject entryRuleInstruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruct = null;


        try {
            // InternalBehavDsl.g:1046:49: (iv_ruleInstruct= ruleInstruct EOF )
            // InternalBehavDsl.g:1047:2: iv_ruleInstruct= ruleInstruct EOF
            {
             newCompositeNode(grammarAccess.getInstructRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstruct=ruleInstruct();

            state._fsp--;

             current =iv_ruleInstruct; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstruct"


    // $ANTLR start "ruleInstruct"
    // InternalBehavDsl.g:1053:1: ruleInstruct returns [EObject current=null] : (otherlv_0= 'send' otherlv_1= 'instruct' otherlv_2= '{' ( (lv_instructions_3_0= ruleInstruction ) ) ( (lv_instructions_4_0= ruleInstruction ) )* otherlv_5= '}' ) ;
    public final EObject ruleInstruct() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_instructions_3_0 = null;

        EObject lv_instructions_4_0 = null;



        	enterRule();

        try {
            // InternalBehavDsl.g:1059:2: ( (otherlv_0= 'send' otherlv_1= 'instruct' otherlv_2= '{' ( (lv_instructions_3_0= ruleInstruction ) ) ( (lv_instructions_4_0= ruleInstruction ) )* otherlv_5= '}' ) )
            // InternalBehavDsl.g:1060:2: (otherlv_0= 'send' otherlv_1= 'instruct' otherlv_2= '{' ( (lv_instructions_3_0= ruleInstruction ) ) ( (lv_instructions_4_0= ruleInstruction ) )* otherlv_5= '}' )
            {
            // InternalBehavDsl.g:1060:2: (otherlv_0= 'send' otherlv_1= 'instruct' otherlv_2= '{' ( (lv_instructions_3_0= ruleInstruction ) ) ( (lv_instructions_4_0= ruleInstruction ) )* otherlv_5= '}' )
            // InternalBehavDsl.g:1061:3: otherlv_0= 'send' otherlv_1= 'instruct' otherlv_2= '{' ( (lv_instructions_3_0= ruleInstruction ) ) ( (lv_instructions_4_0= ruleInstruction ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getInstructAccess().getSendKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getInstructAccess().getInstructKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getInstructAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBehavDsl.g:1073:3: ( (lv_instructions_3_0= ruleInstruction ) )
            // InternalBehavDsl.g:1074:4: (lv_instructions_3_0= ruleInstruction )
            {
            // InternalBehavDsl.g:1074:4: (lv_instructions_3_0= ruleInstruction )
            // InternalBehavDsl.g:1075:5: lv_instructions_3_0= ruleInstruction
            {

            					newCompositeNode(grammarAccess.getInstructAccess().getInstructionsInstructionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_instructions_3_0=ruleInstruction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInstructRule());
            					}
            					add(
            						current,
            						"instructions",
            						lv_instructions_3_0,
            						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.Instruction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehavDsl.g:1092:3: ( (lv_instructions_4_0= ruleInstruction ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=22 && LA10_0<=24)||LA10_0==26||LA10_0==28||(LA10_0>=30 && LA10_0<=32)||LA10_0==34) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBehavDsl.g:1093:4: (lv_instructions_4_0= ruleInstruction )
            	    {
            	    // InternalBehavDsl.g:1093:4: (lv_instructions_4_0= ruleInstruction )
            	    // InternalBehavDsl.g:1094:5: lv_instructions_4_0= ruleInstruction
            	    {

            	    					newCompositeNode(grammarAccess.getInstructAccess().getInstructionsInstructionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_instructions_4_0=ruleInstruction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInstructRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instructions",
            	    						lv_instructions_4_0,
            	    						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.Instruction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getInstructAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstruct"


    // $ANTLR start "entryRuleSendMessage"
    // InternalBehavDsl.g:1119:1: entryRuleSendMessage returns [EObject current=null] : iv_ruleSendMessage= ruleSendMessage EOF ;
    public final EObject entryRuleSendMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSendMessage = null;


        try {
            // InternalBehavDsl.g:1119:52: (iv_ruleSendMessage= ruleSendMessage EOF )
            // InternalBehavDsl.g:1120:2: iv_ruleSendMessage= ruleSendMessage EOF
            {
             newCompositeNode(grammarAccess.getSendMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSendMessage=ruleSendMessage();

            state._fsp--;

             current =iv_ruleSendMessage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSendMessage"


    // $ANTLR start "ruleSendMessage"
    // InternalBehavDsl.g:1126:1: ruleSendMessage returns [EObject current=null] : (otherlv_0= 'send' otherlv_1= 'msg' ( (lv_messageType_2_0= ruleEString ) ) otherlv_3= ';' ) ;
    public final EObject ruleSendMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_messageType_2_0 = null;



        	enterRule();

        try {
            // InternalBehavDsl.g:1132:2: ( (otherlv_0= 'send' otherlv_1= 'msg' ( (lv_messageType_2_0= ruleEString ) ) otherlv_3= ';' ) )
            // InternalBehavDsl.g:1133:2: (otherlv_0= 'send' otherlv_1= 'msg' ( (lv_messageType_2_0= ruleEString ) ) otherlv_3= ';' )
            {
            // InternalBehavDsl.g:1133:2: (otherlv_0= 'send' otherlv_1= 'msg' ( (lv_messageType_2_0= ruleEString ) ) otherlv_3= ';' )
            // InternalBehavDsl.g:1134:3: otherlv_0= 'send' otherlv_1= 'msg' ( (lv_messageType_2_0= ruleEString ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getSendMessageAccess().getSendKeyword_0());
            		
            otherlv_1=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSendMessageAccess().getMsgKeyword_1());
            		
            // InternalBehavDsl.g:1142:3: ( (lv_messageType_2_0= ruleEString ) )
            // InternalBehavDsl.g:1143:4: (lv_messageType_2_0= ruleEString )
            {
            // InternalBehavDsl.g:1143:4: (lv_messageType_2_0= ruleEString )
            // InternalBehavDsl.g:1144:5: lv_messageType_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSendMessageAccess().getMessageTypeEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_messageType_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSendMessageRule());
            					}
            					set(
            						current,
            						"messageType",
            						lv_messageType_2_0,
            						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSendMessageAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSendMessage"


    // $ANTLR start "entryRuleCondition"
    // InternalBehavDsl.g:1169:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalBehavDsl.g:1169:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalBehavDsl.g:1170:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalBehavDsl.g:1176:1: ruleCondition returns [EObject current=null] : ( () otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (lv_key_4_0= ruleEString ) ) ( (lv_operation_5_0= ruleConditionKind ) ) ( (lv_value_6_0= ruleEString ) ) otherlv_7= ')' ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_key_4_0 = null;

        Enumerator lv_operation_5_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;



        	enterRule();

        try {
            // InternalBehavDsl.g:1182:2: ( ( () otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (lv_key_4_0= ruleEString ) ) ( (lv_operation_5_0= ruleConditionKind ) ) ( (lv_value_6_0= ruleEString ) ) otherlv_7= ')' ) )
            // InternalBehavDsl.g:1183:2: ( () otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (lv_key_4_0= ruleEString ) ) ( (lv_operation_5_0= ruleConditionKind ) ) ( (lv_value_6_0= ruleEString ) ) otherlv_7= ')' )
            {
            // InternalBehavDsl.g:1183:2: ( () otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (lv_key_4_0= ruleEString ) ) ( (lv_operation_5_0= ruleConditionKind ) ) ( (lv_value_6_0= ruleEString ) ) otherlv_7= ')' )
            // InternalBehavDsl.g:1184:3: () otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (lv_key_4_0= ruleEString ) ) ( (lv_operation_5_0= ruleConditionKind ) ) ( (lv_value_6_0= ruleEString ) ) otherlv_7= ')'
            {
            // InternalBehavDsl.g:1184:3: ()
            // InternalBehavDsl.g:1185:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConditionAccess().getConditionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalBehavDsl.g:1195:3: ( (otherlv_2= RULE_ID ) )
            // InternalBehavDsl.g:1196:4: (otherlv_2= RULE_ID )
            {
            // InternalBehavDsl.g:1196:4: (otherlv_2= RULE_ID )
            // InternalBehavDsl.g:1197:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getFieldObjectFieldObjectCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getFullStopKeyword_3());
            		
            // InternalBehavDsl.g:1212:3: ( (lv_key_4_0= ruleEString ) )
            // InternalBehavDsl.g:1213:4: (lv_key_4_0= ruleEString )
            {
            // InternalBehavDsl.g:1213:4: (lv_key_4_0= ruleEString )
            // InternalBehavDsl.g:1214:5: lv_key_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getKeyEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_26);
            lv_key_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_4_0,
            						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehavDsl.g:1231:3: ( (lv_operation_5_0= ruleConditionKind ) )
            // InternalBehavDsl.g:1232:4: (lv_operation_5_0= ruleConditionKind )
            {
            // InternalBehavDsl.g:1232:4: (lv_operation_5_0= ruleConditionKind )
            // InternalBehavDsl.g:1233:5: lv_operation_5_0= ruleConditionKind
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getOperationConditionKindEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_4);
            lv_operation_5_0=ruleConditionKind();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"operation",
            						lv_operation_5_0,
            						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.ConditionKind");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehavDsl.g:1250:3: ( (lv_value_6_0= ruleEString ) )
            // InternalBehavDsl.g:1251:4: (lv_value_6_0= ruleEString )
            {
            // InternalBehavDsl.g:1251:4: (lv_value_6_0= ruleEString )
            // InternalBehavDsl.g:1252:5: lv_value_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getValueEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_value_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_6_0,
            						"hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getConditionAccess().getRightParenthesisKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleEString"
    // InternalBehavDsl.g:1277:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalBehavDsl.g:1277:47: (iv_ruleEString= ruleEString EOF )
            // InternalBehavDsl.g:1278:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalBehavDsl.g:1284:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_EBoolean_3= ruleEBoolean ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;
        Token this_INT_2=null;
        AntlrDatatypeRuleToken this_EBoolean_3 = null;



        	enterRule();

        try {
            // InternalBehavDsl.g:1290:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_EBoolean_3= ruleEBoolean ) )
            // InternalBehavDsl.g:1291:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_EBoolean_3= ruleEBoolean )
            {
            // InternalBehavDsl.g:1291:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_EBoolean_3= ruleEBoolean )
            int alt11=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt11=1;
                }
                break;
            case RULE_ID:
                {
                alt11=2;
                }
                break;
            case RULE_INT:
                {
                alt11=3;
                }
                break;
            case 41:
            case 42:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalBehavDsl.g:1292:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBehavDsl.g:1300:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalBehavDsl.g:1308:3: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_2);
                    		

                    			newLeafNode(this_INT_2, grammarAccess.getEStringAccess().getINTTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalBehavDsl.g:1316:3: this_EBoolean_3= ruleEBoolean
                    {

                    			newCompositeNode(grammarAccess.getEStringAccess().getEBooleanParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_EBoolean_3=ruleEBoolean();

                    state._fsp--;


                    			current.merge(this_EBoolean_3);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEFloat"
    // InternalBehavDsl.g:1330:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalBehavDsl.g:1330:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalBehavDsl.g:1331:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalBehavDsl.g:1337:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_6=null;


        	enterRule();

        try {
            // InternalBehavDsl.g:1343:2: ( ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )? ) )
            // InternalBehavDsl.g:1344:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )? )
            {
            // InternalBehavDsl.g:1344:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )? )
            // InternalBehavDsl.g:1345:3: (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )?
            {
            // InternalBehavDsl.g:1345:3: (this_INT_0= RULE_INT )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBehavDsl.g:1346:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_25); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,37,FOLLOW_27); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_28); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_2());
            		
            // InternalBehavDsl.g:1366:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=38 && LA15_0<=39)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBehavDsl.g:1367:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT
                    {
                    // InternalBehavDsl.g:1367:4: (kw= 'E' | kw= 'e' )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==38) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==39) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalBehavDsl.g:1368:5: kw= 'E'
                            {
                            kw=(Token)match(input,38,FOLLOW_29); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalBehavDsl.g:1374:5: kw= 'e'
                            {
                            kw=(Token)match(input,39,FOLLOW_29); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_3_0_1());
                            				

                            }
                            break;

                    }

                    // InternalBehavDsl.g:1380:4: (kw= '-' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==40) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalBehavDsl.g:1381:5: kw= '-'
                            {
                            kw=(Token)match(input,40,FOLLOW_27); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_3_1());
                            				

                            }
                            break;

                    }

                    this_INT_6=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_6);
                    			

                    				newLeafNode(this_INT_6, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRuleEBoolean"
    // InternalBehavDsl.g:1399:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalBehavDsl.g:1399:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalBehavDsl.g:1400:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalBehavDsl.g:1406:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBehavDsl.g:1412:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalBehavDsl.g:1413:2: (kw= 'true' | kw= 'false' )
            {
            // InternalBehavDsl.g:1413:2: (kw= 'true' | kw= 'false' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==41) ) {
                alt16=1;
            }
            else if ( (LA16_0==42) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalBehavDsl.g:1414:3: kw= 'true'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBehavDsl.g:1420:3: kw= 'false'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "ruleConditionKind"
    // InternalBehavDsl.g:1429:1: ruleConditionKind returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) ) ;
    public final Enumerator ruleConditionKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalBehavDsl.g:1435:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) ) )
            // InternalBehavDsl.g:1436:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) )
            {
            // InternalBehavDsl.g:1436:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt17=1;
                }
                break;
            case 44:
                {
                alt17=2;
                }
                break;
            case 45:
                {
                alt17=3;
                }
                break;
            case 46:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalBehavDsl.g:1437:3: (enumLiteral_0= '==' )
                    {
                    // InternalBehavDsl.g:1437:3: (enumLiteral_0= '==' )
                    // InternalBehavDsl.g:1438:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getConditionKindAccess().getEQUALSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getConditionKindAccess().getEQUALSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBehavDsl.g:1445:3: (enumLiteral_1= '!=' )
                    {
                    // InternalBehavDsl.g:1445:3: (enumLiteral_1= '!=' )
                    // InternalBehavDsl.g:1446:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getConditionKindAccess().getNOT_EQUALSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getConditionKindAccess().getNOT_EQUALSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBehavDsl.g:1453:3: (enumLiteral_2= '>' )
                    {
                    // InternalBehavDsl.g:1453:3: (enumLiteral_2= '>' )
                    // InternalBehavDsl.g:1454:4: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getConditionKindAccess().getGREATER_THANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getConditionKindAccess().getGREATER_THANEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBehavDsl.g:1461:3: (enumLiteral_3= '<' )
                    {
                    // InternalBehavDsl.g:1461:3: (enumLiteral_3= '<' )
                    // InternalBehavDsl.g:1462:4: enumLiteral_3= '<'
                    {
                    enumLiteral_3=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getConditionKindAccess().getLESSER_THANEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getConditionKindAccess().getLESSER_THANEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionKind"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\26\10\uffff\1\43\2\uffff";
    static final String dfa_3s = "\1\42\10\uffff\1\44\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\11\1\12";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\1\3\1\uffff\1\4\1\uffff\1\5\1\uffff\1\6\1\7\1\10\1\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\13\1\12",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "340:2: (this_MoveTo_0= ruleMoveTo | this_Pause_1= rulePause | this_PerformAction_2= rulePerformAction | this_Choice_3= ruleChoice | this_WaitForMessage_4= ruleWaitForMessage | this_While_5= ruleWhile | this_Lift_6= ruleLift | this_PlaceObject_7= rulePlaceObject | this_SendMessage_8= ruleSendMessage | this_Instruct_9= ruleInstruct )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000060000000070L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000005D5C00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000005D5C00002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000002000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000005D5D00000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000780000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000040L});

}