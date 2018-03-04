package com.company.devicesStructure;

public class iOS extends Device{
    private double iOSOSVersion;
    //protected int devicePopularity;
    //private String deviceType = "iOS";

    public iOS(){
        //super.deviceOSType = OSType.iOS;
        //super.deviceType = "Unknown";
        this.iOSOSVersion = 9.0;
    }

    public iOS(String deviceType, double iOSOSVersion,int devicePopularity){
        super(deviceType, OSType.iOS, devicePopularity);
        //super.deviceType = deviceType;
        //super.deviceOSType = OSType.iOS;
        //super.devicePopularity = devicePopularity;
        this.iOSOSVersion = iOSOSVersion;
    }


    public void setiOSVersion(double iOSOSVersion){
        this.iOSOSVersion = iOSOSVersion;
    }

    public Double getiOSVersion() {
        return this.iOSOSVersion;
    }
    public void OSVersionInfo(){
        System.out.println("iOS version: " + iOSOSVersion);
    }

    public void WhoIsBetter(){
        System.out.println("iOS is the best!!!");
    }

    @Override
    public String toString() {
        return "This is " + super.deviceType + " device with " + super.deviceOSType + " OS ver. " + iOSOSVersion + " with popularity = " + super.devicePopularity;
    }
}
