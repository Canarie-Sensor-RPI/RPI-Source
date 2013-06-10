/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sensorup.frontend.test.macreg.fordevice;

import org.json.JSONObject;

/**
 *
 * @author student
 */
public class TestForHBFromDevice extends TestRestfulUnit {

    String mac = "max00099";
    int offline_count_in_last_3hr = 0;
    int reboot_count_in_last_3hr = 1;
    int samplingrate = 10;
    int samplingrateunit = 0;

    public TestForHBFromDevice() {
        objName = "HB";
        url0 = "http://david.geocens.ca:9182/iotdemo/v01/hb/";

        url = url0 + mac;
    }

    public String getPutJson() {
        JSONObject data = new JSONObject();
        try {
            data.put("id", mac);
            data.put("offline_count_in_last_3hr", offline_count_in_last_3hr);
            data.put("reboot_count_in_last_3hr", reboot_count_in_last_3hr);
            data.put("samplingrate", samplingrate);
            data.put("samplingrateunit", samplingrateunit);
        } catch (Exception e) {
        }
        return data.toString();
    }
    
    public void delete(){}
    public void create(){}
}
