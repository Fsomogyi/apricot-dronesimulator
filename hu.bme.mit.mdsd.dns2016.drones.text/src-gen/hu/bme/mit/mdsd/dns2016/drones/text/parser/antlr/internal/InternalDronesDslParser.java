package hu.bme.mit.mdsd.dns2016.drones.text.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import hu.bme.mit.mdsd.dns2016.drones.text.services.DronesDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDronesDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Mission'", "'{'", "'Actions'", "','", "'}'", "'Drone'", "'ChargeStation'", "';'", "'MovableObject'", "'ImmovableObject'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalDronesDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDronesDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDronesDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDronesDsl.g"; }



     	private DronesDslGrammarAccess grammarAccess;

        public InternalDronesDslParser(TokenStream input, DronesDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Mission";
       	}

       	@Override
       	protected DronesDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMission"
    // InternalDronesDsl.g:64:1: entryRuleMission returns [EObject current=null] : iv_ruleMission= ruleMission EOF ;
    public final EObject entryRuleMission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMission = null;


        try {
            // InternalDronesDsl.g:64:48: (iv_ruleMission= ruleMission EOF )
            // InternalDronesDsl.g:65:2: iv_ruleMission= ruleMission EOF
            {
             newCompositeNode(grammarAccess.getMissionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMission=ruleMission();

            state._fsp--;

             current =iv_ruleMission; 
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
    // $ANTLR end "entryRuleMission"


    // $ANTLR start "ruleMission"
    // InternalDronesDsl.g:71:1: ruleMission returns [EObject current=null] : ( () otherlv_1= 'Mission' otherlv_2= '{' (otherlv_3= 'Actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) ) (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )* )? otherlv_8= '}' ( ( (lv_drones_9_0= ruleDrone ) ) ( (lv_drones_10_0= ruleDrone ) )* )? ( ( (lv_fieldObjects_11_0= ruleFieldObject ) ) ( (lv_fieldObjects_12_0= ruleFieldObject ) )* )? otherlv_13= '}' ) ;
    public final EObject ruleMission() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_13=null;
        EObject lv_actions_5_0 = null;

        EObject lv_actions_7_0 = null;

        EObject lv_drones_9_0 = null;

        EObject lv_drones_10_0 = null;

        EObject lv_fieldObjects_11_0 = null;

        EObject lv_fieldObjects_12_0 = null;



        	enterRule();

        try {
            // InternalDronesDsl.g:77:2: ( ( () otherlv_1= 'Mission' otherlv_2= '{' (otherlv_3= 'Actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) ) (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )* )? otherlv_8= '}' ( ( (lv_drones_9_0= ruleDrone ) ) ( (lv_drones_10_0= ruleDrone ) )* )? ( ( (lv_fieldObjects_11_0= ruleFieldObject ) ) ( (lv_fieldObjects_12_0= ruleFieldObject ) )* )? otherlv_13= '}' ) )
            // InternalDronesDsl.g:78:2: ( () otherlv_1= 'Mission' otherlv_2= '{' (otherlv_3= 'Actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) ) (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )* )? otherlv_8= '}' ( ( (lv_drones_9_0= ruleDrone ) ) ( (lv_drones_10_0= ruleDrone ) )* )? ( ( (lv_fieldObjects_11_0= ruleFieldObject ) ) ( (lv_fieldObjects_12_0= ruleFieldObject ) )* )? otherlv_13= '}' )
            {
            // InternalDronesDsl.g:78:2: ( () otherlv_1= 'Mission' otherlv_2= '{' (otherlv_3= 'Actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) ) (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )* )? otherlv_8= '}' ( ( (lv_drones_9_0= ruleDrone ) ) ( (lv_drones_10_0= ruleDrone ) )* )? ( ( (lv_fieldObjects_11_0= ruleFieldObject ) ) ( (lv_fieldObjects_12_0= ruleFieldObject ) )* )? otherlv_13= '}' )
            // InternalDronesDsl.g:79:3: () otherlv_1= 'Mission' otherlv_2= '{' (otherlv_3= 'Actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) ) (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )* )? otherlv_8= '}' ( ( (lv_drones_9_0= ruleDrone ) ) ( (lv_drones_10_0= ruleDrone ) )* )? ( ( (lv_fieldObjects_11_0= ruleFieldObject ) ) ( (lv_fieldObjects_12_0= ruleFieldObject ) )* )? otherlv_13= '}'
            {
            // InternalDronesDsl.g:79:3: ()
            // InternalDronesDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMissionAccess().getMissionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMissionAccess().getMissionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getMissionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDronesDsl.g:94:3: (otherlv_3= 'Actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) ) (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDronesDsl.g:95:4: otherlv_3= 'Actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) ) (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )*
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMissionAccess().getActionsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getMissionAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalDronesDsl.g:103:4: ( (lv_actions_5_0= ruleAction ) )
                    // InternalDronesDsl.g:104:5: (lv_actions_5_0= ruleAction )
                    {
                    // InternalDronesDsl.g:104:5: (lv_actions_5_0= ruleAction )
                    // InternalDronesDsl.g:105:6: lv_actions_5_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getMissionAccess().getActionsActionParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_actions_5_0=ruleAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    						}
                    						add(
                    							current,
                    							"actions",
                    							lv_actions_5_0,
                    							"hu.bme.mit.mdsd.dns2016.drones.text.DronesDsl.Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDronesDsl.g:122:4: (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalDronesDsl.g:123:5: otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getMissionAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalDronesDsl.g:127:5: ( (lv_actions_7_0= ruleAction ) )
                    	    // InternalDronesDsl.g:128:6: (lv_actions_7_0= ruleAction )
                    	    {
                    	    // InternalDronesDsl.g:128:6: (lv_actions_7_0= ruleAction )
                    	    // InternalDronesDsl.g:129:7: lv_actions_7_0= ruleAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getMissionAccess().getActionsActionParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_actions_7_0=ruleAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMissionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_7_0,
                    	    								"hu.bme.mit.mdsd.dns2016.drones.text.DronesDsl.Action");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getMissionAccess().getRightCurlyBracketKeyword_4());
            		
            // InternalDronesDsl.g:152:3: ( ( (lv_drones_9_0= ruleDrone ) ) ( (lv_drones_10_0= ruleDrone ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDronesDsl.g:153:4: ( (lv_drones_9_0= ruleDrone ) ) ( (lv_drones_10_0= ruleDrone ) )*
                    {
                    // InternalDronesDsl.g:153:4: ( (lv_drones_9_0= ruleDrone ) )
                    // InternalDronesDsl.g:154:5: (lv_drones_9_0= ruleDrone )
                    {
                    // InternalDronesDsl.g:154:5: (lv_drones_9_0= ruleDrone )
                    // InternalDronesDsl.g:155:6: lv_drones_9_0= ruleDrone
                    {

                    						newCompositeNode(grammarAccess.getMissionAccess().getDronesDroneParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_drones_9_0=ruleDrone();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    						}
                    						add(
                    							current,
                    							"drones",
                    							lv_drones_9_0,
                    							"hu.bme.mit.mdsd.dns2016.drones.text.DronesDsl.Drone");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDronesDsl.g:172:4: ( (lv_drones_10_0= ruleDrone ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==16) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalDronesDsl.g:173:5: (lv_drones_10_0= ruleDrone )
                    	    {
                    	    // InternalDronesDsl.g:173:5: (lv_drones_10_0= ruleDrone )
                    	    // InternalDronesDsl.g:174:6: lv_drones_10_0= ruleDrone
                    	    {

                    	    						newCompositeNode(grammarAccess.getMissionAccess().getDronesDroneParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_7);
                    	    lv_drones_10_0=ruleDrone();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"drones",
                    	    							lv_drones_10_0,
                    	    							"hu.bme.mit.mdsd.dns2016.drones.text.DronesDsl.Drone");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalDronesDsl.g:192:3: ( ( (lv_fieldObjects_11_0= ruleFieldObject ) ) ( (lv_fieldObjects_12_0= ruleFieldObject ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17||(LA6_0>=19 && LA6_0<=20)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDronesDsl.g:193:4: ( (lv_fieldObjects_11_0= ruleFieldObject ) ) ( (lv_fieldObjects_12_0= ruleFieldObject ) )*
                    {
                    // InternalDronesDsl.g:193:4: ( (lv_fieldObjects_11_0= ruleFieldObject ) )
                    // InternalDronesDsl.g:194:5: (lv_fieldObjects_11_0= ruleFieldObject )
                    {
                    // InternalDronesDsl.g:194:5: (lv_fieldObjects_11_0= ruleFieldObject )
                    // InternalDronesDsl.g:195:6: lv_fieldObjects_11_0= ruleFieldObject
                    {

                    						newCompositeNode(grammarAccess.getMissionAccess().getFieldObjectsFieldObjectParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_fieldObjects_11_0=ruleFieldObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    						}
                    						add(
                    							current,
                    							"fieldObjects",
                    							lv_fieldObjects_11_0,
                    							"hu.bme.mit.mdsd.dns2016.drones.text.DronesDsl.FieldObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDronesDsl.g:212:4: ( (lv_fieldObjects_12_0= ruleFieldObject ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==17||(LA5_0>=19 && LA5_0<=20)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalDronesDsl.g:213:5: (lv_fieldObjects_12_0= ruleFieldObject )
                    	    {
                    	    // InternalDronesDsl.g:213:5: (lv_fieldObjects_12_0= ruleFieldObject )
                    	    // InternalDronesDsl.g:214:6: lv_fieldObjects_12_0= ruleFieldObject
                    	    {

                    	    						newCompositeNode(grammarAccess.getMissionAccess().getFieldObjectsFieldObjectParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_fieldObjects_12_0=ruleFieldObject();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"fieldObjects",
                    	    							lv_fieldObjects_12_0,
                    	    							"hu.bme.mit.mdsd.dns2016.drones.text.DronesDsl.FieldObject");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getMissionAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleMission"


    // $ANTLR start "entryRuleDrone"
    // InternalDronesDsl.g:240:1: entryRuleDrone returns [EObject current=null] : iv_ruleDrone= ruleDrone EOF ;
    public final EObject entryRuleDrone() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDrone = null;


        try {
            // InternalDronesDsl.g:240:46: (iv_ruleDrone= ruleDrone EOF )
            // InternalDronesDsl.g:241:2: iv_ruleDrone= ruleDrone EOF
            {
             newCompositeNode(grammarAccess.getDroneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDrone=ruleDrone();

            state._fsp--;

             current =iv_ruleDrone; 
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
    // $ANTLR end "entryRuleDrone"


    // $ANTLR start "ruleDrone"
    // InternalDronesDsl.g:247:1: ruleDrone returns [EObject current=null] : (otherlv_0= 'Drone' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '{' ( ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* )? otherlv_6= '}' )? ) ;
    public final EObject ruleDrone() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDronesDsl.g:253:2: ( (otherlv_0= 'Drone' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '{' ( ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* )? otherlv_6= '}' )? ) )
            // InternalDronesDsl.g:254:2: (otherlv_0= 'Drone' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '{' ( ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* )? otherlv_6= '}' )? )
            {
            // InternalDronesDsl.g:254:2: (otherlv_0= 'Drone' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '{' ( ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* )? otherlv_6= '}' )? )
            // InternalDronesDsl.g:255:3: otherlv_0= 'Drone' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '{' ( ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* )? otherlv_6= '}' )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDroneAccess().getDroneKeyword_0());
            		
            // InternalDronesDsl.g:259:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDronesDsl.g:260:4: (lv_name_1_0= ruleEString )
            {
            // InternalDronesDsl.g:260:4: (lv_name_1_0= ruleEString )
            // InternalDronesDsl.g:261:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDroneAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDroneRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"hu.bme.mit.mdsd.dns2016.drones.text.DronesDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDronesDsl.g:278:3: (otherlv_2= '{' ( ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* )? otherlv_6= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==12) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDronesDsl.g:279:4: otherlv_2= '{' ( ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* )? otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDroneAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalDronesDsl.g:283:4: ( ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_ID)) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalDronesDsl.g:284:5: ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )*
                            {
                            // InternalDronesDsl.g:284:5: ( ( ruleEString ) )
                            // InternalDronesDsl.g:285:6: ( ruleEString )
                            {
                            // InternalDronesDsl.g:285:6: ( ruleEString )
                            // InternalDronesDsl.g:286:7: ruleEString
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getDroneRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getDroneAccess().getSupportedActionsActionCrossReference_2_1_0_0());
                            						
                            pushFollow(FOLLOW_6);
                            ruleEString();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalDronesDsl.g:300:5: (otherlv_4= ',' ( ( ruleEString ) ) )*
                            loop7:
                            do {
                                int alt7=2;
                                int LA7_0 = input.LA(1);

                                if ( (LA7_0==14) ) {
                                    alt7=1;
                                }


                                switch (alt7) {
                            	case 1 :
                            	    // InternalDronesDsl.g:301:6: otherlv_4= ',' ( ( ruleEString ) )
                            	    {
                            	    otherlv_4=(Token)match(input,14,FOLLOW_5); 

                            	    						newLeafNode(otherlv_4, grammarAccess.getDroneAccess().getCommaKeyword_2_1_1_0());
                            	    					
                            	    // InternalDronesDsl.g:305:6: ( ( ruleEString ) )
                            	    // InternalDronesDsl.g:306:7: ( ruleEString )
                            	    {
                            	    // InternalDronesDsl.g:306:7: ( ruleEString )
                            	    // InternalDronesDsl.g:307:8: ruleEString
                            	    {

                            	    								if (current==null) {
                            	    									current = createModelElement(grammarAccess.getDroneRule());
                            	    								}
                            	    							

                            	    								newCompositeNode(grammarAccess.getDroneAccess().getSupportedActionsActionCrossReference_2_1_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_6);
                            	    ruleEString();

                            	    state._fsp--;


                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop7;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getDroneAccess().getRightCurlyBracketKeyword_2_2());
                    			

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
    // $ANTLR end "ruleDrone"


    // $ANTLR start "entryRuleFieldObject"
    // InternalDronesDsl.g:332:1: entryRuleFieldObject returns [EObject current=null] : iv_ruleFieldObject= ruleFieldObject EOF ;
    public final EObject entryRuleFieldObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldObject = null;


        try {
            // InternalDronesDsl.g:332:52: (iv_ruleFieldObject= ruleFieldObject EOF )
            // InternalDronesDsl.g:333:2: iv_ruleFieldObject= ruleFieldObject EOF
            {
             newCompositeNode(grammarAccess.getFieldObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldObject=ruleFieldObject();

            state._fsp--;

             current =iv_ruleFieldObject; 
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
    // $ANTLR end "entryRuleFieldObject"


    // $ANTLR start "ruleFieldObject"
    // InternalDronesDsl.g:339:1: ruleFieldObject returns [EObject current=null] : (this_ChargeStation_0= ruleChargeStation | this_MovableObject_1= ruleMovableObject | this_ImmovableObject_2= ruleImmovableObject ) ;
    public final EObject ruleFieldObject() throws RecognitionException {
        EObject current = null;

        EObject this_ChargeStation_0 = null;

        EObject this_MovableObject_1 = null;

        EObject this_ImmovableObject_2 = null;



        	enterRule();

        try {
            // InternalDronesDsl.g:345:2: ( (this_ChargeStation_0= ruleChargeStation | this_MovableObject_1= ruleMovableObject | this_ImmovableObject_2= ruleImmovableObject ) )
            // InternalDronesDsl.g:346:2: (this_ChargeStation_0= ruleChargeStation | this_MovableObject_1= ruleMovableObject | this_ImmovableObject_2= ruleImmovableObject )
            {
            // InternalDronesDsl.g:346:2: (this_ChargeStation_0= ruleChargeStation | this_MovableObject_1= ruleMovableObject | this_ImmovableObject_2= ruleImmovableObject )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt10=1;
                }
                break;
            case 19:
                {
                alt10=2;
                }
                break;
            case 20:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalDronesDsl.g:347:3: this_ChargeStation_0= ruleChargeStation
                    {

                    			newCompositeNode(grammarAccess.getFieldObjectAccess().getChargeStationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ChargeStation_0=ruleChargeStation();

                    state._fsp--;


                    			current = this_ChargeStation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDronesDsl.g:356:3: this_MovableObject_1= ruleMovableObject
                    {

                    			newCompositeNode(grammarAccess.getFieldObjectAccess().getMovableObjectParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MovableObject_1=ruleMovableObject();

                    state._fsp--;


                    			current = this_MovableObject_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDronesDsl.g:365:3: this_ImmovableObject_2= ruleImmovableObject
                    {

                    			newCompositeNode(grammarAccess.getFieldObjectAccess().getImmovableObjectParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImmovableObject_2=ruleImmovableObject();

                    state._fsp--;


                    			current = this_ImmovableObject_2;
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
    // $ANTLR end "ruleFieldObject"


    // $ANTLR start "entryRuleChargeStation"
    // InternalDronesDsl.g:377:1: entryRuleChargeStation returns [EObject current=null] : iv_ruleChargeStation= ruleChargeStation EOF ;
    public final EObject entryRuleChargeStation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChargeStation = null;


        try {
            // InternalDronesDsl.g:377:54: (iv_ruleChargeStation= ruleChargeStation EOF )
            // InternalDronesDsl.g:378:2: iv_ruleChargeStation= ruleChargeStation EOF
            {
             newCompositeNode(grammarAccess.getChargeStationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChargeStation=ruleChargeStation();

            state._fsp--;

             current =iv_ruleChargeStation; 
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
    // $ANTLR end "entryRuleChargeStation"


    // $ANTLR start "ruleChargeStation"
    // InternalDronesDsl.g:384:1: ruleChargeStation returns [EObject current=null] : (otherlv_0= 'ChargeStation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ';' ) ;
    public final EObject ruleChargeStation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDronesDsl.g:390:2: ( (otherlv_0= 'ChargeStation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ';' ) )
            // InternalDronesDsl.g:391:2: (otherlv_0= 'ChargeStation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ';' )
            {
            // InternalDronesDsl.g:391:2: (otherlv_0= 'ChargeStation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ';' )
            // InternalDronesDsl.g:392:3: otherlv_0= 'ChargeStation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getChargeStationAccess().getChargeStationKeyword_0());
            		
            // InternalDronesDsl.g:396:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDronesDsl.g:397:4: (lv_name_1_0= ruleEString )
            {
            // InternalDronesDsl.g:397:4: (lv_name_1_0= ruleEString )
            // InternalDronesDsl.g:398:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getChargeStationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChargeStationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"hu.bme.mit.mdsd.dns2016.drones.text.DronesDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getChargeStationAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleChargeStation"


    // $ANTLR start "entryRuleMovableObject"
    // InternalDronesDsl.g:423:1: entryRuleMovableObject returns [EObject current=null] : iv_ruleMovableObject= ruleMovableObject EOF ;
    public final EObject entryRuleMovableObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMovableObject = null;


        try {
            // InternalDronesDsl.g:423:54: (iv_ruleMovableObject= ruleMovableObject EOF )
            // InternalDronesDsl.g:424:2: iv_ruleMovableObject= ruleMovableObject EOF
            {
             newCompositeNode(grammarAccess.getMovableObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMovableObject=ruleMovableObject();

            state._fsp--;

             current =iv_ruleMovableObject; 
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
    // $ANTLR end "entryRuleMovableObject"


    // $ANTLR start "ruleMovableObject"
    // InternalDronesDsl.g:430:1: ruleMovableObject returns [EObject current=null] : (otherlv_0= 'MovableObject' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ';' ) ;
    public final EObject ruleMovableObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDronesDsl.g:436:2: ( (otherlv_0= 'MovableObject' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ';' ) )
            // InternalDronesDsl.g:437:2: (otherlv_0= 'MovableObject' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ';' )
            {
            // InternalDronesDsl.g:437:2: (otherlv_0= 'MovableObject' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ';' )
            // InternalDronesDsl.g:438:3: otherlv_0= 'MovableObject' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMovableObjectAccess().getMovableObjectKeyword_0());
            		
            // InternalDronesDsl.g:442:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDronesDsl.g:443:4: (lv_name_1_0= ruleEString )
            {
            // InternalDronesDsl.g:443:4: (lv_name_1_0= ruleEString )
            // InternalDronesDsl.g:444:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMovableObjectAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMovableObjectRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"hu.bme.mit.mdsd.dns2016.drones.text.DronesDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getMovableObjectAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleMovableObject"


    // $ANTLR start "entryRuleImmovableObject"
    // InternalDronesDsl.g:469:1: entryRuleImmovableObject returns [EObject current=null] : iv_ruleImmovableObject= ruleImmovableObject EOF ;
    public final EObject entryRuleImmovableObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImmovableObject = null;


        try {
            // InternalDronesDsl.g:469:56: (iv_ruleImmovableObject= ruleImmovableObject EOF )
            // InternalDronesDsl.g:470:2: iv_ruleImmovableObject= ruleImmovableObject EOF
            {
             newCompositeNode(grammarAccess.getImmovableObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImmovableObject=ruleImmovableObject();

            state._fsp--;

             current =iv_ruleImmovableObject; 
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
    // $ANTLR end "entryRuleImmovableObject"


    // $ANTLR start "ruleImmovableObject"
    // InternalDronesDsl.g:476:1: ruleImmovableObject returns [EObject current=null] : (otherlv_0= 'ImmovableObject' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ';' ) ;
    public final EObject ruleImmovableObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDronesDsl.g:482:2: ( (otherlv_0= 'ImmovableObject' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ';' ) )
            // InternalDronesDsl.g:483:2: (otherlv_0= 'ImmovableObject' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ';' )
            {
            // InternalDronesDsl.g:483:2: (otherlv_0= 'ImmovableObject' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ';' )
            // InternalDronesDsl.g:484:3: otherlv_0= 'ImmovableObject' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getImmovableObjectAccess().getImmovableObjectKeyword_0());
            		
            // InternalDronesDsl.g:488:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDronesDsl.g:489:4: (lv_name_1_0= ruleEString )
            {
            // InternalDronesDsl.g:489:4: (lv_name_1_0= ruleEString )
            // InternalDronesDsl.g:490:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getImmovableObjectAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImmovableObjectRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"hu.bme.mit.mdsd.dns2016.drones.text.DronesDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getImmovableObjectAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleImmovableObject"


    // $ANTLR start "entryRuleAction"
    // InternalDronesDsl.g:515:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalDronesDsl.g:515:47: (iv_ruleAction= ruleAction EOF )
            // InternalDronesDsl.g:516:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalDronesDsl.g:522:1: ruleAction returns [EObject current=null] : ( (lv_name_0_0= ruleEString ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalDronesDsl.g:528:2: ( ( (lv_name_0_0= ruleEString ) ) )
            // InternalDronesDsl.g:529:2: ( (lv_name_0_0= ruleEString ) )
            {
            // InternalDronesDsl.g:529:2: ( (lv_name_0_0= ruleEString ) )
            // InternalDronesDsl.g:530:3: (lv_name_0_0= ruleEString )
            {
            // InternalDronesDsl.g:530:3: (lv_name_0_0= ruleEString )
            // InternalDronesDsl.g:531:4: lv_name_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getActionAccess().getNameEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getActionRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"hu.bme.mit.mdsd.dns2016.drones.text.DronesDsl.EString");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleEString"
    // InternalDronesDsl.g:551:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDronesDsl.g:551:47: (iv_ruleEString= ruleEString EOF )
            // InternalDronesDsl.g:552:2: iv_ruleEString= ruleEString EOF
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
    // InternalDronesDsl.g:558:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDronesDsl.g:564:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDronesDsl.g:565:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDronesDsl.g:565:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalDronesDsl.g:566:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDronesDsl.g:574:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000001B8000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000001A8000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});

}