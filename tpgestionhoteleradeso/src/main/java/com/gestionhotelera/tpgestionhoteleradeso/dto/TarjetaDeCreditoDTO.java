package com.gestionhotelera.tpgestionhoteleradeso.dto;


public class TarjetaDeCreditoDTO {

    private Integer NroTarjeta;
    private Integer CVV;
    private String fechaVencimiento;
    private Integer cuotas;
    
    private double monto;
    private double cotizacionEnPesos;

    //constructor
    public TarjetaDeCreditoDTO(Integer NroTarjeta, Integer CVV, String fechaVencimiento, Integer cuotas, double monto, double cotizacionEnPesos) {
        
        this.NroTarjeta = NroTarjeta;
        this.CVV = CVV;
        this.fechaVencimiento = fechaVencimiento;
        this.cuotas = cuotas;
        this.monto = monto;
        this.cotizacionEnPesos = cotizacionEnPesos;
        
        
    }
    //getters y setters
    public Integer getNroTarjeta() {
        return NroTarjeta;
    }
    public void setNroTarjeta(Integer NroTarjeta) {
        this.NroTarjeta = NroTarjeta;
    }
    public Integer getCVV() {
        return CVV;
    }
    public void setCVV(Integer CVV) {
        this.CVV = CVV;
    }
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }
    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    public Integer getCuotas() {
        return cuotas;
    }
    public void setCuotas(Integer cuotas) {
        this.cuotas = cuotas;
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
