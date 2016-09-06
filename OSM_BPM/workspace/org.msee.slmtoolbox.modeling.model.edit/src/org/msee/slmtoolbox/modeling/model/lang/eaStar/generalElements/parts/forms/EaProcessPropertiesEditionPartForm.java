/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.parts.forms;

// Start of user code for imports
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.providers.EMFListContentProvider;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
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
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.views.properties.tabbed.ISection;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.parts.EaProcessPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.parts.GeneralElementsViewsRepository;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.providers.GeneralElementsMessages;

// End of user code

/**
 * 
 * 
 */
public class EaProcessPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, EaProcessPropertiesEditionPart {

	protected Text name;
	protected Text code;
	protected Text decompositionCode;
	protected Text description;
	protected EMFComboViewer osmioticProcess;



	/**
	 * For {@link ISection} use only.
	 */
	public EaProcessPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public EaProcessPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
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
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == GeneralElementsViewsRepository.EaProcess.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == GeneralElementsViewsRepository.EaProcess.Properties.code) {
					return createCodeText(widgetFactory, parent);
				}
				if (key == GeneralElementsViewsRepository.EaProcess.Properties.decompositionCode) {
					return createDecompositionCodeText(widgetFactory, parent);
				}
				if (key == GeneralElementsViewsRepository.EaProcess.Properties.description) {
					return createDescriptionText(widgetFactory, parent);
				}
				if (key == GeneralElementsViewsRepository.EaProcess.Properties.osmioticProcess) {
					return createOsmioticProcessEMFComboViewer(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	
	protected Composite createOsmioticProcessEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaProcessPropertiesEditionPartForm.this, GeneralElementsViewsRepository.EaProcess.Properties.osmioticProcess, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getOsmioticProcess()));
			}

		});
		osmioticProcess.setContentProvider(new EMFListContentProvider());
		EditingUtils.setID(osmioticProcess.getCombo(), GeneralElementsViewsRepository.EaProcess.Properties.osmioticProcess);
		EditingUtils.setEEFtype(osmioticProcess.getCombo(), "eef::Combo");
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GeneralElementsViewsRepository.EaProcess.Properties.osmioticProcess, GeneralElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}	
	
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(GeneralElementsMessages.EaProcessPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, GeneralElementsViewsRepository.EaProcess.Properties.name, GeneralElementsMessages.EaProcessPropertiesEditionPart_NameLabel);
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							EaProcessPropertiesEditionPartForm.this,
							GeneralElementsViewsRepository.EaProcess.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaProcessPropertiesEditionPartForm.this,
									GeneralElementsViewsRepository.EaProcess.Properties.name,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, name.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaProcessPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaProcessPropertiesEditionPartForm.this, GeneralElementsViewsRepository.EaProcess.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, GeneralElementsViewsRepository.EaProcess.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GeneralElementsViewsRepository.EaProcess.Properties.name, GeneralElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCodeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, GeneralElementsViewsRepository.EaProcess.Properties.code, GeneralElementsMessages.EaProcessPropertiesEditionPart_CodeLabel);
		code = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		code.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData codeData = new GridData(GridData.FILL_HORIZONTAL);
		code.setLayoutData(codeData);
		code.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							EaProcessPropertiesEditionPartForm.this,
							GeneralElementsViewsRepository.EaProcess.Properties.code,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, code.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaProcessPropertiesEditionPartForm.this,
									GeneralElementsViewsRepository.EaProcess.Properties.code,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, code.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaProcessPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		code.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaProcessPropertiesEditionPartForm.this, GeneralElementsViewsRepository.EaProcess.Properties.code, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, code.getText()));
				}
			}
		});
		EditingUtils.setID(code, GeneralElementsViewsRepository.EaProcess.Properties.code);
		EditingUtils.setEEFtype(code, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GeneralElementsViewsRepository.EaProcess.Properties.code, GeneralElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDecompositionCodeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, GeneralElementsViewsRepository.EaProcess.Properties.decompositionCode, GeneralElementsMessages.EaProcessPropertiesEditionPart_DecompositionCodeLabel);
		decompositionCode = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		decompositionCode.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData decompositionCodeData = new GridData(GridData.FILL_HORIZONTAL);
		decompositionCode.setLayoutData(decompositionCodeData);
		decompositionCode.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							EaProcessPropertiesEditionPartForm.this,
							GeneralElementsViewsRepository.EaProcess.Properties.decompositionCode,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, decompositionCode.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaProcessPropertiesEditionPartForm.this,
									GeneralElementsViewsRepository.EaProcess.Properties.decompositionCode,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, decompositionCode.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaProcessPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		decompositionCode.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaProcessPropertiesEditionPartForm.this, GeneralElementsViewsRepository.EaProcess.Properties.decompositionCode, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, decompositionCode.getText()));
				}
			}
		});
		EditingUtils.setID(decompositionCode, GeneralElementsViewsRepository.EaProcess.Properties.decompositionCode);
		EditingUtils.setEEFtype(decompositionCode, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GeneralElementsViewsRepository.EaProcess.Properties.decompositionCode, GeneralElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, GeneralElementsViewsRepository.EaProcess.Properties.description, GeneralElementsMessages.EaProcessPropertiesEditionPart_DescriptionLabel);
		description = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		description.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData descriptionData = new GridData(GridData.FILL_HORIZONTAL);
		description.setLayoutData(descriptionData);
		description.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							EaProcessPropertiesEditionPartForm.this,
							GeneralElementsViewsRepository.EaProcess.Properties.description,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaProcessPropertiesEditionPartForm.this,
									GeneralElementsViewsRepository.EaProcess.Properties.description,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, description.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaProcessPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		description.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaProcessPropertiesEditionPartForm.this, GeneralElementsViewsRepository.EaProcess.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}
		});
		EditingUtils.setID(description, GeneralElementsViewsRepository.EaProcess.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GeneralElementsViewsRepository.EaProcess.Properties.description, GeneralElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
