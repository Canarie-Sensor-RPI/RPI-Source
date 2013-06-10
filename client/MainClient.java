/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sensorup.frontend.test.macreg.fordevice;

import com.sensorup.frontend.test.macreg.*;

/**
 *
 * @author student
 */
public class MainClient {

    public static void main(String[] args) {
        
        // Create a user account
        TestForUserFromWeb testForUserFromWeb=new TestForUserFromWeb();
        testForUserFromWeb.create();
        testForUserFromWeb.list();
        // Register mac from web
        TestForMacFromWeb testForMacFromWeb=new TestForMacFromWeb();
        testForMacFromWeb.create();
        testForMacFromWeb.list();
        // Register mac from device
        TestForMacFromDevice testForMacFromDevice=new TestForMacFromDevice();
        testForMacFromDevice.create();
        testForMacFromDevice.list();
        // HB from device
        TestForHBFromDevice testForHBFromDevice=new TestForHBFromDevice();
        testForHBFromDevice.update();
        testForHBFromDevice.read();
        // Register datastream
        TestForDataStream testForDataStream=new TestForDataStream();
        testForDataStream.create();
        testForDataStream.list();
        
        // Upload Records
        TestForRecord testForRecord=new TestForRecord();
        testForRecord.create();
        testForRecord.list();
        
        //TestForSensor.sample();
        //TestForMac.sample();
        //TestForDataStream testForDataStream=new TestForDataStream();
        //testForDataStream.run();
        //TestForRecord.sample();
    }
}
