package com.logistics.logistics;

import com.logistics.model.Transport;
import com.logistics.model.Truck;

public class RoadLogistics extends Logistics {
    @Override
    public Transport createTransport(){
        return new Truck();
    }
}
