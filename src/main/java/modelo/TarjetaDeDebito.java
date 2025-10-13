package modelo;

public class TarjetaDeDebito extends MedioDePago{

    private TipoTarjeta tipo;
    private String NroTarjeta;
    private Integer cuotas;
    private String fechaVencimiento;
    private Integer CVV;
    

    //constructor
    public TarjetaDeDebito(TipoTarjeta tipo, String NroTarjeta, Integer cuotas, String fechaVencimiento, Integer CVV, double monto, double cotizacionEnPesos, Moneda moneda, Pago pago) {
        super(monto, cotizacionEnPesos, moneda, pago);
        this.tipo = tipo;
        this.NroTarjeta = NroTarjeta;
        this.cuotas = cuotas;
        this.fechaVencimiento = fechaVencimiento;
        this.CVV = CVV;
    }
    //getters y setters
    public TipoTarjeta getTipo() {
        return tipo;
    }
    public void setTipo(TipoTarjeta tipo) {
        this.tipo = tipo;
    }
    public String getNroTarjeta() {
        return NroTarjeta;
    }
    public void setNroTarjeta(String NroTarjeta) {
        this.NroTarjeta = NroTarjeta;
    }
    public Integer getCuotas() {
        return cuotas;
    }
    public void setCuotas(Integer cuotas) {
        this.cuotas = cuotas;
    }
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }
    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    public Integer getCVV() {
        return CVV;
    }
    public void setCVV(Integer CVV) {
        this.CVV = CVV;
    }


}
