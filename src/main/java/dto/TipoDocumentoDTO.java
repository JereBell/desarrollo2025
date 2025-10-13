package dto;

public class TipoDocumentoDTO {

    private String IDTipoDocumento;
    private String tipo;

    //constructor
    public TipoDocumentoDTO(String IDTipoDocumento, String tipo) {
        this.IDTipoDocumento = IDTipoDocumento;
        this.tipo = tipo;
    }
    //getters y setters
    public String getIDTipoDocumento() {
        return IDTipoDocumento;
    }
    public void setIDTipoDocumento(String IDTipoDocumento) {
        this.IDTipoDocumento = IDTipoDocumento;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    

}
