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
public class TestForUserFromWeb extends TestRestfulUnit {
    String user = "gswiot2@gmail.com";
    String firstName = "IOT2";
    String lastName = "GSW2";

    public TestForUserFromWeb() {
        objName = "USER";
        url0 = "http://david.geocens.ca:9182/iotdemo/v01/users/";

        try {
            uid = StringEncoder.getMD5Hash(new StringBuilder().append(user).toString());
        } catch (Exception e) {
        }
        url = url0 + uid;
    }

    public String getPostJson() {
        JSONObject data = new JSONObject();
        try {
            data.put("id", user);
            data.put("uid", uid);
            data.put("lastName", lastName);
            data.put("firstName", firstName);
        } catch (Exception e) {
        }
        return data.toString();
    }

    public String getPutJson() {
        JSONObject data = new JSONObject();
        try {
            data.put("id", user);
            data.put("uid", uid);
            data.put("lastName", lastName);
            data.put("firstName", firstName + "_modified");
        } catch (Exception e) {
        }
        return data.toString();
    }
}
