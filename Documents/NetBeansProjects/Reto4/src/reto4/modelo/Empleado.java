
package reto4.modelo;



public class Empleado {
    private int numDocumento;
    private String nombre;
    private String telefono;
    private String direccion;
    private String fechaContrato;

    public Empleado(int numDocumento, String nombre, String telefono, String direccion, String fechaContrato) {
        this.numDocumento = numDocumento;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fechaContrato = fechaContrato;
    }

    public int getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(int numDocumento) {
        this.numDocumento = numDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(String fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    @Override
    public String toString() {
        return "numDocumento=" + numDocumento + ", nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + ", fechaContrato=" + fechaContrato;
    }
    
    
    
    
    
}
