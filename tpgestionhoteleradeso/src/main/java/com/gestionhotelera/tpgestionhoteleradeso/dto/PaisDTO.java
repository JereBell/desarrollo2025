package com.gestionhotelera.tpgestionhoteleradeso.dto;

public class PaisDTO {

    private String nombre;
    private String IDPais;

    //constructor
    public PaisDTO(String nombre, String IDPais) {
        this.nombre = nombre;
        this.IDPais = IDPais;
    }
    //getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getIDPais() {
        return IDPais;
    }
    public void setIDPais(String IDPais) {
        this.IDPais = IDPais;
    }
    

}
