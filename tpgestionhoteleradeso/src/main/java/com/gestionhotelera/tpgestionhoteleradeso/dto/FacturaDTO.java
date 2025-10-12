package com.gestionhotelera.tpgestionhoteleradeso.dto;
import com.gestionhotelera.tpgestionhoteleradeso.modelo.TipoFactura;

import java.util.Date;

public class FacturaDTO {

    private Date fechaDeEmision;
    private TipoFactura tipo;
    private double importeTotal;

    //constructor
    public FacturaDTO(Date fechaDeEmision, TipoFactura tipo, double importeTotal) {
        this.fechaDeEmision = fechaDeEmision;
        this.tipo = tipo;
        this.importeTotal = importeTotal;
    }
    //getters y setters
    public Date getFechaDeEmision() {
        return fechaDeEmision;
    }
    public void setFechaDeEmision(Date fechaDeEmision) {
        this.fechaDeEmision = fechaDeEmision;
    }
    public TipoFactura getTipo() {
        return tipo;
    }
    public void setTipo(TipoFactura tipo) {
        this.tipo = tipo;
    }
    public double getImporteTotal() {
        return importeTotal;
    }
    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }
    

}

