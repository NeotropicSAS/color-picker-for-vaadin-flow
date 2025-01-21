package com.neotropic.flow.component.colorPicker;

import com.neotropic.flow.component.colorPicker.ColorPicker;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

/**
 * Test View for our {@link ColorPickerV2} add-on class. This class and others in the
 * test folder will not be included in the final JAR.
 */
@Route("")
public class TestView extends Div {

    public TestView() {
        add(new ColorPicker());
    }
}
