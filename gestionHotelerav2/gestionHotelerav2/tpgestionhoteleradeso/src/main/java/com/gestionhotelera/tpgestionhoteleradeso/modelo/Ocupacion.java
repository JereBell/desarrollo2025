package com.gestionhotelera.tpgestionhoteleradeso.modelo;
import java.util.Date;

public class Ocupacion {

    private Date fechaIngreso;
    private Date fechaEgreso;

    //constructor
    public Ocupacion(Date fechaIngreso, Date fechaEgreso) {
        this.fechaIngreso = fechaIngreso;
        this.fechaEgreso = fechaEgreso;
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

}
