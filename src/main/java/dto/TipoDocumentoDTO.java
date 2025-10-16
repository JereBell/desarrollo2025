package dto;

public class TipoDocumentoDTO {
    private String tipo;
    private String id;

    //constructor
    public TipoDocumentoDTO(String tipo, String id) {
        this.tipo = tipo;
        this.id = id;
    }

    public TipoDocumentoDTO() {
        //TODO Auto-generated constructor stub
    }

    //getters y setters
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
