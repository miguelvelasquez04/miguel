/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareapractica1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author EQUIPO
 */
public class ControlComputadora {
    
    static File archivo = new File("c:\\Computadora.txt");
    Computadora objProducto = new Computadora();
    static String nombre;
    static String correo;
    static String visibilidad;
    static String encendido = "si";
    
   

    private static ArrayList<Computadora> lista = new ArrayList<>();
    
     public void Lectura_ArchivoPlano() {
        try {            
            FileReader leer = new FileReader(archivo);
            BufferedReader buffer = new BufferedReader(leer);
            String linea;
            String[] partes;
            lista.clear();
            
            while ((linea = buffer.readLine()) != null) {
                partes = linea.split("\\|");
                nombre = partes[0];
                correo = partes[1];
                visibilidad = partes[2];
                encendido = partes[3];
               
                lista.add(new Computadora(nombre, correo, visibilidad, encendido));
            }
        } catch (Exception e) {
            System.out.println("Error al leer");
        }
    }
public static void Escribir_ArhivoPlano() {
        try {

            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("");
            bw.close();
 
            FileWriter escribir = new FileWriter(archivo, true);
            PrintWriter buffer = new PrintWriter(escribir);
            String fila ;
            
            for (int i = 0; i <lista.size(); i++) {
                fila = lista.get(i).getNombre()+ "|" + lista.get(i).getCorreo()+ "|"
                        + lista.get(i).getVisibilidad()+ "|" + lista.get(i).getEncendido();
                
                buffer.println(fila);
            }
            escribir.close();
        } 
        catch (Exception e) {
            System.out.println("Error al escribir");
        }
    }   
    
    public static void registrar(Computadora objComputadora) {
        lista.add(objComputadora);
        Escribir_ArhivoPlano();
    }

     public static void actualizar(int fila, Computadora objComputadora) {
        lista.set(fila, objComputadora);
        Escribir_ArhivoPlano();
    }

    public static void eliminar(int fila, Computadora objProducto) {
        lista.set(fila, objProducto);
        Escribir_ArhivoPlano();
    }

    public static ArrayList<Computadora> listar() {
        return lista;
    }

    public static ArrayList<Computadora> validar_nombreComputadora(String nombre) {

        ArrayList<Computadora> listaEncontrada = new ArrayList<>();

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre()== nombre) {
                listaEncontrada.add(lista.get(i));
            }
        }

        return listaEncontrada;
    }

    public static ArrayList<Computadora> buscarcorreo(String correo) {

        ArrayList<Computadora> listaEncontrada = new ArrayList<>();

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCorreo()== correo && lista.get(i).getEncendido().equals("A")) {
                listaEncontrada.add(lista.get(i));
            }
        }

        return listaEncontrada;
    }

    public static ArrayList<Computadora> buscarPorNombre(String nombre) {

        ArrayList<Computadora> listaEncontrada = new ArrayList<>();

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre().contains(nombre) && lista.get(i).getEncendido().equals("A")) {
                listaEncontrada.add(lista.get(i));
            }
        }

        return listaEncontrada;
    }

}
