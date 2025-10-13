package modelo;
import java.util.Date;

public class Reserva {

    private Date fechaIngreso;
    private Date fechaEgreso;
    private Habitacion habitacion;
    private ResponsableReserva responsableReserva;

    //constructor
    public Reserva(Date fechaIngreso, Date fechaEgreso, ResponsableReserva responsableReserva, Habitacion habitacion) {
        this.fechaIngreso = fechaIngreso;
        this.fechaEgreso = fechaEgreso;
        this.habitacion = habitacion;
        this.responsableReserva = responsableReserva;
    }
    //getters y setters
    public Date getFechaIngreso() {
        return fechaIngreso;
    }
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public Date getFechaEgreso() {
        return fechaEgreso;
    }
    public void setFechaEgreso(Date fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }
    public Habitacion getHabitacion() {
        return habitacion;
    }
    public ResponsableReserva getResponsableReserva() {
        return responsableReserva;
    }
    public void setResponsableReserva(ResponsableReserva responsableReserva) {
        this.responsableReserva = responsableReserva;
    }
    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }


}
