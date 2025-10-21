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
import java.io.File;
import java.nio.file.Files;

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
                        pasajero.setTipoDocumento(datos[2]);
                        pasajero.setNroDocumento(datos[3]);
                        pasajero.setCUIT(datos[4]);
                        pasajero.setPosIVA(datos[5]);
                        pasajero.setFechaDeNacimiento(datos[6]);
                        pasajero.setCalle(datos[7]);
                        pasajero.setNroCalle(Integer.parseInt(datos[8]));
                        pasajero.setPiso(Integer.parseInt(datos[9]));
                        pasajero.setNroDepartamento(Integer.parseInt(datos[10]));
                        pasajero.setCodigoPostal(Integer.parseInt(datos[11]));
                        pasajero.setCiudad(datos[12]);
                        pasajero.setProvincia(datos[13]);
                        pasajero.setPais(datos[14]);
                        pasajero.setTelefono(datos[15]);
                        pasajero.setEmail(datos[16]);
                        pasajero.setOcupacion(datos[17]);
                        pasajero.setNacionalidad(datos[18]);

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
                System.out.println("Error al buscar pasajeros: " + e.getMessage());
            }

            return pasajeros;
    }

        @Override
        public void modificarPasajero(String documento, PasajeroDTO pasajeroModificado) {
            reemplazarLinea(EncontrarLinea(documento), pasajeroModificado);            
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

        return borrarLinea(EncontrarLinea(nroDocumento));
    }

       
    private int EncontrarLinea(String nroDocumento) {
        int numeroLinea = 0;

         try (InputStream is = PasajeroImp.class.getClassLoader().getResourceAsStream("pasajero.csv")) {
                
                if (is == null) {
                    throw new IOException("No se encontró el archivo 'pasajero.csv' en resources.");
                }
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                String linea, datos[];

                linea = reader.readLine(); // Leer la primera línea (encabezados)
                while ((linea = reader.readLine()) != null) {
                    numeroLinea++;
                    datos = linea.split(",");
                    if (datos[3].equals(nroDocumento)) {
                    return numeroLinea;
                    }
                }
            return -1;
        }
        catch (IOException e) {
            e.printStackTrace();
            return -1;}
        }

        
    private boolean borrarLinea(int numeroLinea) {
        if (numeroLinea < 0) {return false;}
        File archivo = new File (getClass().getClassLoader().getResource("pasajero.csv").getFile());
        try{
            List<String> lineas = Files.readAllLines(archivo.toPath());
            if(numeroLinea >= lineas.size()) {return false;}
            lineas.remove(numeroLinea); //elimina numeroLinea
            Files.write(archivo.toPath(), lineas); //lo reescribo sin numeroLinea
            return true;
        } catch (IOException e){
            e.printStackTrace();
            return false;
        }
    }

    private void reemplazarLinea(int numeroLinea, PasajeroDTO pasajeroModificado) {
        if (numeroLinea < 0) {
            System.out.println("Pasajero no encontrado para modificar.");
            return ;
        }
        File archivo = new File (getClass().getClassLoader().getResource("pasajero.csv").getFile());
        try{
            List<String> lineas = Files.readAllLines(archivo.toPath());
            if(numeroLinea >= lineas.size()) {
                System.out.println("Pasajero no encontrado para modificar.");
                return ;
            }

            String[] campos = new String[] {
                pasajeroModificado.getApellido(),
                pasajeroModificado.getNombres(),
                pasajeroModificado.getTipoDocumento(),
                pasajeroModificado.getNroDocumento(),
                pasajeroModificado.getCUIT(),
                pasajeroModificado.getPosIVA(),
                pasajeroModificado.getFechaDeNacimientoAsString(),
                pasajeroModificado.getCalle(),       
                pasajeroModificado.getNroCalleAsString(),
                pasajeroModificado.getPisoAsString(),
                pasajeroModificado.getNroDepartamentoAsString(),
                pasajeroModificado.getCodigoPostalAsString(),
                pasajeroModificado.getCiudad(),
                pasajeroModificado.getProvincia(),
                pasajeroModificado.getPais(),
                pasajeroModificado.getTelefono(),
                pasajeroModificado.getEmail(),
                pasajeroModificado.getOcupacion(),
                pasajeroModificado.getNacionalidad()
        };
        
        String datos = transformarDatos(campos); // transforma en un string de todos los datos separados por coma

            lineas.set(numeroLinea, datos.trim()); //reemplaza la linea
            Files.write(archivo.toPath(), lineas); //lo reescribo con la linea reemplazada
        } catch (IOException e){
            e.printStackTrace();
    }
    }
}









