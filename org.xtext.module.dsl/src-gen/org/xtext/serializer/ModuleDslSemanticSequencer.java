package org.xtext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
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
import org.xtext.moduleDsl.ADD;
import org.xtext.moduleDsl.AND;
import org.xtext.moduleDsl.ASSIGN_INSTR;
import org.xtext.moduleDsl.COMPARISON;
import org.xtext.moduleDsl.CRITERION;
import org.xtext.moduleDsl.CRITERION_DECL;
import org.xtext.moduleDsl.CST;
import org.xtext.moduleDsl.DATASEL;
import org.xtext.moduleDsl.DATASEL_DECL;
import org.xtext.moduleDsl.DIV;
import org.xtext.moduleDsl.END;
import org.xtext.moduleDsl.EQUAL_DIFF;
import org.xtext.moduleDsl.ERROR_ASSIGN;
import org.xtext.moduleDsl.Flow;
import org.xtext.moduleDsl.IF_INSTR;
import org.xtext.moduleDsl.INTERVAL;
import org.xtext.moduleDsl.LANGUAGE;
import org.xtext.moduleDsl.LOOP_INSTR;
import org.xtext.moduleDsl.LSET;
import org.xtext.moduleDsl.MODULE_DECL;
import org.xtext.moduleDsl.MULT;
import org.xtext.moduleDsl.ModuleDslPackage;
import org.xtext.moduleDsl.NOT;
import org.xtext.moduleDsl.NULL_ASSIGN;
import org.xtext.moduleDsl.OR;
import org.xtext.moduleDsl.SINGLE_ASSIGN;
import org.xtext.moduleDsl.SUB;
import org.xtext.moduleDsl.TYPE;
import org.xtext.moduleDsl.VAR;
import org.xtext.moduleDsl.VarExpRef;
import org.xtext.moduleDsl.bitConstant;
import org.xtext.moduleDsl.bitLITERAL;
import org.xtext.moduleDsl.boolConstant;
import org.xtext.moduleDsl.boolLITERAL;
import org.xtext.moduleDsl.enumConstant;
import org.xtext.moduleDsl.enumLITERAL;
import org.xtext.moduleDsl.hexConstant;
import org.xtext.moduleDsl.hexLITERAL;
import org.xtext.moduleDsl.identLITERAL;
import org.xtext.moduleDsl.intConstant;
import org.xtext.moduleDsl.intLITERAL;
import org.xtext.moduleDsl.realConstant;
import org.xtext.moduleDsl.realLITERAL;
import org.xtext.moduleDsl.strConstant;
import org.xtext.moduleDsl.strLITERAL;
import org.xtext.moduleDsl.unknowLITERAL;
import org.xtext.services.ModuleDslGrammarAccess;

@SuppressWarnings("all")
public class ModuleDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ModuleDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ModuleDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ModuleDslPackage.ADD:
				if(context == grammarAccess.getADD_SUBRule() ||
				   context == grammarAccess.getADD_SUBAccess().getADDLeftAction_1_0_0_0() ||
				   context == grammarAccess.getADD_SUBAccess().getSUBLeftAction_1_0_1_0() ||
				   context == grammarAccess.getANDRule() ||
				   context == grammarAccess.getANDAccess().getANDLeftAction_1_0() ||
				   context == grammarAccess.getCOMPARISONRule() ||
				   context == grammarAccess.getCOMPARISONAccess().getCOMPARISONLeftAction_1_0() ||
				   context == grammarAccess.getEQUAL_DIFFRule() ||
				   context == grammarAccess.getEQUAL_DIFFAccess().getEQUAL_DIFFLeftAction_1_0() ||
				   context == grammarAccess.getEXPRESSIONRule() ||
				   context == grammarAccess.getMULT_DIVRule() ||
				   context == grammarAccess.getMULT_DIVAccess().getDIVLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMULT_DIVAccess().getMULTLeftAction_1_0_0_0() ||
				   context == grammarAccess.getORRule() ||
				   context == grammarAccess.getORAccess().getORLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_ADD_SUB(context, (ADD) semanticObject); 
					return; 
				}
				else break;
			case ModuleDslPackage.AND:
				if(context == grammarAccess.getADD_SUBRule() ||
				   context == grammarAccess.getADD_SUBAccess().getADDLeftAction_1_0_0_0() ||
				   context == grammarAccess.getADD_SUBAccess().getSUBLeftAction_1_0_1_0() ||
				   context == grammarAccess.getANDRule() ||
				   context == grammarAccess.getANDAccess().getANDLeftAction_1_0() ||
				   context == grammarAccess.getCOMPARISONRule() ||
				   context == grammarAccess.getCOMPARISONAccess().getCOMPARISONLeftAction_1_0() ||
				   context == grammarAccess.getEQUAL_DIFFRule() ||
				   context == grammarAccess.getEQUAL_DIFFAccess().getEQUAL_DIFFLeftAction_1_0() ||
				   context == grammarAccess.getEXPRESSIONRule() ||
				   context == grammarAccess.getMULT_DIVRule() ||
				   context == grammarAccess.getMULT_DIVAccess().getDIVLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMULT_DIVAccess().getMULTLeftAction_1_0_0_0() ||
				   context == grammarAccess.getORRule() ||
				   context == grammarAccess.getORAccess().getORLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_AND(context, (AND) semanticObject); 
					return; 
				}
				else break;
			case ModuleDslPackage.ASSIGN_INSTR:
				if(context == grammarAccess.getASSIGN_INSTRRule() ||
				   context == grammarAccess.getINSTRUCTIONRule()) {
					sequence_ASSIGN_INSTR(context, (ASSIGN_INSTR) semanticObject); 
					return; 
				}
				else break;
			case ModuleDslPackage.COMPARISON:
				if(context == grammarAccess.getADD_SUBRule() ||
				   context == grammarAccess.getADD_SUBAccess().getADDLeftAction_1_0_0_0() ||
				   context == grammarAccess.getADD_SUBAccess().getSUBLeftAction_1_0_1_0() ||
				   context == grammarAccess.getANDRule() ||
				   context == grammarAccess.getANDAccess().getANDLeftAction_1_0() ||
				   context == grammarAccess.getCOMPARISONRule() ||
				   context == grammarAccess.getCOMPARISONAccess().getCOMPARISONLeftAction_1_0() ||
				   context == grammarAccess.getEQUAL_DIFFRule() ||
				   context == grammarAccess.getEQUAL_DIFFAccess().getEQUAL_DIFFLeftAction_1_0() ||
				   context == grammarAccess.getEXPRESSIONRule() ||
				   context == grammarAccess.getMULT_DIVRule() ||
				   context == grammarAccess.getMULT_DIVAccess().getDIVLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMULT_DIVAccess().getMULTLeftAction_1_0_0_0() ||
				   context == grammarAccess.getORRule() ||
				   context == grammarAccess.getORAccess().getORLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_COMPARISON(context, (COMPARISON) semanticObject); 
					return; 
				}
				else break;
			case ModuleDslPackage.CRITERION:
				if(context == grammarAccess.getCRITERIONRule()) {
					sequence_CRITERION(context, (CRITERION) semanticObject); 
					return; 
				}
				else break;
			case ModuleDslPackage.CRITERION_DECL:
				if(context == grammarAccess.getCRITERION_DECLRule()) {
					sequence_CRITERION_DECL(context, (CRITERION_DECL) semanticObject); 
					return; 
				}
				else break;
			case ModuleDslPackage.CST:
				if(context == grammarAccess.getCSTRule() ||
				   context == grammarAccess.getVAR_CSTRule()) {
					sequence_CST(context, (CST) semanticObject); 
					return; 
				}
				else break;
			case ModuleDslPackage.DATASEL:
				if(context == grammarAccess.getDATASELRule()) {
					sequence_DATASEL(context, (DATASEL) semanticObject); 
					return; 
				}
				else break;
			case ModuleDslPackage.DATASEL_DECL:
				if(context == grammarAccess.getDATASEL_DECLRule()) {
					sequence_DATASEL_DECL(context, (DATASEL_DECL) semanticObject); 
					return; 
				}
				else break;
			case ModuleDslPackage.DIV:
				if(context == grammarAccess.getADD_SUBRule() ||
				   context == grammarAccess.getADD_SUBAccess().getADDLeftAction_1_0_0_0() ||
				   context == grammarAccess.getADD_SUBAccess().getSUBLeftAction_1_0_1_0() ||
				   context == grammarAccess.getANDRule() ||
				   context == grammarAccess.getANDAccess().getANDLeftAction_1_0() ||
				   context == grammarAccess.getCOMPARISONRule() ||
				   context == grammarAccess.getCOMPARISONAccess().getCOMPARISONLeftAction_1_0() ||
				   context == grammarAccess.getEQUAL_DIFFRule() ||
				   context == grammarAccess.getEQUAL_DIFFAccess().getEQUAL_DIFFLeftAction_1_0() ||
				   context == grammarAccess.getEXPRESSIONRule() ||
				   context == grammarAccess.getMULT_DIVRule() ||
				   context == grammarAccess.getMULT_DIVAccess().getDIVLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMULT_DIVAccess().getMULTLeftAction_1_0_0_0() ||
				   context == grammarAccess.getORRule() ||
				   context == grammarAccess.getORAccess().getORLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_MULT_DIV(context, (DIV) semanticObject); 
					return; 
				}
				else break;
			case ModuleDslPackage.END:
				if(context == grammarAccess.getENDRule()) {
					sequence_END(context, (END) semanticObject); 
					return; 
				}
				else break;
			case ModuleDslPackage.EQUAL_DIFF:
				if(context == grammarAccess.getADD_SUBRule() ||
				   context == grammarAccess.getADD_SUBAccess().getADDLeftAction_1_0_0_0() ||
				   context == grammarAccess.getADD_SUBAccess().getSUBLeftAction_1_0_1_0() ||
				   context == grammarAccess.getANDRule() ||
				   context == grammarAccess.getANDAccess().getANDLeftAction_1_0() ||
				   context == grammarAccess.getCOMPARISONRule() ||
				   context == grammarAccess.getCOMPARISONAccess().getCOMPARISONLeftAction_1_0() ||
				   context == grammarAccess.getEQUAL_DIFFRule() ||
				   context == grammarAccess.getEQUAL_DIFFAccess().getEQUAL_DIFFLeftAction_1_0() ||
				   context == grammarAccess.getEXPRESSIONRule() ||
				   context == grammarAccess.getMULT_DIVRule() ||
				   context == grammarAccess.getMULT_DIVAccess().getDIVLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMULT_DIVAccess().getMULTLeftAction_1_0_0_0() ||
				   context == grammarAccess.getORRule() ||
				   context == grammarAccess.getORAccess().getORLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_EQUAL_DIFF(context, (EQUAL_DIFF) semanticObject); 
					return; 
				}
				else break;
			case ModuleDslPackage.ERROR_ASSIGN:
				if(context == grammarAccess.getERROR_INSTRRule() ||
				   context == grammarAccess.getINSTRUCTIONRule()) {
					sequence_ERROR_INSTR(context, (ERROR_ASSIGN) semanticObject); 
					return; 
				}
				else break;
			case ModuleDslPackage.FLOW:
				if(context == grammarAccess.getFlowRule()) {
					sequence_Flow(context, (Flow) semanticObject); 
					return; 
				}
				else break;
			case ModuleDslPackage.IF_INSTR:
				if(context == grammarAccess.getIF_INSTRRule() ||
				   context == grammarAccess.getINSTRUCTIONRule()) {
					sequence_IF_INSTR(context, (IF_INSTR) semanticObject); 
					return; 
				}
				else break;
			case ModuleDslPackage.INTERVAL:
				if(context == grammarAccess.getINTERVALRule() ||
				   context == grammarAccess.getRANGERule()) {
					sequence_INTERVAL(context, (INTERVAL) semanticObject); 
					return; 
				}
				else break;
			case ModuleDslPackage.LANGUAGE:
				if(context == grammarAccess.getLANGUAGERule()) {
					sequence_LANGUAGE(context, (LANGUAGE) semanticObject); 
					return; 
				}
				else break;
			case ModuleDslPackage.LOOP_INSTR:
				if(context == grammarAccess.getINSTRUCTIONRule() ||
				   context == grammarAccess.getLOOP_INSTRRule()) {
					sequence_LOOP_INSTR(context, (LOOP_INSTR) semanticObject); 
					return; 
				}
				else break;
			case ModuleDslPackage.LSET:
				if(context == grammarAccess.getLSETRule() ||
				   context == grammarAccess.getRANGERule()) {
					sequence_LSET(context, (LSET) semanticObject); 
					return; 
				}
				else break;
			case ModuleDslPackage.MODULE_DECL:
				if(context == grammarAccess.getMODULE_DECLRule()) {
					sequence_MODULE_DECL(context, (MODULE_DECL) semanticObject); 
					return; 
				}
				else break;
			case ModuleDslPackage.MULT:
				if(context == grammarAccess.getADD_SUBRule() ||
				   context == grammarAccess.getADD_SUBAccess().getADDLeftAction_1_0_0_0() ||
				   context == grammarAccess.getADD_SUBAccess().getSUBLeftAction_1_0_1_0() ||
				   context == grammarAccess.getANDRule() ||
				   context == grammarAccess.getANDAccess().getANDLeftAction_1_0() ||
				   context == grammarAccess.getCOMPARISONRule() ||
				   context == grammarAccess.getCOMPARISONAccess().getCOMPARISONLeftAction_1_0() ||
				   context == grammarAccess.getEQUAL_DIFFRule() ||
				   context == grammarAccess.getEQUAL_DIFFAccess().getEQUAL_DIFFLeftAction_1_0() ||
				   context == grammarAccess.getEXPRESSIONRule() ||
				   context == grammarAccess.getMULT_DIVRule() ||
				   context == grammarAccess.getMULT_DIVAccess().getDIVLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMULT_DIVAccess().getMULTLeftAction_1_0_0_0() ||
				   context == grammarAccess.getORRule() ||
				   context == grammarAccess.getORAccess().getORLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_MULT_DIV(context, (MULT) semanticObject); 
					return; 
				}
				else break;
			case ModuleDslPackage.NOT:
				if(context == grammarAccess.getADD_SUBRule() ||
				   context == grammarAccess.getADD_SUBAccess().getADDLeftAction_1_0_0_0() ||
				   context == grammarAccess.getADD_SUBAccess().getSUBLeftAction_1_0_1_0() ||
				   context == grammarAccess.getANDRule() ||
				   context == grammarAccess.getANDAccess().getANDLeftAction_1_0() ||
				   context == grammarAccess.getCOMPARISONRule() ||
				   context == grammarAccess.getCOMPARISONAccess().getCOMPARISONLeftAction_1_0() ||
				   context == grammarAccess.getEQUAL_DIFFRule() ||
				   context == grammarAccess.getEQUAL_DIFFAccess().getEQUAL_DIFFLeftAction_1_0() ||
				   context == grammarAccess.getEXPRESSIONRule() ||
				   context == grammarAccess.getMULT_DIVRule() ||
				   context == grammarAccess.getMULT_DIVAccess().getDIVLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMULT_DIVAccess().getMULTLeftAction_1_0_0_0() ||
				   context == grammarAccess.getORRule() ||
				   context == grammarAccess.getORAccess().getORLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_PrimaryExpression(context, (NOT) semanticObject); 
					return; 
				}
				else break;
			case ModuleDslPackage.NULL_ASSIGN:
				if(context == grammarAccess.getINSTRUCTIONRule() ||
				   context == grammarAccess.getNULL_INSTRRule()) {
					sequence_NULL_INSTR(context, (NULL_ASSIGN) semanticObject); 
					return; 
				}
				else break;
			case ModuleDslPackage.OR:
				if(context == grammarAccess.getADD_SUBRule() ||
				   context == grammarAccess.getADD_SUBAccess().getADDLeftAction_1_0_0_0() ||
				   context == grammarAccess.getADD_SUBAccess().getSUBLeftAction_1_0_1_0() ||
				   context == grammarAccess.getANDRule() ||
				   context == grammarAccess.getANDAccess().getANDLeftAction_1_0() ||
				   context == grammarAccess.getCOMPARISONRule() ||
				   context == grammarAccess.getCOMPARISONAccess().getCOMPARISONLeftAction_1_0() ||
				   context == grammarAccess.getEQUAL_DIFFRule() ||
				   context == grammarAccess.getEQUAL_DIFFAccess().getEQUAL_DIFFLeftAction_1_0() ||
				   context == grammarAccess.getEXPRESSIONRule() ||
				   context == grammarAccess.getMULT_DIVRule() ||
				   context == grammarAccess.getMULT_DIVAccess().getDIVLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMULT_DIVAccess().getMULTLeftAction_1_0_0_0() ||
				   context == grammarAccess.getORRule() ||
				   context == grammarAccess.getORAccess().getORLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_OR(context, (OR) semanticObject); 
					return; 
				}
				else break;
			case ModuleDslPackage.SINGLE_ASSIGN:
				if(context == grammarAccess.getSINGLE_ASSIGNRule()) {
					sequence_SINGLE_ASSIGN(context, (SINGLE_ASSIGN) semanticObject); 
					return; 
				}
				else break;
			case ModuleDslPackage.SUB:
				if(context == grammarAccess.getADD_SUBRule() ||
				   context == grammarAccess.getADD_SUBAccess().getADDLeftAction_1_0_0_0() ||
				   context == grammarAccess.getADD_SUBAccess().getSUBLeftAction_1_0_1_0() ||
				   context == grammarAccess.getANDRule() ||
				   context == grammarAccess.getANDAccess().getANDLeftAction_1_0() ||
				   context == grammarAccess.getCOMPARISONRule() ||
				   context == grammarAccess.getCOMPARISONAccess().getCOMPARISONLeftAction_1_0() ||
				   context == grammarAccess.getEQUAL_DIFFRule() ||
				   context == grammarAccess.getEQUAL_DIFFAccess().getEQUAL_DIFFLeftAction_1_0() ||
				   context == grammarAccess.getEXPRESSIONRule() ||
				   context == grammarAccess.getMULT_DIVRule() ||
				   context == grammarAccess.getMULT_DIVAccess().getDIVLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMULT_DIVAccess().getMULTLeftAction_1_0_0_0() ||
				   context == grammarAccess.getORRule() ||
				   context == grammarAccess.getORAccess().getORLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_ADD_SUB(context, (SUB) semanticObject); 
					return; 
				}
				else break;
			case ModuleDslPackage.TYPE:
				if(context == grammarAccess.getTYPERule()) {
					sequence_TYPE(context, (TYPE) semanticObject); 
					return; 
				}
				else break;
			case ModuleDslPackage.VAR:
				if(context == grammarAccess.getVARRule() ||
				   context == grammarAccess.getVAR_CSTRule()) {
					sequence_VAR(context, (VAR) semanticObject); 
					return; 
				}
				else break;
			case ModuleDslPackage.VAR_EXP_REF:
				if(context == grammarAccess.getADD_SUBRule() ||
				   context == grammarAccess.getADD_SUBAccess().getADDLeftAction_1_0_0_0() ||
				   context == grammarAccess.getADD_SUBAccess().getSUBLeftAction_1_0_1_0() ||
				   context == grammarAccess.getANDRule() ||
				   context == grammarAccess.getANDAccess().getANDLeftAction_1_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getCOMPARISONRule() ||
				   context == grammarAccess.getCOMPARISONAccess().getCOMPARISONLeftAction_1_0() ||
				   context == grammarAccess.getEQUAL_DIFFRule() ||
				   context == grammarAccess.getEQUAL_DIFFAccess().getEQUAL_DIFFLeftAction_1_0() ||
				   context == grammarAccess.getEXPRESSIONRule() ||
				   context == grammarAccess.getMULT_DIVRule() ||
				   context == grammarAccess.getMULT_DIVAccess().getDIVLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMULT_DIVAccess().getMULTLeftAction_1_0_0_0() ||
				   context == grammarAccess.getORRule() ||
				   context == grammarAccess.getORAccess().getORLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_Atomic(context, (VarExpRef) semanticObject); 
					return; 
				}
				else break;
			case ModuleDslPackage.BIT_CONSTANT:
				if(context == grammarAccess.getADD_SUBRule() ||
				   context == grammarAccess.getADD_SUBAccess().getADDLeftAction_1_0_0_0() ||
				   context == grammarAccess.getADD_SUBAccess().getSUBLeftAction_1_0_1_0() ||
				   context == grammarAccess.getANDRule() ||
				   context == grammarAccess.getANDAccess().getANDLeftAction_1_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getCOMPARISONRule() ||
				   context == grammarAccess.getCOMPARISONAccess().getCOMPARISONLeftAction_1_0() ||
				   context == grammarAccess.getEQUAL_DIFFRule() ||
				   context == grammarAccess.getEQUAL_DIFFAccess().getEQUAL_DIFFLeftAction_1_0() ||
				   context == grammarAccess.getEXPRESSIONRule() ||
				   context == grammarAccess.getMULT_DIVRule() ||
				   context == grammarAccess.getMULT_DIVAccess().getDIVLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMULT_DIVAccess().getMULTLeftAction_1_0_0_0() ||
				   context == grammarAccess.getORRule() ||
				   context == grammarAccess.getORAccess().getORLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_Atomic(context, (bitConstant) semanticObject); 
					return; 
				}
				else break;
			case ModuleDslPackage.BIT_LITERAL:
				if(context == grammarAccess.getLiteralRule()) {
					sequence_Literal(context, (bitLITERAL) semanticObject); 
					return; 
				}
				else break;
			case ModuleDslPackage.BOOL_CONSTANT:
				if(context == grammarAccess.getADD_SUBRule() ||
				   context == grammarAccess.getADD_SUBAccess().getADDLeftAction_1_0_0_0() ||
				   context == grammarAccess.getADD_SUBAccess().getSUBLeftAction_1_0_1_0() ||
				   context == grammarAccess.getANDRule() ||
				   context == grammarAccess.getANDAccess().getANDLeftAction_1_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getCOMPARISONRule() ||
				   context == grammarAccess.getCOMPARISONAccess().getCOMPARISONLeftAction_1_0() ||
				   context == grammarAccess.getEQUAL_DIFFRule() ||
				   context == grammarAccess.getEQUAL_DIFFAccess().getEQUAL_DIFFLeftAction_1_0() ||
				   context == grammarAccess.getEXPRESSIONRule() ||
				   context == grammarAccess.getMULT_DIVRule() ||
				   context == grammarAccess.getMULT_DIVAccess().getDIVLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMULT_DIVAccess().getMULTLeftAction_1_0_0_0() ||
				   context == grammarAccess.getORRule() ||
				   context == grammarAccess.getORAccess().getORLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_Atomic(context, (boolConstant) semanticObject); 
					return; 
				}
				else break;
			case ModuleDslPackage.BOOL_LITERAL:
				if(context == grammarAccess.getLiteralRule()) {
					sequence_Literal(context, (boolLITERAL) semanticObject); 
					return; 
				}
				else break;
			case ModuleDslPackage.ENUM_CONSTANT:
				if(context == grammarAccess.getADD_SUBRule() ||
				   context == grammarAccess.getADD_SUBAccess().getADDLeftAction_1_0_0_0() ||
				   context == grammarAccess.getADD_SUBAccess().getSUBLeftAction_1_0_1_0() ||
				   context == grammarAccess.getANDRule() ||
				   context == grammarAccess.getANDAccess().getANDLeftAction_1_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getCOMPARISONRule() ||
				   context == grammarAccess.getCOMPARISONAccess().getCOMPARISONLeftAction_1_0() ||
				   context == grammarAccess.getEQUAL_DIFFRule() ||
				   context == grammarAccess.getEQUAL_DIFFAccess().getEQUAL_DIFFLeftAction_1_0() ||
				   context == grammarAccess.getEXPRESSIONRule() ||
				   context == grammarAccess.getMULT_DIVRule() ||
				   context == grammarAccess.getMULT_DIVAccess().getDIVLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMULT_DIVAccess().getMULTLeftAction_1_0_0_0() ||
				   context == grammarAccess.getORRule() ||
				   context == grammarAccess.getORAccess().getORLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_Atomic(context, (enumConstant) semanticObject); 
					return; 
				}
				else break;
			case ModuleDslPackage.ENUM_LITERAL:
				if(context == grammarAccess.getLiteralRule()) {
					sequence_Literal(context, (enumLITERAL) semanticObject); 
					return; 
				}
				else break;
			case ModuleDslPackage.HEX_CONSTANT:
				if(context == grammarAccess.getADD_SUBRule() ||
				   context == grammarAccess.getADD_SUBAccess().getADDLeftAction_1_0_0_0() ||
				   context == grammarAccess.getADD_SUBAccess().getSUBLeftAction_1_0_1_0() ||
				   context == grammarAccess.getANDRule() ||
				   context == grammarAccess.getANDAccess().getANDLeftAction_1_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getCOMPARISONRule() ||
				   context == grammarAccess.getCOMPARISONAccess().getCOMPARISONLeftAction_1_0() ||
				   context == grammarAccess.getEQUAL_DIFFRule() ||
				   context == grammarAccess.getEQUAL_DIFFAccess().getEQUAL_DIFFLeftAction_1_0() ||
				   context == grammarAccess.getEXPRESSIONRule() ||
				   context == grammarAccess.getMULT_DIVRule() ||
				   context == grammarAccess.getMULT_DIVAccess().getDIVLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMULT_DIVAccess().getMULTLeftAction_1_0_0_0() ||
				   context == grammarAccess.getORRule() ||
				   context == grammarAccess.getORAccess().getORLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_Atomic(context, (hexConstant) semanticObject); 
					return; 
				}
				else break;
			case ModuleDslPackage.HEX_LITERAL:
				if(context == grammarAccess.getLiteralRule()) {
					sequence_Literal(context, (hexLITERAL) semanticObject); 
					return; 
				}
				else break;
			case ModuleDslPackage.IDENT_LITERAL:
				if(context == grammarAccess.getLiteralRule()) {
					sequence_Literal(context, (identLITERAL) semanticObject); 
					return; 
				}
				else break;
			case ModuleDslPackage.INT_CONSTANT:
				if(context == grammarAccess.getADD_SUBRule() ||
				   context == grammarAccess.getADD_SUBAccess().getADDLeftAction_1_0_0_0() ||
				   context == grammarAccess.getADD_SUBAccess().getSUBLeftAction_1_0_1_0() ||
				   context == grammarAccess.getANDRule() ||
				   context == grammarAccess.getANDAccess().getANDLeftAction_1_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getCOMPARISONRule() ||
				   context == grammarAccess.getCOMPARISONAccess().getCOMPARISONLeftAction_1_0() ||
				   context == grammarAccess.getEQUAL_DIFFRule() ||
				   context == grammarAccess.getEQUAL_DIFFAccess().getEQUAL_DIFFLeftAction_1_0() ||
				   context == grammarAccess.getEXPRESSIONRule() ||
				   context == grammarAccess.getMULT_DIVRule() ||
				   context == grammarAccess.getMULT_DIVAccess().getDIVLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMULT_DIVAccess().getMULTLeftAction_1_0_0_0() ||
				   context == grammarAccess.getORRule() ||
				   context == grammarAccess.getORAccess().getORLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_Atomic(context, (intConstant) semanticObject); 
					return; 
				}
				else break;
			case ModuleDslPackage.INT_LITERAL:
				if(context == grammarAccess.getLiteralRule()) {
					sequence_Literal(context, (intLITERAL) semanticObject); 
					return; 
				}
				else break;
			case ModuleDslPackage.REAL_CONSTANT:
				if(context == grammarAccess.getADD_SUBRule() ||
				   context == grammarAccess.getADD_SUBAccess().getADDLeftAction_1_0_0_0() ||
				   context == grammarAccess.getADD_SUBAccess().getSUBLeftAction_1_0_1_0() ||
				   context == grammarAccess.getANDRule() ||
				   context == grammarAccess.getANDAccess().getANDLeftAction_1_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getCOMPARISONRule() ||
				   context == grammarAccess.getCOMPARISONAccess().getCOMPARISONLeftAction_1_0() ||
				   context == grammarAccess.getEQUAL_DIFFRule() ||
				   context == grammarAccess.getEQUAL_DIFFAccess().getEQUAL_DIFFLeftAction_1_0() ||
				   context == grammarAccess.getEXPRESSIONRule() ||
				   context == grammarAccess.getMULT_DIVRule() ||
				   context == grammarAccess.getMULT_DIVAccess().getDIVLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMULT_DIVAccess().getMULTLeftAction_1_0_0_0() ||
				   context == grammarAccess.getORRule() ||
				   context == grammarAccess.getORAccess().getORLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_Atomic(context, (realConstant) semanticObject); 
					return; 
				}
				else break;
			case ModuleDslPackage.REAL_LITERAL:
				if(context == grammarAccess.getLiteralRule()) {
					sequence_Literal(context, (realLITERAL) semanticObject); 
					return; 
				}
				else break;
			case ModuleDslPackage.STR_CONSTANT:
				if(context == grammarAccess.getADD_SUBRule() ||
				   context == grammarAccess.getADD_SUBAccess().getADDLeftAction_1_0_0_0() ||
				   context == grammarAccess.getADD_SUBAccess().getSUBLeftAction_1_0_1_0() ||
				   context == grammarAccess.getANDRule() ||
				   context == grammarAccess.getANDAccess().getANDLeftAction_1_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getCOMPARISONRule() ||
				   context == grammarAccess.getCOMPARISONAccess().getCOMPARISONLeftAction_1_0() ||
				   context == grammarAccess.getEQUAL_DIFFRule() ||
				   context == grammarAccess.getEQUAL_DIFFAccess().getEQUAL_DIFFLeftAction_1_0() ||
				   context == grammarAccess.getEXPRESSIONRule() ||
				   context == grammarAccess.getMULT_DIVRule() ||
				   context == grammarAccess.getMULT_DIVAccess().getDIVLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMULT_DIVAccess().getMULTLeftAction_1_0_0_0() ||
				   context == grammarAccess.getORRule() ||
				   context == grammarAccess.getORAccess().getORLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_Atomic(context, (strConstant) semanticObject); 
					return; 
				}
				else break;
			case ModuleDslPackage.STR_LITERAL:
				if(context == grammarAccess.getLiteralRule()) {
					sequence_Literal(context, (strLITERAL) semanticObject); 
					return; 
				}
				else break;
			case ModuleDslPackage.UNKNOW_LITERAL:
				if(context == grammarAccess.getLiteralRule()) {
					sequence_Literal(context, (unknowLITERAL) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (left=ADD_SUB_ADD_1_0_0_0 right=MULT_DIV)
	 */
	protected void sequence_ADD_SUB(EObject context, ADD semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.ADD__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.ADD__LEFT));
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.ADD__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.ADD__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getADD_SUBAccess().getADDLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getADD_SUBAccess().getRightMULT_DIVParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ADD_SUB_SUB_1_0_1_0 right=MULT_DIV)
	 */
	protected void sequence_ADD_SUB(EObject context, SUB semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.SUB__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.SUB__LEFT));
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.SUB__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.SUB__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getADD_SUBAccess().getSUBLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getADD_SUBAccess().getRightMULT_DIVParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=AND_AND_1_0 right=EQUAL_DIFF)
	 */
	protected void sequence_AND(EObject context, AND semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.AND__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.AND__LEFT));
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.AND__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.AND__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getANDAccess().getANDLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getANDAccess().getRightEQUAL_DIFFParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (sa+=SINGLE_ASSIGN sa+=SINGLE_ASSIGN* end=END)
	 */
	protected void sequence_ASSIGN_INSTR(EObject context, ASSIGN_INSTR semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     vref=[VAR_CST|IDENT]
	 */
	protected void sequence_Atomic(EObject context, VarExpRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.VAR_EXP_REF__VREF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.VAR_EXP_REF__VREF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicAccess().getVrefVAR_CSTIDENTTerminalRuleCall_7_1_0_1(), semanticObject.getVref());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=BIT
	 */
	protected void sequence_Atomic(EObject context, bitConstant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.BIT_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.BIT_CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicAccess().getValueBITTerminalRuleCall_5_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=BOOLEAN
	 */
	protected void sequence_Atomic(EObject context, boolConstant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.BOOL_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.BOOL_CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicAccess().getValueBOOLEANTerminalRuleCall_4_1_0(), semanticObject.isValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=ENUM_ELEMENT
	 */
	protected void sequence_Atomic(EObject context, enumConstant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.ENUM_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.ENUM_CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicAccess().getValueENUM_ELEMENTTerminalRuleCall_3_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=HEX
	 */
	protected void sequence_Atomic(EObject context, hexConstant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.HEX_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.HEX_CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicAccess().getValueHEXTerminalRuleCall_6_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=INTEGER
	 */
	protected void sequence_Atomic(EObject context, intConstant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.INT_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.INT_CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicAccess().getValueINTEGERParserRuleCall_0_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=DECIMAL
	 */
	protected void sequence_Atomic(EObject context, realConstant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.REAL_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.REAL_CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicAccess().getValueDECIMALParserRuleCall_1_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_Atomic(EObject context, strConstant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.STR_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.STR_CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_2_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=COMPARISON_COMPARISON_1_0 (op='<' | op='<=' | op='>' | op='>=') right=ADD_SUB)
	 */
	protected void sequence_COMPARISON(EObject context, COMPARISON semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (crit='mcdc' | crit='dc' | crit='cc')
	 */
	protected void sequence_CRITERION(EObject context, CRITERION semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (crit=CRITERION end=END)
	 */
	protected void sequence_CRITERION_DECL(EObject context, CRITERION_DECL semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.CRITERION_DECL__CRIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.CRITERION_DECL__CRIT));
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.CRITERION_DECL__END) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.CRITERION_DECL__END));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCRITERION_DECLAccess().getCritCRITERIONParserRuleCall_4_0(), semanticObject.getCrit());
		feeder.accept(grammarAccess.getCRITERION_DECLAccess().getEndENDParserRuleCall_5_0(), semanticObject.getEnd());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (flow='cst' name=IDENT type=TYPE value=Literal end=END)
	 */
	protected void sequence_CST(EObject context, CST semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.VAR_CST__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.VAR_CST__NAME));
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.VAR_CST__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.VAR_CST__TYPE));
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.VAR_CST__END) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.VAR_CST__END));
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.CST__FLOW) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.CST__FLOW));
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.CST__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.CST__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCSTAccess().getFlowCstKeyword_1_0(), semanticObject.getFlow());
		feeder.accept(grammarAccess.getCSTAccess().getNameIDENTTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCSTAccess().getTypeTYPEParserRuleCall_4_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getCSTAccess().getValueLiteralParserRuleCall_6_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getCSTAccess().getEndENDParserRuleCall_8_0(), semanticObject.getEnd());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (sel='rand' | sel='eqv' | sel='bv')
	 */
	protected void sequence_DATASEL(EObject context, DATASEL semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (data1=DATASEL data2=DATASEL? end=END)
	 */
	protected void sequence_DATASEL_DECL(EObject context, DATASEL_DECL semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     end=';'
	 */
	protected void sequence_END(EObject context, END semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.END__END) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.END__END));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getENDAccess().getEndSemicolonKeyword_0(), semanticObject.getEnd());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=EQUAL_DIFF_EQUAL_DIFF_1_0 (op='==' | op='!=') right=COMPARISON)
	 */
	protected void sequence_EQUAL_DIFF(EObject context, EQUAL_DIFF semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     end=END
	 */
	protected void sequence_ERROR_INSTR(EObject context, ERROR_ASSIGN semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.ERROR_ASSIGN__END) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.ERROR_ASSIGN__END));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getERROR_INSTRAccess().getEndENDParserRuleCall_2_0(), semanticObject.getEnd());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (flow='in' | flow='out' | flow='inout' | flow='tmp')
	 */
	protected void sequence_Flow(EObject context, Flow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ifcond=EXPRESSION ifst=INSTRUCTION elst=INSTRUCTION)
	 */
	protected void sequence_IF_INSTR(EObject context, IF_INSTR semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.IF_INSTR__IFCOND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.IF_INSTR__IFCOND));
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.IF_INSTR__IFST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.IF_INSTR__IFST));
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.IF_INSTR__ELST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.IF_INSTR__ELST));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIF_INSTRAccess().getIfcondEXPRESSIONParserRuleCall_1_0(), semanticObject.getIfcond());
		feeder.accept(grammarAccess.getIF_INSTRAccess().getIfstINSTRUCTIONParserRuleCall_5_0(), semanticObject.getIfst());
		feeder.accept(grammarAccess.getIF_INSTRAccess().getElstINSTRUCTIONParserRuleCall_7_3_0(), semanticObject.getElst());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((lsqbr=']' | lsqbr='[') min=Literal max=Literal (rsqbr=']' | rsqbr='['))
	 */
	protected void sequence_INTERVAL(EObject context, INTERVAL semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     modules+=MODULE_DECL+
	 */
	protected void sequence_LANGUAGE(EObject context, LANGUAGE semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     val=INT
	 */
	protected void sequence_LOOP_INSTR(EObject context, LOOP_INSTR semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.LOOP_INSTR__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.LOOP_INSTR__VAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLOOP_INSTRAccess().getValINTTerminalRuleCall_2_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value+=Literal value+=Literal*)
	 */
	protected void sequence_LSET(EObject context, LSET semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=BIT
	 */
	protected void sequence_Literal(EObject context, bitLITERAL semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.BIT_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.BIT_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralAccess().getValueBITTerminalRuleCall_5_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=BOOLEAN
	 */
	protected void sequence_Literal(EObject context, boolLITERAL semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.BOOL_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.BOOL_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralAccess().getValueBOOLEANTerminalRuleCall_2_1_0(), semanticObject.isValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=ENUM_ELEMENT
	 */
	protected void sequence_Literal(EObject context, enumLITERAL semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.ENUM_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.ENUM_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralAccess().getValueENUM_ELEMENTTerminalRuleCall_4_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=HEX
	 */
	protected void sequence_Literal(EObject context, hexLITERAL semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.HEX_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.HEX_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralAccess().getValueHEXTerminalRuleCall_6_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=IDENT
	 */
	protected void sequence_Literal(EObject context, identLITERAL semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.IDENT_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.IDENT_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralAccess().getValueIDENTTerminalRuleCall_7_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=INTEGER
	 */
	protected void sequence_Literal(EObject context, intLITERAL semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.INT_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.INT_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralAccess().getValueINTEGERParserRuleCall_0_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=DECIMAL
	 */
	protected void sequence_Literal(EObject context, realLITERAL semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.REAL_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.REAL_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralAccess().getValueDECIMALParserRuleCall_1_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_Literal(EObject context, strLITERAL semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.STR_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.STR_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralAccess().getValueSTRINGTerminalRuleCall_3_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value='?'
	 */
	protected void sequence_Literal(EObject context, unknowLITERAL semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.UNKNOW_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.UNKNOW_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralAccess().getValueQuestionMarkKeyword_8_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=IDENT 
	 *         critdecl=CRITERION_DECL 
	 *         dataseldecl=DATASEL_DECL 
	 *         declaration+=VAR_CST* 
	 *         name=IDENT 
	 *         exp=EXPRESSION 
	 *         instr+=INSTRUCTION*
	 *     )
	 */
	protected void sequence_MODULE_DECL(EObject context, MODULE_DECL semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=MULT_DIV_DIV_1_0_1_0 right=PrimaryExpression)
	 */
	protected void sequence_MULT_DIV(EObject context, DIV semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.DIV__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.DIV__LEFT));
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.DIV__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.DIV__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMULT_DIVAccess().getDIVLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMULT_DIVAccess().getRightPrimaryExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=MULT_DIV_MULT_1_0_0_0 right=PrimaryExpression)
	 */
	protected void sequence_MULT_DIV(EObject context, MULT semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.MULT__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.MULT__LEFT));
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.MULT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.MULT__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMULT_DIVAccess().getMULTLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMULT_DIVAccess().getRightPrimaryExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     end=END
	 */
	protected void sequence_NULL_INSTR(EObject context, NULL_ASSIGN semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.NULL_ASSIGN__END) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.NULL_ASSIGN__END));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNULL_INSTRAccess().getEndENDParserRuleCall_2_0(), semanticObject.getEnd());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=OR_OR_1_0 right=AND)
	 */
	protected void sequence_OR(EObject context, OR semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.OR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.OR__LEFT));
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.OR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.OR__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getORAccess().getORLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getORAccess().getRightANDParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     exp=PrimaryExpression
	 */
	protected void sequence_PrimaryExpression(EObject context, NOT semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.NOT__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.NOT__EXP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getExpPrimaryExpressionParserRuleCall_1_2_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (var=[VAR_CST|IDENT] exp=EXPRESSION)
	 */
	protected void sequence_SINGLE_ASSIGN(EObject context, SINGLE_ASSIGN semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.SINGLE_ASSIGN__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.SINGLE_ASSIGN__VAR));
			if(transientValues.isValueTransient(semanticObject, ModuleDslPackage.Literals.SINGLE_ASSIGN__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModuleDslPackage.Literals.SINGLE_ASSIGN__EXP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSINGLE_ASSIGNAccess().getVarVAR_CSTIDENTTerminalRuleCall_0_0_1(), semanticObject.getVar());
		feeder.accept(grammarAccess.getSINGLE_ASSIGNAccess().getExpEXPRESSIONParserRuleCall_2_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         type='int' | 
	 *         type='real' | 
	 *         type='bool' | 
	 *         type='enum' | 
	 *         type='bit' | 
	 *         type='hex' | 
	 *         type='str'
	 *     )
	 */
	protected void sequence_TYPE(EObject context, TYPE semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (flow=Flow name=IDENT type=TYPE range=RANGE? end=END)
	 */
	protected void sequence_VAR(EObject context, VAR semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
