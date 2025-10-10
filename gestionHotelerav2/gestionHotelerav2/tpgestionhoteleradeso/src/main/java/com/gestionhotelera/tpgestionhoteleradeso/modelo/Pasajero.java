package com.gestionhotelera.tpgestionhoteleradeso.modelo;
import java.util.Date;

public class Pasajero {

    private String nombres;
    private String apellido;
    private String nroDocumento;
    private String CUIT;
    private Date fechaDeNacimiento;
    private String email;
    private String telefono;
    private String ocupacion;

    //constructor
    public Pasajero(String nombres, String apellido, String nroDocumento, String CUIT, Date fechaDeNacimiento, String email, String telefono, String ocupacion) {
        this.nombres = nombres;
        this.apellido = apellido;
        this.nroDocumento = nroDocumento;
        this.CUIT = CUIT;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.email = email;
        this.telefono = telefono;
        this.ocupacion = ocupacion;
    }

    //getters y setters
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNroDocumento() {
        return nroDocumento;
    }
    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }
    public String getCUIT() {
        return CUIT;
    }
    public void setCUIT(String CUIT) {
        this.CUIT = CUIT;
    }
    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }
    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getOcupacion() {
        return ocupacion;
    }
    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
    



}
