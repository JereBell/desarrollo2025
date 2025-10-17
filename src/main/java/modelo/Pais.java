package modelo;

public class Pais {
    private static long siguienteId = 1; // Variable estática para generar IDs únicos
    private String nombre;
    private long IDPais;

    //constructor
    public Pais(String nombre) {
        this.nombre = nombre;
        this.IDPais = siguienteId;
        siguienteId++; // Incrementar el ID para el próximo país
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
    


