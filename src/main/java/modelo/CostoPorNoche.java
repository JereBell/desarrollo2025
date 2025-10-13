package modelo;
import java.util.Date;


public class CostoPorNoche {

    private Date fechaInicioVigencia;
    private Date fechaFinVigencia;
    private double costo;
    private String IDCostoPorNoche;
    private TipoHabitacion tipoHabitacion;

    //constructor
    public CostoPorNoche(Date fechaInicioVigencia, Date fechaFinVigencia, double costo, String IDCostoPorNoche, TipoHabitacion tipoHabitacion) {
        this.fechaInicioVigencia = fechaInicioVigencia;
        this.fechaFinVigencia = fechaFinVigencia;
        this.costo = costo;
        this.IDCostoPorNoche = IDCostoPorNoche;
        this.tipoHabitacion = tipoHabitacion;
    }
    //getters y setters
    public Date getFechaInicioVigencia() {
        return fechaInicioVigencia;
    }
    public void setFechaInicioVigencia(Date fechaInicioVigencia) {
        this.fechaInicioVigencia = fechaInicioVigencia;
    }
    public Date getFechaFinVigencia() {
        return fechaFinVigencia;
    }
    public void setFechaFinVigencia(Date fechaFinVigencia) {
        this.fechaFinVigencia = fechaFinVigencia;
    }
    public double getCosto() {
        return costo;
    }
    public void setCosto(double costo) {
        this.costo = costo;
    }
    public String getIDCostoPorNoche() {
        return IDCostoPorNoche;
    }
    public void setIDCostoPorNoche(String IDCostoPorNoche) {
        this.IDCostoPorNoche = IDCostoPorNoche;
    }
    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }
    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

}
