package modelo;

import java.time.LocalDate;

public class Estadia {
    private long id;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    //cons


    //geters
    public long getId() {
        return id;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }
    //seters
    public void setId(long id) {
        this.id = id;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

}
