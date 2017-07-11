package edu.kit.ipd.sdq.kamp4iec.core;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import edu.kit.ipd.sdq.kamp.util.MapUtil;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.FunctionBlock;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.GlobalVariable;

public class ArchitectureModelLookup {
	/**
	 * Recursive lookup of Composite- and CollectionDataTypes containing certain
	 * DataTypes. Duplicates are eliminated.
	 */
	public static Map<FunctionBlock, Set<GlobalVariable>> lookUpFunctionBlocksOfGlobalVariable(
			ArchitectureVersion version, Collection<GlobalVariable> globalVariables) {
		Map<FunctionBlock, Set<GlobalVariable>> results = new HashMap<FunctionBlock, Set<GlobalVariable>>();
		
		for (FunctionBlock functionBlock: version.getSPSSystem().getContainsProgram().getCallsFunctionBlock()) {
			if (functionBlock.getAccessesGlobalVariable().contains(globalVariables)) {
				MapUtil.putOrAddToMap(results, functionBlock, globalVariables);
			}
		}
		return results;
	}
}
