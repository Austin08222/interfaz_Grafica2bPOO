
package ec.edu.intsuperior.modelo;

import java.util.Date;

public class Cliente extends Persona {
    private String telefonoContacto;

    public Cliente() {
    }

    public Cliente(String cedula, String nombre, String apellido, Date fechaNacimiento) {
        super(cedula, nombre, apellido, fechaNacimiento);
    }

    public Cliente(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public Cliente(String telefonoContacto, String cedula, String nombre, String apellido, Date fechaNacimiento) {
        super(cedula, nombre, apellido, fechaNacimiento);
        this.telefonoContacto = telefonoContacto;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
        
    }
    @Override
     public String toString() {
        return super.toString()+"\n"
                + "Telefono Contacto" +getTelefonoContacto()+"\n";
}
}
