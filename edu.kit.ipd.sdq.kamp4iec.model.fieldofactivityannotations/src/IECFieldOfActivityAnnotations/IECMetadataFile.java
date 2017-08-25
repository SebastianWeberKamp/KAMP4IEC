/**
 */
package IECFieldOfActivityAnnotations;

import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IEC Metadata File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link IECFieldOfActivityAnnotations.IECMetadataFile#getParent <em>Parent</em>}</li>
 *   <li>{@link IECFieldOfActivityAnnotations.IECMetadataFile#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsPackage#getIECMetadataFile()
 * @model
 * @generated
 */
public interface IECMetadataFile extends IECFile {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link IECFieldOfActivityAnnotations.IECDevelopmentArtefactSpecification#getMetadataFiles <em>Metadata Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(IECDevelopmentArtefactSpecification)
	 * @see IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsPackage#getIECMetadataFile_Parent()
	 * @see IECFieldOfActivityAnnotations.IECDevelopmentArtefactSpecification#getMetadataFiles
	 * @model opposite="metadataFiles" required="true" transient="false"
	 * @generated
	 */
	IECDevelopmentArtefactSpecification getParent();

	/**
	 * Sets the value of the '{@link IECFieldOfActivityAnnotations.IECMetadataFile#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(IECDevelopmentArtefactSpecification value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(IECComponent)
	 * @see IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsPackage#getIECMetadataFile_Component()
	 * @model
	 * @generated
	 */
	IECComponent getComponent();

	/**
	 * Sets the value of the '{@link IECFieldOfActivityAnnotations.IECMetadataFile#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(IECComponent value);

} // IECMetadataFile
