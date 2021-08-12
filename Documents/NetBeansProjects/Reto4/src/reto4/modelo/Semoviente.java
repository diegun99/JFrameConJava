
package reto4.modelo;

public class Semoviente {
    private int id;
    private String raza;
    private String color;
    private String proposito;
    private int encargado;

    public Semoviente(int id, String raza, String color, String proposito, int encargado) {
        this.id = id;
        this.raza = raza;
        this.color = color;
        this.proposito = proposito;
        this.encargado = encargado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProposito() {
        return proposito;
    }

    public void setProposito(String proposito) {
        this.proposito = proposito;
    }

    public int getEncargado() {
        return encargado;
    }

    public void setEncargado(int encargado) {
        this.encargado = encargado;
    }

    @Override
    public String toString() {
        return "id=" + id + ", raza=" + raza + ", color=" + color + ", proposito=" + proposito + ", encargado=" + encargado;
    }
    
    
    
    
}
