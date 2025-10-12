package com.gestionhotelera.tpgestionhoteleradeso.dto;

public class ItemFacturaDTO {

    private Integer cantidad;
    private String IDItemFactura;

    //constructor
    public ItemFacturaDTO(Integer cantidad, String IDItemFactura) {
        this.cantidad = cantidad;
        this.IDItemFactura = IDItemFactura;
    }
    //getters y setters
    public Integer getCantidad() {
        return cantidad;
    }
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    public String getIDItemFactura() {
        return IDItemFactura;
    }
    public void setIDItemFactura(String IDItemFactura) {
        this.IDItemFactura = IDItemFactura;
    }
    

}
