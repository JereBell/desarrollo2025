package com.gestionhotelera.tpgestionhoteleradeso.dto;

public class MonedaDTO {

    private String tipo;
    private String IDMoneda;

    //constructor
    public MonedaDTO(String tipo, String IDMoneda) {
        this.tipo = tipo;
        this.IDMoneda = IDMoneda;
    }
    //getters y setters
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getIDMoneda() {
        return IDMoneda;
    }
    public void setIDMoneda(String IDMoneda) {
        this.IDMoneda = IDMoneda;
    }
    

}

