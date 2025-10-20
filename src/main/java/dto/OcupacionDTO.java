package dto;

import java.util.Collection;
import java.util.Date;

public class OcupacionDTO {

    private Date fechaIngreso;
    private Date fechaEgreso;

    //constructor
    public OcupacionDTO(Date fechaIngreso, Date fechaEgreso) {
        this.fechaIngreso = fechaIngreso;
        this.fechaEgreso = fechaEgreso;
    }
    public OcupacionDTO() {
        //TODO Auto-generated constructor stub
    }
    //getters y setters
    public Date getFechaIngreso() {
        return fechaIngreso;
    }
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public Date getFechaEgreso() {
        return fechaEgreso;
    }
    public void setFechaEgreso(Date fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }
    public Object getResponsble() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getResponsble'");
    }
    public Collection<? extends PasajeroDTO> getAcompaniantes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAcompaniantes'");
    }

}
