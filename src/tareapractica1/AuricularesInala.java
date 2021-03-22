/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareapractica1;

/**
 *
 * @author EQUIPO
 */
public class AuricularesInala extends Computadora {

    public AuricularesInala() {
    }

    public AuricularesInala(String nombre, String correo, String visibilidad) {
        super(nombre, correo, visibilidad);
        
        this.nombre = nombre;
        this.correo = correo;
        this.visibilidad = visibilidad;
    }
}
