/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sensorup.frontend.test.macreg.fordevice;


import org.restlet.Client;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.data.Method;
import org.restlet.data.Protocol;
import org.restlet.ext.json.JsonRepresentation;
import org.restlet.representation.Representation;

/**
 *
 * @author student
 */
public class TestRestfulBasic{

    private synchronized static void talkToServer(Request request){
        Client client = new Client(Protocol.HTTP);
        try{
            Response response = client.handle(request);
            Representation output = response.getEntity();
            System.out.print("response = ");
            output.write(System.out);
            client.stop();
        }catch(Exception e){}
        System.out.println();
    }    
    
    public static void testQueryWithGETMethod(String url){
        // Prepare the request
        Request request = new Request(Method.GET, url);
        talkToServer(request);
    }
    
    public static void testQueryWithDELETEMethod(String url){
        // Prepare the request
        try {
            Request request = new Request(Method.DELETE, url);
            talkToServer(request);
        }catch(Exception e){}
    }

    public static void testQueryWithPOSTMethod(String url,String json){
        // Prepare the request        
        try {            
            testQueryWithMethod(url,json,Method.POST);
        }catch(Exception e){}
    }        
    
    public static void testQueryWithPUTMethod(String url,String json){
        // Prepare the request        
        try {
            testQueryWithMethod(url,json,Method.PUT);
        }catch(Exception e){}
    }
    
    private static void testQueryWithMethod(String url,String json, Method method ){
        // Prepare the request        
        try {
            Request request = new Request(method, url);
            JsonRepresentation rep = new JsonRepresentation(json);
            request.setEntity(rep);
            talkToServer(request);
        }catch(Exception e){}
    }    
}
