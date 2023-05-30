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
public class Tema {
    
    //atributos
    private String nombre;
    private int horas;

    //constructor
    public Tema(String nombre, int horas) {
        this.nombre = nombre;
        this.horas = horas;
    }
    
    //método set
    public void modificarHoras(int horas){
        this.horas =  horas;
    }
    
    //métodos get
    public String obtenerNombre(){
        return nombre;
    }
    
    public int obtenerHoras(){
        return horas;
    }
}
