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
//Esta clase hereda de asignatura
public class Presencial extends Asignatura{
    
    //atributos
    private String libro;
    private Salon salon;
    private Horario horario;
    
    //constructor
    public Presencial(String libro, String nombre, int horas) {
        super(nombre, horas); //llama al contructor de asignatura
        this.libro = libro;
    }
    
    
    //métodos
    public String obtenerLibro(){
        return libro;
    }
    
    public void asignarSalon(Salon salon){
        this.salon = salon;
    }
    
    public void asignarHorario(Horario horario){
        this.horario = horario;
    }
    
    public Horario obtenerHoraio(){
        return horario;
    }
    
    public Salon obtenerSalon(){
        return salon;
    }
}
