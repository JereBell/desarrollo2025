package dao.daoImp;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;

import dao.ConserjeDAO;
import modelo.Conserje;
import dto.ConserjeDTO;

public class ConserjeImp implements ConserjeDAO {

    @Override
    public void registrarConserje(String nombre, String apellido, String email, String IDPais, String telefono, String fechaNacimiento, String username, String password) throws FileNotFoundException {
       

    }

    @Override
    public boolean autenticarUsuario(ConserjeDTO conserjeDTO) {
        try (InputStream is = ConserjeImp.class.getClassLoader().getResourceAsStream("conserje.csv")) {

            if (is == null) {
                throw new IOException("No se encontró el archivo 'conserje.csv' en resources.");
            }
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                String linea;
                linea = reader.readLine(); // Leer la primera línea (encabezados)
                while ((linea = reader.readLine()) != null) {
                    String[] datos = linea.split(","); //obtengo un string por cada campo separado por coma
                        String usuario = datos[2];
                        String contrasenia = datos[3];
                        if (usuario.equals(conserjeDTO.getUsuario()) && contrasenia.equals(conserjeDTO.getContrasenia())) {
                            return true;
                        }
                }
            } catch (IOException e) {
                System.err.println("Error al leer el archivo: " + e.getMessage());
            }
        return false;
    }

}
