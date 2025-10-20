package dao;

import java.util.List;

import dto.OcupacionDTO;

public interface OcupacionDAO {
    void agregarOcupacion(OcupacionDTO ocupacion);
    void modificarOcupacion(OcupacionDTO ocupacion);
    void eliminarOcupacion(int id);
    OcupacionDTO buscarOcupacion(int id);
    List<OcupacionDTO> buscarOcupaciones(OcupacionDTO filtro);
}
