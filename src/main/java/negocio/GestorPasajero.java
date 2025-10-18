package negocio;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.List;
import java.util.Scanner;

import dao.daoImp.PasajeroImp;
import dto.CiudadDTO;
import dto.DireccionDTO;
import dto.PaisDTO;
import dto.PasajeroDTO;
import dto.ProvinciaDTO;
import modelo.Direccion;
import modelo.Ciudad;
import modelo.Pais;
import modelo.Provincia;
import modelo.TipoDocumento;


public class GestorPasajero {
    private PasajeroImp pasajeroImp;


    public GestorPasajero() {
        this.pasajeroImp = new PasajeroImp();
    }


    //metodos
    public List<PasajeroDTO> buscarPasajero() throws IOException {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Ingrese datos del pasajero a buscar (Puede dejar en blanco para omitir ese campo):");
            System.out.println("Nombre:");
            String nombre = scanner.nextLine();
            System.out.println("Apellido:");
            String apellido = scanner.nextLine();
            System.out.println("Número de Documento:");
            String nroDocumento = scanner.nextLine();
            System.out.println("Tipo de Documento:");
            String tipoDocumento = scanner.nextLine();
          

            PasajeroDTO buscado = new PasajeroDTO();
            buscado.setNombres(nombre);
            buscado.setApellido(apellido);
            buscado.setNroDocumento(nroDocumento);
            buscado.setTipoDocumento(tipoDocumento);

            return pasajeroImp.buscarPasajeros(buscado);
        } finally {
            scanner.close();
        }
    }

    public PasajeroDTO agregarPasajero() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PasajeroDTO pasajero = new PasajeroDTO();

        System.out.println("Ingrese el nombre del pasajero:");
        pasajero.setNombres(reader.readLine());

        System.out.println("Ingrese el apellido del pasajero:");
        pasajero.setApellido(reader.readLine());


        System.out.println("Ingrese el tipo de documento:");
        String tipoDoc = reader.readLine();

        pasajero.setTipoDocumento(tipoDoc);

        System.out.println("Ingrese el Número de documento del pasajero:");
        pasajero.setNroDocumento(reader.readLine());

        System.out.println("Ingrese el CUIT:");
        pasajero.setCUIT(reader.readLine());

        System.out.println("Ingrese la posición del IVA:");
        pasajero.setPosIVA(reader.readLine());

        System.out.println("Ingrese su fecha de nacimiento (dd/mm/aaaa):");
        pasajero.setFechaDeNacimiento(reader.readLine());

        System.out.println("Ingrese su código postal:");
        Integer codigoPostal = Integer.parseInt(reader.readLine());

        System.out.println("Ingrese su ciudad:");
        String nombreCiudad = reader.readLine();

        System.out.println("Ingrese su provincia:");
        String nombreProvincia = reader.readLine();


        System.out.println("Ingrese su país:");
        String nombrePais = reader.readLine();

        PaisDTO pais = new PaisDTO(nombrePais);
        ProvinciaDTO provincia = new ProvinciaDTO(nombreProvincia, pais);

        CiudadDTO ciudad = new CiudadDTO(nombreCiudad, provincia);

        System.out.println("Ingrese su calle:");
        String calle = reader.readLine();

        System.out.println("Ingrese su número de calle:");
        Integer nroCalle = Integer.parseInt(reader.readLine());

        System.out.println("Ingrese su piso:");
        Integer piso = Integer.parseInt(reader.readLine());

        System.out.println("Ingrese su número de departamento:");
        Integer nroDpto = Integer.parseInt(reader.readLine());

        DireccionDTO direccion = new DireccionDTO(codigoPostal, calle, nroCalle, piso, nroDpto, ciudad);
        pasajero.setDireccion(direccion);

        System.out.println("Ingrese el teléfono del pasajero:");
        pasajero.setTelefono(reader.readLine());

        System.out.println("Ingrese el correo electrónico del pasajero:");
        pasajero.setEmail(reader.readLine());

        System.out.println("Ingrese su ocupación:");
        pasajero.setOcupacion(reader.readLine());

        System.out.println("Ingrese su nacionalidad:");
        pasajero.setNacionalidad(reader.readLine());

        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean opcionValida;
        do {
            System.out.println("1. CONTINUAR");
            System.out.println("2. CANCELAR");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();
            opcionValida = true;

            switch (opcion) {
                case 1: //CONTINUAR
                    ValidadorHuesped.validar(pasajero);
                    pasajeroImp.agregarPasajero(pasajero);

                    sc.close();
                    break;

                case 2: //CANCELAR
                    int opcionCancela;
                    boolean opcionValidaCancela;
                    do {
                            System.out.println("Desea cancelar el alta de huesped?");
                            System.out.println("1. SI");
                            System.out.println("2. NO");
                            System.out.print("Ingrese una opción: ");
                            opcionCancela = sc.nextInt();
                            opcionValidaCancela = true;

                            switch (opcionCancela) {
                                case 1: //SI
                                    System.out.println("Operación cancelada.");
                                    sc.close();
                                    return null;

                                case 2: //NO
                                    sc.close(); 
                                    //No se que hace aca

                                default:
                                    opcionValidaCancela = false;
                                    System.out.println("Opción no válida. Intente nuevamente.\n");
                                    sc.close();
                                    break;
                            }

                        } while (!opcionValidaCancela);
                    sc.close(); 
                    System.out.println("Operación cancelada.");
                    return null;

                default:
                    opcionValida = false;
                    System.out.println("Opción no válida. Intente nuevamente.\n");
                    sc.close();
                    break;
            }

        } while (!opcionValida);

        reader.close();

                // Guardar el nuevo pasajero en la base de dato s
                // pasajeroImp.agregarPasajero(pasajero); lo comento porque no esta implementado
                
                System.out.println("Pasajero agregado exitosamente.");

                return pasajero;
            }
    public boolean modificarPasajero(PasajeroDTO pasajero) throws IOException {

        return true;
    }
}
