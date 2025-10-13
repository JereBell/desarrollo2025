package dto;

import java.util.Date;

public class PagoDTO {

    private double montoAcumulado;
    private double vuelto;
    private Date fechaRealizacion;

    //constructor
    public PagoDTO(double montoAcumulado, double vuelto, Date fechaRealizacion) {
        this.montoAcumulado = montoAcumulado;
        this.vuelto = vuelto;
        this.fechaRealizacion = fechaRealizacion;
    }
    //getters y setters
    public double getMontoAcumulado() {
        return montoAcumulado;
    }
    public void setMontoAcumulado(double montoAcumulado) {
        this.montoAcumulado = montoAcumulado;
    }
    public double getVuelto() {
        return vuelto;
    }
    public void setVuelto(double vuelto) {
        this.vuelto = vuelto;
    }
    public Date getFechaRealizacion() {
        return fechaRealizacion;
    }
    public void setFechaRealizacion(Date fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }
    

}
