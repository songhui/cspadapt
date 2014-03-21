/*
* generated by Xtext
*/
package net.modelbased.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import net.modelbased.services.ConstraintMLGrammarAccess;

public class ConstraintMLParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private ConstraintMLGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected net.modelbased.parser.antlr.internal.InternalConstraintMLParser createParser(XtextTokenStream stream) {
		return new net.modelbased.parser.antlr.internal.InternalConstraintMLParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "MyRootCS";
	}
	
	public ConstraintMLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ConstraintMLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
