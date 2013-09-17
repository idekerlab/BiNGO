package bingo.internal;

import java.util.Properties;

import org.cytoscape.app.swing.CySwingAppAdapter;
import org.cytoscape.application.swing.CyAction;
import org.cytoscape.service.util.AbstractCyActivator;
import org.cytoscape.util.swing.OpenBrowser;
import org.cytoscape.work.SynchronousTaskManager;
import org.osgi.framework.BundleContext;

public class CyActivator extends AbstractCyActivator {
	public CyActivator() {
		super();
	}

	public void start(BundleContext bc) {

		CySwingAppAdapter adapter = getService(bc,CySwingAppAdapter.class);
		OpenBrowser openBrowserService = getService(bc,OpenBrowser.class);
		
		BingoPluginAction bingoPluginAction = new BingoPluginAction(adapter, openBrowserService);		
		registerService(bc,bingoPluginAction,CyAction.class, new Properties());
	}
}
