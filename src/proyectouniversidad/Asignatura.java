/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectouniversidad;

import java.util.ArrayList;

/**
 *
 * @author SENA
 */
public class Asignatura {
    
    //atributos
    private String nombre;
    private int horas;
    private ArrayList<Tema> temas;
    
    //constructor

    public Asignatura(String nombre, int horas) {
        this.nombre = nombre;
        this.horas = horas;
        temas = new ArrayList<>(); //instanciar la lista en el constructor
    }
    
    //método set
    public void modificarHoras(int horas){
        this.horas = horas;
    }
    
    //método de la lista para agregar tema
    public void agregarTema(Tema tema){
        temas.add(tema);
    }
    
    //método para eliminar un objeto de la lista
    public void quitarTema(Tema tema){
        temas.remove(tema);
    }
    
    //método
    public void listarTemas(){
        for(Tema tema : temas){
            System.out.println("Nombre: " + tema.obtenerNombre());
            System.out.println("Número de horas: " + tema.obtenerHoras());
        }
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
}
