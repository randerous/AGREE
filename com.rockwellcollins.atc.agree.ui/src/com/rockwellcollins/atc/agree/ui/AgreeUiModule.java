/*
 * generated by Xtext
 */
package com.rockwellcollins.atc.agree.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.resource.containers.IAllContainersState;
import org.eclipse.xtext.ui.shared.Access;
import org.osate.xtext.aadl2.ui.containers.Aadl2ProjectsState;
import org.osate.xtext.aadl2.ui.containers.Aadl2ProjectsStateHelper;

/**
 * Use this class to register components to be used within the IDE.
 */
public class AgreeUiModule extends com.rockwellcollins.atc.agree.ui.AbstractAgreeUiModule {
	public AgreeUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	// public Class<? extends IEObjectHoverProvider> bindIEObjectHoverProvider()
	// {
	// return AgreeHoverProvider.class;
	// }

	@Override
	public com.google.inject.Provider<org.eclipse.xtext.resource.containers.IAllContainersState> provideIAllContainersState() {
		return Access.<IAllContainersState> provider(Aadl2ProjectsState.class);
	}

	public Class<? extends Aadl2ProjectsStateHelper> bindWorkspaceProjectsStateHelper() {
		return Aadl2ProjectsStateHelper.class;
	}

}
