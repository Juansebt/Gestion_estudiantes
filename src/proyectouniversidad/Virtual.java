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
//Hereda de asignatura
public class Virtual extends Asignatura{
    
    //atributos
    private String url;
    private Plataforma plataforma;
    
    //constrcutor
    public Virtual(String url, String nombre, int horas){    
        super(nombre, horas);
        this.url = url;
    }

    //método get
    public String obtenerUrl() {
        return url;
    }
    
    //método set para el atributo de tipo plataforma
    public void asignarPlataforma(Plataforma plataforma){
        this.plataforma = plataforma;
    }
}
