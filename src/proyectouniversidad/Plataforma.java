/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectouniversidad;

/**
 *
 * @author SENA
 */
public class Plataforma {
    
    //atributos
    private String nombre;
    
    //constructor
    public Plataforma(String nombre){
        this.nombre = nombre;
    }

    //método
    public String obtenerNombre() {
        return nombre;
    }
}
