package dto;

public class DireccionDTO {

    private Integer codigoPostal;
    private String calle;
    private Integer nroCalle;
    private Integer piso;
    private Integer nroDepartamento;
    private CiudadDTO ciudad;

    //constructor
    public DireccionDTO(Integer codigoPostal, String calle, Integer nroCalle, Integer piso, Integer nroDepartamento, CiudadDTO ciudad) {
        this.codigoPostal = codigoPostal;
        this.calle = calle;
        this.nroCalle = nroCalle;
        this.piso = piso;
        this.nroDepartamento = nroDepartamento;
        this.ciudad = ciudad;

    }
    public DireccionDTO() {
        this.ciudad = new CiudadDTO();
    }
    //getters y setters
    public Integer getCodigoPostal() {
        return codigoPostal;
    }
    public void setCodigoPostal(Integer codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    public String getCalle() {
        return calle;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public Integer getNroCalle() {
        return nroCalle;
    }
    public void setNroCalle(Integer nroCalle) {
        this.nroCalle = nroCalle;
    }
    public Integer getPiso() {
        return piso;
    }
    public void setPiso(Integer piso) {
        this.piso = piso;
    }
    public Integer getNroDepartamento() {
        return nroDepartamento;
    }
    public void setNroDepartamento(Integer nroDepartamento) {
        this.nroDepartamento = nroDepartamento;
    }

    public CiudadDTO getCiudad() {
        return ciudad;
    }
    



}
