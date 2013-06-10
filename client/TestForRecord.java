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
public class TestForRecord extends TestRestfulUnit {
    
    public TestForRecord() {
        objName = "Record";
        url0="http://admin.geocens.ca:9182/iotdemo/v01/datastreams/cbffd783dd5c7d787c9447fd0416a0e2/records/";
    }
    
    public String getPostJson(){
        JSONObject data = new JSONObject();
        try{
            data.put("reading", 12.5);
        }catch(Exception e){}
        return data.toString();
    }
    
    public void update(){}
    public void delete(){}
    public void read(){}
}
