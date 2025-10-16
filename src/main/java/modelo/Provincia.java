package modelo;

public class Provincia {

    private String nombre;
    private Integer IDProvincia;
    private Pais pais;

    //constructor
    public Provincia(Integer IDProvincia, String nombre, Pais pais) {
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
    public Integer getIDProvincia() {
        return IDProvincia;
    }
    public void setIDProvincia(Integer IDProvincia) {
        this.IDProvincia = IDProvincia;
    }
    public Pais getPais() {
        return pais;
    }
    public void setPais(Pais pais) {
        this.pais = pais;
    }

}
