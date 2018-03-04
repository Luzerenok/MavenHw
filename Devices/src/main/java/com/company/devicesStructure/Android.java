package com.company.devicesStructure;

public class Android extends Device{
    private double androidOSVersion;
   // protected int devicePopularity;
    //private String deviceType = "Mobile";

    public Android(){
        //super.deviceOSType = OSType.Android;
        //super.deviceType = "Unknown";
        this.androidOSVersion = 4.0;
    }

    public Android(String deviceType, double androidOSVersion,int devicePopularity){
        super(deviceType, OSType.Android, devicePopularity);
        //super.deviceType = deviceType;
        //super.deviceOSType = OSType.Android;
        //super.devicePopularity = devicePopularity;
        this.androidOSVersion = androidOSVersion;
    }


    public void setAndroidVersion(double androidOSVersion){
        this.androidOSVersion = androidOSVersion;
    }

    public Double getAndroidVersion() {
        return this.androidOSVersion;
    }
    public void OSVersionInfo(){
        System.out.println("Android version: " + androidOSVersion);
    }

    public void WhoIsBetter(){
        System.out.println("Android is the best!!!");
    }

    @Override
    public String toString() {
        return "This is " + super.deviceType + " device with " + super.deviceOSType + " OS ver. " + androidOSVersion + " with popularity = " + super.devicePopularity;
    }
}
