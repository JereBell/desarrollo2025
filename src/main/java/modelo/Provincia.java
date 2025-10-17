package modelo;

public class Provincia {

    private static long siguienteId = 1; // Variable estática para generar IDs únicos
    private String nombre;
    private long IDProvincia;
    private Pais pais;

    //constructor
    public Provincia(String nombre, Pais pais) {
        this.nombre = nombre;
        this.IDProvincia = siguienteId;
        this.pais = pais;
        siguienteId++; // Incrementar el ID para la próxima provincia
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
    public Pais getPais() {
        return pais;
    }
    public void setPais(Pais pais) {
        this.pais = pais;
    }

}
