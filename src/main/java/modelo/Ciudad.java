package modelo;

public class Ciudad {
    private static long siguienteId = 1; // Variable estática para generar IDs únicos
    private String nombre;
    private long IDCiudad;
    private Provincia provincia;

    //constructor
    public Ciudad(String nombre, Provincia provincia) {
        this.nombre = nombre;
        this.IDCiudad = siguienteId;
        this.provincia = provincia;
        siguienteId++; // Incrementar el ID para la próxima ciudad
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
    
    public Provincia getProvincia() {
        return provincia;
    }
    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

}
