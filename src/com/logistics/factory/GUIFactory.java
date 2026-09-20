package com.logistics.factory;

import com.logistics.model.Button;
import com.logistics.model.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
