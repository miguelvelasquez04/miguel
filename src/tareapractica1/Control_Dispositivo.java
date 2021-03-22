/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareapractica1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author EQUIPO
 */
class Control_Dispositivo {
     static File archivo = new File("c:\\Dispositivos.txt");
    private static Object lista;
   
Dispositivo objDispositivo = new Dispositivo();
    static String  nombre;
    static  String correo;
    static String visibilidad;
    static String encendido = "si";    
   static ArrayList<Computadora> validar_nombre() {
         return null;      
    }
   
   public static void Lectura_ArchivoPlano(){
         try {            
            FileReader leer = new FileReader(archivo);
            BufferedReader buffer = new BufferedReader(leer);
            String linea;
            String[] partes;
            lista.equals(lista);
            
            while ((linea = buffer.readLine()) != null) {
                partes = linea.split("\\|");
                nombre = partes[1];
                correo = partes[2];
                visibilidad= partes[3];
                encendido=partes[4];
              
               
                lista.equals(new Dispositivo(nombre, correo, visibilidad, encendido));
            }
        } catch (Exception e) {
            System.out.println("Error al leer");
        }
    }
   
    public static void Escribir_ArhivoPlano() {
               BufferedReader br = null;
        try {
           br = new BufferedReader(new FileReader(archivo));
           String texto = br.readLine();
           while(texto != null)
           {
               System.out.println(texto);
               texto = br.readLine();
           }
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado");
            System.out.println(e.getMessage());
        }
        catch(Exception e) {
            System.out.println("Error de lectura del fichero");
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if(br != null)
                    br.close();
            }
            catch (Exception e) {
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());

            }
        }
    }  
}
    
          
                        
                        
                        
                        
                        
                        
                        
                        
                        
                       
                
   


