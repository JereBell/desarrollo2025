package dto;

public class ProvinciaDTO {

    private static long siguienteID = 1;
    private String nombre;
    private long IDProvincia;
    private PaisDTO pais;

    //constructor
    public ProvinciaDTO(String nombre, PaisDTO pais) {
        this.nombre = nombre;
        this.IDProvincia = siguienteID;
        this.pais = pais;
        siguienteID++;
    }
    public ProvinciaDTO() {
        this.pais = new PaisDTO();
    }
    //getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public long getIDProvincia() {
        return IDProvincia;
    }
    public PaisDTO getPais() {
        return pais;
    }
    

}

