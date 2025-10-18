package dao;


import java.io.BufferedReader;
import java.util.List;
import dto.PasajeroDTO;

public interface PasajeroDAO {

    public void modificarPasajero(String nroDocumento, PasajeroDTO pasajeroModificado);
    public List<PasajeroDTO> buscarPasajeros(PasajeroDTO buscado);
    public boolean agregarPasajero(PasajeroDTO pasajero);
    public boolean borrarPasajero(String nroDocumento);


}