/**
 */
package IECFieldOfActivityAnnotations.impl;

import IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsPackage;
import IECFieldOfActivityAnnotations.IECFileAggregation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IEC File Aggregation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link IECFieldOfActivityAnnotations.impl.IECFileAggregationImpl#getNumberOfFiles <em>Number Of Files</em>}</li>
 *   <li>{@link IECFieldOfActivityAnnotations.impl.IECFileAggregationImpl#getTechnology <em>Technology</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class IECFileAggregationImpl extends MinimalEObjectImpl.Container implements IECFileAggregation {
	/**
	 * The default value of the '{@link #getNumberOfFiles() <em>Number Of Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfFiles()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_FILES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfFiles() <em>Number Of Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfFiles()
	 * @generated
	 * @ordered
	 */
	protected int numberOfFiles = NUMBER_OF_FILES_EDEFAULT;

	/**
	 * The default value of the '{@link #getTechnology() <em>Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnology()
	 * @generated
	 * @ordered
	 */
	protected static final String TECHNOLOGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTechnology() <em>Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnology()
	 * @generated
	 * @ordered
	 */
	protected String technology = TECHNOLOGY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IECFileAggregationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IECFieldOfActivityAnnotationsPackage.Literals.IEC_FILE_AGGREGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfFiles() {
		return numberOfFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfFiles(int newNumberOfFiles) {
		int oldNumberOfFiles = numberOfFiles;
		numberOfFiles = newNumberOfFiles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IECFieldOfActivityAnnotationsPackage.IEC_FILE_AGGREGATION__NUMBER_OF_FILES, oldNumberOfFiles, numberOfFiles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTechnology() {
		return technology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTechnology(String newTechnology) {
		String oldTechnology = technology;
		technology = newTechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IECFieldOfActivityAnnotationsPackage.IEC_FILE_AGGREGATION__TECHNOLOGY, oldTechnology, technology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IECFieldOfActivityAnnotationsPackage.IEC_FILE_AGGREGATION__NUMBER_OF_FILES:
				return getNumberOfFiles();
			case IECFieldOfActivityAnnotationsPackage.IEC_FILE_AGGREGATION__TECHNOLOGY:
				return getTechnology();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IECFieldOfActivityAnnotationsPackage.IEC_FILE_AGGREGATION__NUMBER_OF_FILES:
				setNumberOfFiles((Integer)newValue);
				return;
			case IECFieldOfActivityAnnotationsPackage.IEC_FILE_AGGREGATION__TECHNOLOGY:
				setTechnology((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IECFieldOfActivityAnnotationsPackage.IEC_FILE_AGGREGATION__NUMBER_OF_FILES:
				setNumberOfFiles(NUMBER_OF_FILES_EDEFAULT);
				return;
			case IECFieldOfActivityAnnotationsPackage.IEC_FILE_AGGREGATION__TECHNOLOGY:
				setTechnology(TECHNOLOGY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IECFieldOfActivityAnnotationsPackage.IEC_FILE_AGGREGATION__NUMBER_OF_FILES:
				return numberOfFiles != NUMBER_OF_FILES_EDEFAULT;
			case IECFieldOfActivityAnnotationsPackage.IEC_FILE_AGGREGATION__TECHNOLOGY:
				return TECHNOLOGY_EDEFAULT == null ? technology != null : !TECHNOLOGY_EDEFAULT.equals(technology);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (numberOfFiles: ");
		result.append(numberOfFiles);
		result.append(", technology: ");
		result.append(technology);
		result.append(')');
		return result.toString();
	}

} //IECFileAggregationImpl
