package modelo;

public class Ciudad {

    private String nombre;
    private String IDCiudad;
    private Provincia provincia;

    //constructor
    public Ciudad(String nombre, String IDCiudad, Provincia provincia) {
        this.nombre = nombre;
        this.IDCiudad = IDCiudad;
        this.provincia = provincia;
    }
    //getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getIDCiudad() {
        return IDCiudad;
    }
    public void setIDCiudad(String IDCiudad) {
        this.IDCiudad = IDCiudad;
    }
    public Provincia getProvincia() {
        return provincia;
    }
    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

}
