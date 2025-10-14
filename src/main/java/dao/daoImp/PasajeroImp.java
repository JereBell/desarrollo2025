package dao.daoImp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import dao.PasajeroDAO;
import dto.PasajeroDTO;

public class PasajeroImp implements PasajeroDAO {



    @Override
    public PasajeroDTO buscarPasajeros(String nombre) {
        try (InputStream is = PasajeroImp.class.getClassLoader().getResourceAsStream("pasajero.csv")) {
            PasajeroDTO pasajero = new PasajeroDTO();
            if (is == null) {
                throw new IOException("No se encontró el archivo 'pasajero.csv' en resources.");
            }
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                 String linea;
            linea = reader.readLine(); // Leer la primera línea (encabezados)
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(","); //obtengo un string por cada campo separado por coma
                if (datos[1].equalsIgnoreCase(nombre)) {
                    pasajero.setApellido(datos[0]);
                    pasajero.setNombres(datos[1]);
                    pasajero.setNroDocumento(datos[2]);
                    pasajero.setCUIT(datos[3]);
                    pasajero.setFechaDeNacimiento(null);
                    pasajero.setEmail(datos[5]);
                    pasajero.setTelefono(datos[6]);
                    pasajero.setOcupacion(datos[7]);
                }
            }
            return pasajero;
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        return null;
    }

    @Override
        public void modificarPasajero(PasajeroDTO pasajero) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'modificarPasajero'");
        }
    }


