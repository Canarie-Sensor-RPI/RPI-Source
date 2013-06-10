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
public class TestForMacFromWeb extends TestRestfulUnit {
    
    String user = "gswiot2@gmail.com";
    String mac = "max00099";

    public TestForMacFromWeb() {
        objName = "MAC";
        url0 = "http://david.geocens.ca:9182/iotdemo/v01/macs/";

        try {
            StringBuilder sb = new StringBuilder().append(user).append("-").append(mac);
            uid = StringEncoder.getMD5Hash(sb.toString());
        } catch (Exception e) {
        }
        url = url0 + mac;
    }

    public String getPostJson() {
        JSONObject data = new JSONObject();
        try {
            data.put("id", mac);
            data.put("uid", uid);
            data.put("user", user);
        } catch (Exception e) {
        }
        return data.toString();
    }

    public void delete(){}
    public void update(){}
}
