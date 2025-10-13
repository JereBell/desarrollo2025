package modelo;

public class ResponsablePagoTercero {

    private String CUIT;;
    private String razonSocial;
    private String telefono;
    private Direccion direccion;
    

    //constructor
    public ResponsablePagoTercero(String CUIT, String razonSocial, String telefono, Direccion direccion) {
        this.CUIT = CUIT;
        this.razonSocial = razonSocial;
        this.telefono = telefono;
        this.direccion = direccion;
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
    public Direccion getDireccion() {
        return direccion;
    }
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }


}
