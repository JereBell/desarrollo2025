package modelo;
import java.util.Date;
import java.util.List;

public class Ocupacion {

    private Date fechaIngreso;
    private Date fechaEgreso;
    private Habitacion habitacion;
    private List<Servicio> servicios;
    private Pasajero responsble;
    private List<Pasajero> acompañantes;

    //constructor
    public Ocupacion(Date fechaIngreso, Date fechaEgreso, Habitacion habitacion, List<Servicio> servicios, Pasajero responsble) {
        this.fechaIngreso = fechaIngreso;
        this.fechaEgreso = fechaEgreso;
        this.habitacion = habitacion;
        this.servicios = servicios;
        this.responsble = responsble;
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
    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
    public List<Servicio> getServicios() {
        return servicios;
    }
    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }
    public Pasajero getResponsble() {
        return responsble;
    }
    public void setResponsble(Pasajero responsble) {
        this.responsble = responsble;
    }
    public List<Pasajero> getAcompañantes() {
        return acompañantes;
    }
    public void setAcompañantes(List<Pasajero> acompañantes) {
        this.acompañantes = acompañantes;
    }
    

}
