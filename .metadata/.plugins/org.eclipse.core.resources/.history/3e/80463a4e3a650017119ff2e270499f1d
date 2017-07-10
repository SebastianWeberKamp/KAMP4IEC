package edu.kit.ipd.sdq.kamp4iec.core;

import edu.kit.ipd.sdq.kamp.propagation.AbstractChangePropagationAnalysis;
import edu.kit.ipd.sdq.kamp4iec.model.Modificationmarks.ChangePropagationDueToDataDeploy;

/**
 * Abstract super class, parameterized to enable covariant attributes for
 * different kinds of propagation algorithms. Its also defines some sub-routines
 * of the propagation algorithm, but not the algorithm itself.
 * 
 * @param S
 *            The type of the architecture version.
 * @param T
 *            The type of the ChangePropagationDueToDataDependencies object.
 */
public abstract class AbstractKAMP4IECChangePropagationAnalysis<S extends ArchitectureVersion, T extends ChangePropagationDueToDataDeploy>
		implements AbstractChangePropagationAnalysis<S> {

	private T changePropagationDueToDataDeploy;

}