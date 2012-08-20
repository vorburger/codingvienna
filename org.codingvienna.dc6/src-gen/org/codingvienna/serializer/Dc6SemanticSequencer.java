package org.codingvienna.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.codingvienna.dc6.Canvas;
import org.codingvienna.dc6.Caption;
import org.codingvienna.dc6.Color;
import org.codingvienna.dc6.Corner;
import org.codingvienna.dc6.Dc6Package;
import org.codingvienna.dc6.Location;
import org.codingvienna.dc6.Model;
import org.codingvienna.dc6.Size;
import org.codingvienna.dc6.Square;
import org.codingvienna.services.Dc6GrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class Dc6SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private Dc6GrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == Dc6Package.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case Dc6Package.CANVAS:
				if(context == grammarAccess.getCanvasRule()) {
					sequence_Canvas(context, (Canvas) semanticObject); 
					return; 
				}
				else break;
			case Dc6Package.CAPTION:
				if(context == grammarAccess.getCaptionRule() ||
				   context == grammarAccess.getPropertiesRule()) {
					sequence_Caption(context, (Caption) semanticObject); 
					return; 
				}
				else break;
			case Dc6Package.COLOR:
				if(context == grammarAccess.getColorRule() ||
				   context == grammarAccess.getPropertiesRule()) {
					sequence_Color(context, (Color) semanticObject); 
					return; 
				}
				else break;
			case Dc6Package.CORNER:
				if(context == grammarAccess.getCornerRule() ||
				   context == grammarAccess.getPropertiesRule()) {
					sequence_Corner(context, (Corner) semanticObject); 
					return; 
				}
				else break;
			case Dc6Package.LOCATION:
				if(context == grammarAccess.getLocationRule() ||
				   context == grammarAccess.getPropertiesRule()) {
					sequence_Location(context, (Location) semanticObject); 
					return; 
				}
				else break;
			case Dc6Package.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case Dc6Package.SIZE:
				if(context == grammarAccess.getPropertiesRule() ||
				   context == grammarAccess.getSizeRule()) {
					sequence_Size(context, (Size) semanticObject); 
					return; 
				}
				else break;
			case Dc6Package.SQUARE:
				if(context == grammarAccess.getSquareRule()) {
					sequence_Square(context, (Square) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (squares+=Square*)
	 */
	protected void sequence_Canvas(EObject context, Canvas semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     caption=STRING
	 */
	protected void sequence_Caption(EObject context, Caption semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Dc6Package.Literals.CAPTION__CAPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Dc6Package.Literals.CAPTION__CAPTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCaptionAccess().getCaptionSTRINGTerminalRuleCall_1_1_0(), semanticObject.getCaption());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     color=ColorEnum
	 */
	protected void sequence_Color(EObject context, Color semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Dc6Package.Literals.COLOR__COLOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Dc6Package.Literals.COLOR__COLOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getColorAccess().getColorColorEnumEnumRuleCall_1_1_0(), semanticObject.getColor());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     corner=CornerEnum
	 */
	protected void sequence_Corner(EObject context, Corner semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Dc6Package.Literals.CORNER__CORNER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Dc6Package.Literals.CORNER__CORNER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCornerAccess().getCornerCornerEnumEnumRuleCall_1_1_0(), semanticObject.getCorner());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (x=INT y=INT)
	 */
	protected void sequence_Location(EObject context, Location semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Dc6Package.Literals.LOCATION__X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Dc6Package.Literals.LOCATION__X));
			if(transientValues.isValueTransient(semanticObject, Dc6Package.Literals.LOCATION__Y) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Dc6Package.Literals.LOCATION__Y));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLocationAccess().getXINTTerminalRuleCall_1_1_0(), semanticObject.getX());
		feeder.accept(grammarAccess.getLocationAccess().getYINTTerminalRuleCall_1_3_0(), semanticObject.getY());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     canvas=Canvas
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Dc6Package.Literals.MODEL__CANVAS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Dc6Package.Literals.MODEL__CANVAS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getModelAccess().getCanvasCanvasParserRuleCall_0(), semanticObject.getCanvas());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (width=INT height=INT)
	 */
	protected void sequence_Size(EObject context, Size semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Dc6Package.Literals.SIZE__WIDTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Dc6Package.Literals.SIZE__WIDTH));
			if(transientValues.isValueTransient(semanticObject, Dc6Package.Literals.SIZE__HEIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Dc6Package.Literals.SIZE__HEIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSizeAccess().getWidthINTTerminalRuleCall_1_1_0(), semanticObject.getWidth());
		feeder.accept(grammarAccess.getSizeAccess().getHeightINTTerminalRuleCall_1_3_0(), semanticObject.getHeight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (properties+=Properties* squares+=Square*)
	 */
	protected void sequence_Square(EObject context, Square semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
