package modelo;

import java.time.LocalDate;

public class Huesped {
    private long id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String nacionalidad;
    private String ocupacion;
    private String email;
    private String tipoDocumento;
    private int numeroDocumento;
    private LocalDate fechaNacimiento;
    // posicion frente al ivapodemos charlar pq se puede obtener mediante instanceOf

    //cons

    //geters
    public long getId() {
        return id;
    }  
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public String getOcupacion() {
        return ocupacion;
    }
    public String getEmail() {
        return email;
    }
    public String getTipoDocumento() {
        return tipoDocumento;
    }
    public int getNumeroDocumento() {
        return numeroDocumento;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    //seters
    public void setId(long id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
