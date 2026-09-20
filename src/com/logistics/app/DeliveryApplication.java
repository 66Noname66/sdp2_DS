package com.logistics.app;

import com.logistics.factory.GUIFactory;
import com.logistics.logistics.Logistics;
import com.logistics.model.Button;
import com.logistics.model.Checkbox;

public class DeliveryApplication {
    private final Button button;
    private final Checkbox checkbox;
    private final Logistics logistics;

    public DeliveryApplication(GUIFactory guiFactory, Logistics logistics) {
        if  (guiFactory == null || logistics == null) {
            throw new IllegalArgumentException("GUI and Logistics must not be null");

        }
        this.button = guiFactory.createButton();
        this.checkbox = guiFactory.createCheckbox();
        this.logistics = logistics;

    }
    public void run(String cargo, String destination) {
        button.paint();
        checkbox.paint();

        logistics.planDelivery(cargo, destination);
    }
}
