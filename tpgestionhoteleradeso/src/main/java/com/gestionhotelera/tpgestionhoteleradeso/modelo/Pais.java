package com.gestionhotelera.tpgestionhoteleradeso.modelo;

public class Pais {

    private String nombre;
    private String IDPais;

    //constructor
    public Pais(String nombre, String IDPais) {
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
