
package proyectouniversidad;

import java.util.Date;

/**
 *
 * @author SENA
 */
public class Estudiante {
    
    //Atributos
    private String nombre;
    private Date fechaNacimiento; //el tipo Date se debe importar

    //Constructor
    public Estudiante(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    //métodos get
    public String obtenerNombre(){
        return nombre;
    }
    
    public Date obtenerFechaNacimiento(){
        return fechaNacimiento;
    }
    
    //métodos set
    public void asignarNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void asignarFechaNacimiento(Date fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }
}
