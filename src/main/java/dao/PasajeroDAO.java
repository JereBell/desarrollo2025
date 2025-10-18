package dao;


import java.io.BufferedReader;
import java.util.List;
import dto.PasajeroDTO;

public interface PasajeroDAO {

    public void modificarPasajero(String nroDocumento, PasajeroDTO pasajeroModificado);
    public List<PasajeroDTO> buscarPasajeros(PasajeroDTO buscado);
    public boolean agregarPasajero(PasajeroDTO pasajero);
   /* public PasajeroDTO buscarPasajero(String apellido);
    public PasajeroDTO buscarPasajero(String nroDocumento);
    public PasajeroDTO buscarPasajero(String CUIT);
    public PasajeroDTO buscarPasajero(String fechaDeNacimiento);
    public PasajeroDTO buscarPasajero(String email);
    public PasajeroDTO buscarPasajero(String telefono);
    public PasajeroDTO buscarPasajero(String ocupacion);
    public PasajeroDTO buscarPasajero(String direccion);
    public PasajeroDTO buscarPasajero(String tipoDocumento);
    */
    


}