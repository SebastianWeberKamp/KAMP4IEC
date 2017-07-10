/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.util;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractChangePropagationStep;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractSeedModifications;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;

import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Element;

import edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.*;

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
 * @see edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.ModificationmarksPackage
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
			case ModificationmarksPackage.KAMP4IEC_MODIFICATION_REPOSITORY: {
				KAMP4IECModificationRepository kamp4IECModificationRepository = (KAMP4IECModificationRepository)theEObject;
				T1 result = caseKAMP4IECModificationRepository(kamp4IECModificationRepository);
				if (result == null) result = caseAbstractKAMP4IECModificationRepository(kamp4IECModificationRepository);
				if (result == null) result = caseAbstractModificationRepository(kamp4IECModificationRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModificationmarksPackage.KAMP4IEC_SEED_MODIFICATIONS: {
				KAMP4IECSeedModifications kamp4IECSeedModifications = (KAMP4IECSeedModifications)theEObject;
				T1 result = caseKAMP4IECSeedModifications(kamp4IECSeedModifications);
				if (result == null) result = caseAbstractSeedModifications(kamp4IECSeedModifications);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModificationmarksPackage.CHANGE_PROPAGATION_DUE_TO_DATA_DEPLOY: {
				ChangePropagationDueToDataDeploy changePropagationDueToDataDeploy = (ChangePropagationDueToDataDeploy)theEObject;
				T1 result = caseChangePropagationDueToDataDeploy(changePropagationDueToDataDeploy);
				if (result == null) result = caseChangePropagationStep(changePropagationDueToDataDeploy);
				if (result == null) result = caseAbstractChangePropagationStep(changePropagationDueToDataDeploy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModificationmarksPackage.MODIFY_ELEMENT: {
				ModifyElement<?> modifyElement = (ModifyElement<?>)theEObject;
				T1 result = caseModifyElement(modifyElement);
				if (result == null) result = caseAbstractModification(modifyElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModificationmarksPackage.MODIFY_GLOBAL_VARIABLE: {
				ModifyGlobalVariable modifyGlobalVariable = (ModifyGlobalVariable)theEObject;
				T1 result = caseModifyGlobalVariable(modifyGlobalVariable);
				if (result == null) result = caseModifyElement(modifyGlobalVariable);
				if (result == null) result = caseAbstractModification(modifyGlobalVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModificationmarksPackage.MODIFY_FUNCTION_BLOCK: {
				ModifyFunctionBlock modifyFunctionBlock = (ModifyFunctionBlock)theEObject;
				T1 result = caseModifyFunctionBlock(modifyFunctionBlock);
				if (result == null) result = caseModifyElement(modifyFunctionBlock);
				if (result == null) result = caseAbstractModification(modifyFunctionBlock);
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
	public <T extends KAMP4IECSeedModifications> T1 caseAbstractKAMP4IECModificationRepository(AbstractKAMP4IECModificationRepository<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KAMP4IEC Modification Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KAMP4IEC Modification Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseKAMP4IECModificationRepository(KAMP4IECModificationRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KAMP4IEC Seed Modifications</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KAMP4IEC Seed Modifications</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseKAMP4IECSeedModifications(KAMP4IECSeedModifications object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Propagation Due To Data Deploy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Propagation Due To Data Deploy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseChangePropagationDueToDataDeploy(ChangePropagationDueToDataDeploy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Element> T1 caseModifyElement(ModifyElement<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Global Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Global Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseModifyGlobalVariable(ModifyGlobalVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Function Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Function Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseModifyFunctionBlock(ModifyFunctionBlock object) {
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
