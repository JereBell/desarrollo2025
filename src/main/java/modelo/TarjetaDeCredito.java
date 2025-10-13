package modelo;

public class TarjetaDeCredito extends MedioDePago {

    private Integer NroTarjeta;
    private Integer CVV;
    private String fechaVencimiento;
    private Integer cuotas;
    private TipoTarjeta tipo;

    //constructor
    public TarjetaDeCredito(Integer NroTarjeta, Integer CVV, String fechaVencimiento, Integer cuotas, double monto, double cotizacionEnPesos, Moneda moneda, Pago pago) {
        super(monto, cotizacionEnPesos, moneda, pago);
        this.NroTarjeta = NroTarjeta;
        this.CVV = CVV;
        this.fechaVencimiento = fechaVencimiento;
        this.cuotas = cuotas;
    }
    //getters y setters
    public Integer getNroTarjeta() {
        return NroTarjeta;
    }
    public void setNroTarjeta(Integer NroTarjeta) {
        this.NroTarjeta = NroTarjeta;
    }
    public Integer getCVV() {
        return CVV;
    }
    public void setCVV(Integer CVV) {
        this.CVV = CVV;
    }
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }
    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    public Integer getCuotas() {
        return cuotas;
    }
    public void setCuotas(Integer cuotas) {
        this.cuotas = cuotas;
    }

}
