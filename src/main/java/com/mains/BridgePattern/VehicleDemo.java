package com.mains.BridgePattern;

import java.util.ArrayList;

public class VehicleDemo {
    public static void main(String[] args) {

      ArrayList <Vehicle> vehicleList = new ArrayList<>();
      vehicleList.add(new Car(new HighPerformance()));
      vehicleList.add(new Car(new LowPerformance()));

      for (Vehicle vList : vehicleList) {
        vList.run();
      }
   }
}
