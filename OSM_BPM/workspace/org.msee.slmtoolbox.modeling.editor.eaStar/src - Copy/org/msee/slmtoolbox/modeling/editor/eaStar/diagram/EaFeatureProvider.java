package org.msee.slmtoolbox.modeling.editor.eaStar.diagram;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICopyFeature;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IDeleteFeature;
import org.eclipse.graphiti.features.IMoveAnchorFeature;
import org.eclipse.graphiti.features.IMoveShapeFeature;
import org.eclipse.graphiti.features.IPasteFeature;
import org.eclipse.graphiti.features.IReconnectionFeature;
import org.eclipse.graphiti.features.IResizeShapeFeature;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ICopyContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.features.context.IMoveAnchorContext;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.context.IPasteContext;
import org.eclipse.graphiti.features.context.IReconnectionContext;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.features.impl.DefaultResizeShapeFeature;
import org.eclipse.graphiti.mm.pictograms.FreeFormConnection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.DefaultEaMoveShapeFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.EAResourceResizeFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.EaDeleteFlowNodeFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.EaUpdateProcessFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.FlowNodeCopyFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.FlowNodePasteFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.activity.DefaultEaResizeShapeActivityFeaure;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.activity.EaPaintExtendedActivityFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.activity.EaUpdateActivityFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.activity.atomic.EaAddAtomicActivityFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.activity.atomic.EaAtomicToStructuralFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.activity.atomic.EaCreateAtomicActivityFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.activity.structural.EaAddMseServiceFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.activity.structural.EaAddStructuralActivityFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.activity.structural.EaCreateStructuralActivityFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.activity.structural.EaResizeShapeStructuralActivityFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.activity.structural.EaUpdateStrucutralActivityFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.anchor.EaMoveAnchorFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.connector.EaAddExternalConnectorFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.connector.EaAddInternalConnectorFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.connector.EaAddProcessConnectorFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.connector.EaPaintConnectorFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.connector.EaUpdateConnectorFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.connector.EaCreateExternalConnectorFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.connector.EaCreateInternalConnectorFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.connector.EaCreateProcessConnectorFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.connector.EaResizeShapeConnectorFeaure;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.flow.DefaultEaAddConnectionFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.flow.EaAddSupportFlowFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.flow.EaCreateControlFlowFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.flow.EaCreateInputOutputFlowFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.flow.EaCreateSupportFlowFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.flow.EaPaintFlowFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.flow.EaReconnectControlFlowFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.flow.EaReconnectInputOutputFlowFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.flow.EaReconnectSupportFlowFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.flow.EaUpdateFlowFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.flow.EaUpdateSupportFlowFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.operator.EaAddAndFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.operator.EaAddOrFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.operator.EaCreateAndFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.operator.EaCreateOrFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.organization.EaAddOrganizationFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.organization.EaCreateOrganizationFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.organization.EaMoveShapeOrganizationFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.organization.EaPaintOrganizationFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.organization.EaResizeSHapeOrganizationFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.organization.EaUpdateOrganizationFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.resource.EaAddHumanFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.resource.EaAddITFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.resource.EaAddMaterialFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.resource.EaAddMseServiceToResourceFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.resource.EaCreateHumanFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.resource.EaCreateITFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.resource.EaCreateMaterialFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.resource.EaMoveShapeResourceFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.resource.EaUpdateResourceFeature;
import org.msee.slmtoolbox.modeling.editor.graphiti.diagram.DefaultMseeFeatureProvider;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaAnd;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaAtomicExtendedActivity;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaConnector;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaControlFlow;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExternalConnector;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlow;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaHumanResource;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaITResource;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaInternalConnector;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaLogicalOperator;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaMaterialResource;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOr;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOutputInputFlow;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaProcessConnector;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResource;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaStructuralExtendedActivity;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaSupportFlow;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;
import org.msee.slmtoolbox.modeling.service.app.lang.eastar.EAStarAppService;

public class EaFeatureProvider extends
		DefaultMseeFeatureProvider<EAStarAppService> {

	public EaFeatureProvider(IDiagramTypeProvider dtp) {
		super(dtp);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.graphiti.features.impl.AbstractFeatureProvider#getAddFeature
	 * (org.eclipse.graphiti.features.context.IAddContext)
	 */
	@Override
	public IAddFeature getAddFeature(IAddContext context) {

		// test if the Object is an Atomic ExtendedActivity
		if (context.getNewObject() instanceof EaAtomicExtendedActivity)
			return new EaAddAtomicActivityFeature(this);
		// test if the Object is a Structural ExtendedActivity
		else if (context.getNewObject() instanceof EaStructuralExtendedActivity)
			// create structural extended activity graphical object
			return new EaAddStructuralActivityFeature(this);
		// test if the Object is an instance of OutputInput Flow
		else if (context.getNewObject() instanceof EaOutputInputFlow)
			// create an outputInput Flow graphical object
			return new DefaultEaAddConnectionFeature(this);
		// test if the Object is an instance of Control Flow
		else if (context.getNewObject() instanceof EaControlFlow)
			// create a control Flow graphical object
			return new DefaultEaAddConnectionFeature(this);
		// test if the Object is an instance of Support Flow
		else if (context.getNewObject() instanceof EaSupportFlow)
			// create a support Flow graphical object
			return new EaAddSupportFlowFeature(this);

		// test if the Object is an instance of InternalConnector
		else if (context.getNewObject() instanceof EaInternalConnector)
			// create an internal connector graphical object
			return new EaAddInternalConnectorFeature(this);
		// test if the Object is an instance of ExternalConnector
		else if (context.getNewObject() instanceof EaExternalConnector)
			// create an external connector graphical object
			return new EaAddExternalConnectorFeature(this);
		// test if the Object is an instance of ProcessConnector
		else if (context.getNewObject() instanceof EaProcessConnector)
			// create a process connector graphical object
			return new EaAddProcessConnectorFeature(this);
		// test if the Object is an instance of Human Resource
		else if (context.getNewObject() instanceof EaHumanResource)
			// create a human resource graphical object
			return new EaAddHumanFeature(this);
		// test if the Object is an instance of Material Resource
		else if (context.getNewObject() instanceof EaMaterialResource)
			// create a material resource graphical object
			return new EaAddMaterialFeature(this);
		// test if the Object is an instance of IT Resource
		else if (context.getNewObject() instanceof EaITResource)
			// create an IT resource graphical object
			return new EaAddITFeature(this);
		// test if it is a logical Operator
		// DivergingAnd and ConvergingAnd will have the same graphical
		// representation
		else if (context.getNewObject() instanceof EaAnd)
			// create an And logical operator graphical object
			return new EaAddAndFeature(this);
		// DivergingOr and ConvergingOr will have the same graphical
		// representation
		else if (context.getNewObject() instanceof EaOr)
			// create an Or logical operator graphical object
			return new EaAddOrFeature(this);
		// test if the Object is an instance of EaOrganization
		else if (context.getNewObject() instanceof EaOrganization)
			// create an EaOrganization graphical object
			return new EaAddOrganizationFeature(this);
		// test if the Object is an instance of EaProcess

		return super.getAddFeature(context);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.graphiti.features.impl.AbstractFeatureProvider#getCreateFeatures
	 * ()
	 */
	@Override
	public ICreateFeature[] getCreateFeatures() {
		return null;

	}

	/**
	 * @return Resource create features (Human, material, and IT)
	 */
	public ICreateFeature[] getResourcesFeatures() {
		return new ICreateFeature[] { new EaCreateOrganizationFeature(this),
				new EaCreateHumanFeature(this),
				new EaCreateMaterialFeature(this),
				new EaCreateITFeature(this) };
	}

	/**
	 * 
	 * @return Connector create features (internal, external, and process)
	 */
	public ICreateFeature[] getConnectorsFeatures() {
		return new ICreateFeature[] {
				new EaCreateInternalConnectorFeature(this),
				new EaCreateExternalConnectorFeature(this),
				new EaCreateProcessConnectorFeature(this)};
	}

	/**
	 * 
	 * @return Logical Operator create features (And and Or)
	 */
	public ICreateFeature[] getLogicalOperatorsFeatures() {
		return new ICreateFeature[] { new EaCreateAndFeature(this),
				new EaCreateOrFeature(this) };
	}

	/**
	 * 
	 * @return extendedActivity create features (atomic and strucutral)
	 */

	public ICreateFeature[] getExtendedActivityFeatures() {
		return new ICreateFeature[] { new EaCreateAtomicActivityFeature(this),
				new EaCreateStructuralActivityFeature(this) };
	}
	
	/**
	 * @return connection create features (inputOutput, support, and Control)
	 */
	@Override
	public ICreateConnectionFeature[] getCreateConnectionFeatures() {
		return new ICreateConnectionFeature[] {
				new EaCreateInputOutputFlowFeature(this),
				new EaCreateSupportFlowFeature(this),
				new EaCreateControlFlowFeature(this) };
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.graphiti.ui.features.DefaultFeatureProvider#getMoveAnchorFeature
	 * (org.eclipse.graphiti.features.context.IMoveAnchorContext)
	 */
	@Override
	public IMoveAnchorFeature getMoveAnchorFeature(IMoveAnchorContext context) {
		return new EaMoveAnchorFeature(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.graphiti.ui.features.DefaultFeatureProvider#getMoveShapeFeature
	 * (org.eclipse.graphiti.features.context.IMoveShapeContext)
	 */
	@Override
	public IMoveShapeFeature getMoveShapeFeature(IMoveShapeContext context) {
		PictogramElement pictogramElement = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		if (bo instanceof EaOrganization) {
			return new EaMoveShapeOrganizationFeature(this);
		} else if (bo instanceof EaResource) {
			return new EaMoveShapeResourceFeature(this);
		}

		return new DefaultEaMoveShapeFeature(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.graphiti.ui.features.DefaultFeatureProvider#getCopyFeature
	 * (org.eclipse.graphiti.features.context.ICopyContext)
	 */
	@Override
	public ICopyFeature getCopyFeature(ICopyContext context) {
		return new FlowNodeCopyFeature(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.graphiti.ui.features.DefaultFeatureProvider#getPasteFeature
	 * (org.eclipse.graphiti.features.context.IPasteContext)
	 */
	@Override
	public IPasteFeature getPasteFeature(IPasteContext context) {
		return new FlowNodePasteFeature(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.graphiti.ui.features.DefaultFeatureProvider#getUpdateFeature
	 * (org.eclipse.graphiti.features.context.IUpdateContext)
	 */
	@Override
	public IUpdateFeature getUpdateFeature(IUpdateContext context) {
		PictogramElement pictogramElement = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		if (bo instanceof EaStructuralExtendedActivity) {
			return new EaUpdateStrucutralActivityFeature(this);
		}if (bo instanceof EaExtendedActivity) {
			return new EaUpdateActivityFeature(this);
		} else if (bo instanceof EaConnector) {
			return new EaUpdateConnectorFeature(this);
		} else if (bo instanceof EaResource) {
			return new EaUpdateResourceFeature(this);
		} else if (bo instanceof EaSupportFlow) {
			return new EaUpdateSupportFlowFeature(this);
		} else if (bo instanceof EaFlow) {
			return new EaUpdateFlowFeature(this);
		} else if (bo instanceof EaOrganization) {
			return new EaUpdateOrganizationFeature(this);
		}  else if (bo instanceof EaProcess) {
			return new EaUpdateProcessFeature(this);
		}
		return super.getUpdateFeature(context);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.graphiti.features.impl.AbstractFeatureProvider#
	 * getReconnectionFeature
	 * (org.eclipse.graphiti.features.context.IReconnectionContext)
	 */
	@Override
	public IReconnectionFeature getReconnectionFeature(
			IReconnectionContext context) {
		FreeFormConnection connection = (FreeFormConnection) context
				.getConnection();
		EaFlow bo = (EaFlow) getBusinessObjectForPictogramElement(connection);
		if (bo instanceof EaControlFlow) {
			return new EaReconnectControlFlowFeature(this);
		} else if (bo instanceof EaSupportFlow) {
			return new EaReconnectSupportFlowFeature(this);
		} else {
			return new EaReconnectInputOutputFlowFeature(this);
		}
	}

	/**
	 * Resize shape features respond to user's resize requests.
	 * 
	 * @param context
	 *            the context
	 * 
	 * @return resize feature according to the given context
	 * 
	 * @see IResizeShapeFeature
	 */
	public IResizeShapeFeature getResizeShapeFeature(IResizeShapeContext context) {
		PictogramElement shape = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(shape);
		if (bo instanceof EaResource
				|| bo instanceof EaLogicalOperator) {
			return new EAResourceResizeFeature(this);
		} else if (bo instanceof EaStructuralExtendedActivity) {
			return new EaResizeShapeStructuralActivityFeature(this);
		} else if (bo instanceof EaExtendedActivity) {
			return new DefaultEaResizeShapeActivityFeaure(this);
		} else if (bo instanceof EaOrganization ){
			return new EaResizeSHapeOrganizationFeature(this);
		} else if (bo instanceof EaConnector ){
			return new EaResizeShapeConnectorFeaure(this);
		} else {
			return new DefaultResizeShapeFeature(this);
		}
		
	}

	/**
	 * Delete features remove the grapical representations of domain model
	 * objects as well as the domain model objects itself.
	 * 
	 * @param context
	 *            the context
	 * 
	 * @return delete feature according to the given context
	 * @see IDeleteFeature
	 */
	@Override
	public IDeleteFeature getDeleteFeature(IDeleteContext context) {
		PictogramElement shape = context.getPictogramElement();
		Object businessObject = getBusinessObjectForPictogramElement(shape);
		if (businessObject instanceof EaFlowNode) {
			return new EaDeleteFlowNodeFeature(this);
		} else if (businessObject instanceof EaOrganization)  {
			return new EaDeleteFlowNodeFeature(this);
		}
		return super.getDeleteFeature(context);
	}

	/**
	 * Custom features can do anything. Their functionality can not be planned
	 * by the graphics framework (team).
	 * 
	 * @param context
	 *            the context
	 * 
	 * @return custom feature according to the given context
	 * 
	 * @see ICustomFeature
	 */
	public ICustomFeature[] getCustomFeatures(ICustomContext context) {
		PictogramElement[] pictogramElement = context.getPictogramElements();
		if (1 == pictogramElement.length) {
			Object bo = getBusinessObjectForPictogramElement(pictogramElement[0]);
			if (bo instanceof EaStructuralExtendedActivity) {
				return new ICustomFeature[] { new EaPaintExtendedActivityFeature(this), new EaAddMseServiceFeature(this)};
			} if (bo instanceof EaAtomicExtendedActivity) {
				return new ICustomFeature[] { new EaPaintExtendedActivityFeature(this), new EaAtomicToStructuralFeature(this)};
			} else if (bo instanceof EaOrganization) {
				return new ICustomFeature[] { new EaPaintOrganizationFeature(this), };
			} else if (bo instanceof EaConnector) {
				return new ICustomFeature[] { new EaPaintConnectorFeature(this), };
			} else if (bo instanceof EaFlow) {
				return new ICustomFeature[] { new EaPaintFlowFeature(this), };
			} else if (bo instanceof EaResource) {
				return new ICustomFeature[] { new EaAddMseServiceToResourceFeature(this),};
			} else {
				return new ICustomFeature[0];
			}
		} else {
			return new ICustomFeature[0];
		}
	}
}
