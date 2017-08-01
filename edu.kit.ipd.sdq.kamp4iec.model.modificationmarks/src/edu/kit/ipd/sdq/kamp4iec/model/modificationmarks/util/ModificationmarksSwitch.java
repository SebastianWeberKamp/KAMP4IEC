/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.util;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractChangePropagationStep;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractSeedModifications;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;

import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECComponent;

import edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.ModificationmarksPackage
 * @generated
 */
public class ModificationmarksSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModificationmarksPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModificationmarksSwitch() {
		if (modelPackage == null) {
			modelPackage = ModificationmarksPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ModificationmarksPackage.ABSTRACT_KAMP4IEC_MODIFICATION_REPOSITORY: {
				AbstractKAMP4IECModificationRepository<?> abstractKAMP4IECModificationRepository = (AbstractKAMP4IECModificationRepository<?>)theEObject;
				T1 result = caseAbstractKAMP4IECModificationRepository(abstractKAMP4IECModificationRepository);
				if (result == null) result = caseAbstractModificationRepository(abstractKAMP4IECModificationRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModificationmarksPackage.IEC_MODIFICATION_REPOSITORY: {
				IECModificationRepository iecModificationRepository = (IECModificationRepository)theEObject;
				T1 result = caseIECModificationRepository(iecModificationRepository);
				if (result == null) result = caseAbstractKAMP4IECModificationRepository(iecModificationRepository);
				if (result == null) result = caseAbstractModificationRepository(iecModificationRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS: {
				IECSeedModifications iecSeedModifications = (IECSeedModifications)theEObject;
				T1 result = caseIECSeedModifications(iecSeedModifications);
				if (result == null) result = caseAbstractSeedModifications(iecSeedModifications);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY: {
				IECChangePropagationDueToDataDependency iecChangePropagationDueToDataDependency = (IECChangePropagationDueToDataDependency)theEObject;
				T1 result = caseIECChangePropagationDueToDataDependency(iecChangePropagationDueToDataDependency);
				if (result == null) result = caseChangePropagationStep(iecChangePropagationDueToDataDependency);
				if (result == null) result = caseAbstractChangePropagationStep(iecChangePropagationDueToDataDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModificationmarksPackage.IEC_MODIFY_ELEMENT: {
				IECModifyElement<?> iecModifyElement = (IECModifyElement<?>)theEObject;
				T1 result = caseIECModifyElement(iecModifyElement);
				if (result == null) result = caseAbstractModification(iecModifyElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModificationmarksPackage.IEC_MODIFY_GLOBAL_VARIABLE: {
				IECModifyGlobalVariable iecModifyGlobalVariable = (IECModifyGlobalVariable)theEObject;
				T1 result = caseIECModifyGlobalVariable(iecModifyGlobalVariable);
				if (result == null) result = caseIECModifyElement(iecModifyGlobalVariable);
				if (result == null) result = caseAbstractModification(iecModifyGlobalVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModificationmarksPackage.IEC_MODIFY_FUNCTION_BLOCK: {
				IECModifyFunctionBlock iecModifyFunctionBlock = (IECModifyFunctionBlock)theEObject;
				T1 result = caseIECModifyFunctionBlock(iecModifyFunctionBlock);
				if (result == null) result = caseIECModifyElement(iecModifyFunctionBlock);
				if (result == null) result = caseAbstractModification(iecModifyFunctionBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract KAMP4IEC Modification Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract KAMP4IEC Modification Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends IECSeedModifications> T1 caseAbstractKAMP4IECModificationRepository(AbstractKAMP4IECModificationRepository<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Modification Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Modification Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIECModificationRepository(IECModificationRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Seed Modifications</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Seed Modifications</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIECSeedModifications(IECSeedModifications object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Change Propagation Due To Data Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Change Propagation Due To Data Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIECChangePropagationDueToDataDependency(IECChangePropagationDueToDataDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Modify Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Modify Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends IECComponent> T1 caseIECModifyElement(IECModifyElement<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Modify Global Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Modify Global Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIECModifyGlobalVariable(IECModifyGlobalVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Modify Function Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Modify Function Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIECModifyFunctionBlock(IECModifyFunctionBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Modification Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Modification Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <S extends AbstractSeedModifications, T extends AbstractChangePropagationStep> T1 caseAbstractModificationRepository(AbstractModificationRepository<S, T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Seed Modifications</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Seed Modifications</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAbstractSeedModifications(AbstractSeedModifications object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Change Propagation Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Change Propagation Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAbstractChangePropagationStep(AbstractChangePropagationStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Propagation Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Propagation Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseChangePropagationStep(ChangePropagationStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Modification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Modification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <S, T> T1 caseAbstractModification(AbstractModification<S, T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //ModificationmarksSwitch
