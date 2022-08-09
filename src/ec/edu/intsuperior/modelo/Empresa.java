package ec.edu.intsuperior.modelo;

public class Empresa {
    public String nombreEmpresa;
    public String direccionEmpresa;
   

   
    public Empresa() {
    }
     

    public Empresa(String nombreEmpresa, String direccionEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

            
    @Override
    public String toString() {
        return "los datos de la empresa son : \n "
                + "nombre: " +getNombreEmpresa()+ "\n"
                + "direccion de la empresa : " +getDireccionEmpresa ()+"\n"
                + "empleados de la empresa: ";
                
        
                
    }
   
    
}
