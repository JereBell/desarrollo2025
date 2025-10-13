package modelo;

public class TipoDocumento {

    private String IDTipoDocumento;
    private String tipo;

    //constructor
    public TipoDocumento(String IDTipoDocumento, String tipo) {
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
