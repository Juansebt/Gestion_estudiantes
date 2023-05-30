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
public class Grupo {
    
    //Atributos 
    private String nombre;
    private String codigo; 
    private ArrayList<Estudiante> estudiantes; //Lista para agregar objetos de la clase relacionada Estudiante
    //el atributo de la lista no se ve en el diagrama pero se identifica por el
    //tipo de relación entre las clases
    
    //constructor
    public Grupo(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        estudiantes = new ArrayList<>(); //Arreglo dinámico
    }
    
    //métodos
    public void matricularEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante); //agregar estudiante a la lista
    }
    
    //método de la lista, para llamar a todo los estudiantes de la lista
    public ArrayList<Estudiante> retornarEstudiantes(){
        return estudiantes;
    }
    
    //mostrar datos de cada estudiante
    public void mostrarDatosEstudiantes(){
        for(Estudiante estudiante : estudiantes){
            System.out.println("Nombre: " + estudiante.obtenerNombre());
            System.out.println("Fecha de nacimiento: " + estudiante.obtenerFechaNacimiento());
        }
    }
}
