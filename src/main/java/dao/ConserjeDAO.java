package dao;

import java.io.FileNotFoundException;

import dto.ConserjeDTO;

public interface ConserjeDAO {
    void registrarConserje(String nombre, String apellido, String email, String IDPais, String telefono, String fechaNacimiento, String username, String password) throws FileNotFoundException;
    boolean autenticarUsuario(ConserjeDTO conserjeDTO);
    
}
