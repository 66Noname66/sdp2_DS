package com.logistics.factory;

import com.logistics.model.Button;
import com.logistics.model.Checkbox;
import com.logistics.model.WindowsButton;
import com.logistics.model.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton(){
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox(){
        return new WindowsCheckbox();
    }
}
