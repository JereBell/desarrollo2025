package modelo;

public class Consumo {
    private String nombre;
    private double precio;
    private int cantidad;



    //geters
    public String getNombre(){
        return nombre;
    }

    public double getPrecio(){
        return precio;
    }

    public int getCantidad(){
        return cantidad;
    }
    
    //seters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
}
