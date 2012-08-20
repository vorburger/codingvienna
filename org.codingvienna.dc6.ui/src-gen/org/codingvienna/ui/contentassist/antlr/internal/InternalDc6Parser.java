package org.codingvienna.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.codingvienna.services.Dc6GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDc6Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'red'", "'green'", "'blue'", "'rounded'", "'default'", "'Canvas {'", "'}'", "'Square'", "'{'", "'color'", "'corner'", "'location'", "':'", "'caption'", "'size'"
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
    public String getGrammarFileName() { return "../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g"; }


     
     	private Dc6GrammarAccess grammarAccess;
     	
        public void setGrammarAccess(Dc6GrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:61:1: ( ruleModel EOF )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:69:1: ruleModel : ( ( rule__Model__CanvasAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:73:2: ( ( ( rule__Model__CanvasAssignment ) ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:74:1: ( ( rule__Model__CanvasAssignment ) )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:74:1: ( ( rule__Model__CanvasAssignment ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:75:1: ( rule__Model__CanvasAssignment )
            {
             before(grammarAccess.getModelAccess().getCanvasAssignment()); 
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:76:1: ( rule__Model__CanvasAssignment )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:76:2: rule__Model__CanvasAssignment
            {
            pushFollow(FOLLOW_rule__Model__CanvasAssignment_in_ruleModel94);
            rule__Model__CanvasAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getCanvasAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCanvas"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:88:1: entryRuleCanvas : ruleCanvas EOF ;
    public final void entryRuleCanvas() throws RecognitionException {
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:89:1: ( ruleCanvas EOF )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:90:1: ruleCanvas EOF
            {
             before(grammarAccess.getCanvasRule()); 
            pushFollow(FOLLOW_ruleCanvas_in_entryRuleCanvas121);
            ruleCanvas();

            state._fsp--;

             after(grammarAccess.getCanvasRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCanvas128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCanvas"


    // $ANTLR start "ruleCanvas"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:97:1: ruleCanvas : ( ( rule__Canvas__Group__0 ) ) ;
    public final void ruleCanvas() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:101:2: ( ( ( rule__Canvas__Group__0 ) ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:102:1: ( ( rule__Canvas__Group__0 ) )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:102:1: ( ( rule__Canvas__Group__0 ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:103:1: ( rule__Canvas__Group__0 )
            {
             before(grammarAccess.getCanvasAccess().getGroup()); 
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:104:1: ( rule__Canvas__Group__0 )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:104:2: rule__Canvas__Group__0
            {
            pushFollow(FOLLOW_rule__Canvas__Group__0_in_ruleCanvas154);
            rule__Canvas__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCanvasAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCanvas"


    // $ANTLR start "entryRuleSquare"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:116:1: entryRuleSquare : ruleSquare EOF ;
    public final void entryRuleSquare() throws RecognitionException {
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:117:1: ( ruleSquare EOF )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:118:1: ruleSquare EOF
            {
             before(grammarAccess.getSquareRule()); 
            pushFollow(FOLLOW_ruleSquare_in_entryRuleSquare181);
            ruleSquare();

            state._fsp--;

             after(grammarAccess.getSquareRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSquare188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSquare"


    // $ANTLR start "ruleSquare"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:125:1: ruleSquare : ( ( rule__Square__Group__0 ) ) ;
    public final void ruleSquare() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:129:2: ( ( ( rule__Square__Group__0 ) ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:130:1: ( ( rule__Square__Group__0 ) )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:130:1: ( ( rule__Square__Group__0 ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:131:1: ( rule__Square__Group__0 )
            {
             before(grammarAccess.getSquareAccess().getGroup()); 
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:132:1: ( rule__Square__Group__0 )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:132:2: rule__Square__Group__0
            {
            pushFollow(FOLLOW_rule__Square__Group__0_in_ruleSquare214);
            rule__Square__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSquareAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSquare"


    // $ANTLR start "entryRuleProperties"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:144:1: entryRuleProperties : ruleProperties EOF ;
    public final void entryRuleProperties() throws RecognitionException {
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:145:1: ( ruleProperties EOF )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:146:1: ruleProperties EOF
            {
             before(grammarAccess.getPropertiesRule()); 
            pushFollow(FOLLOW_ruleProperties_in_entryRuleProperties241);
            ruleProperties();

            state._fsp--;

             after(grammarAccess.getPropertiesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperties248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProperties"


    // $ANTLR start "ruleProperties"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:153:1: ruleProperties : ( ( rule__Properties__Alternatives ) ) ;
    public final void ruleProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:157:2: ( ( ( rule__Properties__Alternatives ) ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:158:1: ( ( rule__Properties__Alternatives ) )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:158:1: ( ( rule__Properties__Alternatives ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:159:1: ( rule__Properties__Alternatives )
            {
             before(grammarAccess.getPropertiesAccess().getAlternatives()); 
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:160:1: ( rule__Properties__Alternatives )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:160:2: rule__Properties__Alternatives
            {
            pushFollow(FOLLOW_rule__Properties__Alternatives_in_ruleProperties274);
            rule__Properties__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPropertiesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperties"


    // $ANTLR start "entryRuleColor"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:172:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:173:1: ( ruleColor EOF )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:174:1: ruleColor EOF
            {
             before(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_ruleColor_in_entryRuleColor301);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getColorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColor308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:181:1: ruleColor : ( ( rule__Color__Group__0 ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:185:2: ( ( ( rule__Color__Group__0 ) ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:186:1: ( ( rule__Color__Group__0 ) )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:186:1: ( ( rule__Color__Group__0 ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:187:1: ( rule__Color__Group__0 )
            {
             before(grammarAccess.getColorAccess().getGroup()); 
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:188:1: ( rule__Color__Group__0 )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:188:2: rule__Color__Group__0
            {
            pushFollow(FOLLOW_rule__Color__Group__0_in_ruleColor334);
            rule__Color__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleCorner"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:200:1: entryRuleCorner : ruleCorner EOF ;
    public final void entryRuleCorner() throws RecognitionException {
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:201:1: ( ruleCorner EOF )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:202:1: ruleCorner EOF
            {
             before(grammarAccess.getCornerRule()); 
            pushFollow(FOLLOW_ruleCorner_in_entryRuleCorner361);
            ruleCorner();

            state._fsp--;

             after(grammarAccess.getCornerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCorner368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCorner"


    // $ANTLR start "ruleCorner"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:209:1: ruleCorner : ( ( rule__Corner__Group__0 ) ) ;
    public final void ruleCorner() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:213:2: ( ( ( rule__Corner__Group__0 ) ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:214:1: ( ( rule__Corner__Group__0 ) )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:214:1: ( ( rule__Corner__Group__0 ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:215:1: ( rule__Corner__Group__0 )
            {
             before(grammarAccess.getCornerAccess().getGroup()); 
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:216:1: ( rule__Corner__Group__0 )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:216:2: rule__Corner__Group__0
            {
            pushFollow(FOLLOW_rule__Corner__Group__0_in_ruleCorner394);
            rule__Corner__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCornerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCorner"


    // $ANTLR start "entryRuleLocation"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:228:1: entryRuleLocation : ruleLocation EOF ;
    public final void entryRuleLocation() throws RecognitionException {
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:229:1: ( ruleLocation EOF )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:230:1: ruleLocation EOF
            {
             before(grammarAccess.getLocationRule()); 
            pushFollow(FOLLOW_ruleLocation_in_entryRuleLocation421);
            ruleLocation();

            state._fsp--;

             after(grammarAccess.getLocationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocation428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLocation"


    // $ANTLR start "ruleLocation"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:237:1: ruleLocation : ( ( rule__Location__Group__0 ) ) ;
    public final void ruleLocation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:241:2: ( ( ( rule__Location__Group__0 ) ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:242:1: ( ( rule__Location__Group__0 ) )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:242:1: ( ( rule__Location__Group__0 ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:243:1: ( rule__Location__Group__0 )
            {
             before(grammarAccess.getLocationAccess().getGroup()); 
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:244:1: ( rule__Location__Group__0 )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:244:2: rule__Location__Group__0
            {
            pushFollow(FOLLOW_rule__Location__Group__0_in_ruleLocation454);
            rule__Location__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocation"


    // $ANTLR start "entryRuleCaption"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:256:1: entryRuleCaption : ruleCaption EOF ;
    public final void entryRuleCaption() throws RecognitionException {
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:257:1: ( ruleCaption EOF )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:258:1: ruleCaption EOF
            {
             before(grammarAccess.getCaptionRule()); 
            pushFollow(FOLLOW_ruleCaption_in_entryRuleCaption481);
            ruleCaption();

            state._fsp--;

             after(grammarAccess.getCaptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCaption488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCaption"


    // $ANTLR start "ruleCaption"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:265:1: ruleCaption : ( ( rule__Caption__Group__0 ) ) ;
    public final void ruleCaption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:269:2: ( ( ( rule__Caption__Group__0 ) ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:270:1: ( ( rule__Caption__Group__0 ) )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:270:1: ( ( rule__Caption__Group__0 ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:271:1: ( rule__Caption__Group__0 )
            {
             before(grammarAccess.getCaptionAccess().getGroup()); 
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:272:1: ( rule__Caption__Group__0 )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:272:2: rule__Caption__Group__0
            {
            pushFollow(FOLLOW_rule__Caption__Group__0_in_ruleCaption514);
            rule__Caption__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCaptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCaption"


    // $ANTLR start "entryRuleSize"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:284:1: entryRuleSize : ruleSize EOF ;
    public final void entryRuleSize() throws RecognitionException {
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:285:1: ( ruleSize EOF )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:286:1: ruleSize EOF
            {
             before(grammarAccess.getSizeRule()); 
            pushFollow(FOLLOW_ruleSize_in_entryRuleSize541);
            ruleSize();

            state._fsp--;

             after(grammarAccess.getSizeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSize548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSize"


    // $ANTLR start "ruleSize"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:293:1: ruleSize : ( ( rule__Size__Group__0 ) ) ;
    public final void ruleSize() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:297:2: ( ( ( rule__Size__Group__0 ) ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:298:1: ( ( rule__Size__Group__0 ) )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:298:1: ( ( rule__Size__Group__0 ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:299:1: ( rule__Size__Group__0 )
            {
             before(grammarAccess.getSizeAccess().getGroup()); 
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:300:1: ( rule__Size__Group__0 )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:300:2: rule__Size__Group__0
            {
            pushFollow(FOLLOW_rule__Size__Group__0_in_ruleSize574);
            rule__Size__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSizeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSize"


    // $ANTLR start "ruleColorEnum"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:313:1: ruleColorEnum : ( ( rule__ColorEnum__Alternatives ) ) ;
    public final void ruleColorEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:317:1: ( ( ( rule__ColorEnum__Alternatives ) ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:318:1: ( ( rule__ColorEnum__Alternatives ) )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:318:1: ( ( rule__ColorEnum__Alternatives ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:319:1: ( rule__ColorEnum__Alternatives )
            {
             before(grammarAccess.getColorEnumAccess().getAlternatives()); 
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:320:1: ( rule__ColorEnum__Alternatives )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:320:2: rule__ColorEnum__Alternatives
            {
            pushFollow(FOLLOW_rule__ColorEnum__Alternatives_in_ruleColorEnum611);
            rule__ColorEnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColorEnumAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColorEnum"


    // $ANTLR start "ruleCornerEnum"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:332:1: ruleCornerEnum : ( ( rule__CornerEnum__Alternatives ) ) ;
    public final void ruleCornerEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:336:1: ( ( ( rule__CornerEnum__Alternatives ) ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:337:1: ( ( rule__CornerEnum__Alternatives ) )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:337:1: ( ( rule__CornerEnum__Alternatives ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:338:1: ( rule__CornerEnum__Alternatives )
            {
             before(grammarAccess.getCornerEnumAccess().getAlternatives()); 
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:339:1: ( rule__CornerEnum__Alternatives )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:339:2: rule__CornerEnum__Alternatives
            {
            pushFollow(FOLLOW_rule__CornerEnum__Alternatives_in_ruleCornerEnum647);
            rule__CornerEnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCornerEnumAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCornerEnum"


    // $ANTLR start "rule__Properties__Alternatives"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:350:1: rule__Properties__Alternatives : ( ( ruleColor ) | ( ruleCorner ) | ( ruleLocation ) | ( ruleCaption ) | ( ruleSize ) );
    public final void rule__Properties__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:354:1: ( ( ruleColor ) | ( ruleCorner ) | ( ruleLocation ) | ( ruleCaption ) | ( ruleSize ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt1=1;
                }
                break;
            case 21:
                {
                alt1=2;
                }
                break;
            case 22:
                {
                alt1=3;
                }
                break;
            case 24:
                {
                alt1=4;
                }
                break;
            case 25:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:355:1: ( ruleColor )
                    {
                    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:355:1: ( ruleColor )
                    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:356:1: ruleColor
                    {
                     before(grammarAccess.getPropertiesAccess().getColorParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleColor_in_rule__Properties__Alternatives682);
                    ruleColor();

                    state._fsp--;

                     after(grammarAccess.getPropertiesAccess().getColorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:361:6: ( ruleCorner )
                    {
                    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:361:6: ( ruleCorner )
                    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:362:1: ruleCorner
                    {
                     before(grammarAccess.getPropertiesAccess().getCornerParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCorner_in_rule__Properties__Alternatives699);
                    ruleCorner();

                    state._fsp--;

                     after(grammarAccess.getPropertiesAccess().getCornerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:367:6: ( ruleLocation )
                    {
                    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:367:6: ( ruleLocation )
                    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:368:1: ruleLocation
                    {
                     before(grammarAccess.getPropertiesAccess().getLocationParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleLocation_in_rule__Properties__Alternatives716);
                    ruleLocation();

                    state._fsp--;

                     after(grammarAccess.getPropertiesAccess().getLocationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:373:6: ( ruleCaption )
                    {
                    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:373:6: ( ruleCaption )
                    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:374:1: ruleCaption
                    {
                     before(grammarAccess.getPropertiesAccess().getCaptionParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleCaption_in_rule__Properties__Alternatives733);
                    ruleCaption();

                    state._fsp--;

                     after(grammarAccess.getPropertiesAccess().getCaptionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:379:6: ( ruleSize )
                    {
                    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:379:6: ( ruleSize )
                    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:380:1: ruleSize
                    {
                     before(grammarAccess.getPropertiesAccess().getSizeParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleSize_in_rule__Properties__Alternatives750);
                    ruleSize();

                    state._fsp--;

                     after(grammarAccess.getPropertiesAccess().getSizeParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__Alternatives"


    // $ANTLR start "rule__ColorEnum__Alternatives"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:390:1: rule__ColorEnum__Alternatives : ( ( ( 'red' ) ) | ( ( 'green' ) ) | ( ( 'blue' ) ) );
    public final void rule__ColorEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:394:1: ( ( ( 'red' ) ) | ( ( 'green' ) ) | ( ( 'blue' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:395:1: ( ( 'red' ) )
                    {
                    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:395:1: ( ( 'red' ) )
                    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:396:1: ( 'red' )
                    {
                     before(grammarAccess.getColorEnumAccess().getREDEnumLiteralDeclaration_0()); 
                    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:397:1: ( 'red' )
                    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:397:3: 'red'
                    {
                    match(input,11,FOLLOW_11_in_rule__ColorEnum__Alternatives783); 

                    }

                     after(grammarAccess.getColorEnumAccess().getREDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:402:6: ( ( 'green' ) )
                    {
                    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:402:6: ( ( 'green' ) )
                    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:403:1: ( 'green' )
                    {
                     before(grammarAccess.getColorEnumAccess().getGREENEnumLiteralDeclaration_1()); 
                    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:404:1: ( 'green' )
                    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:404:3: 'green'
                    {
                    match(input,12,FOLLOW_12_in_rule__ColorEnum__Alternatives804); 

                    }

                     after(grammarAccess.getColorEnumAccess().getGREENEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:409:6: ( ( 'blue' ) )
                    {
                    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:409:6: ( ( 'blue' ) )
                    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:410:1: ( 'blue' )
                    {
                     before(grammarAccess.getColorEnumAccess().getBLUEEnumLiteralDeclaration_2()); 
                    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:411:1: ( 'blue' )
                    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:411:3: 'blue'
                    {
                    match(input,13,FOLLOW_13_in_rule__ColorEnum__Alternatives825); 

                    }

                     after(grammarAccess.getColorEnumAccess().getBLUEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorEnum__Alternatives"


    // $ANTLR start "rule__CornerEnum__Alternatives"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:421:1: rule__CornerEnum__Alternatives : ( ( ( 'rounded' ) ) | ( ( 'default' ) ) );
    public final void rule__CornerEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:425:1: ( ( ( 'rounded' ) ) | ( ( 'default' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:426:1: ( ( 'rounded' ) )
                    {
                    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:426:1: ( ( 'rounded' ) )
                    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:427:1: ( 'rounded' )
                    {
                     before(grammarAccess.getCornerEnumAccess().getROUNDEDEnumLiteralDeclaration_0()); 
                    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:428:1: ( 'rounded' )
                    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:428:3: 'rounded'
                    {
                    match(input,14,FOLLOW_14_in_rule__CornerEnum__Alternatives861); 

                    }

                     after(grammarAccess.getCornerEnumAccess().getROUNDEDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:433:6: ( ( 'default' ) )
                    {
                    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:433:6: ( ( 'default' ) )
                    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:434:1: ( 'default' )
                    {
                     before(grammarAccess.getCornerEnumAccess().getDEFAULTEnumLiteralDeclaration_1()); 
                    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:435:1: ( 'default' )
                    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:435:3: 'default'
                    {
                    match(input,15,FOLLOW_15_in_rule__CornerEnum__Alternatives882); 

                    }

                     after(grammarAccess.getCornerEnumAccess().getDEFAULTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CornerEnum__Alternatives"


    // $ANTLR start "rule__Canvas__Group__0"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:447:1: rule__Canvas__Group__0 : rule__Canvas__Group__0__Impl rule__Canvas__Group__1 ;
    public final void rule__Canvas__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:451:1: ( rule__Canvas__Group__0__Impl rule__Canvas__Group__1 )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:452:2: rule__Canvas__Group__0__Impl rule__Canvas__Group__1
            {
            pushFollow(FOLLOW_rule__Canvas__Group__0__Impl_in_rule__Canvas__Group__0915);
            rule__Canvas__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Canvas__Group__1_in_rule__Canvas__Group__0918);
            rule__Canvas__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Canvas__Group__0"


    // $ANTLR start "rule__Canvas__Group__0__Impl"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:459:1: rule__Canvas__Group__0__Impl : ( () ) ;
    public final void rule__Canvas__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:463:1: ( ( () ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:464:1: ( () )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:464:1: ( () )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:465:1: ()
            {
             before(grammarAccess.getCanvasAccess().getCanvasAction_0()); 
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:466:1: ()
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:468:1: 
            {
            }

             after(grammarAccess.getCanvasAccess().getCanvasAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Canvas__Group__0__Impl"


    // $ANTLR start "rule__Canvas__Group__1"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:478:1: rule__Canvas__Group__1 : rule__Canvas__Group__1__Impl rule__Canvas__Group__2 ;
    public final void rule__Canvas__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:482:1: ( rule__Canvas__Group__1__Impl rule__Canvas__Group__2 )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:483:2: rule__Canvas__Group__1__Impl rule__Canvas__Group__2
            {
            pushFollow(FOLLOW_rule__Canvas__Group__1__Impl_in_rule__Canvas__Group__1976);
            rule__Canvas__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Canvas__Group__2_in_rule__Canvas__Group__1979);
            rule__Canvas__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Canvas__Group__1"


    // $ANTLR start "rule__Canvas__Group__1__Impl"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:490:1: rule__Canvas__Group__1__Impl : ( 'Canvas {' ) ;
    public final void rule__Canvas__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:494:1: ( ( 'Canvas {' ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:495:1: ( 'Canvas {' )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:495:1: ( 'Canvas {' )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:496:1: 'Canvas {'
            {
             before(grammarAccess.getCanvasAccess().getCanvasKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__Canvas__Group__1__Impl1007); 
             after(grammarAccess.getCanvasAccess().getCanvasKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Canvas__Group__1__Impl"


    // $ANTLR start "rule__Canvas__Group__2"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:509:1: rule__Canvas__Group__2 : rule__Canvas__Group__2__Impl rule__Canvas__Group__3 ;
    public final void rule__Canvas__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:513:1: ( rule__Canvas__Group__2__Impl rule__Canvas__Group__3 )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:514:2: rule__Canvas__Group__2__Impl rule__Canvas__Group__3
            {
            pushFollow(FOLLOW_rule__Canvas__Group__2__Impl_in_rule__Canvas__Group__21038);
            rule__Canvas__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Canvas__Group__3_in_rule__Canvas__Group__21041);
            rule__Canvas__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Canvas__Group__2"


    // $ANTLR start "rule__Canvas__Group__2__Impl"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:521:1: rule__Canvas__Group__2__Impl : ( ( rule__Canvas__SquaresAssignment_2 )* ) ;
    public final void rule__Canvas__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:525:1: ( ( ( rule__Canvas__SquaresAssignment_2 )* ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:526:1: ( ( rule__Canvas__SquaresAssignment_2 )* )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:526:1: ( ( rule__Canvas__SquaresAssignment_2 )* )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:527:1: ( rule__Canvas__SquaresAssignment_2 )*
            {
             before(grammarAccess.getCanvasAccess().getSquaresAssignment_2()); 
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:528:1: ( rule__Canvas__SquaresAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:528:2: rule__Canvas__SquaresAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Canvas__SquaresAssignment_2_in_rule__Canvas__Group__2__Impl1068);
            	    rule__Canvas__SquaresAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getCanvasAccess().getSquaresAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Canvas__Group__2__Impl"


    // $ANTLR start "rule__Canvas__Group__3"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:538:1: rule__Canvas__Group__3 : rule__Canvas__Group__3__Impl ;
    public final void rule__Canvas__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:542:1: ( rule__Canvas__Group__3__Impl )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:543:2: rule__Canvas__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Canvas__Group__3__Impl_in_rule__Canvas__Group__31099);
            rule__Canvas__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Canvas__Group__3"


    // $ANTLR start "rule__Canvas__Group__3__Impl"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:549:1: rule__Canvas__Group__3__Impl : ( '}' ) ;
    public final void rule__Canvas__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:553:1: ( ( '}' ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:554:1: ( '}' )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:554:1: ( '}' )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:555:1: '}'
            {
             before(grammarAccess.getCanvasAccess().getRightCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__Canvas__Group__3__Impl1127); 
             after(grammarAccess.getCanvasAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Canvas__Group__3__Impl"


    // $ANTLR start "rule__Square__Group__0"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:576:1: rule__Square__Group__0 : rule__Square__Group__0__Impl rule__Square__Group__1 ;
    public final void rule__Square__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:580:1: ( rule__Square__Group__0__Impl rule__Square__Group__1 )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:581:2: rule__Square__Group__0__Impl rule__Square__Group__1
            {
            pushFollow(FOLLOW_rule__Square__Group__0__Impl_in_rule__Square__Group__01166);
            rule__Square__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Square__Group__1_in_rule__Square__Group__01169);
            rule__Square__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Square__Group__0"


    // $ANTLR start "rule__Square__Group__0__Impl"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:588:1: rule__Square__Group__0__Impl : ( () ) ;
    public final void rule__Square__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:592:1: ( ( () ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:593:1: ( () )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:593:1: ( () )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:594:1: ()
            {
             before(grammarAccess.getSquareAccess().getSquareAction_0()); 
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:595:1: ()
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:597:1: 
            {
            }

             after(grammarAccess.getSquareAccess().getSquareAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Square__Group__0__Impl"


    // $ANTLR start "rule__Square__Group__1"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:607:1: rule__Square__Group__1 : rule__Square__Group__1__Impl rule__Square__Group__2 ;
    public final void rule__Square__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:611:1: ( rule__Square__Group__1__Impl rule__Square__Group__2 )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:612:2: rule__Square__Group__1__Impl rule__Square__Group__2
            {
            pushFollow(FOLLOW_rule__Square__Group__1__Impl_in_rule__Square__Group__11227);
            rule__Square__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Square__Group__2_in_rule__Square__Group__11230);
            rule__Square__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Square__Group__1"


    // $ANTLR start "rule__Square__Group__1__Impl"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:619:1: rule__Square__Group__1__Impl : ( 'Square' ) ;
    public final void rule__Square__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:623:1: ( ( 'Square' ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:624:1: ( 'Square' )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:624:1: ( 'Square' )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:625:1: 'Square'
            {
             before(grammarAccess.getSquareAccess().getSquareKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__Square__Group__1__Impl1258); 
             after(grammarAccess.getSquareAccess().getSquareKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Square__Group__1__Impl"


    // $ANTLR start "rule__Square__Group__2"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:638:1: rule__Square__Group__2 : rule__Square__Group__2__Impl rule__Square__Group__3 ;
    public final void rule__Square__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:642:1: ( rule__Square__Group__2__Impl rule__Square__Group__3 )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:643:2: rule__Square__Group__2__Impl rule__Square__Group__3
            {
            pushFollow(FOLLOW_rule__Square__Group__2__Impl_in_rule__Square__Group__21289);
            rule__Square__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Square__Group__3_in_rule__Square__Group__21292);
            rule__Square__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Square__Group__2"


    // $ANTLR start "rule__Square__Group__2__Impl"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:650:1: rule__Square__Group__2__Impl : ( '{' ) ;
    public final void rule__Square__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:654:1: ( ( '{' ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:655:1: ( '{' )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:655:1: ( '{' )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:656:1: '{'
            {
             before(grammarAccess.getSquareAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__Square__Group__2__Impl1320); 
             after(grammarAccess.getSquareAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Square__Group__2__Impl"


    // $ANTLR start "rule__Square__Group__3"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:669:1: rule__Square__Group__3 : rule__Square__Group__3__Impl rule__Square__Group__4 ;
    public final void rule__Square__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:673:1: ( rule__Square__Group__3__Impl rule__Square__Group__4 )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:674:2: rule__Square__Group__3__Impl rule__Square__Group__4
            {
            pushFollow(FOLLOW_rule__Square__Group__3__Impl_in_rule__Square__Group__31351);
            rule__Square__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Square__Group__4_in_rule__Square__Group__31354);
            rule__Square__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Square__Group__3"


    // $ANTLR start "rule__Square__Group__3__Impl"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:681:1: rule__Square__Group__3__Impl : ( ( rule__Square__PropertiesAssignment_3 )* ) ;
    public final void rule__Square__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:685:1: ( ( ( rule__Square__PropertiesAssignment_3 )* ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:686:1: ( ( rule__Square__PropertiesAssignment_3 )* )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:686:1: ( ( rule__Square__PropertiesAssignment_3 )* )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:687:1: ( rule__Square__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getSquareAccess().getPropertiesAssignment_3()); 
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:688:1: ( rule__Square__PropertiesAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=20 && LA5_0<=22)||(LA5_0>=24 && LA5_0<=25)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:688:2: rule__Square__PropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Square__PropertiesAssignment_3_in_rule__Square__Group__3__Impl1381);
            	    rule__Square__PropertiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSquareAccess().getPropertiesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Square__Group__3__Impl"


    // $ANTLR start "rule__Square__Group__4"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:698:1: rule__Square__Group__4 : rule__Square__Group__4__Impl rule__Square__Group__5 ;
    public final void rule__Square__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:702:1: ( rule__Square__Group__4__Impl rule__Square__Group__5 )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:703:2: rule__Square__Group__4__Impl rule__Square__Group__5
            {
            pushFollow(FOLLOW_rule__Square__Group__4__Impl_in_rule__Square__Group__41412);
            rule__Square__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Square__Group__5_in_rule__Square__Group__41415);
            rule__Square__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Square__Group__4"


    // $ANTLR start "rule__Square__Group__4__Impl"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:710:1: rule__Square__Group__4__Impl : ( ( rule__Square__SquaresAssignment_4 )* ) ;
    public final void rule__Square__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:714:1: ( ( ( rule__Square__SquaresAssignment_4 )* ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:715:1: ( ( rule__Square__SquaresAssignment_4 )* )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:715:1: ( ( rule__Square__SquaresAssignment_4 )* )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:716:1: ( rule__Square__SquaresAssignment_4 )*
            {
             before(grammarAccess.getSquareAccess().getSquaresAssignment_4()); 
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:717:1: ( rule__Square__SquaresAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:717:2: rule__Square__SquaresAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Square__SquaresAssignment_4_in_rule__Square__Group__4__Impl1442);
            	    rule__Square__SquaresAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSquareAccess().getSquaresAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Square__Group__4__Impl"


    // $ANTLR start "rule__Square__Group__5"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:727:1: rule__Square__Group__5 : rule__Square__Group__5__Impl ;
    public final void rule__Square__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:731:1: ( rule__Square__Group__5__Impl )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:732:2: rule__Square__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Square__Group__5__Impl_in_rule__Square__Group__51473);
            rule__Square__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Square__Group__5"


    // $ANTLR start "rule__Square__Group__5__Impl"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:738:1: rule__Square__Group__5__Impl : ( '}' ) ;
    public final void rule__Square__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:742:1: ( ( '}' ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:743:1: ( '}' )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:743:1: ( '}' )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:744:1: '}'
            {
             before(grammarAccess.getSquareAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_17_in_rule__Square__Group__5__Impl1501); 
             after(grammarAccess.getSquareAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Square__Group__5__Impl"


    // $ANTLR start "rule__Color__Group__0"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:769:1: rule__Color__Group__0 : rule__Color__Group__0__Impl rule__Color__Group__1 ;
    public final void rule__Color__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:773:1: ( rule__Color__Group__0__Impl rule__Color__Group__1 )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:774:2: rule__Color__Group__0__Impl rule__Color__Group__1
            {
            pushFollow(FOLLOW_rule__Color__Group__0__Impl_in_rule__Color__Group__01544);
            rule__Color__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Color__Group__1_in_rule__Color__Group__01547);
            rule__Color__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__0"


    // $ANTLR start "rule__Color__Group__0__Impl"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:781:1: rule__Color__Group__0__Impl : ( () ) ;
    public final void rule__Color__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:785:1: ( ( () ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:786:1: ( () )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:786:1: ( () )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:787:1: ()
            {
             before(grammarAccess.getColorAccess().getColorAction_0()); 
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:788:1: ()
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:790:1: 
            {
            }

             after(grammarAccess.getColorAccess().getColorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__0__Impl"


    // $ANTLR start "rule__Color__Group__1"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:800:1: rule__Color__Group__1 : rule__Color__Group__1__Impl ;
    public final void rule__Color__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:804:1: ( rule__Color__Group__1__Impl )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:805:2: rule__Color__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Color__Group__1__Impl_in_rule__Color__Group__11605);
            rule__Color__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__1"


    // $ANTLR start "rule__Color__Group__1__Impl"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:811:1: rule__Color__Group__1__Impl : ( ( rule__Color__Group_1__0 ) ) ;
    public final void rule__Color__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:815:1: ( ( ( rule__Color__Group_1__0 ) ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:816:1: ( ( rule__Color__Group_1__0 ) )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:816:1: ( ( rule__Color__Group_1__0 ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:817:1: ( rule__Color__Group_1__0 )
            {
             before(grammarAccess.getColorAccess().getGroup_1()); 
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:818:1: ( rule__Color__Group_1__0 )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:818:2: rule__Color__Group_1__0
            {
            pushFollow(FOLLOW_rule__Color__Group_1__0_in_rule__Color__Group__1__Impl1632);
            rule__Color__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__1__Impl"


    // $ANTLR start "rule__Color__Group_1__0"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:832:1: rule__Color__Group_1__0 : rule__Color__Group_1__0__Impl rule__Color__Group_1__1 ;
    public final void rule__Color__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:836:1: ( rule__Color__Group_1__0__Impl rule__Color__Group_1__1 )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:837:2: rule__Color__Group_1__0__Impl rule__Color__Group_1__1
            {
            pushFollow(FOLLOW_rule__Color__Group_1__0__Impl_in_rule__Color__Group_1__01666);
            rule__Color__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Color__Group_1__1_in_rule__Color__Group_1__01669);
            rule__Color__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_1__0"


    // $ANTLR start "rule__Color__Group_1__0__Impl"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:844:1: rule__Color__Group_1__0__Impl : ( 'color' ) ;
    public final void rule__Color__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:848:1: ( ( 'color' ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:849:1: ( 'color' )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:849:1: ( 'color' )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:850:1: 'color'
            {
             before(grammarAccess.getColorAccess().getColorKeyword_1_0()); 
            match(input,20,FOLLOW_20_in_rule__Color__Group_1__0__Impl1697); 
             after(grammarAccess.getColorAccess().getColorKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_1__0__Impl"


    // $ANTLR start "rule__Color__Group_1__1"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:863:1: rule__Color__Group_1__1 : rule__Color__Group_1__1__Impl ;
    public final void rule__Color__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:867:1: ( rule__Color__Group_1__1__Impl )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:868:2: rule__Color__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Color__Group_1__1__Impl_in_rule__Color__Group_1__11728);
            rule__Color__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_1__1"


    // $ANTLR start "rule__Color__Group_1__1__Impl"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:874:1: rule__Color__Group_1__1__Impl : ( ( rule__Color__ColorAssignment_1_1 ) ) ;
    public final void rule__Color__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:878:1: ( ( ( rule__Color__ColorAssignment_1_1 ) ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:879:1: ( ( rule__Color__ColorAssignment_1_1 ) )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:879:1: ( ( rule__Color__ColorAssignment_1_1 ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:880:1: ( rule__Color__ColorAssignment_1_1 )
            {
             before(grammarAccess.getColorAccess().getColorAssignment_1_1()); 
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:881:1: ( rule__Color__ColorAssignment_1_1 )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:881:2: rule__Color__ColorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Color__ColorAssignment_1_1_in_rule__Color__Group_1__1__Impl1755);
            rule__Color__ColorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getColorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_1__1__Impl"


    // $ANTLR start "rule__Corner__Group__0"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:895:1: rule__Corner__Group__0 : rule__Corner__Group__0__Impl rule__Corner__Group__1 ;
    public final void rule__Corner__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:899:1: ( rule__Corner__Group__0__Impl rule__Corner__Group__1 )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:900:2: rule__Corner__Group__0__Impl rule__Corner__Group__1
            {
            pushFollow(FOLLOW_rule__Corner__Group__0__Impl_in_rule__Corner__Group__01789);
            rule__Corner__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Corner__Group__1_in_rule__Corner__Group__01792);
            rule__Corner__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Corner__Group__0"


    // $ANTLR start "rule__Corner__Group__0__Impl"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:907:1: rule__Corner__Group__0__Impl : ( () ) ;
    public final void rule__Corner__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:911:1: ( ( () ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:912:1: ( () )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:912:1: ( () )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:913:1: ()
            {
             before(grammarAccess.getCornerAccess().getCornerAction_0()); 
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:914:1: ()
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:916:1: 
            {
            }

             after(grammarAccess.getCornerAccess().getCornerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Corner__Group__0__Impl"


    // $ANTLR start "rule__Corner__Group__1"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:926:1: rule__Corner__Group__1 : rule__Corner__Group__1__Impl ;
    public final void rule__Corner__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:930:1: ( rule__Corner__Group__1__Impl )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:931:2: rule__Corner__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Corner__Group__1__Impl_in_rule__Corner__Group__11850);
            rule__Corner__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Corner__Group__1"


    // $ANTLR start "rule__Corner__Group__1__Impl"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:937:1: rule__Corner__Group__1__Impl : ( ( rule__Corner__Group_1__0 ) ) ;
    public final void rule__Corner__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:941:1: ( ( ( rule__Corner__Group_1__0 ) ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:942:1: ( ( rule__Corner__Group_1__0 ) )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:942:1: ( ( rule__Corner__Group_1__0 ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:943:1: ( rule__Corner__Group_1__0 )
            {
             before(grammarAccess.getCornerAccess().getGroup_1()); 
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:944:1: ( rule__Corner__Group_1__0 )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:944:2: rule__Corner__Group_1__0
            {
            pushFollow(FOLLOW_rule__Corner__Group_1__0_in_rule__Corner__Group__1__Impl1877);
            rule__Corner__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getCornerAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Corner__Group__1__Impl"


    // $ANTLR start "rule__Corner__Group_1__0"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:958:1: rule__Corner__Group_1__0 : rule__Corner__Group_1__0__Impl rule__Corner__Group_1__1 ;
    public final void rule__Corner__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:962:1: ( rule__Corner__Group_1__0__Impl rule__Corner__Group_1__1 )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:963:2: rule__Corner__Group_1__0__Impl rule__Corner__Group_1__1
            {
            pushFollow(FOLLOW_rule__Corner__Group_1__0__Impl_in_rule__Corner__Group_1__01911);
            rule__Corner__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Corner__Group_1__1_in_rule__Corner__Group_1__01914);
            rule__Corner__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Corner__Group_1__0"


    // $ANTLR start "rule__Corner__Group_1__0__Impl"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:970:1: rule__Corner__Group_1__0__Impl : ( 'corner' ) ;
    public final void rule__Corner__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:974:1: ( ( 'corner' ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:975:1: ( 'corner' )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:975:1: ( 'corner' )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:976:1: 'corner'
            {
             before(grammarAccess.getCornerAccess().getCornerKeyword_1_0()); 
            match(input,21,FOLLOW_21_in_rule__Corner__Group_1__0__Impl1942); 
             after(grammarAccess.getCornerAccess().getCornerKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Corner__Group_1__0__Impl"


    // $ANTLR start "rule__Corner__Group_1__1"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:989:1: rule__Corner__Group_1__1 : rule__Corner__Group_1__1__Impl ;
    public final void rule__Corner__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:993:1: ( rule__Corner__Group_1__1__Impl )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:994:2: rule__Corner__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Corner__Group_1__1__Impl_in_rule__Corner__Group_1__11973);
            rule__Corner__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Corner__Group_1__1"


    // $ANTLR start "rule__Corner__Group_1__1__Impl"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1000:1: rule__Corner__Group_1__1__Impl : ( ( rule__Corner__CornerAssignment_1_1 ) ) ;
    public final void rule__Corner__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1004:1: ( ( ( rule__Corner__CornerAssignment_1_1 ) ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1005:1: ( ( rule__Corner__CornerAssignment_1_1 ) )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1005:1: ( ( rule__Corner__CornerAssignment_1_1 ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1006:1: ( rule__Corner__CornerAssignment_1_1 )
            {
             before(grammarAccess.getCornerAccess().getCornerAssignment_1_1()); 
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1007:1: ( rule__Corner__CornerAssignment_1_1 )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1007:2: rule__Corner__CornerAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Corner__CornerAssignment_1_1_in_rule__Corner__Group_1__1__Impl2000);
            rule__Corner__CornerAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCornerAccess().getCornerAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Corner__Group_1__1__Impl"


    // $ANTLR start "rule__Location__Group__0"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1021:1: rule__Location__Group__0 : rule__Location__Group__0__Impl rule__Location__Group__1 ;
    public final void rule__Location__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1025:1: ( rule__Location__Group__0__Impl rule__Location__Group__1 )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1026:2: rule__Location__Group__0__Impl rule__Location__Group__1
            {
            pushFollow(FOLLOW_rule__Location__Group__0__Impl_in_rule__Location__Group__02034);
            rule__Location__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Location__Group__1_in_rule__Location__Group__02037);
            rule__Location__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__0"


    // $ANTLR start "rule__Location__Group__0__Impl"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1033:1: rule__Location__Group__0__Impl : ( () ) ;
    public final void rule__Location__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1037:1: ( ( () ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1038:1: ( () )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1038:1: ( () )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1039:1: ()
            {
             before(grammarAccess.getLocationAccess().getLocationAction_0()); 
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1040:1: ()
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1042:1: 
            {
            }

             after(grammarAccess.getLocationAccess().getLocationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__0__Impl"


    // $ANTLR start "rule__Location__Group__1"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1052:1: rule__Location__Group__1 : rule__Location__Group__1__Impl ;
    public final void rule__Location__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1056:1: ( rule__Location__Group__1__Impl )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1057:2: rule__Location__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Location__Group__1__Impl_in_rule__Location__Group__12095);
            rule__Location__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__1"


    // $ANTLR start "rule__Location__Group__1__Impl"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1063:1: rule__Location__Group__1__Impl : ( ( rule__Location__Group_1__0 ) ) ;
    public final void rule__Location__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1067:1: ( ( ( rule__Location__Group_1__0 ) ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1068:1: ( ( rule__Location__Group_1__0 ) )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1068:1: ( ( rule__Location__Group_1__0 ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1069:1: ( rule__Location__Group_1__0 )
            {
             before(grammarAccess.getLocationAccess().getGroup_1()); 
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1070:1: ( rule__Location__Group_1__0 )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1070:2: rule__Location__Group_1__0
            {
            pushFollow(FOLLOW_rule__Location__Group_1__0_in_rule__Location__Group__1__Impl2122);
            rule__Location__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__1__Impl"


    // $ANTLR start "rule__Location__Group_1__0"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1084:1: rule__Location__Group_1__0 : rule__Location__Group_1__0__Impl rule__Location__Group_1__1 ;
    public final void rule__Location__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1088:1: ( rule__Location__Group_1__0__Impl rule__Location__Group_1__1 )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1089:2: rule__Location__Group_1__0__Impl rule__Location__Group_1__1
            {
            pushFollow(FOLLOW_rule__Location__Group_1__0__Impl_in_rule__Location__Group_1__02156);
            rule__Location__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Location__Group_1__1_in_rule__Location__Group_1__02159);
            rule__Location__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group_1__0"


    // $ANTLR start "rule__Location__Group_1__0__Impl"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1096:1: rule__Location__Group_1__0__Impl : ( 'location' ) ;
    public final void rule__Location__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1100:1: ( ( 'location' ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1101:1: ( 'location' )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1101:1: ( 'location' )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1102:1: 'location'
            {
             before(grammarAccess.getLocationAccess().getLocationKeyword_1_0()); 
            match(input,22,FOLLOW_22_in_rule__Location__Group_1__0__Impl2187); 
             after(grammarAccess.getLocationAccess().getLocationKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group_1__0__Impl"


    // $ANTLR start "rule__Location__Group_1__1"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1115:1: rule__Location__Group_1__1 : rule__Location__Group_1__1__Impl rule__Location__Group_1__2 ;
    public final void rule__Location__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1119:1: ( rule__Location__Group_1__1__Impl rule__Location__Group_1__2 )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1120:2: rule__Location__Group_1__1__Impl rule__Location__Group_1__2
            {
            pushFollow(FOLLOW_rule__Location__Group_1__1__Impl_in_rule__Location__Group_1__12218);
            rule__Location__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Location__Group_1__2_in_rule__Location__Group_1__12221);
            rule__Location__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group_1__1"


    // $ANTLR start "rule__Location__Group_1__1__Impl"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1127:1: rule__Location__Group_1__1__Impl : ( ( rule__Location__XAssignment_1_1 ) ) ;
    public final void rule__Location__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1131:1: ( ( ( rule__Location__XAssignment_1_1 ) ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1132:1: ( ( rule__Location__XAssignment_1_1 ) )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1132:1: ( ( rule__Location__XAssignment_1_1 ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1133:1: ( rule__Location__XAssignment_1_1 )
            {
             before(grammarAccess.getLocationAccess().getXAssignment_1_1()); 
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1134:1: ( rule__Location__XAssignment_1_1 )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1134:2: rule__Location__XAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Location__XAssignment_1_1_in_rule__Location__Group_1__1__Impl2248);
            rule__Location__XAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getXAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group_1__1__Impl"


    // $ANTLR start "rule__Location__Group_1__2"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1144:1: rule__Location__Group_1__2 : rule__Location__Group_1__2__Impl rule__Location__Group_1__3 ;
    public final void rule__Location__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1148:1: ( rule__Location__Group_1__2__Impl rule__Location__Group_1__3 )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1149:2: rule__Location__Group_1__2__Impl rule__Location__Group_1__3
            {
            pushFollow(FOLLOW_rule__Location__Group_1__2__Impl_in_rule__Location__Group_1__22278);
            rule__Location__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Location__Group_1__3_in_rule__Location__Group_1__22281);
            rule__Location__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group_1__2"


    // $ANTLR start "rule__Location__Group_1__2__Impl"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1156:1: rule__Location__Group_1__2__Impl : ( ':' ) ;
    public final void rule__Location__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1160:1: ( ( ':' ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1161:1: ( ':' )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1161:1: ( ':' )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1162:1: ':'
            {
             before(grammarAccess.getLocationAccess().getColonKeyword_1_2()); 
            match(input,23,FOLLOW_23_in_rule__Location__Group_1__2__Impl2309); 
             after(grammarAccess.getLocationAccess().getColonKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group_1__2__Impl"


    // $ANTLR start "rule__Location__Group_1__3"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1175:1: rule__Location__Group_1__3 : rule__Location__Group_1__3__Impl ;
    public final void rule__Location__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1179:1: ( rule__Location__Group_1__3__Impl )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1180:2: rule__Location__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Location__Group_1__3__Impl_in_rule__Location__Group_1__32340);
            rule__Location__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group_1__3"


    // $ANTLR start "rule__Location__Group_1__3__Impl"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1186:1: rule__Location__Group_1__3__Impl : ( ( rule__Location__YAssignment_1_3 ) ) ;
    public final void rule__Location__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1190:1: ( ( ( rule__Location__YAssignment_1_3 ) ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1191:1: ( ( rule__Location__YAssignment_1_3 ) )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1191:1: ( ( rule__Location__YAssignment_1_3 ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1192:1: ( rule__Location__YAssignment_1_3 )
            {
             before(grammarAccess.getLocationAccess().getYAssignment_1_3()); 
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1193:1: ( rule__Location__YAssignment_1_3 )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1193:2: rule__Location__YAssignment_1_3
            {
            pushFollow(FOLLOW_rule__Location__YAssignment_1_3_in_rule__Location__Group_1__3__Impl2367);
            rule__Location__YAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getYAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group_1__3__Impl"


    // $ANTLR start "rule__Caption__Group__0"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1211:1: rule__Caption__Group__0 : rule__Caption__Group__0__Impl rule__Caption__Group__1 ;
    public final void rule__Caption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1215:1: ( rule__Caption__Group__0__Impl rule__Caption__Group__1 )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1216:2: rule__Caption__Group__0__Impl rule__Caption__Group__1
            {
            pushFollow(FOLLOW_rule__Caption__Group__0__Impl_in_rule__Caption__Group__02405);
            rule__Caption__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Caption__Group__1_in_rule__Caption__Group__02408);
            rule__Caption__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Caption__Group__0"


    // $ANTLR start "rule__Caption__Group__0__Impl"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1223:1: rule__Caption__Group__0__Impl : ( () ) ;
    public final void rule__Caption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1227:1: ( ( () ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1228:1: ( () )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1228:1: ( () )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1229:1: ()
            {
             before(grammarAccess.getCaptionAccess().getCaptionAction_0()); 
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1230:1: ()
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1232:1: 
            {
            }

             after(grammarAccess.getCaptionAccess().getCaptionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Caption__Group__0__Impl"


    // $ANTLR start "rule__Caption__Group__1"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1242:1: rule__Caption__Group__1 : rule__Caption__Group__1__Impl ;
    public final void rule__Caption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1246:1: ( rule__Caption__Group__1__Impl )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1247:2: rule__Caption__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Caption__Group__1__Impl_in_rule__Caption__Group__12466);
            rule__Caption__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Caption__Group__1"


    // $ANTLR start "rule__Caption__Group__1__Impl"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1253:1: rule__Caption__Group__1__Impl : ( ( rule__Caption__Group_1__0 ) ) ;
    public final void rule__Caption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1257:1: ( ( ( rule__Caption__Group_1__0 ) ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1258:1: ( ( rule__Caption__Group_1__0 ) )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1258:1: ( ( rule__Caption__Group_1__0 ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1259:1: ( rule__Caption__Group_1__0 )
            {
             before(grammarAccess.getCaptionAccess().getGroup_1()); 
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1260:1: ( rule__Caption__Group_1__0 )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1260:2: rule__Caption__Group_1__0
            {
            pushFollow(FOLLOW_rule__Caption__Group_1__0_in_rule__Caption__Group__1__Impl2493);
            rule__Caption__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getCaptionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Caption__Group__1__Impl"


    // $ANTLR start "rule__Caption__Group_1__0"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1274:1: rule__Caption__Group_1__0 : rule__Caption__Group_1__0__Impl rule__Caption__Group_1__1 ;
    public final void rule__Caption__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1278:1: ( rule__Caption__Group_1__0__Impl rule__Caption__Group_1__1 )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1279:2: rule__Caption__Group_1__0__Impl rule__Caption__Group_1__1
            {
            pushFollow(FOLLOW_rule__Caption__Group_1__0__Impl_in_rule__Caption__Group_1__02527);
            rule__Caption__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Caption__Group_1__1_in_rule__Caption__Group_1__02530);
            rule__Caption__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Caption__Group_1__0"


    // $ANTLR start "rule__Caption__Group_1__0__Impl"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1286:1: rule__Caption__Group_1__0__Impl : ( 'caption' ) ;
    public final void rule__Caption__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1290:1: ( ( 'caption' ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1291:1: ( 'caption' )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1291:1: ( 'caption' )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1292:1: 'caption'
            {
             before(grammarAccess.getCaptionAccess().getCaptionKeyword_1_0()); 
            match(input,24,FOLLOW_24_in_rule__Caption__Group_1__0__Impl2558); 
             after(grammarAccess.getCaptionAccess().getCaptionKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Caption__Group_1__0__Impl"


    // $ANTLR start "rule__Caption__Group_1__1"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1305:1: rule__Caption__Group_1__1 : rule__Caption__Group_1__1__Impl ;
    public final void rule__Caption__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1309:1: ( rule__Caption__Group_1__1__Impl )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1310:2: rule__Caption__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Caption__Group_1__1__Impl_in_rule__Caption__Group_1__12589);
            rule__Caption__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Caption__Group_1__1"


    // $ANTLR start "rule__Caption__Group_1__1__Impl"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1316:1: rule__Caption__Group_1__1__Impl : ( ( rule__Caption__CaptionAssignment_1_1 ) ) ;
    public final void rule__Caption__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1320:1: ( ( ( rule__Caption__CaptionAssignment_1_1 ) ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1321:1: ( ( rule__Caption__CaptionAssignment_1_1 ) )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1321:1: ( ( rule__Caption__CaptionAssignment_1_1 ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1322:1: ( rule__Caption__CaptionAssignment_1_1 )
            {
             before(grammarAccess.getCaptionAccess().getCaptionAssignment_1_1()); 
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1323:1: ( rule__Caption__CaptionAssignment_1_1 )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1323:2: rule__Caption__CaptionAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Caption__CaptionAssignment_1_1_in_rule__Caption__Group_1__1__Impl2616);
            rule__Caption__CaptionAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCaptionAccess().getCaptionAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Caption__Group_1__1__Impl"


    // $ANTLR start "rule__Size__Group__0"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1337:1: rule__Size__Group__0 : rule__Size__Group__0__Impl rule__Size__Group__1 ;
    public final void rule__Size__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1341:1: ( rule__Size__Group__0__Impl rule__Size__Group__1 )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1342:2: rule__Size__Group__0__Impl rule__Size__Group__1
            {
            pushFollow(FOLLOW_rule__Size__Group__0__Impl_in_rule__Size__Group__02650);
            rule__Size__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Size__Group__1_in_rule__Size__Group__02653);
            rule__Size__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__0"


    // $ANTLR start "rule__Size__Group__0__Impl"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1349:1: rule__Size__Group__0__Impl : ( () ) ;
    public final void rule__Size__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1353:1: ( ( () ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1354:1: ( () )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1354:1: ( () )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1355:1: ()
            {
             before(grammarAccess.getSizeAccess().getSizeAction_0()); 
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1356:1: ()
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1358:1: 
            {
            }

             after(grammarAccess.getSizeAccess().getSizeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__0__Impl"


    // $ANTLR start "rule__Size__Group__1"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1368:1: rule__Size__Group__1 : rule__Size__Group__1__Impl ;
    public final void rule__Size__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1372:1: ( rule__Size__Group__1__Impl )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1373:2: rule__Size__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Size__Group__1__Impl_in_rule__Size__Group__12711);
            rule__Size__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__1"


    // $ANTLR start "rule__Size__Group__1__Impl"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1379:1: rule__Size__Group__1__Impl : ( ( rule__Size__Group_1__0 ) ) ;
    public final void rule__Size__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1383:1: ( ( ( rule__Size__Group_1__0 ) ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1384:1: ( ( rule__Size__Group_1__0 ) )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1384:1: ( ( rule__Size__Group_1__0 ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1385:1: ( rule__Size__Group_1__0 )
            {
             before(grammarAccess.getSizeAccess().getGroup_1()); 
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1386:1: ( rule__Size__Group_1__0 )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1386:2: rule__Size__Group_1__0
            {
            pushFollow(FOLLOW_rule__Size__Group_1__0_in_rule__Size__Group__1__Impl2738);
            rule__Size__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getSizeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__1__Impl"


    // $ANTLR start "rule__Size__Group_1__0"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1400:1: rule__Size__Group_1__0 : rule__Size__Group_1__0__Impl rule__Size__Group_1__1 ;
    public final void rule__Size__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1404:1: ( rule__Size__Group_1__0__Impl rule__Size__Group_1__1 )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1405:2: rule__Size__Group_1__0__Impl rule__Size__Group_1__1
            {
            pushFollow(FOLLOW_rule__Size__Group_1__0__Impl_in_rule__Size__Group_1__02772);
            rule__Size__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Size__Group_1__1_in_rule__Size__Group_1__02775);
            rule__Size__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group_1__0"


    // $ANTLR start "rule__Size__Group_1__0__Impl"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1412:1: rule__Size__Group_1__0__Impl : ( 'size' ) ;
    public final void rule__Size__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1416:1: ( ( 'size' ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1417:1: ( 'size' )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1417:1: ( 'size' )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1418:1: 'size'
            {
             before(grammarAccess.getSizeAccess().getSizeKeyword_1_0()); 
            match(input,25,FOLLOW_25_in_rule__Size__Group_1__0__Impl2803); 
             after(grammarAccess.getSizeAccess().getSizeKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group_1__0__Impl"


    // $ANTLR start "rule__Size__Group_1__1"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1431:1: rule__Size__Group_1__1 : rule__Size__Group_1__1__Impl rule__Size__Group_1__2 ;
    public final void rule__Size__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1435:1: ( rule__Size__Group_1__1__Impl rule__Size__Group_1__2 )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1436:2: rule__Size__Group_1__1__Impl rule__Size__Group_1__2
            {
            pushFollow(FOLLOW_rule__Size__Group_1__1__Impl_in_rule__Size__Group_1__12834);
            rule__Size__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Size__Group_1__2_in_rule__Size__Group_1__12837);
            rule__Size__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group_1__1"


    // $ANTLR start "rule__Size__Group_1__1__Impl"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1443:1: rule__Size__Group_1__1__Impl : ( ( rule__Size__WidthAssignment_1_1 ) ) ;
    public final void rule__Size__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1447:1: ( ( ( rule__Size__WidthAssignment_1_1 ) ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1448:1: ( ( rule__Size__WidthAssignment_1_1 ) )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1448:1: ( ( rule__Size__WidthAssignment_1_1 ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1449:1: ( rule__Size__WidthAssignment_1_1 )
            {
             before(grammarAccess.getSizeAccess().getWidthAssignment_1_1()); 
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1450:1: ( rule__Size__WidthAssignment_1_1 )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1450:2: rule__Size__WidthAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Size__WidthAssignment_1_1_in_rule__Size__Group_1__1__Impl2864);
            rule__Size__WidthAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSizeAccess().getWidthAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group_1__1__Impl"


    // $ANTLR start "rule__Size__Group_1__2"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1460:1: rule__Size__Group_1__2 : rule__Size__Group_1__2__Impl rule__Size__Group_1__3 ;
    public final void rule__Size__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1464:1: ( rule__Size__Group_1__2__Impl rule__Size__Group_1__3 )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1465:2: rule__Size__Group_1__2__Impl rule__Size__Group_1__3
            {
            pushFollow(FOLLOW_rule__Size__Group_1__2__Impl_in_rule__Size__Group_1__22894);
            rule__Size__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Size__Group_1__3_in_rule__Size__Group_1__22897);
            rule__Size__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group_1__2"


    // $ANTLR start "rule__Size__Group_1__2__Impl"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1472:1: rule__Size__Group_1__2__Impl : ( ':' ) ;
    public final void rule__Size__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1476:1: ( ( ':' ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1477:1: ( ':' )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1477:1: ( ':' )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1478:1: ':'
            {
             before(grammarAccess.getSizeAccess().getColonKeyword_1_2()); 
            match(input,23,FOLLOW_23_in_rule__Size__Group_1__2__Impl2925); 
             after(grammarAccess.getSizeAccess().getColonKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group_1__2__Impl"


    // $ANTLR start "rule__Size__Group_1__3"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1491:1: rule__Size__Group_1__3 : rule__Size__Group_1__3__Impl ;
    public final void rule__Size__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1495:1: ( rule__Size__Group_1__3__Impl )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1496:2: rule__Size__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Size__Group_1__3__Impl_in_rule__Size__Group_1__32956);
            rule__Size__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group_1__3"


    // $ANTLR start "rule__Size__Group_1__3__Impl"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1502:1: rule__Size__Group_1__3__Impl : ( ( rule__Size__HeightAssignment_1_3 ) ) ;
    public final void rule__Size__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1506:1: ( ( ( rule__Size__HeightAssignment_1_3 ) ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1507:1: ( ( rule__Size__HeightAssignment_1_3 ) )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1507:1: ( ( rule__Size__HeightAssignment_1_3 ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1508:1: ( rule__Size__HeightAssignment_1_3 )
            {
             before(grammarAccess.getSizeAccess().getHeightAssignment_1_3()); 
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1509:1: ( rule__Size__HeightAssignment_1_3 )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1509:2: rule__Size__HeightAssignment_1_3
            {
            pushFollow(FOLLOW_rule__Size__HeightAssignment_1_3_in_rule__Size__Group_1__3__Impl2983);
            rule__Size__HeightAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getSizeAccess().getHeightAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group_1__3__Impl"


    // $ANTLR start "rule__Model__CanvasAssignment"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1528:1: rule__Model__CanvasAssignment : ( ruleCanvas ) ;
    public final void rule__Model__CanvasAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1532:1: ( ( ruleCanvas ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1533:1: ( ruleCanvas )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1533:1: ( ruleCanvas )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1534:1: ruleCanvas
            {
             before(grammarAccess.getModelAccess().getCanvasCanvasParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleCanvas_in_rule__Model__CanvasAssignment3026);
            ruleCanvas();

            state._fsp--;

             after(grammarAccess.getModelAccess().getCanvasCanvasParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__CanvasAssignment"


    // $ANTLR start "rule__Canvas__SquaresAssignment_2"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1543:1: rule__Canvas__SquaresAssignment_2 : ( ruleSquare ) ;
    public final void rule__Canvas__SquaresAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1547:1: ( ( ruleSquare ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1548:1: ( ruleSquare )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1548:1: ( ruleSquare )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1549:1: ruleSquare
            {
             before(grammarAccess.getCanvasAccess().getSquaresSquareParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSquare_in_rule__Canvas__SquaresAssignment_23057);
            ruleSquare();

            state._fsp--;

             after(grammarAccess.getCanvasAccess().getSquaresSquareParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Canvas__SquaresAssignment_2"


    // $ANTLR start "rule__Square__PropertiesAssignment_3"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1558:1: rule__Square__PropertiesAssignment_3 : ( ruleProperties ) ;
    public final void rule__Square__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1562:1: ( ( ruleProperties ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1563:1: ( ruleProperties )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1563:1: ( ruleProperties )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1564:1: ruleProperties
            {
             before(grammarAccess.getSquareAccess().getPropertiesPropertiesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleProperties_in_rule__Square__PropertiesAssignment_33088);
            ruleProperties();

            state._fsp--;

             after(grammarAccess.getSquareAccess().getPropertiesPropertiesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Square__PropertiesAssignment_3"


    // $ANTLR start "rule__Square__SquaresAssignment_4"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1573:1: rule__Square__SquaresAssignment_4 : ( ruleSquare ) ;
    public final void rule__Square__SquaresAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1577:1: ( ( ruleSquare ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1578:1: ( ruleSquare )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1578:1: ( ruleSquare )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1579:1: ruleSquare
            {
             before(grammarAccess.getSquareAccess().getSquaresSquareParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleSquare_in_rule__Square__SquaresAssignment_43119);
            ruleSquare();

            state._fsp--;

             after(grammarAccess.getSquareAccess().getSquaresSquareParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Square__SquaresAssignment_4"


    // $ANTLR start "rule__Color__ColorAssignment_1_1"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1588:1: rule__Color__ColorAssignment_1_1 : ( ruleColorEnum ) ;
    public final void rule__Color__ColorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1592:1: ( ( ruleColorEnum ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1593:1: ( ruleColorEnum )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1593:1: ( ruleColorEnum )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1594:1: ruleColorEnum
            {
             before(grammarAccess.getColorAccess().getColorColorEnumEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleColorEnum_in_rule__Color__ColorAssignment_1_13150);
            ruleColorEnum();

            state._fsp--;

             after(grammarAccess.getColorAccess().getColorColorEnumEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__ColorAssignment_1_1"


    // $ANTLR start "rule__Corner__CornerAssignment_1_1"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1603:1: rule__Corner__CornerAssignment_1_1 : ( ruleCornerEnum ) ;
    public final void rule__Corner__CornerAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1607:1: ( ( ruleCornerEnum ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1608:1: ( ruleCornerEnum )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1608:1: ( ruleCornerEnum )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1609:1: ruleCornerEnum
            {
             before(grammarAccess.getCornerAccess().getCornerCornerEnumEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleCornerEnum_in_rule__Corner__CornerAssignment_1_13181);
            ruleCornerEnum();

            state._fsp--;

             after(grammarAccess.getCornerAccess().getCornerCornerEnumEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Corner__CornerAssignment_1_1"


    // $ANTLR start "rule__Location__XAssignment_1_1"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1618:1: rule__Location__XAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Location__XAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1622:1: ( ( RULE_INT ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1623:1: ( RULE_INT )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1623:1: ( RULE_INT )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1624:1: RULE_INT
            {
             before(grammarAccess.getLocationAccess().getXINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Location__XAssignment_1_13212); 
             after(grammarAccess.getLocationAccess().getXINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__XAssignment_1_1"


    // $ANTLR start "rule__Location__YAssignment_1_3"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1633:1: rule__Location__YAssignment_1_3 : ( RULE_INT ) ;
    public final void rule__Location__YAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1637:1: ( ( RULE_INT ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1638:1: ( RULE_INT )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1638:1: ( RULE_INT )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1639:1: RULE_INT
            {
             before(grammarAccess.getLocationAccess().getYINTTerminalRuleCall_1_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Location__YAssignment_1_33243); 
             after(grammarAccess.getLocationAccess().getYINTTerminalRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__YAssignment_1_3"


    // $ANTLR start "rule__Caption__CaptionAssignment_1_1"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1648:1: rule__Caption__CaptionAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Caption__CaptionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1652:1: ( ( RULE_STRING ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1653:1: ( RULE_STRING )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1653:1: ( RULE_STRING )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1654:1: RULE_STRING
            {
             before(grammarAccess.getCaptionAccess().getCaptionSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Caption__CaptionAssignment_1_13274); 
             after(grammarAccess.getCaptionAccess().getCaptionSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Caption__CaptionAssignment_1_1"


    // $ANTLR start "rule__Size__WidthAssignment_1_1"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1663:1: rule__Size__WidthAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Size__WidthAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1667:1: ( ( RULE_INT ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1668:1: ( RULE_INT )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1668:1: ( RULE_INT )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1669:1: RULE_INT
            {
             before(grammarAccess.getSizeAccess().getWidthINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Size__WidthAssignment_1_13305); 
             after(grammarAccess.getSizeAccess().getWidthINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__WidthAssignment_1_1"


    // $ANTLR start "rule__Size__HeightAssignment_1_3"
    // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1678:1: rule__Size__HeightAssignment_1_3 : ( RULE_INT ) ;
    public final void rule__Size__HeightAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1682:1: ( ( RULE_INT ) )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1683:1: ( RULE_INT )
            {
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1683:1: ( RULE_INT )
            // ../org.codingvienna.dc6.ui/src-gen/org/codingvienna/ui/contentassist/antlr/internal/InternalDc6.g:1684:1: RULE_INT
            {
             before(grammarAccess.getSizeAccess().getHeightINTTerminalRuleCall_1_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Size__HeightAssignment_1_33336); 
             after(grammarAccess.getSizeAccess().getHeightINTTerminalRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__HeightAssignment_1_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__CanvasAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCanvas_in_entryRuleCanvas121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCanvas128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Canvas__Group__0_in_ruleCanvas154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSquare_in_entryRuleSquare181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSquare188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Square__Group__0_in_ruleSquare214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperties_in_entryRuleProperties241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperties248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Properties__Alternatives_in_ruleProperties274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_entryRuleColor301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColor308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Group__0_in_ruleColor334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCorner_in_entryRuleCorner361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCorner368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Corner__Group__0_in_ruleCorner394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocation_in_entryRuleLocation421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocation428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Location__Group__0_in_ruleLocation454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCaption_in_entryRuleCaption481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCaption488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Caption__Group__0_in_ruleCaption514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSize_in_entryRuleSize541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSize548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Size__Group__0_in_ruleSize574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorEnum__Alternatives_in_ruleColorEnum611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CornerEnum__Alternatives_in_ruleCornerEnum647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__Properties__Alternatives682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCorner_in_rule__Properties__Alternatives699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocation_in_rule__Properties__Alternatives716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCaption_in_rule__Properties__Alternatives733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSize_in_rule__Properties__Alternatives750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__ColorEnum__Alternatives783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ColorEnum__Alternatives804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ColorEnum__Alternatives825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__CornerEnum__Alternatives861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__CornerEnum__Alternatives882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Canvas__Group__0__Impl_in_rule__Canvas__Group__0915 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Canvas__Group__1_in_rule__Canvas__Group__0918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Canvas__Group__1__Impl_in_rule__Canvas__Group__1976 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_rule__Canvas__Group__2_in_rule__Canvas__Group__1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Canvas__Group__1__Impl1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Canvas__Group__2__Impl_in_rule__Canvas__Group__21038 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_rule__Canvas__Group__3_in_rule__Canvas__Group__21041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Canvas__SquaresAssignment_2_in_rule__Canvas__Group__2__Impl1068 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Canvas__Group__3__Impl_in_rule__Canvas__Group__31099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Canvas__Group__3__Impl1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Square__Group__0__Impl_in_rule__Square__Group__01166 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Square__Group__1_in_rule__Square__Group__01169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Square__Group__1__Impl_in_rule__Square__Group__11227 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Square__Group__2_in_rule__Square__Group__11230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Square__Group__1__Impl1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Square__Group__2__Impl_in_rule__Square__Group__21289 = new BitSet(new long[]{0x0000000003760000L});
    public static final BitSet FOLLOW_rule__Square__Group__3_in_rule__Square__Group__21292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Square__Group__2__Impl1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Square__Group__3__Impl_in_rule__Square__Group__31351 = new BitSet(new long[]{0x0000000003760000L});
    public static final BitSet FOLLOW_rule__Square__Group__4_in_rule__Square__Group__31354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Square__PropertiesAssignment_3_in_rule__Square__Group__3__Impl1381 = new BitSet(new long[]{0x0000000003700002L});
    public static final BitSet FOLLOW_rule__Square__Group__4__Impl_in_rule__Square__Group__41412 = new BitSet(new long[]{0x0000000003760000L});
    public static final BitSet FOLLOW_rule__Square__Group__5_in_rule__Square__Group__41415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Square__SquaresAssignment_4_in_rule__Square__Group__4__Impl1442 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Square__Group__5__Impl_in_rule__Square__Group__51473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Square__Group__5__Impl1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Group__0__Impl_in_rule__Color__Group__01544 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Color__Group__1_in_rule__Color__Group__01547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Group__1__Impl_in_rule__Color__Group__11605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Group_1__0_in_rule__Color__Group__1__Impl1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Group_1__0__Impl_in_rule__Color__Group_1__01666 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_rule__Color__Group_1__1_in_rule__Color__Group_1__01669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Color__Group_1__0__Impl1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Group_1__1__Impl_in_rule__Color__Group_1__11728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__ColorAssignment_1_1_in_rule__Color__Group_1__1__Impl1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Corner__Group__0__Impl_in_rule__Corner__Group__01789 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Corner__Group__1_in_rule__Corner__Group__01792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Corner__Group__1__Impl_in_rule__Corner__Group__11850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Corner__Group_1__0_in_rule__Corner__Group__1__Impl1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Corner__Group_1__0__Impl_in_rule__Corner__Group_1__01911 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Corner__Group_1__1_in_rule__Corner__Group_1__01914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Corner__Group_1__0__Impl1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Corner__Group_1__1__Impl_in_rule__Corner__Group_1__11973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Corner__CornerAssignment_1_1_in_rule__Corner__Group_1__1__Impl2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Location__Group__0__Impl_in_rule__Location__Group__02034 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Location__Group__1_in_rule__Location__Group__02037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Location__Group__1__Impl_in_rule__Location__Group__12095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Location__Group_1__0_in_rule__Location__Group__1__Impl2122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Location__Group_1__0__Impl_in_rule__Location__Group_1__02156 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Location__Group_1__1_in_rule__Location__Group_1__02159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Location__Group_1__0__Impl2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Location__Group_1__1__Impl_in_rule__Location__Group_1__12218 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Location__Group_1__2_in_rule__Location__Group_1__12221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Location__XAssignment_1_1_in_rule__Location__Group_1__1__Impl2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Location__Group_1__2__Impl_in_rule__Location__Group_1__22278 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Location__Group_1__3_in_rule__Location__Group_1__22281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Location__Group_1__2__Impl2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Location__Group_1__3__Impl_in_rule__Location__Group_1__32340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Location__YAssignment_1_3_in_rule__Location__Group_1__3__Impl2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Caption__Group__0__Impl_in_rule__Caption__Group__02405 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Caption__Group__1_in_rule__Caption__Group__02408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Caption__Group__1__Impl_in_rule__Caption__Group__12466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Caption__Group_1__0_in_rule__Caption__Group__1__Impl2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Caption__Group_1__0__Impl_in_rule__Caption__Group_1__02527 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Caption__Group_1__1_in_rule__Caption__Group_1__02530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Caption__Group_1__0__Impl2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Caption__Group_1__1__Impl_in_rule__Caption__Group_1__12589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Caption__CaptionAssignment_1_1_in_rule__Caption__Group_1__1__Impl2616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Size__Group__0__Impl_in_rule__Size__Group__02650 = new BitSet(new long[]{0x0000000003700000L});
    public static final BitSet FOLLOW_rule__Size__Group__1_in_rule__Size__Group__02653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Size__Group__1__Impl_in_rule__Size__Group__12711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Size__Group_1__0_in_rule__Size__Group__1__Impl2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Size__Group_1__0__Impl_in_rule__Size__Group_1__02772 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Size__Group_1__1_in_rule__Size__Group_1__02775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Size__Group_1__0__Impl2803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Size__Group_1__1__Impl_in_rule__Size__Group_1__12834 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Size__Group_1__2_in_rule__Size__Group_1__12837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Size__WidthAssignment_1_1_in_rule__Size__Group_1__1__Impl2864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Size__Group_1__2__Impl_in_rule__Size__Group_1__22894 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Size__Group_1__3_in_rule__Size__Group_1__22897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Size__Group_1__2__Impl2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Size__Group_1__3__Impl_in_rule__Size__Group_1__32956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Size__HeightAssignment_1_3_in_rule__Size__Group_1__3__Impl2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCanvas_in_rule__Model__CanvasAssignment3026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSquare_in_rule__Canvas__SquaresAssignment_23057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperties_in_rule__Square__PropertiesAssignment_33088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSquare_in_rule__Square__SquaresAssignment_43119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorEnum_in_rule__Color__ColorAssignment_1_13150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCornerEnum_in_rule__Corner__CornerAssignment_1_13181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Location__XAssignment_1_13212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Location__YAssignment_1_33243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Caption__CaptionAssignment_1_13274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Size__WidthAssignment_1_13305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Size__HeightAssignment_1_33336 = new BitSet(new long[]{0x0000000000000002L});

}