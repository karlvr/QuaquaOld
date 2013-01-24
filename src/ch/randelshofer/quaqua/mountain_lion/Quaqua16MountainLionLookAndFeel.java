package ch.randelshofer.quaqua.mountain_lion;

import javax.swing.UIDefaults;
import javax.swing.plaf.ColorUIResource;

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
		
        Object toolBarBackground = new ColorUIResource(222, 222, 222);
        
		Object[] uiDefaults = new Object[] {
			"ToolBar.title.background", toolBarBackground
		};
		
		putDefaults(table, uiDefaults);
	}

}
