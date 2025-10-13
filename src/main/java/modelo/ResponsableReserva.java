package modelo;

import java.util.List;

public class ResponsableReserva {
    private String nombre;
    private String apellido;
    private String telefono;
    private List<Reserva> reservas;
    

    // Constructor
    public ResponsableReserva(String nombre, String apellido, String telefono, List<Reserva> reservas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.reservas = reservas;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getTelefono() {
        return telefono;
    }
    public List<Reserva> getReservas() {
        return reservas;
    }
    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    

}
