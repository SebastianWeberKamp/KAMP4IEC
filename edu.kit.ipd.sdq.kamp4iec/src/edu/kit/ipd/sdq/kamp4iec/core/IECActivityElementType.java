package edu.kit.ipd.sdq.kamp4iec.core;

import edu.kit.ipd.sdq.kamp.workplan.AbstractActivityElementType;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECDeploymentSpecification;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECMetadataFile;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECSourceFile;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECTestCase;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Configuration;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Function;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.FunctionBlock;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.GlobalVariable;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECInterface;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECMethodImplementation;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECPropertyImplementation;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program;;

public enum IECActivityElementType implements AbstractActivityElementType {
	//IEC-related
	FUNCTIONBLOCK(FunctionBlock.class),
	GLOBALVARIABLE(GlobalVariable.class),
	CONFIGURATION(Configuration.class),
	PROGRAM(Program.class),
	FUNCTION(Function.class),
	INTERFACE(IECInterface.class),
	PROPERTY(IECPropertyImplementation.class),
	METHOD(IECMethodImplementation.class),
	ENUM(edu.kit.ipd.sdq.kamp4iec.model.IECModel.Enum.class),
	// annotation-related
	SOURCECODEFILES(IECSourceFile.class),
	METADATAFILES(IECMetadataFile.class),
	TESTCASE(IECTestCase.class), 
	DEPLOYMENTCONFIGURATION(IECDeploymentSpecification.class);
	private final Class<?> clazz;
	private final String name;
	
	private IECActivityElementType(Class<?> clazz) {
		this.clazz = clazz;
		this.name = clazz.getSimpleName();
	}

	@Override
	public Class<?> getElementClass() {
		return clazz;
	}
	
	@Override
	public String getName() {
		return name;
	}

	public static IECActivityElementType[] getTopLevelArchitectureActivityElementTypes() {	
		return new IECActivityElementType[]{GLOBALVARIABLE, FUNCTIONBLOCK, CONFIGURATION, PROGRAM, FUNCTION, INTERFACE, PROPERTY, METHOD, ENUM};
	}

}
