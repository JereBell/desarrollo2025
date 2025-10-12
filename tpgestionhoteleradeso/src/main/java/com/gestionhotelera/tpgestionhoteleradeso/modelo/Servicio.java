package com.gestionhotelera.tpgestionhoteleradeso.modelo;
import java.util.Date;

public class Servicio {

    private Date fechaDeRealizacion;
    private String IDServicio;
    private double precioUnitario;
    private Integer cantidad;
    private String descripcion;
    private Integer cantidadPagada;

    //constructor
    public Servicio(Date fechaDeRealizacion, String IDServicio, double precioUnitario, Integer cantidad, String descripcion, Integer cantidadPagada) {
        this.fechaDeRealizacion = fechaDeRealizacion;
        this.IDServicio = IDServicio;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.cantidadPagada = cantidadPagada;
    }

    //getters y setters
    public Date getFechaDeRealizacion() {
        return fechaDeRealizacion;
    }
    public void setFechaDeRealizacion(Date fechaDeRealizacion) {
        this.fechaDeRealizacion = fechaDeRealizacion;
    }
    public String getIDServicio() {
        return IDServicio;
    }
    public void setIDServicio(String IDServicio) {
        this.IDServicio = IDServicio;
    }
    public double getPrecioUnitario() {
        return precioUnitario;
    }
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    public Integer getCantidad() {
        return cantidad;
    }
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Integer getCantidadPagada() {
        return cantidadPagada;
    }
    public void setCantidadPagada(Integer cantidadPagada) {
        this.cantidadPagada = cantidadPagada;
    }
    


}
