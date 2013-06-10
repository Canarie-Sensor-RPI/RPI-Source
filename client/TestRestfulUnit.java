/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sensorup.frontend.test.macreg.fordevice;

/**
 *
 * @author student
 */
public class TestRestfulUnit {
    String objName=null;
    String url0=null;
    String uid=null;
    String url=null;
    
    public TestRestfulUnit(){
    }    
    
    public String getPostJson() {
        return null;
    }

    public String getPutJson() {
        return null;
    }
    
    public void run() {
        System.out.println("=========================================");
        System.out.println("Test for "+objName);
        
        create();
        list();
        update();
        read();
        delete();
        list();
    }
    
    public void create() {
        System.out.println("******Test to create a "+objName);
        TestRestfulBasic.testQueryWithPOSTMethod(url0,getPostJson());
    }    
    
    public void list() {
        System.out.println("******Test to list "+objName);
        TestRestfulBasic.testQueryWithGETMethod(url0);
    }        
    
    public void read() {
        System.out.println("******Test to get a "+objName);
        TestRestfulBasic.testQueryWithGETMethod(url);
    }    
    
    public void update() {
        System.out.println("******Test to update a "+objName);
        TestRestfulBasic.testQueryWithPUTMethod(url,getPutJson());
    }    
    
    public void delete() {
        System.out.println("******Test to delete a "+objName);
        TestRestfulBasic.testQueryWithDELETEMethod(url);
    }
}
