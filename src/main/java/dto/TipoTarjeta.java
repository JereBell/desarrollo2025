package dto;

import java.util.ArrayList;
import java.util.List;


public class TipoTarjeta {

    private String nombre;
    private String IDTipoTarjeta;
    private List<TarjetaDeCreditoDTO> tarjetas = new ArrayList<>();
    private List<TarjetaDeDebitoDTO> tarjetasDebito = new ArrayList<>();

    //constructor
    public TipoTarjeta(String nombre, String IDTipoTarjeta) {
        this.nombre = nombre;
        this.IDTipoTarjeta = IDTipoTarjeta;
    }
    //getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getIDTipoTarjeta() {
        return IDTipoTarjeta;
    }
    public void setIDTipoTarjeta(String IDTipoTarjeta) {
        this.IDTipoTarjeta = IDTipoTarjeta;
    }


}
