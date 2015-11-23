/**
 */
package adressbook.tests;

import adressbook.AdressBook;
import adressbook.AdressbookFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Adress Book</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdressBookTest extends TestCase {

	/**
	 * The fixture for this Adress Book test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdressBook fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AdressBookTest.class);
	}

	/**
	 * Constructs a new Adress Book test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdressBookTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Adress Book test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AdressBook fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Adress Book test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdressBook getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AdressbookFactory.eINSTANCE.createAdressBook());
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

} //AdressBookTest
