package dto;


public class CiudadDTO {

    private static long siguienteID = 1;
    private String nombre;
    private long IDCiudad;
    private ProvinciaDTO provincia;

    //constructor
    public CiudadDTO(String nombre, ProvinciaDTO provincia) {
        this.nombre = nombre;
        this.IDCiudad = siguienteID;
        this.provincia = provincia;
        siguienteID++;
    }
    //getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public long getIDCiudad() {
        return IDCiudad;
    }
    public ProvinciaDTO getProvincia() {
        return provincia;
    }
    

}
