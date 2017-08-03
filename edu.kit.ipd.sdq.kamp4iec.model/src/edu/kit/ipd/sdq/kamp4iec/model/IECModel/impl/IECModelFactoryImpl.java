/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl;

import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Configuration;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Function;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.FunctionBlock;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.GlobalVariable;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECInterface;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECMethod;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECMethodImplementation;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelFactory;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECProperty;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECPropertyImplementation;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Interfaces;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IECModelFactoryImpl extends EFactoryImpl implements IECModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IECModelFactory init() {
		try {
			IECModelFactory theIECModelFactory = (IECModelFactory)EPackage.Registry.INSTANCE.getEFactory(IECModelPackage.eNS_URI);
			if (theIECModelFactory != null) {
				return theIECModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IECModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IECModelPackage.FUNCTION_BLOCK: return createFunctionBlock();
			case IECModelPackage.FUNCTION: return createFunction();
			case IECModelPackage.PROGRAM: return createProgram();
			case IECModelPackage.CONFIGURATION: return createConfiguration();
			case IECModelPackage.IEC_INTERFACE: return createIECInterface();
			case IECModelPackage.GLOBAL_VARIABLE: return createGlobalVariable();
			case IECModelPackage.IEC_METHOD_IMPLEMENTATION: return createIECMethodImplementation();
			case IECModelPackage.IEC_PROPERTY_IMPLEMENTATION: return createIECPropertyImplementation();
			case IECModelPackage.ENUM: return createEnum();
			case IECModelPackage.IEC_PROPERTY: return createIECProperty();
			case IECModelPackage.IEC_METHOD: return createIECMethod();
			case IECModelPackage.INTERFACES: return createInterfaces();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBlock createFunctionBlock() {
		FunctionBlockImpl functionBlock = new FunctionBlockImpl();
		return functionBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program createProgram() {
		ProgramImpl program = new ProgramImpl();
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECInterface createIECInterface() {
		IECInterfaceImpl iecInterface = new IECInterfaceImpl();
		return iecInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariable createGlobalVariable() {
		GlobalVariableImpl globalVariable = new GlobalVariableImpl();
		return globalVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECMethodImplementation createIECMethodImplementation() {
		IECMethodImplementationImpl iecMethodImplementation = new IECMethodImplementationImpl();
		return iecMethodImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECPropertyImplementation createIECPropertyImplementation() {
		IECPropertyImplementationImpl iecPropertyImplementation = new IECPropertyImplementationImpl();
		return iecPropertyImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public edu.kit.ipd.sdq.kamp4iec.model.IECModel.Enum createEnum() {
		EnumImpl enum_ = new EnumImpl();
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECProperty createIECProperty() {
		IECPropertyImpl iecProperty = new IECPropertyImpl();
		return iecProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECMethod createIECMethod() {
		IECMethodImpl iecMethod = new IECMethodImpl();
		return iecMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interfaces createInterfaces() {
		InterfacesImpl interfaces = new InterfacesImpl();
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECModelPackage getIECModelPackage() {
		return (IECModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IECModelPackage getPackage() {
		return IECModelPackage.eINSTANCE;
	}

} //IECModelFactoryImpl
