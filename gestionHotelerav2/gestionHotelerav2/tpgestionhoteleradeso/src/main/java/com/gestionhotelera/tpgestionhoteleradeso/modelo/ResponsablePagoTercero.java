package com.gestionhotelera.tpgestionhoteleradeso.modelo;

public class ResponsablePagoTercero {

    private String CUIT;;
    private String razonSocial;
    private String telefono;

    //constructor
    public ResponsablePagoTercero(String CUIT, String razonSocial, String telefono) {
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
    

}
