package modelo;

public class Provincia {

    private String nombre;
    private String IDProvincia;
    private Pais pais;

    //constructor
    public Provincia(String nombre, String IDProvincia, Pais pais) {
        this.nombre = nombre;
        this.IDProvincia = IDProvincia;
        this.pais = pais;
    }
    //getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getIDProvincia() {
        return IDProvincia;
    }
    public void setIDProvincia(String IDProvincia) {
        this.IDProvincia = IDProvincia;
    }
    public Pais getPais() {
        return pais;
    }
    public void setPais(Pais pais) {
        this.pais = pais;
    }

}
