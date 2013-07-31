package ch.randelshofer.quaqua.mountain_lion;

import javax.swing.UIDefaults;
import javax.swing.plaf.ColorUIResource;

import ch.randelshofer.quaqua.QuaquaManager;
import ch.randelshofer.quaqua.color.InactivatableColorUIResource;
import ch.randelshofer.quaqua.lion.Quaqua16LionLookAndFeel;

public class Quaqua16MountainLionLookAndFeel extends Quaqua16LionLookAndFeel {

	public Quaqua16MountainLionLookAndFeel() {
		super();
	}

	protected Quaqua16MountainLionLookAndFeel(String className) {
		super(className);
	}

	@Override
	protected void initDesignDefaults(UIDefaults table) {
		super.initDesignDefaults(table);
		
		String javaVersion = QuaquaManager.getProperty("java.version", "");
		if (javaVersion.startsWith("1.5") || javaVersion.startsWith("1.6")) {
			/* No need to do anything on Java 1.6 or earlier. */
		} else {
	        Object toolBarBackground = new InactivatableColorUIResource(new ColorUIResource(222, 222, 222), new ColorUIResource(246, 246, 246));
	        
			Object[] uiDefaults = new Object[] {
				"ToolBar.title.background", toolBarBackground
			};
			
			putDefaults(table, uiDefaults);
		}
	}

}
