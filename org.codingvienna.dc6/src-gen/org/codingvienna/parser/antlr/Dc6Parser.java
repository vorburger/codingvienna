/*
* generated by Xtext
*/
package org.codingvienna.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.codingvienna.services.Dc6GrammarAccess;

public class Dc6Parser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private Dc6GrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.codingvienna.parser.antlr.internal.InternalDc6Parser createParser(XtextTokenStream stream) {
		return new org.codingvienna.parser.antlr.internal.InternalDc6Parser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public Dc6GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(Dc6GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}