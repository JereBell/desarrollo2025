package dto;
import java.util.Date;

import modelo.EstadoCheque;

public class ChequeDTO{

    private Date fechaCobro;
    private String nroCheque;
    private String plaza;
    private EstadoCheque estado;
    private double monto;
    private double cotizacionEnPesos;

    //constructor
    public ChequeDTO(Date fechaCobro, String nroCheque, String plaza, EstadoCheque estado, double monto, double cotizacionEnPesos) {
        
        this.fechaCobro = fechaCobro;
        this.nroCheque = nroCheque;
        this.plaza = plaza;
        this.estado = estado;
        this.monto = monto;
        this.cotizacionEnPesos = cotizacionEnPesos;

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
    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
    public double getCotizacionEnPesos() {
        return cotizacionEnPesos;
    }
    public void setCotizacionEnPesos(double cotizacionEnPesos) {
        this.cotizacionEnPesos = cotizacionEnPesos;
    }
    

}
