package modelo;

public class Pais {

    private String nombre;
    private Integer IDPais;

    //constructor
    public Pais(String nombre, Integer IDPais) {
        this.nombre = nombre;
        this.IDPais = IDPais;
    }
    //getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getIDPais() {
        return IDPais;
    }
    public void setIDPais(Integer IDPais) {
        this.IDPais = IDPais;
    }
    

}
