package negocio;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.List;
import java.util.Scanner;

import dao.daoImp.PasajeroImp;
import dto.PasajeroDTO;
import dto.TipoDocumentoDTO;
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
            buscado.setTipoDocumentoString(tipoDocumento);

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
        ValidadorHuesped.validarNombre(pasajero.getNombres());

        System.out.println("Ingrese el apellido del pasajero:");
        pasajero.setApellido(reader.readLine());
        ValidadorHuesped.validarApellido(pasajero.getApellido());

        System.out.println("Ingrese el ID del tipo de documento:");
        String idTipoDoc = reader.readLine();
        ValidadorHuesped.validarIdTipoDocumento(idTipoDoc);

        System.out.println("Ingrese el tipo de documento:");
        String tipoDoc = reader.readLine();
        ValidadorHuesped.validarTipoDocumento(tipoDoc);

        TipoDocumento tipoDocumento = new TipoDocumento(idTipoDoc, tipoDoc);
        pasajero.setTipoDocumento(tipoDocumento);

        System.out.println("Ingrese el Número de documento del pasajero:");
        pasajero.setNroDocumento(reader.readLine());
        ValidadorHuesped.validarDni(pasajero.getNroDocumento());

        System.out.println("Ingrese el CUIT:");
        pasajero.setCUIT(reader.readLine());
        ValidadorHuesped.validarCUIT(pasajero.getCUIT());

        System.out.println("Ingrese la posición del IVA:");
        pasajero.setPosIVA(reader.readLine());
        ValidadorHuesped.validarPosIVA(pasajero.getPosIVA());

        System.out.println("Ingrese su fecha de nacimiento (dd/mm/aaaa):");
        pasajero.setFechaDeNacimiento(reader.readLine());
        ValidadorHuesped.validarFechaDeNacimiento(pasajero.getFechaDeNacimiento());

        System.out.println("Ingrese su código postal:");
        Integer codigoPostal = Integer.parseInt(reader.readLine());
        ValidadorHuesped.validarCodigoPostal(codigoPostal);

        System.out.println("Ingrese SU ciudad:");
        String nombreCiudad = reader.readLine();
        ValidadorHuesped.validarCiudad(nombreCiudad);

        System.out.println("Ingrese su provincia:");
        String nombreProvincia = reader.readLine();
        ValidadorHuesped.validarProvincia(nombreProvincia);

        System.out.println("Ingrese el ID de su provincia:");   
        Integer idProvincia = Integer.parseInt(reader.readLine());
        ValidadorHuesped.validarIdProvincia(idProvincia);

        System.out.println("Ingrese el nombre de su país:");
        String nombrePais = reader.readLine();
        ValidadorHuesped.validarPais(nombrePais);

        System.out.println("Ingrese el ID de su país:");
        Integer idPais = Integer.parseInt(reader.readLine());
        ValidadorHuesped.validarIdPais(idPais);

        System.out.println("Ingrese el ID de su ciudad:");
        Integer idCiudad = Integer.parseInt(reader.readLine());
        ValidadorHuesped.validarIdCiudad(idCiudad);

        Pais pais = new Pais(nombrePais, idPais);
        Provincia provincia = new Provincia(idProvincia, nombreProvincia, pais);

        Ciudad ciudad = new Ciudad(idCiudad, nombreCiudad, provincia);

        System.out.println("Ingrese su calle:");
        String calle = reader.readLine();
        ValidadorHuesped.validarDomicilio(calle);

        System.out.println("Ingrese su número de calle:");
        Integer nroCalle = Integer.parseInt(reader.readLine());
        ValidadorHuesped.validarNumeroCalle(nroCalle);

        System.out.println("Ingrese su piso:");
        Integer piso = Integer.parseInt(reader.readLine());
        ValidadorHuesped.validarPiso(piso);

        System.out.println("Ingrese su número de departamento:");
        Integer nroDpto = Integer.parseInt(reader.readLine());
        ValidadorHuesped.validarNroDpto(nroDpto);

        Direccion direccion = new Direccion(codigoPostal, calle, nroCalle, piso, nroDpto, ciudad);
        pasajero.setDireccion(direccion);

        System.out.println("Ingrese el teléfono del pasajero:");
        pasajero.setTelefono(reader.readLine());
        ValidadorHuesped.validarTelefono(pasajero.getTelefono());

        System.out.println("Ingrese el correo electrónico del pasajero:");
        pasajero.setEmail(reader.readLine());
        ValidadorHuesped.validarEmail(pasajero.getEmail());

        System.out.println("Ingrese su ocupación:");
        pasajero.setOcupacion(reader.readLine());
        ValidadorHuesped.validarOcupacion(pasajero.getOcupacion());

        System.out.println("Ingrese su nacionalidad:");
        pasajero.setNacionalidad(reader.readLine());
        ValidadorHuesped.validarNacionalidad(pasajero.getNacionalidad());

        
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
        }
