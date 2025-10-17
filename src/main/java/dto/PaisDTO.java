package dto;

public class PaisDTO {

    private static long siguienteID = 1;
    private String nombre;
    private long IDPais;

    //constructor
    public PaisDTO(String nombre) {
        this.nombre = nombre;
        this.IDPais = siguienteID;
        siguienteID++;
    }
    //getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public long getIDPais() {
        return IDPais;
    }
   
    

}
