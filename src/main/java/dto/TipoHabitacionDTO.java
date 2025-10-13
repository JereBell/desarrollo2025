package dto;

public class TipoHabitacionDTO {

    private String IDTipoHabitacion;
    private Integer capacidad;
    private String nombre;

    //constructor
    public TipoHabitacionDTO(String IDTipoHabitacion, Integer capacidad, String nombre) {
        this.IDTipoHabitacion = IDTipoHabitacion;
        this.capacidad = capacidad;
        this.nombre = nombre;
    }
    //getters y setters
    public String getIDTipoHabitacion() {
        return IDTipoHabitacion;
    }
    public void setIDTipoHabitacion(String IDTipoHabitacion) {
        this.IDTipoHabitacion = IDTipoHabitacion;
    }
    public Integer getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

}

