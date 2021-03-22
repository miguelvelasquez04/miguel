/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareapractica1;

import java.util.Scanner;

/**
 *
 * @author EQUIPO
 */
public class CrearDispos {

   // private static void crearComputadora() {
        
    
       
   // }

   
   /* String nombre;
    String correo;
    String visibilidad;
    String encendido;
    int*/
    String compPortatil;
    String tablet;
    String SmartWatch;
    String SmartPhone;
    String AuricularesInalam;

    public CrearDispos(String compPortatil, String tablet, String SmartWatch, String SmartPhone, String AuricularesInalam) {
        this.compPortatil = compPortatil;
        this.tablet = tablet;
        this.SmartWatch = SmartWatch;
        this.SmartPhone = SmartPhone;
        this.AuricularesInalam = AuricularesInalam;
    }

    public String getCompPortatil() {
        return compPortatil;
    }

    public void setCompPortatil(String compPortatil) {
        this.compPortatil = compPortatil;
    }

    public String getTablet() {
        return tablet;
    }

    public void setTablet(String tablet) {
        this.tablet = tablet;
    }

    public String getSmartWatch() {
        return SmartWatch;
    }

    public void setSmartWatch(String SmartWatch) {
        this.SmartWatch = SmartWatch;
    }

    public String getSmartPhone() {
        return SmartPhone;
    }

    public void setSmartPhone(String SmartPhone) {
        this.SmartPhone = SmartPhone;
    }

    public String getAuricularesInalam() {
        return AuricularesInalam;
    }

    public void setAuricularesInalam(String AuricularesInalam) {
        this.AuricularesInalam = AuricularesInalam;
    }
    
    public static void CrearDispositivos()
    {
       Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        
        do{
            System.out.println("--------- Crear Dispositivos----------------");
            System.out.println("1. Computadora portatil");
            System.out.println("2. tablet");
            System.out.println("3. smartWatch");
            System.out.println("4. Smartphone");
            System.out.println("5. Auriculares inalambricos");
            System.out.println("6. salir");
            System.out.println("Seleccione la opcion a ejecutar:");
            System.out.println("-------------------------------------------");
            opcion = entrada.nextInt();
          
    } while (opcion < 1 || opcion > 6);
         switch(opcion){
            case 1: 
                    break;
            case 2: 
                    break;
            case 3: 
                    break;
            case 4:
                    break;
            case 5:
                    break;
            case 6:
                    break;
           
    }
        
        
}
    }
