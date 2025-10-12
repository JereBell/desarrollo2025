package com.gestionhotelera.tpgestionhoteleradeso.modelo;

public class Habitacion {

    private Integer numero;
    private String IDHabitacion;
    private EstadoHabitacion estado;

    //constructor
    public Habitacion(Integer numero, String IDHabitacion, EstadoHabitacion estado) {
        this.numero = numero;
        this.IDHabitacion = IDHabitacion;
        this.estado = estado;
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
    

}
