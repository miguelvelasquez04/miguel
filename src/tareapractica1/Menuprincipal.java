/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareapractica1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menuprincipal {
   
     
    public static void main(String[] args)
    {
        int salir = 0;
        mostrarMenuprincipal();
        Control_Dispositivo.Escribir_ArhivoPlano();
    }
    
    
     public static void mostrarMenuprincipal()
    {
         Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        
        do{
          System.out.println("---------  **E C O S I S T E M A   DE   D I S P O S I T I V O S** ----------------\n");
            System.out.println("1. Crear dispositivo");
            System.out.println("2. Administrar Dispositivo");
            System.out.println("3. Acciones con Dispoditivos");
            System.out.println("4. Acciones externas de Dispositivos");
            System.out.println("5. Cargas masivas");
            System.out.println("6. Logs ");
            System.out.println("0. salir");
            System.out.println("-------------------------------------------\n");
            System.out.println("seleccione la opción a ejecutar: ");
           
            opcion  = entrada.nextInt();
         } while (opcion < 1 || opcion > 6);

        switch (opcion) {
            case 1:
                MenuCrearDispo dispositivos = new  MenuCrearDispo();
                 dispositivos.submenuDispoACrear();
                break;
                
            case 2:
              MenuCrearDispo dispositivo = new MenuCrearDispo();
              dispositivo.Opciones_administrarDispositivos ();
                break;
                
            case 3:
       
               MenuCrearDispo conexion = new MenuCrearDispo();
                conexion.AccionDispo();
                conexion.Opcion_AccionDispo();
                break;
                
            case 5:
                System.exit(0);
                break;
                 
        }
    }
}
 
   

   
     

