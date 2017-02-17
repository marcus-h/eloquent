/*
 * generated by Xtext 2.11.0
 */
package de.fraunhofer.iem.serializer;

import com.google.inject.Inject;
import de.fraunhofer.iem.seminar.Assignment;
import de.fraunhofer.iem.seminar.Preference;
import de.fraunhofer.iem.seminar.Seminar;
import de.fraunhofer.iem.seminar.SeminarPackage;
import de.fraunhofer.iem.seminar.Student;
import de.fraunhofer.iem.seminar.Supervise;
import de.fraunhofer.iem.seminar.Supervisor;
import de.fraunhofer.iem.seminar.Topic;
import de.fraunhofer.iem.services.SeminarGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class SeminarSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SeminarGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SeminarPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SeminarPackage.ASSIGNMENT:
				sequence_Assignment(context, (Assignment) semanticObject); 
				return; 
			case SeminarPackage.PREFERENCE:
				sequence_Preference(context, (Preference) semanticObject); 
				return; 
			case SeminarPackage.SEMINAR:
				sequence_Seminar(context, (Seminar) semanticObject); 
				return; 
			case SeminarPackage.STUDENT:
				sequence_Student(context, (Student) semanticObject); 
				return; 
			case SeminarPackage.SUPERVISE:
				sequence_Supervise(context, (Supervise) semanticObject); 
				return; 
			case SeminarPackage.SUPERVISOR:
				sequence_Supervisor(context, (Supervisor) semanticObject); 
				return; 
			case SeminarPackage.TOPIC:
				sequence_Topic(context, (Topic) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Assignment returns Assignment
	 *
	 * Constraint:
	 *     (student=[Student|ID] topic=[Topic|ID])
	 */
	protected void sequence_Assignment(ISerializationContext context, Assignment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SeminarPackage.Literals.ASSIGNMENT__STUDENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SeminarPackage.Literals.ASSIGNMENT__STUDENT));
			if (transientValues.isValueTransient(semanticObject, SeminarPackage.Literals.ASSIGNMENT__TOPIC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SeminarPackage.Literals.ASSIGNMENT__TOPIC));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAssignmentAccess().getStudentStudentIDTerminalRuleCall_0_0_1(), semanticObject.eGet(SeminarPackage.Literals.ASSIGNMENT__STUDENT, false));
		feeder.accept(grammarAccess.getAssignmentAccess().getTopicTopicIDTerminalRuleCall_4_0_1(), semanticObject.eGet(SeminarPackage.Literals.ASSIGNMENT__TOPIC, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Preference returns Preference
	 *
	 * Constraint:
	 *     (student=[Student|ID] topic=[Topic|ID])
	 */
	protected void sequence_Preference(ISerializationContext context, Preference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SeminarPackage.Literals.PREFERENCE__STUDENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SeminarPackage.Literals.PREFERENCE__STUDENT));
			if (transientValues.isValueTransient(semanticObject, SeminarPackage.Literals.PREFERENCE__TOPIC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SeminarPackage.Literals.PREFERENCE__TOPIC));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPreferenceAccess().getStudentStudentIDTerminalRuleCall_0_0_1(), semanticObject.eGet(SeminarPackage.Literals.PREFERENCE__STUDENT, false));
		feeder.accept(grammarAccess.getPreferenceAccess().getTopicTopicIDTerminalRuleCall_2_0_1(), semanticObject.eGet(SeminarPackage.Literals.PREFERENCE__TOPIC, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Seminar returns Seminar
	 *
	 * Constraint:
	 *     (
	 *         supervisors+=Supervisor? 
	 *         (supervisors+=Supervisor? supervisors+=Supervisor?)* 
	 *         students+=Student? 
	 *         (students+=Student? students+=Student?)* 
	 *         (topics+=Topic | topics+=Topic)* 
	 *         preferences+=Preference* 
	 *         supervises+=Supervise* 
	 *         assignments+=Assignment*
	 *     )
	 */
	protected void sequence_Seminar(ISerializationContext context, Seminar semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Student returns Student
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Student(ISerializationContext context, Student semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SeminarPackage.Literals.STUDENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SeminarPackage.Literals.STUDENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStudentAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Supervise returns Supervise
	 *
	 * Constraint:
	 *     (supervisor=[Supervisor|ID] topic=[Topic|ID])
	 */
	protected void sequence_Supervise(ISerializationContext context, Supervise semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SeminarPackage.Literals.SUPERVISE__SUPERVISOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SeminarPackage.Literals.SUPERVISE__SUPERVISOR));
			if (transientValues.isValueTransient(semanticObject, SeminarPackage.Literals.SUPERVISE__TOPIC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SeminarPackage.Literals.SUPERVISE__TOPIC));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSuperviseAccess().getSupervisorSupervisorIDTerminalRuleCall_0_0_1(), semanticObject.eGet(SeminarPackage.Literals.SUPERVISE__SUPERVISOR, false));
		feeder.accept(grammarAccess.getSuperviseAccess().getTopicTopicIDTerminalRuleCall_2_0_1(), semanticObject.eGet(SeminarPackage.Literals.SUPERVISE__TOPIC, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Supervisor returns Supervisor
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Supervisor(ISerializationContext context, Supervisor semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SeminarPackage.Literals.SUPERVISOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SeminarPackage.Literals.SUPERVISOR__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSupervisorAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Topic returns Topic
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Topic(ISerializationContext context, Topic semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SeminarPackage.Literals.TOPIC__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SeminarPackage.Literals.TOPIC__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTopicAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
