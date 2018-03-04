package com.company;

import com.company.devicesStructure.Device;
import com.company.devicesStructure.IDevice;

import java.util.Comparator;

public class DeviceComparator implements Comparator<IDevice>{
    @Override
    public int compare(IDevice devicesInterface1, IDevice devicesInterface2){
        return (devicesInterface1.getPopularity() - devicesInterface2.getPopularity());
    }
}
