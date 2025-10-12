package com.gestionhotelera.tpgestionhoteleradeso.modelo;
import java.util.Date;

public class Cheque extends MedioDePago{

    private Date fechaCobro;
    private String nroCheque;
    private String plaza;
    private EstadoCheque estado;

    //constructor
    public Cheque(Date fechaCobro, String nroCheque, String plaza, EstadoCheque estado, double monto, double cotizacionEnPesos) {
        super(monto, cotizacionEnPesos);
        this.fechaCobro = fechaCobro;
        this.nroCheque = nroCheque;
        this.plaza = plaza;
        this.estado = estado;
    }
    //getters y setters
    public Date getFechaCobro() {
        return fechaCobro;
    }
    public void setFechaCobro(Date fechaCobro) {
        this.fechaCobro = fechaCobro;
    }
    public String getNroCheque() {
        return nroCheque;
    }
    public void setNroCheque(String nroCheque) {
        this.nroCheque = nroCheque;
    }
    public String getPlaza() {
        return plaza;
    }
    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }
    public EstadoCheque getEstado() {
        return estado;
    }
    public void setEstado(EstadoCheque estado) {
        this.estado = estado;
    }

}
