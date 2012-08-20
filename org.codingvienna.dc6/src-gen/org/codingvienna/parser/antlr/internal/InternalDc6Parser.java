package org.codingvienna.parser.antlr.internal; 

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
import org.codingvienna.services.Dc6GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDc6Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Canvas {'", "'}'", "'Square'", "'{'", "'color'", "'corner'", "'location'", "':'", "'caption'", "'size'", "'red'", "'green'", "'blue'", "'rounded'", "'default'"
    };
    public static final int RULE_ID=6;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=4;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalDc6Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDc6Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDc6Parser.tokenNames; }
    public String getGrammarFileName() { return "../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g"; }



     	private Dc6GrammarAccess grammarAccess;
     	
        public InternalDc6Parser(TokenStream input, Dc6GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected Dc6GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:77:1: ruleModel returns [EObject current=null] : ( (lv_canvas_0_0= ruleCanvas ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_canvas_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:80:28: ( ( (lv_canvas_0_0= ruleCanvas ) ) )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:81:1: ( (lv_canvas_0_0= ruleCanvas ) )
            {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:81:1: ( (lv_canvas_0_0= ruleCanvas ) )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:82:1: (lv_canvas_0_0= ruleCanvas )
            {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:82:1: (lv_canvas_0_0= ruleCanvas )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:83:3: lv_canvas_0_0= ruleCanvas
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getCanvasCanvasParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleCanvas_in_ruleModel130);
            lv_canvas_0_0=ruleCanvas();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"canvas",
                    		lv_canvas_0_0, 
                    		"Canvas");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCanvas"
    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:107:1: entryRuleCanvas returns [EObject current=null] : iv_ruleCanvas= ruleCanvas EOF ;
    public final EObject entryRuleCanvas() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCanvas = null;


        try {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:108:2: (iv_ruleCanvas= ruleCanvas EOF )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:109:2: iv_ruleCanvas= ruleCanvas EOF
            {
             newCompositeNode(grammarAccess.getCanvasRule()); 
            pushFollow(FOLLOW_ruleCanvas_in_entryRuleCanvas165);
            iv_ruleCanvas=ruleCanvas();

            state._fsp--;

             current =iv_ruleCanvas; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCanvas175); 

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
    // $ANTLR end "entryRuleCanvas"


    // $ANTLR start "ruleCanvas"
    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:116:1: ruleCanvas returns [EObject current=null] : ( () otherlv_1= 'Canvas {' ( (lv_squares_2_0= ruleSquare ) )* otherlv_3= '}' ) ;
    public final EObject ruleCanvas() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_squares_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:119:28: ( ( () otherlv_1= 'Canvas {' ( (lv_squares_2_0= ruleSquare ) )* otherlv_3= '}' ) )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:120:1: ( () otherlv_1= 'Canvas {' ( (lv_squares_2_0= ruleSquare ) )* otherlv_3= '}' )
            {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:120:1: ( () otherlv_1= 'Canvas {' ( (lv_squares_2_0= ruleSquare ) )* otherlv_3= '}' )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:120:2: () otherlv_1= 'Canvas {' ( (lv_squares_2_0= ruleSquare ) )* otherlv_3= '}'
            {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:120:2: ()
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:121:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCanvasAccess().getCanvasAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleCanvas221); 

                	newLeafNode(otherlv_1, grammarAccess.getCanvasAccess().getCanvasKeyword_1());
                
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:130:1: ( (lv_squares_2_0= ruleSquare ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:131:1: (lv_squares_2_0= ruleSquare )
            	    {
            	    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:131:1: (lv_squares_2_0= ruleSquare )
            	    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:132:3: lv_squares_2_0= ruleSquare
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCanvasAccess().getSquaresSquareParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSquare_in_ruleCanvas242);
            	    lv_squares_2_0=ruleSquare();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCanvasRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"squares",
            	            		lv_squares_2_0, 
            	            		"Square");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleCanvas255); 

                	newLeafNode(otherlv_3, grammarAccess.getCanvasAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleCanvas"


    // $ANTLR start "entryRuleSquare"
    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:160:1: entryRuleSquare returns [EObject current=null] : iv_ruleSquare= ruleSquare EOF ;
    public final EObject entryRuleSquare() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSquare = null;


        try {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:161:2: (iv_ruleSquare= ruleSquare EOF )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:162:2: iv_ruleSquare= ruleSquare EOF
            {
             newCompositeNode(grammarAccess.getSquareRule()); 
            pushFollow(FOLLOW_ruleSquare_in_entryRuleSquare291);
            iv_ruleSquare=ruleSquare();

            state._fsp--;

             current =iv_ruleSquare; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSquare301); 

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
    // $ANTLR end "entryRuleSquare"


    // $ANTLR start "ruleSquare"
    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:169:1: ruleSquare returns [EObject current=null] : ( () otherlv_1= 'Square' otherlv_2= '{' ( (lv_properties_3_0= ruleProperties ) )* ( (lv_squares_4_0= ruleSquare ) )* otherlv_5= '}' ) ;
    public final EObject ruleSquare() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_properties_3_0 = null;

        EObject lv_squares_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:172:28: ( ( () otherlv_1= 'Square' otherlv_2= '{' ( (lv_properties_3_0= ruleProperties ) )* ( (lv_squares_4_0= ruleSquare ) )* otherlv_5= '}' ) )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:173:1: ( () otherlv_1= 'Square' otherlv_2= '{' ( (lv_properties_3_0= ruleProperties ) )* ( (lv_squares_4_0= ruleSquare ) )* otherlv_5= '}' )
            {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:173:1: ( () otherlv_1= 'Square' otherlv_2= '{' ( (lv_properties_3_0= ruleProperties ) )* ( (lv_squares_4_0= ruleSquare ) )* otherlv_5= '}' )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:173:2: () otherlv_1= 'Square' otherlv_2= '{' ( (lv_properties_3_0= ruleProperties ) )* ( (lv_squares_4_0= ruleSquare ) )* otherlv_5= '}'
            {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:173:2: ()
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:174:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSquareAccess().getSquareAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleSquare347); 

                	newLeafNode(otherlv_1, grammarAccess.getSquareAccess().getSquareKeyword_1());
                
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleSquare359); 

                	newLeafNode(otherlv_2, grammarAccess.getSquareAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:187:1: ( (lv_properties_3_0= ruleProperties ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=15 && LA2_0<=17)||(LA2_0>=19 && LA2_0<=20)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:188:1: (lv_properties_3_0= ruleProperties )
            	    {
            	    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:188:1: (lv_properties_3_0= ruleProperties )
            	    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:189:3: lv_properties_3_0= ruleProperties
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSquareAccess().getPropertiesPropertiesParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperties_in_ruleSquare380);
            	    lv_properties_3_0=ruleProperties();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSquareRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"properties",
            	            		lv_properties_3_0, 
            	            		"Properties");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:205:3: ( (lv_squares_4_0= ruleSquare ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:206:1: (lv_squares_4_0= ruleSquare )
            	    {
            	    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:206:1: (lv_squares_4_0= ruleSquare )
            	    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:207:3: lv_squares_4_0= ruleSquare
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSquareAccess().getSquaresSquareParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSquare_in_ruleSquare402);
            	    lv_squares_4_0=ruleSquare();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSquareRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"squares",
            	            		lv_squares_4_0, 
            	            		"Square");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleSquare415); 

                	newLeafNode(otherlv_5, grammarAccess.getSquareAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleSquare"


    // $ANTLR start "entryRuleProperties"
    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:235:1: entryRuleProperties returns [EObject current=null] : iv_ruleProperties= ruleProperties EOF ;
    public final EObject entryRuleProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperties = null;


        try {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:236:2: (iv_ruleProperties= ruleProperties EOF )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:237:2: iv_ruleProperties= ruleProperties EOF
            {
             newCompositeNode(grammarAccess.getPropertiesRule()); 
            pushFollow(FOLLOW_ruleProperties_in_entryRuleProperties451);
            iv_ruleProperties=ruleProperties();

            state._fsp--;

             current =iv_ruleProperties; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperties461); 

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
    // $ANTLR end "entryRuleProperties"


    // $ANTLR start "ruleProperties"
    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:244:1: ruleProperties returns [EObject current=null] : (this_Color_0= ruleColor | this_Corner_1= ruleCorner | this_Location_2= ruleLocation | this_Caption_3= ruleCaption | this_Size_4= ruleSize ) ;
    public final EObject ruleProperties() throws RecognitionException {
        EObject current = null;

        EObject this_Color_0 = null;

        EObject this_Corner_1 = null;

        EObject this_Location_2 = null;

        EObject this_Caption_3 = null;

        EObject this_Size_4 = null;


         enterRule(); 
            
        try {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:247:28: ( (this_Color_0= ruleColor | this_Corner_1= ruleCorner | this_Location_2= ruleLocation | this_Caption_3= ruleCaption | this_Size_4= ruleSize ) )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:248:1: (this_Color_0= ruleColor | this_Corner_1= ruleCorner | this_Location_2= ruleLocation | this_Caption_3= ruleCaption | this_Size_4= ruleSize )
            {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:248:1: (this_Color_0= ruleColor | this_Corner_1= ruleCorner | this_Location_2= ruleLocation | this_Caption_3= ruleCaption | this_Size_4= ruleSize )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case 17:
                {
                alt4=3;
                }
                break;
            case 19:
                {
                alt4=4;
                }
                break;
            case 20:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:249:5: this_Color_0= ruleColor
                    {
                     
                            newCompositeNode(grammarAccess.getPropertiesAccess().getColorParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleColor_in_ruleProperties508);
                    this_Color_0=ruleColor();

                    state._fsp--;

                     
                            current = this_Color_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:259:5: this_Corner_1= ruleCorner
                    {
                     
                            newCompositeNode(grammarAccess.getPropertiesAccess().getCornerParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCorner_in_ruleProperties535);
                    this_Corner_1=ruleCorner();

                    state._fsp--;

                     
                            current = this_Corner_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:269:5: this_Location_2= ruleLocation
                    {
                     
                            newCompositeNode(grammarAccess.getPropertiesAccess().getLocationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleLocation_in_ruleProperties562);
                    this_Location_2=ruleLocation();

                    state._fsp--;

                     
                            current = this_Location_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:279:5: this_Caption_3= ruleCaption
                    {
                     
                            newCompositeNode(grammarAccess.getPropertiesAccess().getCaptionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleCaption_in_ruleProperties589);
                    this_Caption_3=ruleCaption();

                    state._fsp--;

                     
                            current = this_Caption_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:289:5: this_Size_4= ruleSize
                    {
                     
                            newCompositeNode(grammarAccess.getPropertiesAccess().getSizeParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleSize_in_ruleProperties616);
                    this_Size_4=ruleSize();

                    state._fsp--;

                     
                            current = this_Size_4; 
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
    // $ANTLR end "ruleProperties"


    // $ANTLR start "entryRuleColor"
    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:305:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:306:2: (iv_ruleColor= ruleColor EOF )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:307:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_ruleColor_in_entryRuleColor651);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColor661); 

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
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:314:1: ruleColor returns [EObject current=null] : ( () (otherlv_1= 'color' ( (lv_color_2_0= ruleColorEnum ) ) ) ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_color_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:317:28: ( ( () (otherlv_1= 'color' ( (lv_color_2_0= ruleColorEnum ) ) ) ) )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:318:1: ( () (otherlv_1= 'color' ( (lv_color_2_0= ruleColorEnum ) ) ) )
            {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:318:1: ( () (otherlv_1= 'color' ( (lv_color_2_0= ruleColorEnum ) ) ) )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:318:2: () (otherlv_1= 'color' ( (lv_color_2_0= ruleColorEnum ) ) )
            {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:318:2: ()
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:319:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getColorAccess().getColorAction_0(),
                        current);
                

            }

            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:324:2: (otherlv_1= 'color' ( (lv_color_2_0= ruleColorEnum ) ) )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:324:4: otherlv_1= 'color' ( (lv_color_2_0= ruleColorEnum ) )
            {
            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleColor708); 

                	newLeafNode(otherlv_1, grammarAccess.getColorAccess().getColorKeyword_1_0());
                
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:328:1: ( (lv_color_2_0= ruleColorEnum ) )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:329:1: (lv_color_2_0= ruleColorEnum )
            {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:329:1: (lv_color_2_0= ruleColorEnum )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:330:3: lv_color_2_0= ruleColorEnum
            {
             
            	        newCompositeNode(grammarAccess.getColorAccess().getColorColorEnumEnumRuleCall_1_1_0()); 
            	    
            pushFollow(FOLLOW_ruleColorEnum_in_ruleColor729);
            lv_color_2_0=ruleColorEnum();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getColorRule());
            	        }
                   		set(
                   			current, 
                   			"color",
                    		lv_color_2_0, 
                    		"ColorEnum");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleCorner"
    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:354:1: entryRuleCorner returns [EObject current=null] : iv_ruleCorner= ruleCorner EOF ;
    public final EObject entryRuleCorner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCorner = null;


        try {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:355:2: (iv_ruleCorner= ruleCorner EOF )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:356:2: iv_ruleCorner= ruleCorner EOF
            {
             newCompositeNode(grammarAccess.getCornerRule()); 
            pushFollow(FOLLOW_ruleCorner_in_entryRuleCorner766);
            iv_ruleCorner=ruleCorner();

            state._fsp--;

             current =iv_ruleCorner; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCorner776); 

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
    // $ANTLR end "entryRuleCorner"


    // $ANTLR start "ruleCorner"
    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:363:1: ruleCorner returns [EObject current=null] : ( () (otherlv_1= 'corner' ( (lv_corner_2_0= ruleCornerEnum ) ) ) ) ;
    public final EObject ruleCorner() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_corner_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:366:28: ( ( () (otherlv_1= 'corner' ( (lv_corner_2_0= ruleCornerEnum ) ) ) ) )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:367:1: ( () (otherlv_1= 'corner' ( (lv_corner_2_0= ruleCornerEnum ) ) ) )
            {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:367:1: ( () (otherlv_1= 'corner' ( (lv_corner_2_0= ruleCornerEnum ) ) ) )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:367:2: () (otherlv_1= 'corner' ( (lv_corner_2_0= ruleCornerEnum ) ) )
            {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:367:2: ()
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:368:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCornerAccess().getCornerAction_0(),
                        current);
                

            }

            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:373:2: (otherlv_1= 'corner' ( (lv_corner_2_0= ruleCornerEnum ) ) )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:373:4: otherlv_1= 'corner' ( (lv_corner_2_0= ruleCornerEnum ) )
            {
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleCorner823); 

                	newLeafNode(otherlv_1, grammarAccess.getCornerAccess().getCornerKeyword_1_0());
                
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:377:1: ( (lv_corner_2_0= ruleCornerEnum ) )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:378:1: (lv_corner_2_0= ruleCornerEnum )
            {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:378:1: (lv_corner_2_0= ruleCornerEnum )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:379:3: lv_corner_2_0= ruleCornerEnum
            {
             
            	        newCompositeNode(grammarAccess.getCornerAccess().getCornerCornerEnumEnumRuleCall_1_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCornerEnum_in_ruleCorner844);
            lv_corner_2_0=ruleCornerEnum();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCornerRule());
            	        }
                   		set(
                   			current, 
                   			"corner",
                    		lv_corner_2_0, 
                    		"CornerEnum");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleCorner"


    // $ANTLR start "entryRuleLocation"
    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:403:1: entryRuleLocation returns [EObject current=null] : iv_ruleLocation= ruleLocation EOF ;
    public final EObject entryRuleLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocation = null;


        try {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:404:2: (iv_ruleLocation= ruleLocation EOF )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:405:2: iv_ruleLocation= ruleLocation EOF
            {
             newCompositeNode(grammarAccess.getLocationRule()); 
            pushFollow(FOLLOW_ruleLocation_in_entryRuleLocation881);
            iv_ruleLocation=ruleLocation();

            state._fsp--;

             current =iv_ruleLocation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocation891); 

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
    // $ANTLR end "entryRuleLocation"


    // $ANTLR start "ruleLocation"
    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:412:1: ruleLocation returns [EObject current=null] : ( () (otherlv_1= 'location' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_y_4_0= RULE_INT ) ) ) ) ;
    public final EObject ruleLocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_x_2_0=null;
        Token otherlv_3=null;
        Token lv_y_4_0=null;

         enterRule(); 
            
        try {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:415:28: ( ( () (otherlv_1= 'location' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_y_4_0= RULE_INT ) ) ) ) )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:416:1: ( () (otherlv_1= 'location' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_y_4_0= RULE_INT ) ) ) )
            {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:416:1: ( () (otherlv_1= 'location' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_y_4_0= RULE_INT ) ) ) )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:416:2: () (otherlv_1= 'location' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_y_4_0= RULE_INT ) ) )
            {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:416:2: ()
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:417:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLocationAccess().getLocationAction_0(),
                        current);
                

            }

            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:422:2: (otherlv_1= 'location' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_y_4_0= RULE_INT ) ) )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:422:4: otherlv_1= 'location' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_y_4_0= RULE_INT ) )
            {
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleLocation938); 

                	newLeafNode(otherlv_1, grammarAccess.getLocationAccess().getLocationKeyword_1_0());
                
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:426:1: ( (lv_x_2_0= RULE_INT ) )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:427:1: (lv_x_2_0= RULE_INT )
            {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:427:1: (lv_x_2_0= RULE_INT )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:428:3: lv_x_2_0= RULE_INT
            {
            lv_x_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLocation955); 

            			newLeafNode(lv_x_2_0, grammarAccess.getLocationAccess().getXINTTerminalRuleCall_1_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLocationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"x",
                    		lv_x_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleLocation972); 

                	newLeafNode(otherlv_3, grammarAccess.getLocationAccess().getColonKeyword_1_2());
                
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:448:1: ( (lv_y_4_0= RULE_INT ) )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:449:1: (lv_y_4_0= RULE_INT )
            {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:449:1: (lv_y_4_0= RULE_INT )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:450:3: lv_y_4_0= RULE_INT
            {
            lv_y_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLocation989); 

            			newLeafNode(lv_y_4_0, grammarAccess.getLocationAccess().getYINTTerminalRuleCall_1_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLocationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"y",
                    		lv_y_4_0, 
                    		"INT");
            	    

            }


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
    // $ANTLR end "ruleLocation"


    // $ANTLR start "entryRuleCaption"
    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:474:1: entryRuleCaption returns [EObject current=null] : iv_ruleCaption= ruleCaption EOF ;
    public final EObject entryRuleCaption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaption = null;


        try {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:475:2: (iv_ruleCaption= ruleCaption EOF )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:476:2: iv_ruleCaption= ruleCaption EOF
            {
             newCompositeNode(grammarAccess.getCaptionRule()); 
            pushFollow(FOLLOW_ruleCaption_in_entryRuleCaption1031);
            iv_ruleCaption=ruleCaption();

            state._fsp--;

             current =iv_ruleCaption; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCaption1041); 

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
    // $ANTLR end "entryRuleCaption"


    // $ANTLR start "ruleCaption"
    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:483:1: ruleCaption returns [EObject current=null] : ( () (otherlv_1= 'caption' ( (lv_caption_2_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleCaption() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_caption_2_0=null;

         enterRule(); 
            
        try {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:486:28: ( ( () (otherlv_1= 'caption' ( (lv_caption_2_0= RULE_STRING ) ) ) ) )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:487:1: ( () (otherlv_1= 'caption' ( (lv_caption_2_0= RULE_STRING ) ) ) )
            {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:487:1: ( () (otherlv_1= 'caption' ( (lv_caption_2_0= RULE_STRING ) ) ) )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:487:2: () (otherlv_1= 'caption' ( (lv_caption_2_0= RULE_STRING ) ) )
            {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:487:2: ()
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:488:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCaptionAccess().getCaptionAction_0(),
                        current);
                

            }

            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:493:2: (otherlv_1= 'caption' ( (lv_caption_2_0= RULE_STRING ) ) )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:493:4: otherlv_1= 'caption' ( (lv_caption_2_0= RULE_STRING ) )
            {
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleCaption1088); 

                	newLeafNode(otherlv_1, grammarAccess.getCaptionAccess().getCaptionKeyword_1_0());
                
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:497:1: ( (lv_caption_2_0= RULE_STRING ) )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:498:1: (lv_caption_2_0= RULE_STRING )
            {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:498:1: (lv_caption_2_0= RULE_STRING )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:499:3: lv_caption_2_0= RULE_STRING
            {
            lv_caption_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCaption1105); 

            			newLeafNode(lv_caption_2_0, grammarAccess.getCaptionAccess().getCaptionSTRINGTerminalRuleCall_1_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCaptionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"caption",
                    		lv_caption_2_0, 
                    		"STRING");
            	    

            }


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
    // $ANTLR end "ruleCaption"


    // $ANTLR start "entryRuleSize"
    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:523:1: entryRuleSize returns [EObject current=null] : iv_ruleSize= ruleSize EOF ;
    public final EObject entryRuleSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSize = null;


        try {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:524:2: (iv_ruleSize= ruleSize EOF )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:525:2: iv_ruleSize= ruleSize EOF
            {
             newCompositeNode(grammarAccess.getSizeRule()); 
            pushFollow(FOLLOW_ruleSize_in_entryRuleSize1147);
            iv_ruleSize=ruleSize();

            state._fsp--;

             current =iv_ruleSize; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSize1157); 

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
    // $ANTLR end "entryRuleSize"


    // $ANTLR start "ruleSize"
    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:532:1: ruleSize returns [EObject current=null] : ( () (otherlv_1= 'size' ( (lv_width_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_height_4_0= RULE_INT ) ) ) ) ;
    public final EObject ruleSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_width_2_0=null;
        Token otherlv_3=null;
        Token lv_height_4_0=null;

         enterRule(); 
            
        try {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:535:28: ( ( () (otherlv_1= 'size' ( (lv_width_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_height_4_0= RULE_INT ) ) ) ) )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:536:1: ( () (otherlv_1= 'size' ( (lv_width_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_height_4_0= RULE_INT ) ) ) )
            {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:536:1: ( () (otherlv_1= 'size' ( (lv_width_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_height_4_0= RULE_INT ) ) ) )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:536:2: () (otherlv_1= 'size' ( (lv_width_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_height_4_0= RULE_INT ) ) )
            {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:536:2: ()
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:537:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSizeAccess().getSizeAction_0(),
                        current);
                

            }

            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:542:2: (otherlv_1= 'size' ( (lv_width_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_height_4_0= RULE_INT ) ) )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:542:4: otherlv_1= 'size' ( (lv_width_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_height_4_0= RULE_INT ) )
            {
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleSize1204); 

                	newLeafNode(otherlv_1, grammarAccess.getSizeAccess().getSizeKeyword_1_0());
                
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:546:1: ( (lv_width_2_0= RULE_INT ) )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:547:1: (lv_width_2_0= RULE_INT )
            {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:547:1: (lv_width_2_0= RULE_INT )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:548:3: lv_width_2_0= RULE_INT
            {
            lv_width_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSize1221); 

            			newLeafNode(lv_width_2_0, grammarAccess.getSizeAccess().getWidthINTTerminalRuleCall_1_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSizeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"width",
                    		lv_width_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleSize1238); 

                	newLeafNode(otherlv_3, grammarAccess.getSizeAccess().getColonKeyword_1_2());
                
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:568:1: ( (lv_height_4_0= RULE_INT ) )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:569:1: (lv_height_4_0= RULE_INT )
            {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:569:1: (lv_height_4_0= RULE_INT )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:570:3: lv_height_4_0= RULE_INT
            {
            lv_height_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSize1255); 

            			newLeafNode(lv_height_4_0, grammarAccess.getSizeAccess().getHeightINTTerminalRuleCall_1_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSizeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"height",
                    		lv_height_4_0, 
                    		"INT");
            	    

            }


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
    // $ANTLR end "ruleSize"


    // $ANTLR start "ruleColorEnum"
    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:594:1: ruleColorEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'green' ) | (enumLiteral_2= 'blue' ) ) ;
    public final Enumerator ruleColorEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:596:28: ( ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'green' ) | (enumLiteral_2= 'blue' ) ) )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:597:1: ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'green' ) | (enumLiteral_2= 'blue' ) )
            {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:597:1: ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'green' ) | (enumLiteral_2= 'blue' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt5=1;
                }
                break;
            case 22:
                {
                alt5=2;
                }
                break;
            case 23:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:597:2: (enumLiteral_0= 'red' )
                    {
                    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:597:2: (enumLiteral_0= 'red' )
                    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:597:4: enumLiteral_0= 'red'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_21_in_ruleColorEnum1311); 

                            current = grammarAccess.getColorEnumAccess().getREDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getColorEnumAccess().getREDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:603:6: (enumLiteral_1= 'green' )
                    {
                    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:603:6: (enumLiteral_1= 'green' )
                    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:603:8: enumLiteral_1= 'green'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_22_in_ruleColorEnum1328); 

                            current = grammarAccess.getColorEnumAccess().getGREENEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getColorEnumAccess().getGREENEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:609:6: (enumLiteral_2= 'blue' )
                    {
                    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:609:6: (enumLiteral_2= 'blue' )
                    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:609:8: enumLiteral_2= 'blue'
                    {
                    enumLiteral_2=(Token)match(input,23,FOLLOW_23_in_ruleColorEnum1345); 

                            current = grammarAccess.getColorEnumAccess().getBLUEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getColorEnumAccess().getBLUEEnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleColorEnum"


    // $ANTLR start "ruleCornerEnum"
    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:619:1: ruleCornerEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'rounded' ) | (enumLiteral_1= 'default' ) ) ;
    public final Enumerator ruleCornerEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:621:28: ( ( (enumLiteral_0= 'rounded' ) | (enumLiteral_1= 'default' ) ) )
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:622:1: ( (enumLiteral_0= 'rounded' ) | (enumLiteral_1= 'default' ) )
            {
            // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:622:1: ( (enumLiteral_0= 'rounded' ) | (enumLiteral_1= 'default' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            else if ( (LA6_0==25) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:622:2: (enumLiteral_0= 'rounded' )
                    {
                    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:622:2: (enumLiteral_0= 'rounded' )
                    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:622:4: enumLiteral_0= 'rounded'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_24_in_ruleCornerEnum1390); 

                            current = grammarAccess.getCornerEnumAccess().getROUNDEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCornerEnumAccess().getROUNDEDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:628:6: (enumLiteral_1= 'default' )
                    {
                    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:628:6: (enumLiteral_1= 'default' )
                    // ../org.codingvienna.dc6/src-gen/org/codingvienna/parser/antlr/internal/InternalDc6.g:628:8: enumLiteral_1= 'default'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_25_in_ruleCornerEnum1407); 

                            current = grammarAccess.getCornerEnumAccess().getDEFAULTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCornerEnumAccess().getDEFAULTEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleCornerEnum"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCanvas_in_ruleModel130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCanvas_in_entryRuleCanvas165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCanvas175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleCanvas221 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_ruleSquare_in_ruleCanvas242 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleCanvas255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSquare_in_entryRuleSquare291 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSquare301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleSquare347 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSquare359 = new BitSet(new long[]{0x00000000001BB000L});
    public static final BitSet FOLLOW_ruleProperties_in_ruleSquare380 = new BitSet(new long[]{0x00000000001BB000L});
    public static final BitSet FOLLOW_ruleSquare_in_ruleSquare402 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleSquare415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperties_in_entryRuleProperties451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperties461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_ruleProperties508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCorner_in_ruleProperties535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocation_in_ruleProperties562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCaption_in_ruleProperties589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSize_in_ruleProperties616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_entryRuleColor651 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColor661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleColor708 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_ruleColorEnum_in_ruleColor729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCorner_in_entryRuleCorner766 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCorner776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleCorner823 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_ruleCornerEnum_in_ruleCorner844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocation_in_entryRuleLocation881 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocation891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleLocation938 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLocation955 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleLocation972 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLocation989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCaption_in_entryRuleCaption1031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCaption1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleCaption1088 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCaption1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSize_in_entryRuleSize1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSize1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleSize1204 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSize1221 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSize1238 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSize1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleColorEnum1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleColorEnum1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleColorEnum1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleCornerEnum1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleCornerEnum1407 = new BitSet(new long[]{0x0000000000000002L});

}