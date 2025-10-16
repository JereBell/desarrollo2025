package dao.daoImp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import dao.PasajeroDAO;
import dto.PasajeroDTO;

public class PasajeroImp implements PasajeroDAO {



        @Override
        public List<PasajeroDTO> buscarPasajeros(PasajeroDTO buscado) {

            List<PasajeroDTO> pasajeros = new ArrayList<>();
            
            try (InputStream is = PasajeroImp.class.getClassLoader().getResourceAsStream("pasajero.csv")) {
                
                if (is == null) {
                    throw new IOException("No se encontró el archivo 'pasajero.csv' en resources.");
                }
                    BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                    String linea;
                linea = reader.readLine(); // Leer la primera línea (encabezados)
                while ((linea = reader.readLine()) != null) {

                    PasajeroDTO pasajero = new PasajeroDTO();

                    String[] datos = linea.split(","); //obtengo un string por cada campo separado por coma

                        pasajero.setApellido(datos[0]);
                        pasajero.setNombres(datos[1]);
                        pasajero.setTipoDocumentoString(datos[2]);
                        pasajero.setNroDocumento(datos[3]);
                        pasajero.setCUIT(datos[4]);
                        pasajero.setEmail(datos[16]);
                        pasajero.setTelefono(datos[15]);
                        pasajero.setOcupacion(datos[17]);

                    if ((buscado.getNombres().isEmpty()) || buscado.getNombres().equalsIgnoreCase(pasajero.getNombres())) {
                        if ((buscado.getApellido().isEmpty()) || buscado.getApellido().equalsIgnoreCase(pasajero.getApellido())) {
                            if ((buscado.getTipoDocumentoString().isEmpty()) || buscado.getTipoDocumentoString().equalsIgnoreCase(pasajero.getTipoDocumentoString())) {
                                if ((buscado.getNroDocumento().isEmpty()) || buscado.getNroDocumento().equalsIgnoreCase(pasajero.getNroDocumento())) {

                                    pasajeros.add(pasajero);
                                }
                            }
                        }
                    }
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }

            return pasajeros;
    }

        @Override
        public void modificarPasajero(PasajeroDTO pasajero) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'modificarPasajero'");
        }
    
        @Override
        public void agregarPasajero(PasajeroDTO pasajero) {
            // TODO Auto-generated method stub
            // guarda en el csv todos los datos ingresados
            throw new UnsupportedOperationException("Unimplemented method 'agregarPasajero'");
        }



    }


