/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sensorup.frontend.test.macreg.fordevice;

import net.geosensorweb.utility.string.StringEncoder;
import org.json.JSONObject;

/**
 *
 * @author student
 */
public class TestForSensorFromWeb extends TestRestfulUnit {

    String user = "gswiot2@gmail.com";
    String sensor = "max00099";
    String nickName = "Harry";

    public TestForSensorFromWeb() {
        objName = "SENSOR";
        url0 = "http://david.geocens.ca:9182/iotdemo/v01/users/f8f5981c5b465b880b4ae7bb3ee71ed4/sensors/";

        try {
            StringBuilder sb = new StringBuilder().append(user).append("-").append(sensor);
            uid = StringEncoder.getMD5Hash(sb.toString());
        } catch (Exception e) {
        }
        url = url0 + uid;
    }

    public String getPostJson() {
        JSONObject data = new JSONObject();
        try {
            data.put("id", sensor);
            data.put("uid", uid);
            data.put("user", user);
            data.put("nickName", nickName);
        } catch (Exception e) {
        }
        return data.toString();
    }

    public String getPutJson() {
        JSONObject data = new JSONObject();
        try {
            data.put("id", sensor);
            data.put("uid", uid);
            data.put("user", user);
            data.put("nickName", nickName + "_JR");
        } catch (Exception e) {
        }
        return data.toString();
    }
}
