package com.company.devicesStructure;

import java.util.Objects;

public abstract class Device implements IDevice{
    protected String deviceType;
    protected OSType deviceOSType;
    protected int devicePopularity;

    public Device() {
        this.deviceOSType = OSType.Unknown;
        this.deviceType = "Unknown";
        this.devicePopularity = 0;
    }

    public Device(String deviceType, OSType deviceOSType, int devicePopularity) {
        this.deviceOSType = deviceOSType;
        this.deviceType = deviceType;
        this.devicePopularity = devicePopularity;
    }

       public String getDeviceType() {
        return this.deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public Integer getPopularity() {
        return this.devicePopularity;
    }

    public void setPopularity(int devicePopularity) {
        this.devicePopularity = devicePopularity;
    }

    public OSType getDeviceOSType(){
        return this.deviceOSType;
    }

    public void setDeviceOSType(OSType deviceOSType){
        this.deviceOSType = deviceOSType;
    }

    public abstract void OSVersionInfo();
    public abstract void WhoIsBetter();

    @Override
    public int hashCode() {
        return Objects.hash(deviceType,deviceOSType,devicePopularity);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Device device = (Device) obj;
        return device.deviceType == this.deviceType &&
                device.deviceOSType == this.deviceOSType && device.devicePopularity == this.devicePopularity;
    }

}
