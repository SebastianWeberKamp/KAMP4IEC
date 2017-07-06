/**
 */
package Modifikationmarks.util;

import Modifikationmarks.*;

import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Element;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Modifikationmarks.ModifikationmarksPackage
 * @generated
 */
public class ModifikationmarksAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModifikationmarksPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifikationmarksAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModifikationmarksPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifikationmarksSwitch<Adapter> modelSwitch =
		new ModifikationmarksSwitch<Adapter>() {
			@Override
			public <T extends KAMP4IECSeedModifications> Adapter caseAbstractKAMP4IECModificationRepository(AbstractKAMP4IECModificationRepository<T> object) {
				return createAbstractKAMP4IECModificationRepositoryAdapter();
			}
			@Override
			public Adapter caseKAMP4IECModificationRepository(KAMP4IECModificationRepository object) {
				return createKAMP4IECModificationRepositoryAdapter();
			}
			@Override
			public Adapter caseKAMP4IECSeedModifications(KAMP4IECSeedModifications object) {
				return createKAMP4IECSeedModificationsAdapter();
			}
			@Override
			public Adapter caseChangePropagationDueToDataDeploy(ChangePropagationDueToDataDeploy object) {
				return createChangePropagationDueToDataDeployAdapter();
			}
			@Override
			public <T extends Element> Adapter caseModifyElement(ModifyElement<T> object) {
				return createModifyElementAdapter();
			}
			@Override
			public Adapter caseModifyGlobalVariable(ModifyGlobalVariable object) {
				return createModifyGlobalVariableAdapter();
			}
			@Override
			public Adapter caseModifyFunctionBlock(ModifyFunctionBlock object) {
				return createModifyFunctionBlockAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Modifikationmarks.AbstractKAMP4IECModificationRepository <em>Abstract KAMP4IEC Modification Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modifikationmarks.AbstractKAMP4IECModificationRepository
	 * @generated
	 */
	public Adapter createAbstractKAMP4IECModificationRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modifikationmarks.KAMP4IECModificationRepository <em>KAMP4IEC Modification Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modifikationmarks.KAMP4IECModificationRepository
	 * @generated
	 */
	public Adapter createKAMP4IECModificationRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modifikationmarks.KAMP4IECSeedModifications <em>KAMP4IEC Seed Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modifikationmarks.KAMP4IECSeedModifications
	 * @generated
	 */
	public Adapter createKAMP4IECSeedModificationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modifikationmarks.ChangePropagationDueToDataDeploy <em>Change Propagation Due To Data Deploy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modifikationmarks.ChangePropagationDueToDataDeploy
	 * @generated
	 */
	public Adapter createChangePropagationDueToDataDeployAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modifikationmarks.ModifyElement <em>Modify Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modifikationmarks.ModifyElement
	 * @generated
	 */
	public Adapter createModifyElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modifikationmarks.ModifyGlobalVariable <em>Modify Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modifikationmarks.ModifyGlobalVariable
	 * @generated
	 */
	public Adapter createModifyGlobalVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modifikationmarks.ModifyFunctionBlock <em>Modify Function Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modifikationmarks.ModifyFunctionBlock
	 * @generated
	 */
	public Adapter createModifyFunctionBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ModifikationmarksAdapterFactory