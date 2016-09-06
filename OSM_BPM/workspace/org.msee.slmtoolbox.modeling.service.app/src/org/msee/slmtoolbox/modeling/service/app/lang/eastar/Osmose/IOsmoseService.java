package org.msee.slmtoolbox.modeling.service.app.lang.eastar.Osmose;

import java.util.HashMap;

import org.eclipse.core.resources.IFile;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.root.EaModel;

public interface IOsmoseService {
	public void buildContainer(IFile source);
	public EaModel rebuildModel(String osmioticEvent);
	public HashMap<String,OsmioticRelation> getOsmioticProcess();
}
