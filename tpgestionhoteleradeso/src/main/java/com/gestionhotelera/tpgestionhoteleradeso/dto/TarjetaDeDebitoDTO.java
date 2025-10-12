package com.gestionhotelera.tpgestionhoteleradeso.dto;



public class TarjetaDeDebitoDTO{

    
    private String NroTarjeta;
    private Integer cuotas;
    private String fechaVencimiento;
    private Integer CVV;
    private double monto;
    private double cotizacionEnPesos;
    

    //constructor
    public TarjetaDeDebitoDTO( String NroTarjeta, Integer cuotas, String fechaVencimiento, Integer CVV, double monto, double cotizacionEnPesos) {
        
        
        this.NroTarjeta = NroTarjeta;
        this.cuotas = cuotas;
        this.fechaVencimiento = fechaVencimiento;
        this.CVV = CVV;
        this.monto = monto;
        this.cotizacionEnPesos = cotizacionEnPesos;

    }
    //getters y setters
    
    public String getNroTarjeta() {
        return NroTarjeta;
    }
    public void setNroTarjeta(String NroTarjeta) {
        this.NroTarjeta = NroTarjeta;
    }
    public Integer getCuotas() {
        return cuotas;
    }
    public void setCuotas(Integer cuotas) {
        this.cuotas = cuotas;
    }
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }
    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    public Integer getCVV() {
        return CVV;
    }
    public void setCVV(Integer CVV) {
        this.CVV = CVV;
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

