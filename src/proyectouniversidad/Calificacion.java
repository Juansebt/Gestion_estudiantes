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
public class Calificacion {
    //atributos
    private double nota1;
    private double nota2;
    private double notaFinal;
    private Estudiante estudiante;
    private Asignatura asignatura;
    
    //métodos set
    public void asignarNota1(int nota1){
        this.nota1 = nota1;
    }
    
    public void asignarNota2(int nota2){
        this.nota2 = nota2;
    }
    
    //método
    public void calcularNotaFinal(){
        notaFinal = nota1*0.70 + nota2*0.3;
    }
    
    //método get
    public double obtenerNotaFinal(){
        return notaFinal;
    }
    
    //métodos set para los atrubutos de tipo estudiante y asignatura
    public void asignarEstudiante(Estudiante estudiante){
        this.estudiante = estudiante;
    }
    
    public void asignarAsignatura(Asignatura asignatura){
        this.asignatura = asignatura;
    }
}
