/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.parts.impl;

// Start of user code for imports
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.providers.EMFListContentProvider;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.parts.EaProcessPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.parts.GeneralElementsViewsRepository;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.providers.GeneralElementsMessages;

// End of user code

/**
 * 
 * 
 */
public class EaProcessPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, EaProcessPropertiesEditionPart {

	protected Text name;
	protected Text code;
	protected Text decompositionCode;
	protected Text description;
	protected EMFComboViewer osmioticProcess;




	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public EaProcessPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence eaProcessStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = eaProcessStep.addStep(GeneralElementsViewsRepository.EaProcess.Properties.class);
		propertiesStep.addStep(GeneralElementsViewsRepository.EaProcess.Properties.name);
		propertiesStep.addStep(GeneralElementsViewsRepository.EaProcess.Properties.code);
		propertiesStep.addStep(GeneralElementsViewsRepository.EaProcess.Properties.decompositionCode);
		propertiesStep.addStep(GeneralElementsViewsRepository.EaProcess.Properties.description);
		//propertiesStep.addStep(GeneralElementsViewsRepository.EaProcess.Properties.osmioticProcess);
		
		
		composer = new PartComposer(eaProcessStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == GeneralElementsViewsRepository.EaProcess.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == GeneralElementsViewsRepository.EaProcess.Properties.name) {
					return createNameText(parent);
				}
				if (key == GeneralElementsViewsRepository.EaProcess.Properties.code) {
					return createCodeText(parent);
				}
				if (key == GeneralElementsViewsRepository.EaProcess.Properties.decompositionCode) {
					return createDecompositionCodeText(parent);
				}
				if (key == GeneralElementsViewsRepository.EaProcess.Properties.description) {
					return createDescriptionText(parent);
				}
				if (key == GeneralElementsViewsRepository.EaProcess.Properties.osmioticProcess) {
					return createOsmioticProcessEMFComboViewer(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(GeneralElementsMessages.EaProcessPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, GeneralElementsViewsRepository.EaProcess.Properties.name, GeneralElementsMessages.EaProcessPropertiesEditionPart_NameLabel);
		name = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaProcessPropertiesEditionPartImpl.this, GeneralElementsViewsRepository.EaProcess.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaProcessPropertiesEditionPartImpl.this, GeneralElementsViewsRepository.EaProcess.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, GeneralElementsViewsRepository.EaProcess.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GeneralElementsViewsRepository.EaProcess.Properties.name, GeneralElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCodeText(Composite parent) {
		createDescription(parent, GeneralElementsViewsRepository.EaProcess.Properties.code, GeneralElementsMessages.EaProcessPropertiesEditionPart_CodeLabel);
		code = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData codeData = new GridData(GridData.FILL_HORIZONTAL);
		code.setLayoutData(codeData);
		code.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaProcessPropertiesEditionPartImpl.this, GeneralElementsViewsRepository.EaProcess.Properties.code, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, code.getText()));
			}

		});
		code.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaProcessPropertiesEditionPartImpl.this, GeneralElementsViewsRepository.EaProcess.Properties.code, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, code.getText()));
				}
			}

		});
		EditingUtils.setID(code, GeneralElementsViewsRepository.EaProcess.Properties.code);
		EditingUtils.setEEFtype(code, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GeneralElementsViewsRepository.EaProcess.Properties.code, GeneralElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDecompositionCodeText(Composite parent) {
		createDescription(parent, GeneralElementsViewsRepository.EaProcess.Properties.decompositionCode, GeneralElementsMessages.EaProcessPropertiesEditionPart_DecompositionCodeLabel);
		decompositionCode = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData decompositionCodeData = new GridData(GridData.FILL_HORIZONTAL);
		decompositionCode.setLayoutData(decompositionCodeData);
		decompositionCode.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaProcessPropertiesEditionPartImpl.this, GeneralElementsViewsRepository.EaProcess.Properties.decompositionCode, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, decompositionCode.getText()));
			}

		});
		decompositionCode.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaProcessPropertiesEditionPartImpl.this, GeneralElementsViewsRepository.EaProcess.Properties.decompositionCode, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, decompositionCode.getText()));
				}
			}

		});
		EditingUtils.setID(decompositionCode, GeneralElementsViewsRepository.EaProcess.Properties.decompositionCode);
		EditingUtils.setEEFtype(decompositionCode, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GeneralElementsViewsRepository.EaProcess.Properties.decompositionCode, GeneralElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}
	
	protected Composite createOsmioticProcessEMFComboViewer(Composite parent) {
		createDescription(parent, GeneralElementsViewsRepository.EaProcess.Properties.osmioticProcess, GeneralElementsMessages.EaProcessPropertiesEditionPart_OsmioticProcessLabel);
		osmioticProcess = new EMFComboViewer(parent);
		GridData osmioticProcessData = new GridData(GridData.FILL_HORIZONTAL);
		osmioticProcess.getCombo().setLayoutData(osmioticProcessData);
		osmioticProcess.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		osmioticProcess.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaProcessPropertiesEditionPartImpl.this, GeneralElementsViewsRepository.EaProcess.Properties.osmioticProcess, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getOsmioticProcess()));
			}

		});
		osmioticProcess.setContentProvider(new EMFListContentProvider());
		EditingUtils.setID(osmioticProcess.getCombo(), GeneralElementsViewsRepository.EaProcess.Properties.osmioticProcess);
		EditingUtils.setEEFtype(osmioticProcess.getCombo(), "eef::Combo"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GeneralElementsViewsRepository.EaProcess.Properties.osmioticProcess, GeneralElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(Composite parent) {
		createDescription(parent, GeneralElementsViewsRepository.EaProcess.Properties.description, GeneralElementsMessages.EaProcessPropertiesEditionPart_DescriptionLabel);
		description = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData descriptionData = new GridData(GridData.FILL_HORIZONTAL);
		description.setLayoutData(descriptionData);
		description.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaProcessPropertiesEditionPartImpl.this, GeneralElementsViewsRepository.EaProcess.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
			}

		});
		description.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaProcessPropertiesEditionPartImpl.this, GeneralElementsViewsRepository.EaProcess.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, GeneralElementsViewsRepository.EaProcess.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GeneralElementsViewsRepository.EaProcess.Properties.description, GeneralElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.parts.EaProcessPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.parts.EaProcessPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.parts.EaProcessPropertiesEditionPart#getCode()
	 * 
	 */
	public String getCode() {
		return code.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.parts.EaProcessPropertiesEditionPart#setCode(String newValue)
	 * 
	 */
	public void setCode(String newValue) {
		if (newValue != null) {
			code.setText(newValue);
		} else {
			code.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.parts.EaProcessPropertiesEditionPart#getDecompositionCode()
	 * 
	 */
	public String getDecompositionCode() {
		return decompositionCode.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.parts.EaProcessPropertiesEditionPart#setDecompositionCode(String newValue)
	 * 
	 */
	public void setDecompositionCode(String newValue) {
		if (newValue != null) {
			decompositionCode.setText(newValue);
		} else {
			decompositionCode.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.parts.EaProcessPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.parts.EaProcessPropertiesEditionPart#setDescription(String newValue)
	 * 
	 */
	public void setDescription(String newValue) {
		if (newValue != null) {
			description.setText(newValue);
		} else {
			description.setText(""); //$NON-NLS-1$
		}
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see eaStar.generalElements.parts.EaProcessPropertiesEditionPart#getOsmioticProcess()
	 * 
	 */
	public Object getOsmioticProcess() {
		if (osmioticProcess.getSelection() instanceof StructuredSelection) {
			return ((StructuredSelection) osmioticProcess.getSelection()).getFirstElement();
		}
		return "";
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see eaStar.generalElements.parts.EaProcessPropertiesEditionPart#initOsmioticProcess(Object input, Object currentValue)
	 */
	public void initOsmioticProcess(Object input, Object currentValue) {
		osmioticProcess.setInput(input);
		if (currentValue != null) {
			osmioticProcess.setSelection(new StructuredSelection(currentValue));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see eaStar.generalElements.parts.EaProcessPropertiesEditionPart#setOsmioticProcess(Object newValue)
	 * 
	 */
	public void setOsmioticProcess(Object newValue) {
		if (newValue != null) {
			osmioticProcess.modelUpdating(new StructuredSelection(newValue));
		} else {
			osmioticProcess.modelUpdating(new StructuredSelection("")); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see eaStar.generalElements.parts.EaProcessPropertiesEditionPart#addFilterOsmioticProcess(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOsmioticProcess(ViewerFilter filter) {
		osmioticProcess.addFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return GeneralElementsMessages.EaProcess_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
