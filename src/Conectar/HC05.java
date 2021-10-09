package Conectar;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.bluetooth.DeviceClass;
import javax.bluetooth.DiscoveryAgent;
import javax.bluetooth.DiscoveryListener;
import javax.bluetooth.LocalDevice;
import javax.bluetooth.RemoteDevice;
import javax.bluetooth.ServiceRecord;
import javax.bluetooth.UUID;
import javax.microedition.io.Connection;
import javax.microedition.io.Connector;
import javax.microedition.io.StreamConnection;
import javax.swing.JOptionPane;


public  class HC05 {

    boolean scanFinished = false;
    RemoteDevice hc05device = null;
    RemoteDevice hc05device2 = null;
   
    String hc05Url;

    public Vector<Device> devices = new Vector<>();

    public void scan() throws Exception {
        LocalDevice.getLocalDevice().getDiscoveryAgent().startInquiry(DiscoveryAgent.GIAC, new DiscoveryListener() {
            @Override
            public void deviceDiscovered(RemoteDevice btDevice, DeviceClass cod) {
                try {
                    String name = btDevice.getFriendlyName(false);
                    RemoteDevice dev = btDevice;
                    Device d = new Device(name, dev);
                    devices.add(d);
                    System.out.println(name + " added");

                } catch (IOException ex) {
                    Logger.getLogger(HC05.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            @Override
            public void servicesDiscovered(int i, ServiceRecord[] srs) {
                scanFinished = true;
            }

            @Override
            public void serviceSearchCompleted(int i, int i1) {

            }

            @Override
            public void inquiryCompleted(int i) {

            }

        });
        
    }

    public void conect(String s) throws Exception {
        if ("RECEPTOR".equals(s) || "HC-06".equals(s)) {
            System.out.println("connecting");
            for (int i = 0; i < devices.size(); i++) {
                if ("RECEPTOR".equals(devices.elementAt(i).name) || "HC-06".equals(devices.elementAt(i).name)) {
                    hc05device = devices.elementAt(i).hc05device;
                    hc05device2=hc05device;
                }

            }
            UUID uuid = new UUID(0x1101); //scan for btspp://... services (as HC-05 offers it)
            UUID[] searchUuidSet = new UUID[]{uuid};
            int[] attrIDs = new int[]{
                0x0100 // service name
            };
            scanFinished = false;

            LocalDevice.getLocalDevice().getDiscoveryAgent().searchServices(attrIDs, searchUuidSet,
                    hc05device, new DiscoveryListener() {
                @Override
                public void deviceDiscovered(RemoteDevice btDevice, DeviceClass cod) {
                }

                @Override
                public void inquiryCompleted(int discType) {
                }

                @Override
                public void serviceSearchCompleted(int transID, int respCode) {
                    scanFinished = true;
                }

                @Override
                public void servicesDiscovered(int transID, ServiceRecord[] servRecord) {
                    for (int i = 0; i < servRecord.length; i++) {
                        hc05Url = servRecord[i].getConnectionURL(ServiceRecord.NOAUTHENTICATE_NOENCRYPT, false);
                        if (hc05Url != null) {
                            break; //take the first one
                        }
                    }
                }
            });

            while (!scanFinished) {
                Thread.sleep(1);
            }
            JOptionPane.showMessageDialog(null, "Conexion exitosa\nIP:"+hc05device+"\nNombre:"+s);
            System.out.println("got it");
        } else {

            JOptionPane.showMessageDialog(null, "No se logro establecer conexion intente de nuevo");
            System.out.println("cannot conect");

        }

    }

    public void action1(String txt) throws Exception {
        if (hc05device != null) {
            System.out.println("Direccion IP"+hc05device);
            StreamConnection streamConnection = (StreamConnection) Connector.open(hc05Url);
            OutputStream os = streamConnection.openOutputStream();
            InputStream is = streamConnection.openInputStream();

            os.write(txt.getBytes()); //just send '1' to the device
            os.close();
            is.close();
            streamConnection.close();
            System.out.println("Mensaje enviado:"+txt);
            
        } else {

            System.out.println("Mensaje no enviado");
   //         System.out.println(hc05device2);

        }
    }

    public RemoteDevice action2(String text) throws Exception {
        RemoteDevice ip=null; 
         if (hc05device2 != null) {
            StreamConnection streamConnection = (StreamConnection) Connector.open(hc05Url);
            OutputStream os = streamConnection.openOutputStream();
            InputStream is = streamConnection.openInputStream();

            os.write(text.getBytes()); //just send '0' to the device
            os.close();
            is.close();
            streamConnection.close();
             System.out.println("Mensaje enviado");
        } else {
            System.out.println("Mensaje no enviado");
        }
        System.out.println(hc05device2);
    
        return ip ;

    }

    }
