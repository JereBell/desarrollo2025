package modelo;

public class Efectivo extends MedioDePago {

    //constructor
    public Efectivo(double monto, double cotizacionEnPesos, Moneda moneda, Pago pago) {
        super(monto, cotizacionEnPesos, moneda, pago);
    }

}
