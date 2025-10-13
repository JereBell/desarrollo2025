package modelo;

public class Banco {

    private String tipo;
    private String IDBanco;

    //constructor
    public Banco(String tipo, String IDBanco) {
        this.tipo = tipo;
        this.IDBanco = IDBanco;
    }
    //getters y setters
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getIDBanco() {
        return IDBanco;
    }
    public void setIDBanco(String IDBanco) {
        this.IDBanco = IDBanco;
    }


}
