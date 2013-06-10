/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sensorup.frontend.test.macreg.fordevice;

import com.sensorup.frontend.test.macreg.*;
import com.sensorup.doc.MacInfo;
import com.sensorup.frontend.test.TestBasic;
import net.geosensorweb.utility.string.StringEncoder;
import org.json.JSONObject;
import org.restlet.Request;
import org.restlet.data.Method;
import org.restlet.ext.json.JsonRepresentation;

/**
 *
 * @author student
 */
public class TestForMacFromDevice extends TestRestfulUnit {
    
    String mac = "max00099";
    String description="GSW IOT Test";
    String manufacturer="GSW";
    String model_number="xyz001";
    int connection_mode=1;


    public TestForMacFromDevice() {
        objName = "MAC";
        url0 = "http://david.geocens.ca:9182/iotdemo/v01/macs/";

        url = url0 + mac;
    }

    public String getPostJson() {
        JSONObject data = new JSONObject();
        try {
            data.put("id", mac);
            data.put("description", description);
            data.put("manufacturer", manufacturer);
            data.put("model_number", model_number);
            data.put("connection_mode", connection_mode);
        } catch (Exception e) {
        }
        return data.toString();
    }

    public void delete(){}
    public void update(){}    
}
