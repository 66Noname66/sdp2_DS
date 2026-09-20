package com.logistics.logistics;

import com.logistics.model.Ship;
import com.logistics.model.Transport;

public class SeaLogistics extends Logistics{
    @Override
    public Transport createTransport(){
        return new Ship();
    }
}
