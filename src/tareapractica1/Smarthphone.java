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
public class Smarthphone extends Computadora {
    int numerotel;

    public Smarthphone() {
        
    }

    public Smarthphone(int numerotel, String nombre, String correo, String visibilidad) {
        super(nombre, correo, visibilidad);
        this.numerotel = numerotel;
    }
    
    public int getNumerotel() {
        return numerotel;
    }

    public void setNumerotel(int numerotel) {
        this.numerotel = numerotel;
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