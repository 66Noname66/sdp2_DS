package com.logistics.factory;

import com.logistics.model.Button;
import com.logistics.model.Checkbox;
import com.logistics.model.MacOSButton;
import com.logistics.model.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }
    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
