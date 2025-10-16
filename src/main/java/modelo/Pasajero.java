package modelo;
import java.util.Date;

public class Pasajero {

    private String nombres;
    private String apellido;
    private String nroDocumento;
    private String CUIT;
    private String posIVA;
    private Date fechaDeNacimiento;
    private String email;
    private String telefono;
    private String ocupacion;
    private Direccion direccion;
    private TipoDocumento tipoDocumento;
    private String nacionalidad;


    //constructor
    public Pasajero(String nombres, String apellido, String nroDocumento, String CUIT, String posIVA, Date fechaDeNacimiento, String email, String telefono, String ocupacion, TipoDocumento tipoDocumento, Direccion direccion, String nacionalidad) {
        this.nombres = nombres;
        this.apellido = apellido;
        this.nroDocumento = nroDocumento;
        this.CUIT = CUIT;
        this.posIVA = posIVA;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.email = email;
        this.telefono = telefono;
        this.ocupacion = ocupacion;
        this.direccion = direccion;
        this.tipoDocumento = tipoDocumento;
        this.nacionalidad = nacionalidad; 
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
    public String getPosIVA() {
        return posIVA;
    }
    public void setPosIVA(String posIVA) {
        this.posIVA = posIVA;
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
    public Direccion getDireccion() {
        return direccion;
    }
    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }
    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    

}
