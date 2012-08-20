/*
* generated by Xtext
*/
package org.eclipse.xtext.common.parseTreeConstruction;

import org.eclipse.emf.ecore.*;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parsetree.reconstr.IEObjectConsumer;
import org.eclipse.xtext.parsetree.reconstr.impl.AbstractParseTreeConstructor;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

import com.google.inject.Inject;

@SuppressWarnings("all")
public class TerminalsParsetreeConstructor extends AbstractParseTreeConstructor {
		
	@Inject
	private TerminalsGrammarAccess grammarAccess;
	
	@Override
	protected AbstractToken getRootToken(IEObjectConsumer inst) {
		return new ThisRootNode(inst);	
	}
	
protected class ThisRootNode extends RootToken {
	public ThisRootNode(IEObjectConsumer inst) {
		super(inst);
	}
	
	@Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return null;
		}	
	}	
}
	
}