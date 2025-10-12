package com.gestionhotelera.tpgestionhoteleradeso.modelo;

public class Ciudad {

    private String nombre;
    private String IDCiudad;

    //constructor
    public Ciudad(String nombre, String IDCiudad) {
        this.nombre = nombre;
        this.IDCiudad = IDCiudad;
    }
    //getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getIDCiudad() {
        return IDCiudad;
    }
    public void setIDCiudad(String IDCiudad) {
        this.IDCiudad = IDCiudad;
    }
    

}
