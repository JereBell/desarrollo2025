package dto;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import modelo.Direccion;
import modelo.TipoDocumento;

public class PasajeroDTO {

    private String nombres;
    private String apellido;
    private String nroDocumento;
    private String CUIT;
    private String posIVA;
    private Date fechaDeNacimiento;
    private String email;
    private String telefono;
    private String ocupacion;
    private DireccionDTO direccion;
    private String tipoDocumento;
    private String nacionalidad;

    //constructor
    public PasajeroDTO(String nombres, String apellido, String nroDocumento, String CUIT, String posIVA, Date fechaDeNacimiento, String email, String telefono, String ocupacion, String tipoDocumento, DireccionDTO direccion, String nacionalidad) {
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

    public PasajeroDTO() {
        //TODO Auto-generated constructor stub
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
    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate ld = LocalDate.parse(fechaDeNacimiento, f);
            this.fechaDeNacimiento = Date.from(ld.atStartOfDay(ZoneId.systemDefault()).toInstant());
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
    public DireccionDTO getDireccion() {
        return direccion;
    }
    public String getTipoDocumento() {
        return tipoDocumento;
    }
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public void setDireccion(DireccionDTO direccion) {
        this.direccion = direccion;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getFechaDeNacimientoAsString() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate ld = fechaDeNacimiento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return ld.format(f);
    }
    public String getCalle() {
        return direccion.getCalle();
    }

    public String getNroCalleAsString() {
        return (direccion.getNroCalle().toString());
    }

    public String getPisoAsString() {
        return direccion.getPiso().toString();
    }

    public String getNroDepartamentoAsString() {
        return direccion.getNroDepartamento().toString();
    }
    public String getCodigoPostalAsString() {
        return direccion.getCodigoPostal().toString();
    }
    public Integer getNroCalle() {
        return direccion.getNroCalle();
    }
    public Integer getPiso() {
        return direccion.getPiso();
    }
    public Integer getNroDepartamento() {
        return direccion.getNroDepartamento();
    }
    public Integer getCodigoPostal() {
        return direccion.getCodigoPostal();
    }
    
    public String getCiudad() {
        return direccion.getCiudad().getNombre();
    }
    public String getProvincia() {
        return direccion.getCiudad().getProvincia().getNombre();
    }
    public String getPais() {
        return direccion.getCiudad().getProvincia().getPais().getNombre();
    }

    public void setCiudad(String ciudad) {
        this.direccion.getCiudad().setNombre(ciudad);
    }
    public void setProvincia(String provincia) {
        this.direccion.getCiudad().getProvincia().setNombre(provincia);
    }
    public void setPais(String pais) {
        this.direccion.getCiudad().getProvincia().getPais().setNombre(pais);
    }  
    public void setCalle(String calle) {
        this.direccion.setCalle(calle);
    }
    public void setNroCalle(Integer nroCalle) {
        this.direccion.setNroCalle(nroCalle);
    }
    public void setPiso(Integer piso) {
        this.direccion.setPiso(piso);
    }
    public void setNroDepartamento(Integer nroDepartamento) {
        this.direccion.setNroDepartamento(nroDepartamento);
    }
    public void setCodigoPostal(Integer codigoPostal) {
        this.direccion.setCodigoPostal(codigoPostal);
    }

}
