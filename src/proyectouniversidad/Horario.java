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
public class Horario {
    
    //atributos
    private String dia;
    private int horaInicio;
    private int horaFinal;

    //constructor
    public Horario(String dia, int horaInicio, int horaFinal) {
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
    }
    
    //métodos get
    public String obtenerDia(){
        return dia;
    }
    
    public int obtenerHoraInicio(){
        return horaInicio;
    }
    
    public int obtenerHoraFinal(){
        return horaFinal;
    }
}
