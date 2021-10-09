
package Main;

import org.opencv.core.Core;

/**
 *
 * @author Cristhian
 */
public class Main_Iniciar {
    
    public static void main(String args[]){
         
     new MainPrincipal().setVisible(true);
    System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }
    
}
