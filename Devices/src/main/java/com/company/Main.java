package com.company;

import com.company.devicesStructure.Android;
import com.company.devicesStructure.Device;
import com.company.devicesStructure.IDevice;
import com.company.devicesStructure.iOS;

import java.io.Serializable;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Added devices:");
        System.out.println();

        Device device0 = new Android();
        Device device1 = new Android("Tablet", 7.0,10);
        System.out.println(device0.toString());
        System.out.println(device1.toString());
        System.out.println("Who is better?");
        device1.WhoIsBetter();

        Device device2 = new iOS();
        Device device3 = new iOS("Mobile", 7.0,10);
        System.out.println(device2.toString());
        System.out.println(device3.toString());
        System.out.println("Who is better?");
        device3.WhoIsBetter();

        Android android0 = new Android();
        Android android1 = new Android("Tablet", 8.0,15);
        System.out.println(android0.toString());
        System.out.println(android1.toString());

        iOS iOS0 = new iOS();
        iOS iOS1 = new iOS("Mobile",11.0,20);
        System.out.println(iOS0.toString());
        System.out.println(iOS1.toString());

        //Using ArrayList
        List<Device> devices = new ArrayList<>();
        devices.add(device0);
        devices.add(device1);
        devices.add(device2);
        devices.add(device3);
        devices.add(android0);
        devices.add(android1);
        devices.add(iOS0);
        devices.add(iOS1);

        for (Device device : devices) {
            device.OSVersionInfo();
        }

        devices.sort(new DeviceComparator());

        System.out.println();
        System.out.println("Sorted list of devices:");
        System.out.println();
        for(Device device : devices){
            System.out.println(device);
        }

        //Using Interface
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println("The list of the devices with the using Interface:");
        System.out.println("---------------------------------------------------");

        List<IDevice> devicesInterface = new ArrayList<IDevice>();
        devicesInterface.add(new Android("Mobile",8.0,7));
        devicesInterface.add(new Android("Tablet",6.2,4));
        devicesInterface.add(new iOS("Mobile",10.2,2));
        devicesInterface.add(new iOS("Mobile",11.0,10));
        devicesInterface.add(new iOS("Tablet",11.1,12));

        //using comparator
        devicesInterface.sort(new DeviceComparator());
        System.out.println();
        System.out.println("Sorted list of devices:");
        System.out.println();
        for(IDevice deviceInterface : devicesInterface){
            System.out.println(deviceInterface);
        }

        //Set HashSet
        Set<Device> devicesSetHashSet = new HashSet<>();
        devicesSetHashSet.add(new Android("Mobile", 8.0, 2));
        devicesSetHashSet.add(new iOS("Mobile", 10.0, 1));
        devicesSetHashSet.add(new Android("Mobile", 8.0, 2));
        devicesSetHashSet.add(new Android("Mobile", 8.0, 2));
        devicesSetHashSet.add(new iOS("Mobile", 10.0, 1));
        devicesSetHashSet.add(new iOS("Mobile", 10.0, 3));

        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("Set devices with the using of HashSet");
        System.out.println("--------------------------------");
        System.out.println();
        for(Device device: devicesSetHashSet){
            System.out.println(device);
        }

        //Set TreeSet
        Set<Device> devicesSetTreeSet = new TreeSet<>(new Comparator<Device>() {
            @Override
            public int compare(Device device1, Device device2) {
                return device1.getPopularity() - device2.getPopularity();
            }
        });
        devicesSetTreeSet.add(new Android("Mobile", 8.0, 2));
        devicesSetTreeSet.add(new Android("Mobile", 8.0, 2));
        devicesSetTreeSet.add(new iOS("Mobile", 10.0, 1));
        devicesSetTreeSet.add(new Android("Mobile", 8.0, 2));
        devicesSetTreeSet.add(new iOS("Mobile", 10.0, 1));
        devicesSetTreeSet.add(new iOS("Mobile", 10.0, 3));

        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("Set devices with the using of TreeSet");
        System.out.println("--------------------------------");
        System.out.println();
        for(Device device: devicesSetTreeSet){
            System.out.println(device);
        }

        //Map HashMap
        Map<Device,String> devicesMapHashMap = new HashMap<>();
        devicesMapHashMap.put(new Android("Tablet",7.0,1),"New");
        devicesMapHashMap.put(new Android("Tablet",7.0,1),"Reflashed");
        devicesMapHashMap.put(new Android("Mobile",7.0,5),"New");
        devicesMapHashMap.put(new Android("Tablet",7.0,5),"New");
        devicesMapHashMap.put(new iOS("Tablet",10.0,3),"New");
        devicesMapHashMap.put(new iOS("Tablet",10.0,3),"Reflashed");
        devicesMapHashMap.put(new iOS("Tablet",10.0,5),"New");

        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("Map devices with the using of HashMap");
        System.out.println("--------------------------------");
        System.out.println();
        devicesMapHashMap.forEach((key, value) -> System.out.println("Key: " + key.toString() + " Value: " + value));


        //Map TreeMap
         Map<Device,String> devicesMapTreeMap = new TreeMap<>(new Comparator<Device>() {
             @Override
             public int compare(Device device1, Device device2) {
                 if (device1.getPopularity() == device2.getPopularity() && device1.getDeviceType()==device2.getDeviceType() && device1.getDeviceOSType()==device2.getDeviceOSType()){
                    return device1.getPopularity() - device2.getPopularity();
                 }
                 else {
                     if (device1.getPopularity() > device2.getPopularity()) {
                         return 1;
                     } else {
                         return -1;
                     }
                 }
             }
        });


        devicesMapTreeMap.put(new Android("Tablet",7.0,1),"New");
        devicesMapTreeMap.put(new Android("Tablet",7.0,1),"Reflashed");
        devicesMapTreeMap.put(new Android("Mobile",7.0,5),"New");
        devicesMapTreeMap.put(new Android("Tablet",7.0,5),"New");
        devicesMapTreeMap.put(new iOS("Tablet",10.0,3),"New");
        devicesMapTreeMap.put(new iOS("Tablet",10.0,3),"Reflashed");
        devicesMapTreeMap.put(new iOS("Tablet",10.0,5),"New");


        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("Map devices with the using of TreeMap");
        System.out.println("--------------------------------");
        System.out.println();
        devicesMapTreeMap.forEach((key, value) -> System.out.println("Key: " + key.toString() + " Value: " + value));

    }
}
