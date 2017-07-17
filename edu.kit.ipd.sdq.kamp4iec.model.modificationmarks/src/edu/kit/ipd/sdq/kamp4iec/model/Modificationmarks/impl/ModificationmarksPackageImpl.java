/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.impl;

import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage;

import edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.AbstractKAMP4IECModificationRepository;
import edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.ChangePropagationDueToDataDependency;
import edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.KAMP4IECModificationRepository;
import edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.KAMP4IECSeedModifications;
import edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.ModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.ModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.ModifyElement;
import edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.ModifyFunctionBlock;
import edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.ModifyGlobalVariable;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModificationmarksPackageImpl extends EPackageImpl implements ModificationmarksPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractKAMP4IECModificationRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kamp4IECModificationRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kamp4IECSeedModificationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changePropagationDueToDataDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyGlobalVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyFunctionBlockEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.ModificationmarksPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModificationmarksPackageImpl() {
		super(eNS_URI, ModificationmarksFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModificationmarksPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModificationmarksPackage init() {
		if (isInited) return (ModificationmarksPackage)EPackage.Registry.INSTANCE.getEPackage(ModificationmarksPackage.eNS_URI);

		// Obtain or create and register package
		ModificationmarksPackageImpl theModificationmarksPackage = (ModificationmarksPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModificationmarksPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModificationmarksPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		IECModelPackage.eINSTANCE.eClass();
		edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theModificationmarksPackage.createPackageContents();

		// Initialize created meta-data
		theModificationmarksPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModificationmarksPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModificationmarksPackage.eNS_URI, theModificationmarksPackage);
		return theModificationmarksPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractKAMP4IECModificationRepository() {
		return abstractKAMP4IECModificationRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKAMP4IECModificationRepository() {
		return kamp4IECModificationRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKAMP4IECSeedModifications() {
		return kamp4IECSeedModificationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKAMP4IECSeedModifications_GlobalVariableModifications() {
		return (EReference)kamp4IECSeedModificationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKAMP4IECSeedModifications_FunctionblockModifications() {
		return (EReference)kamp4IECSeedModificationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangePropagationDueToDataDependency() {
		return changePropagationDueToDataDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangePropagationDueToDataDependency_FunctionBlockModifications() {
		return (EReference)changePropagationDueToDataDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangePropagationDueToDataDependency_GlobalVariableModifications() {
		return (EReference)changePropagationDueToDataDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyElement() {
		return modifyElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyGlobalVariable() {
		return modifyGlobalVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyFunctionBlock() {
		return modifyFunctionBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModificationmarksFactory getModificationmarksFactory() {
		return (ModificationmarksFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abstractKAMP4IECModificationRepositoryEClass = createEClass(ABSTRACT_KAMP4IEC_MODIFICATION_REPOSITORY);

		kamp4IECModificationRepositoryEClass = createEClass(KAMP4IEC_MODIFICATION_REPOSITORY);

		kamp4IECSeedModificationsEClass = createEClass(KAMP4IEC_SEED_MODIFICATIONS);
		createEReference(kamp4IECSeedModificationsEClass, KAMP4IEC_SEED_MODIFICATIONS__GLOBAL_VARIABLE_MODIFICATIONS);
		createEReference(kamp4IECSeedModificationsEClass, KAMP4IEC_SEED_MODIFICATIONS__FUNCTIONBLOCK_MODIFICATIONS);

		changePropagationDueToDataDependencyEClass = createEClass(CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY);
		createEReference(changePropagationDueToDataDependencyEClass, CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__FUNCTION_BLOCK_MODIFICATIONS);
		createEReference(changePropagationDueToDataDependencyEClass, CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY__GLOBAL_VARIABLE_MODIFICATIONS);

		modifyElementEClass = createEClass(MODIFY_ELEMENT);

		modifyGlobalVariableEClass = createEClass(MODIFY_GLOBAL_VARIABLE);

		modifyFunctionBlockEClass = createEClass(MODIFY_FUNCTION_BLOCK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage theModificationmarksPackage_1 = (edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage)EPackage.Registry.INSTANCE.getEPackage(edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage.eNS_URI);
		IECModelPackage theIECModelPackage = (IECModelPackage)EPackage.Registry.INSTANCE.getEPackage(IECModelPackage.eNS_URI);

		// Create type parameters
		ETypeParameter abstractKAMP4IECModificationRepositoryEClass_T = addETypeParameter(abstractKAMP4IECModificationRepositoryEClass, "T");
		ETypeParameter modifyElementEClass_T = addETypeParameter(modifyElementEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getKAMP4IECSeedModifications());
		abstractKAMP4IECModificationRepositoryEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theIECModelPackage.getIECComponent());
		modifyElementEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(theModificationmarksPackage_1.getAbstractModificationRepository());
		EGenericType g2 = createEGenericType(abstractKAMP4IECModificationRepositoryEClass_T);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theModificationmarksPackage_1.getChangePropagationStep());
		g1.getETypeArguments().add(g2);
		abstractKAMP4IECModificationRepositoryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAbstractKAMP4IECModificationRepository());
		g2 = createEGenericType(this.getKAMP4IECSeedModifications());
		g1.getETypeArguments().add(g2);
		kamp4IECModificationRepositoryEClass.getEGenericSuperTypes().add(g1);
		kamp4IECSeedModificationsEClass.getESuperTypes().add(theModificationmarksPackage_1.getAbstractSeedModifications());
		changePropagationDueToDataDependencyEClass.getESuperTypes().add(theModificationmarksPackage_1.getChangePropagationStep());
		g1 = createEGenericType(theModificationmarksPackage_1.getAbstractModification());
		g2 = createEGenericType(modifyElementEClass_T);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEObject());
		g1.getETypeArguments().add(g2);
		modifyElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getModifyElement());
		g2 = createEGenericType(theIECModelPackage.getGlobalVariable());
		g1.getETypeArguments().add(g2);
		modifyGlobalVariableEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getModifyElement());
		g2 = createEGenericType(theIECModelPackage.getFunctionBlock());
		g1.getETypeArguments().add(g2);
		modifyFunctionBlockEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractKAMP4IECModificationRepositoryEClass, AbstractKAMP4IECModificationRepository.class, "AbstractKAMP4IECModificationRepository", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(kamp4IECModificationRepositoryEClass, KAMP4IECModificationRepository.class, "KAMP4IECModificationRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(kamp4IECSeedModificationsEClass, KAMP4IECSeedModifications.class, "KAMP4IECSeedModifications", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKAMP4IECSeedModifications_GlobalVariableModifications(), this.getModifyGlobalVariable(), null, "globalVariableModifications", null, 0, -1, KAMP4IECSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKAMP4IECSeedModifications_FunctionblockModifications(), this.getModifyFunctionBlock(), null, "functionblockModifications", null, 0, -1, KAMP4IECSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changePropagationDueToDataDependencyEClass, ChangePropagationDueToDataDependency.class, "ChangePropagationDueToDataDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChangePropagationDueToDataDependency_FunctionBlockModifications(), this.getModifyFunctionBlock(), null, "functionBlockModifications", null, 0, -1, ChangePropagationDueToDataDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangePropagationDueToDataDependency_GlobalVariableModifications(), this.getModifyGlobalVariable(), null, "globalVariableModifications", null, 0, -1, ChangePropagationDueToDataDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modifyElementEClass, ModifyElement.class, "ModifyElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modifyGlobalVariableEClass, ModifyGlobalVariable.class, "ModifyGlobalVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modifyFunctionBlockEClass, ModifyFunctionBlock.class, "ModifyFunctionBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ModificationmarksPackageImpl
