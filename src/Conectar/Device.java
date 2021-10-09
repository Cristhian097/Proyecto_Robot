/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conectar;

import javax.bluetooth.RemoteDevice;

/**
 *
 * @author Cristhian
 */
public class Device {
    
    public String name="";
    public RemoteDevice hc05device;
    
     public Device(String name,RemoteDevice hc05device) {
        this.name = name;
        this.hc05device=hc05device;
         
        
    }
     public Device(String name) {
        this.name = name;
    }
}
