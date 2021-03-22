/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareapractica1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author EQUIPO
 */
public class Computadora {
   
    protected  String  nombre;
    protected  String correo;
    protected  String visibilidad;
    protected  String encendido = "si";
    protected int lista;
    
    

    public Computadora() {
       
    }

    public Computadora(String nombre, String correo, String visibilidad) {
        
       
        this.nombre = nombre;
        this.correo = correo;
        this.visibilidad = visibilidad;
    }

  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getVisibilidad() {
        return visibilidad;
    }

    public void setVisibilidad(String visibilidad) {
        this.visibilidad = visibilidad;
    }

    public String getEncendido() {
        return encendido;
    }

    public void setEncendido(String encendido) {
        this.encendido = encendido;
        
       
 }
    
    }
      
         
          
     
          
          
          
   
     

      
           
   


  
        
     

    

