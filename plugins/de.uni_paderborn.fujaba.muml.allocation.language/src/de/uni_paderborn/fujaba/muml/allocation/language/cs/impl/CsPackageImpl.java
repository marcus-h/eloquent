/**
 */
package de.uni_paderborn.fujaba.muml.allocation.language.cs.impl;

import de.uni_paderborn.fujaba.muml.allocation.language.cs.ComponentResourceTupleDescriptorCS;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.ConstraintCS;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.CsFactory;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.CsPackage;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.EvaluatableElementCS;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.InstanceTupleDescriptorCS;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.LocationConstraintCS;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.LocationConstraintTypes;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.LocationTupleDescriptorCS;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.MeasureFunctionCS;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.QoSDimensionCS;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.RequiredHardwareResourceInstanceConstraintCS;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.ResourceConstraintCS;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.ServiceCS;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.SpecificationCS;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.TupleDescriptorCS;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.ValueTupleDescriptorCS;

import de.uni_paderborn.fujaba.muml.allocation.language.cs.WeightingComponentResourceTupleElementCS;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.ocl.examples.xtext.base.basecs.BaseCSPackage;

import org.eclipse.ocl.examples.xtext.completeocl.completeoclcs.CompleteOCLCSPackage;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialoclcs.EssentialOCLCSPackage;
import org.storydriven.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CsPackageImpl extends EPackageImpl implements CsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificationCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluatableElementCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weightingComponentResourceTupleElementCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qoSDimensionCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationConstraintCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceConstraintCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredHardwareResourceInstanceConstraintCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tupleDescriptorCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceTupleDescriptorCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationTupleDescriptorCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentResourceTupleDescriptorCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueTupleDescriptorCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureFunctionCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum locationConstraintTypesEEnum = null;

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
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.CsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CsPackageImpl() {
		super(eNS_URI, CsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CsPackage init() {
		if (isInited) return (CsPackage)EPackage.Registry.INSTANCE.getEPackage(CsPackage.eNS_URI);

		// Obtain or create and register package
		CsPackageImpl theCsPackage = (CsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CompleteOCLCSPackage.eINSTANCE.eClass();
		CorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCsPackage.createPackageContents();

		// Initialize created meta-data
		theCsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CsPackage.eNS_URI, theCsPackage);
		return theCsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificationCS() {
		return specificationCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificationCS_Services() {
		return (EReference)specificationCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificationCS_Constraints() {
		return (EReference)specificationCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificationCS_Measure() {
		return (EReference)specificationCSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluatableElementCS() {
		return evaluatableElementCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluatableElementCS_Expression() {
		return (EReference)evaluatableElementCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWeightingComponentResourceTupleElementCS() {
		return weightingComponentResourceTupleElementCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWeightingComponentResourceTupleElementCS_TupleDescriptors() {
		return (EReference)weightingComponentResourceTupleElementCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWeightingComponentResourceTupleElementCS_Weighting() {
		return (EReference)weightingComponentResourceTupleElementCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceCS() {
		return serviceCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceCS_Dimensions() {
		return (EReference)serviceCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQoSDimensionCS() {
		return qoSDimensionCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintCS() {
		return constraintCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationConstraintCS() {
		return locationConstraintCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationConstraintCS_TupleDescriptor() {
		return (EReference)locationConstraintCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationConstraintCS_Type() {
		return (EAttribute)locationConstraintCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceConstraintCS() {
		return resourceConstraintCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceConstraintCS_Rhs() {
		return (EReference)resourceConstraintCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredHardwareResourceInstanceConstraintCS() {
		return requiredHardwareResourceInstanceConstraintCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequiredHardwareResourceInstanceConstraintCS_TupleDescriptors() {
		return (EReference)requiredHardwareResourceInstanceConstraintCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTupleDescriptorCS() {
		return tupleDescriptorCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceTupleDescriptorCS() {
		return instanceTupleDescriptorCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceTupleDescriptorCS_Instance() {
		return (EAttribute)instanceTupleDescriptorCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationTupleDescriptorCS() {
		return locationTupleDescriptorCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationTupleDescriptorCS_SecondInstance() {
		return (EAttribute)locationTupleDescriptorCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentResourceTupleDescriptorCS() {
		return componentResourceTupleDescriptorCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentResourceTupleDescriptorCS_Hwresinstance() {
		return (EAttribute)componentResourceTupleDescriptorCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueTupleDescriptorCS() {
		return valueTupleDescriptorCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueTupleDescriptorCS_Value() {
		return (EAttribute)valueTupleDescriptorCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureFunctionCS() {
		return measureFunctionCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureFunctionCS_Services() {
		return (EReference)measureFunctionCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLocationConstraintTypes() {
		return locationConstraintTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsFactory getCsFactory() {
		return (CsFactory)getEFactoryInstance();
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
		specificationCSEClass = createEClass(SPECIFICATION_CS);
		createEReference(specificationCSEClass, SPECIFICATION_CS__SERVICES);
		createEReference(specificationCSEClass, SPECIFICATION_CS__CONSTRAINTS);
		createEReference(specificationCSEClass, SPECIFICATION_CS__MEASURE);

		evaluatableElementCSEClass = createEClass(EVALUATABLE_ELEMENT_CS);
		createEReference(evaluatableElementCSEClass, EVALUATABLE_ELEMENT_CS__EXPRESSION);

		weightingComponentResourceTupleElementCSEClass = createEClass(WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT_CS);
		createEReference(weightingComponentResourceTupleElementCSEClass, WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT_CS__TUPLE_DESCRIPTORS);
		createEReference(weightingComponentResourceTupleElementCSEClass, WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT_CS__WEIGHTING);

		serviceCSEClass = createEClass(SERVICE_CS);
		createEReference(serviceCSEClass, SERVICE_CS__DIMENSIONS);

		qoSDimensionCSEClass = createEClass(QO_SDIMENSION_CS);

		constraintCSEClass = createEClass(CONSTRAINT_CS);

		locationConstraintCSEClass = createEClass(LOCATION_CONSTRAINT_CS);
		createEReference(locationConstraintCSEClass, LOCATION_CONSTRAINT_CS__TUPLE_DESCRIPTOR);
		createEAttribute(locationConstraintCSEClass, LOCATION_CONSTRAINT_CS__TYPE);

		resourceConstraintCSEClass = createEClass(RESOURCE_CONSTRAINT_CS);
		createEReference(resourceConstraintCSEClass, RESOURCE_CONSTRAINT_CS__RHS);

		requiredHardwareResourceInstanceConstraintCSEClass = createEClass(REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT_CS);
		createEReference(requiredHardwareResourceInstanceConstraintCSEClass, REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT_CS__TUPLE_DESCRIPTORS);

		tupleDescriptorCSEClass = createEClass(TUPLE_DESCRIPTOR_CS);

		instanceTupleDescriptorCSEClass = createEClass(INSTANCE_TUPLE_DESCRIPTOR_CS);
		createEAttribute(instanceTupleDescriptorCSEClass, INSTANCE_TUPLE_DESCRIPTOR_CS__INSTANCE);

		locationTupleDescriptorCSEClass = createEClass(LOCATION_TUPLE_DESCRIPTOR_CS);
		createEAttribute(locationTupleDescriptorCSEClass, LOCATION_TUPLE_DESCRIPTOR_CS__SECOND_INSTANCE);

		componentResourceTupleDescriptorCSEClass = createEClass(COMPONENT_RESOURCE_TUPLE_DESCRIPTOR_CS);
		createEAttribute(componentResourceTupleDescriptorCSEClass, COMPONENT_RESOURCE_TUPLE_DESCRIPTOR_CS__HWRESINSTANCE);

		valueTupleDescriptorCSEClass = createEClass(VALUE_TUPLE_DESCRIPTOR_CS);
		createEAttribute(valueTupleDescriptorCSEClass, VALUE_TUPLE_DESCRIPTOR_CS__VALUE);

		measureFunctionCSEClass = createEClass(MEASURE_FUNCTION_CS);
		createEReference(measureFunctionCSEClass, MEASURE_FUNCTION_CS__SERVICES);

		// Create enums
		locationConstraintTypesEEnum = createEEnum(LOCATION_CONSTRAINT_TYPES);
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
		CompleteOCLCSPackage theCompleteOCLCSPackage = (CompleteOCLCSPackage)EPackage.Registry.INSTANCE.getEPackage(CompleteOCLCSPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		BaseCSPackage theBaseCSPackage = (BaseCSPackage)EPackage.Registry.INSTANCE.getEPackage(BaseCSPackage.eNS_URI);
		EssentialOCLCSPackage theEssentialOCLCSPackage = (EssentialOCLCSPackage)EPackage.Registry.INSTANCE.getEPackage(EssentialOCLCSPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		specificationCSEClass.getESuperTypes().add(theCompleteOCLCSPackage.getCompleteOCLDocumentCS());
		specificationCSEClass.getESuperTypes().add(theCorePackage.getExtendableElement());
		evaluatableElementCSEClass.getESuperTypes().add(theBaseCSPackage.getModelElementCS());
		weightingComponentResourceTupleElementCSEClass.getESuperTypes().add(theBaseCSPackage.getModelElementCS());
		serviceCSEClass.getESuperTypes().add(theBaseCSPackage.getNamedElementCS());
		qoSDimensionCSEClass.getESuperTypes().add(theBaseCSPackage.getNamedElementCS());
		qoSDimensionCSEClass.getESuperTypes().add(this.getEvaluatableElementCS());
		qoSDimensionCSEClass.getESuperTypes().add(this.getWeightingComponentResourceTupleElementCS());
		constraintCSEClass.getESuperTypes().add(theBaseCSPackage.getNamedElementCS());
		constraintCSEClass.getESuperTypes().add(this.getEvaluatableElementCS());
		locationConstraintCSEClass.getESuperTypes().add(this.getConstraintCS());
		resourceConstraintCSEClass.getESuperTypes().add(this.getConstraintCS());
		resourceConstraintCSEClass.getESuperTypes().add(this.getWeightingComponentResourceTupleElementCS());
		requiredHardwareResourceInstanceConstraintCSEClass.getESuperTypes().add(this.getConstraintCS());
		tupleDescriptorCSEClass.getESuperTypes().add(theBaseCSPackage.getModelElementCS());
		instanceTupleDescriptorCSEClass.getESuperTypes().add(this.getTupleDescriptorCS());
		locationTupleDescriptorCSEClass.getESuperTypes().add(this.getInstanceTupleDescriptorCS());
		componentResourceTupleDescriptorCSEClass.getESuperTypes().add(this.getInstanceTupleDescriptorCS());
		valueTupleDescriptorCSEClass.getESuperTypes().add(this.getTupleDescriptorCS());
		measureFunctionCSEClass.getESuperTypes().add(theBaseCSPackage.getModelElementCS());

		// Initialize classes and features; add operations and parameters
		initEClass(specificationCSEClass, SpecificationCS.class, "SpecificationCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecificationCS_Services(), this.getServiceCS(), null, "services", null, 0, -1, SpecificationCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificationCS_Constraints(), this.getConstraintCS(), null, "constraints", null, 0, -1, SpecificationCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificationCS_Measure(), this.getMeasureFunctionCS(), null, "measure", null, 0, 1, SpecificationCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evaluatableElementCSEClass, EvaluatableElementCS.class, "EvaluatableElementCS", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvaluatableElementCS_Expression(), theEssentialOCLCSPackage.getContextCS(), null, "expression", null, 1, 1, EvaluatableElementCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(weightingComponentResourceTupleElementCSEClass, WeightingComponentResourceTupleElementCS.class, "WeightingComponentResourceTupleElementCS", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWeightingComponentResourceTupleElementCS_TupleDescriptors(), this.getComponentResourceTupleDescriptorCS(), null, "tupleDescriptors", null, 1, -1, WeightingComponentResourceTupleElementCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeightingComponentResourceTupleElementCS_Weighting(), this.getValueTupleDescriptorCS(), null, "weighting", null, 1, 1, WeightingComponentResourceTupleElementCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceCSEClass, ServiceCS.class, "ServiceCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceCS_Dimensions(), this.getQoSDimensionCS(), null, "dimensions", null, 0, -1, ServiceCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qoSDimensionCSEClass, QoSDimensionCS.class, "QoSDimensionCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constraintCSEClass, ConstraintCS.class, "ConstraintCS", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(locationConstraintCSEClass, LocationConstraintCS.class, "LocationConstraintCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocationConstraintCS_TupleDescriptor(), this.getLocationTupleDescriptorCS(), null, "tupleDescriptor", null, 1, 1, LocationConstraintCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocationConstraintCS_Type(), this.getLocationConstraintTypes(), "type", null, 1, 1, LocationConstraintCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceConstraintCSEClass, ResourceConstraintCS.class, "ResourceConstraintCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceConstraintCS_Rhs(), this.getValueTupleDescriptorCS(), null, "rhs", null, 1, 1, ResourceConstraintCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredHardwareResourceInstanceConstraintCSEClass, RequiredHardwareResourceInstanceConstraintCS.class, "RequiredHardwareResourceInstanceConstraintCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequiredHardwareResourceInstanceConstraintCS_TupleDescriptors(), this.getComponentResourceTupleDescriptorCS(), null, "tupleDescriptors", null, 1, -1, RequiredHardwareResourceInstanceConstraintCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tupleDescriptorCSEClass, TupleDescriptorCS.class, "TupleDescriptorCS", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(instanceTupleDescriptorCSEClass, InstanceTupleDescriptorCS.class, "InstanceTupleDescriptorCS", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstanceTupleDescriptorCS_Instance(), ecorePackage.getEString(), "instance", null, 1, 1, InstanceTupleDescriptorCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationTupleDescriptorCSEClass, LocationTupleDescriptorCS.class, "LocationTupleDescriptorCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocationTupleDescriptorCS_SecondInstance(), ecorePackage.getEString(), "secondInstance", null, 1, 1, LocationTupleDescriptorCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentResourceTupleDescriptorCSEClass, ComponentResourceTupleDescriptorCS.class, "ComponentResourceTupleDescriptorCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentResourceTupleDescriptorCS_Hwresinstance(), ecorePackage.getEString(), "hwresinstance", null, 1, 1, ComponentResourceTupleDescriptorCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueTupleDescriptorCSEClass, ValueTupleDescriptorCS.class, "ValueTupleDescriptorCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueTupleDescriptorCS_Value(), ecorePackage.getEString(), "value", null, 1, 1, ValueTupleDescriptorCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measureFunctionCSEClass, MeasureFunctionCS.class, "MeasureFunctionCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasureFunctionCS_Services(), this.getServiceCS(), null, "services", null, 0, -1, MeasureFunctionCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(locationConstraintTypesEEnum, LocationConstraintTypes.class, "LocationConstraintTypes");
		addEEnumLiteral(locationConstraintTypesEEnum, LocationConstraintTypes.SAME_LOCATION);
		addEEnumLiteral(locationConstraintTypesEEnum, LocationConstraintTypes.DIFFERENT_LOCATION);

		// Create resource
		createResource(eNS_URI);
	}

} //CsPackageImpl
