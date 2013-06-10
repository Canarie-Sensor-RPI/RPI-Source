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
public class TestForDataStream extends TestRestfulUnit {
    String user="gswiot2@gmail.com";
    String sensor="max00099";
    String phenId="hydrogentest1";
    String phenName="hydrogentest1Name";
    String unit="unittest";

    public TestForDataStream() {
        objName = "DataStream";
        url0="http://admin.geocens.ca:9182/iotdemo/v01/users/f8f5981c5b465b880b4ae7bb3ee71ed4/sensors/33421de9fe0b5caae81869b49ed084a4/datastreams/";

        try {
            StringBuilder sb=new StringBuilder().append(user).append("-")
                    .append(sensor).append("-").append(phenId);
            uid=StringEncoder.getMD5Hash(sb.toString());                    
        } catch (Exception e) {
        }
        url = url0 + uid;
    }
    
    public String getPostJson(){
        JSONObject data = new JSONObject();
        try{
            data.put("id", phenId);
            data.put("user", user);
            data.put("sensor", sensor);
            data.put("phenName", phenName);
            data.put("unit", unit);
        }catch(Exception e){}
        return data.toString();
    }
    
    public String getPutJson(){
        JSONObject data = new JSONObject();        
        try{
            data.put("id", phenId);
            data.put("uid", uid);
            data.put("user", user);
            data.put("sensor", sensor);
            data.put("phenName", phenName);
            data.put("unit", unit+"_modified");
        }catch(Exception e){}
        return data.toString();
    }
}
