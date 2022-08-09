/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

import java.util.Date;

/**
 *
 * @author Santiago Solis
 */
public class Empleado extends Persona{
    double sueldo;

    public Empleado() {
    }

    public Empleado(double sueldo, String cedula, String nombre, String apellido, Date fechaNacimiento) {
        super(cedula, nombre, apellido, fechaNacimiento);
        this.sueldo = sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"
                + "Sueldo" +getSueldo()+"\n"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
