/**
 */
package Modifikationmarks.tests;

import Modifikationmarks.KAMP4IECModificationRepository;
import Modifikationmarks.ModifikationmarksFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>KAMP4IEC Modification Repository</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class KAMP4IECModificationRepositoryTest extends AbstractKAMP4IECModificationRepositoryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(KAMP4IECModificationRepositoryTest.class);
	}

	/**
	 * Constructs a new KAMP4IEC Modification Repository test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KAMP4IECModificationRepositoryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this KAMP4IEC Modification Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected KAMP4IECModificationRepository getFixture() {
		return (KAMP4IECModificationRepository)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModifikationmarksFactory.eINSTANCE.createKAMP4IECModificationRepository());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //KAMP4IECModificationRepositoryTest
