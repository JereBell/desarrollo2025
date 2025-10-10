package com.gestionhotelera.tpgestionhoteleradeso.modelo;

public class Provincia {

    private String nombre;
    private String IDProvincia;

    //constructor
    public Provincia(String nombre, String IDProvincia) {
        this.nombre = nombre;
        this.IDProvincia = IDProvincia;
    }
    //getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getIDProvincia() {
        return IDProvincia;
    }
    public void setIDProvincia(String IDProvincia) {
        this.IDProvincia = IDProvincia;
    }
    

}
