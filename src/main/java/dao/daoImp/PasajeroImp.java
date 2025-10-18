package dao.daoImp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
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
                        pasajero.setNroDocumento(datos[2]);
                        pasajero.setCUIT(datos[3]);
                        pasajero.setEmail(datos[5]);
                        pasajero.setTelefono(datos[6]);
                        pasajero.setOcupacion(datos[7]);

                    if ((buscado.getNombres().isEmpty()) || buscado.getNombres().equalsIgnoreCase(pasajero.getNombres())) {
                        if ((buscado.getApellido().isEmpty()) || buscado.getApellido().equalsIgnoreCase(pasajero.getApellido())) {
                            if ((buscado.getTipoDocumento().isEmpty()) || buscado.getTipoDocumento().equalsIgnoreCase(pasajero.getTipoDocumento())) {
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
        public void modificarPasajero(String documento, PasajeroDTO pasajeroModificado) {
            // Implementación pendiente
            
        }
    
        @Override
        public boolean agregarPasajero(PasajeroDTO pasajero) {
            // Lista de campos en el mismo orden que el encabezado del CSV
            String[] campos = new String[] {
                pasajero.getApellido(),
                pasajero.getNombres(),
                pasajero.getTipoDocumento(),
                pasajero.getNroDocumento(),
                pasajero.getCUIT(),
                pasajero.getPosIVA(),
                pasajero.getFechaDeNacimientoAsString(),
                pasajero.getCalle(),       
                pasajero.getNroCalleAsString(),
                pasajero.getPisoAsString(),
                pasajero.getNroDepartamentoAsString(),
                pasajero.getCodigoPostalAsString(),
                pasajero.getCiudad(),
                pasajero.getProvincia(),
                pasajero.getPais(),
                pasajero.getTelefono(),
                pasajero.getEmail(),
                pasajero.getOcupacion(),
                pasajero.getNacionalidad()
        };
        
        String datos = transformarDatos(campos); // transforma en un string de todos los datos separados por coma
        
        return guardarEnArchivo(datos);

    }

    private String formatoCsv(String s) {
        if (s == null) return "";
        if (s.contains("\"")) {
            s = s.replace("\"", "\"\"");
        }
        if (s.contains(",") || s.contains("\"") || s.contains("\n") || s.contains("\r")) {
            return "\"" + s + "\"";
        }
        return s;
        }

    private String transformarDatos (String[] campos){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < campos.length; i++) {
                    sb.append(formatoCsv(campos[i]));
                    if (i < campos.length - 1) sb.append(',');
                }
        sb.append(System.lineSeparator());

        return sb.toString();
    }

    public boolean guardarEnArchivo (String datos){

        String ruta = "src/main/resources/pasajero.csv";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ruta, true))) {
            writer.newLine();
            writer.write(datos);
            writer.newLine();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean borrarPasajero(String nroDocumento) {
        // Implementación pendiente
        return false;
    }
}





