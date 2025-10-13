package modelo;

import java.util.List;

public class Habitacion {

    private Integer numero;
    private String IDHabitacion;
    private EstadoHabitacion estado;
    private List<Reserva> reservas;
    private TipoHabitacion tipoHabitacion;

    //constructor
    public Habitacion(Integer numero, String IDHabitacion, EstadoHabitacion estado, List<Reserva> reservas, TipoHabitacion tipoHabitacion) {
        this.numero = numero;
        this.IDHabitacion = IDHabitacion;
        this.estado = estado;
        this.reservas = reservas;
        this.tipoHabitacion = tipoHabitacion;
    }
    //getters y setters
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public String getIDHabitacion() {
        return IDHabitacion;
    }
    public void setIDHabitacion(String IDHabitacion) {
        this.IDHabitacion = IDHabitacion;
    }
    public EstadoHabitacion getEstado() {
        return estado;
    }
    public void setEstado(EstadoHabitacion estado) {
        this.estado = estado;
    }
    public List<Reserva> getReservas() {
        return reservas;
    }
    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }
    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }
    

}
