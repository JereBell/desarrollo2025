package modelo;

public class Habitacion {
    private int numero;
    private String descripcion;
    private double valorNoche; //o precio
    private String tipo;
    private int cantidad;
    private boolean estado; //true disponible, false no disponible

    //geters
    public int getNumero(){
        return numero;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public double getValorNoche() {
        return valorNoche;
    }
    public String getTipo() {
        return tipo;
    }
    public int getCantidad() {
        return cantidad;
    }
    public boolean getEstado() {
        return estado;
    }
    //seters
    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public void setValorNoche(double valorNoche) {
        this.valorNoche = valorNoche;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}

