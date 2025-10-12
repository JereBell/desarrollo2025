package com.gestionhotelera.tpgestionhoteleradeso.dto;

public class ResponsablePagoTerceroDTO {

    private String CUIT;;
    private String razonSocial;
    private String telefono;

    //constructor
    public ResponsablePagoTerceroDTO(String CUIT, String razonSocial, String telefono) {
        this.CUIT = CUIT;
        this.razonSocial = razonSocial;
        this.telefono = telefono;
    }
    //getters y setters
    public String getCUIT() {
        return CUIT;
    }
    public void setCUIT(String CUIT) {
        this.CUIT = CUIT;
    }
    public String getRazonSocial() {
        return razonSocial;
    }
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    public String getTelefono() {
        return telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}

