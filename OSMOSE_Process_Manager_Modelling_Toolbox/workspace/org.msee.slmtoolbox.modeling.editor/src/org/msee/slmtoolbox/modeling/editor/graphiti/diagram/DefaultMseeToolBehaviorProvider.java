package org.msee.slmtoolbox.modeling.editor.graphiti.diagram;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.context.IPictogramElementContext;
import org.eclipse.graphiti.features.context.impl.CustomContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.tb.ContextButtonEntry;
import org.eclipse.graphiti.tb.DefaultToolBehaviorProvider;
import org.eclipse.graphiti.tb.IContextButtonPadData;

public class DefaultMseeToolBehaviorProvider extends DefaultToolBehaviorProvider {

    public DefaultMseeToolBehaviorProvider(IDiagramTypeProvider dtp) {
        super(dtp);
    }
    
    @Override
    public IContextButtonPadData getContextButtonPad(
                                       IPictogramElementContext context) {
        IContextButtonPadData data = super.getContextButtonPad(context);
        PictogramElement pictoElement = context.getPictogramElement();
     
        // 1. set the generic context buttons
        // note, that we do not add 'remove' (just as an example)
        setGenericContextButtons(data, pictoElement, CONTEXT_BUTTON_DELETE | 
                                                   CONTEXT_BUTTON_UPDATE);
        // 2. set the color button 
        // 2.a. create new CustomContext
        CustomContext customContext = new CustomContext(new PictogramElement[] { pictoElement });
        ICustomFeature[] cf = getFeatureProvider().getCustomFeatures(customContext);
        
        // 3.b. create context button and add all applicable features
        for (int i = 0; i < cf.length; i++) {
            ICustomFeature iCustomFeature = cf[i];
            ContextButtonEntry button = new ContextButtonEntry(iCustomFeature, customContext);
            button.setText(iCustomFeature.getName());
            button.setIconId(iCustomFeature.getImageId());
            button.setDescription(iCustomFeature.getDescription());
            
            // 3.c. add context button, if it contains at least one feature
            data.getDomainSpecificContextButtons().add(button);
        }
        
        return data;
    }

}
