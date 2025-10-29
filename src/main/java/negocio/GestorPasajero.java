package negocio;
import dao.PasajeroDAO;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import dao.daoImp.OcupacionImp;
import dao.daoImp.PasajeroImp;
import dto.CiudadDTO;
import dto.DireccionDTO;
import dto.OcupacionDTO;
import dto.PaisDTO;
import dto.PasajeroDTO;
import dto.ProvinciaDTO;
import jakarta.persistence.criteria.CriteriaBuilder.In;
import modelo.Direccion;
import modelo.Ciudad;
import modelo.Ocupacion;
import modelo.Pais;
import modelo.Pasajero;
import modelo.Provincia;
import modelo.TipoDocumento;


public class GestorPasajero {
    private PasajeroImp pasajeroImp;
    private OcupacionImp ocupacionImp;


    public GestorPasajero() {
        this.pasajeroImp = new PasajeroImp();
        this.ocupacionImp = new OcupacionImp();
    }


    //metodos
    public List<PasajeroDTO> buscarPasajero(Scanner sc) throws IOException {
        try {
            System.out.println("Ingrese datos del pasajero a buscar (Puede dejar en blanco para omitir ese campo):");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Apellido: ");
            String apellido = sc.nextLine();
            System.out.print("Número de Documento: ");
            String nroDocumento = sc.nextLine();
            System.out.print("Tipo de Documento: ");
            String tipoDocumento = sc.nextLine();

            PasajeroDTO buscado = new PasajeroDTO();
            buscado.setNombres(nombre);
            buscado.setApellido(apellido);
            buscado.setNroDocumento(nroDocumento);
            buscado.setTipoDocumento(tipoDocumento);

            return pasajeroImp.buscarPasajeros(buscado);
        } finally {
        }
    }

    public PasajeroDTO agregarPasajero() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PasajeroDTO pasajero = new PasajeroDTO();

        System.out.print("Ingrese el nombre del pasajero: ");
        pasajero.setNombres(reader.readLine());

        System.out.print("Ingrese el apellido del pasajero: ");
        pasajero.setApellido(reader.readLine());


        System.out.print("Ingrese el tipo de documento: ");
        String tipoDoc = reader.readLine();

        pasajero.setTipoDocumento(tipoDoc);

        System.out.print("Ingrese el Número de documento del pasajero: ");
        pasajero.setNroDocumento(reader.readLine());

        System.out.print("Ingrese el CUIT: ");
        pasajero.setCUIT(reader.readLine());

        System.out.print("Ingrese la posición del IVA: ");
        pasajero.setPosIVA(reader.readLine());

        System.out.print("Ingrese su fecha de nacimiento (aaaa-mm-dd): ");
        pasajero.setFechaDeNacimiento(reader.readLine());

        System.out.print("Ingrese su código postal: ");
        Integer codigoPostal = Integer.parseInt(reader.readLine());

        System.out.print("Ingrese su ciudad: ");
        String nombreCiudad = reader.readLine();

        System.out.print("Ingrese su provincia: ");
        String nombreProvincia = reader.readLine();


        System.out.print("Ingrese su país: ");
        String nombrePais = reader.readLine();

        PaisDTO pais = new PaisDTO(nombrePais);
        ProvinciaDTO provincia = new ProvinciaDTO(nombreProvincia, pais);

        CiudadDTO ciudad = new CiudadDTO(nombreCiudad, provincia);

        System.out.print("Ingrese su calle: ");
        String calle = reader.readLine();

        System.out.print("Ingrese su número de calle: ");
        Integer nroCalle = Integer.parseInt(reader.readLine());

        System.out.print("Ingrese su piso: ");
        Integer piso = Integer.parseInt(reader.readLine());

        System.out.print("Ingrese su número de departamento: ");
        Integer nroDpto = Integer.parseInt(reader.readLine());

        DireccionDTO direccion = new DireccionDTO(codigoPostal, calle, nroCalle, piso, nroDpto, ciudad);
        pasajero.setDireccion(direccion);

        System.out.print("Ingrese el teléfono del pasajero: ");
        pasajero.setTelefono(reader.readLine());

        System.out.print("Ingrese el correo electrónico del pasajero: ");
        pasajero.setEmail(reader.readLine());

        System.out.print("Ingrese su ocupación: ");
        pasajero.setOcupacion(reader.readLine());

        System.out.print("Ingrese su nacionalidad: ");
        pasajero.setNacionalidad(reader.readLine());

        Scanner sc = new Scanner(System.in);
        Integer opcion=null;
        String entrada;
        System.out.println("1. CONTINUAR");
        System.out.println("2. CANCELAR");
        System.out.print("Ingrese una opción: ");
        entrada = sc.nextLine();
        // leer hasta que el usuario ingrese un entero válido
        while(opcion==null) {
            if (entrada.isEmpty()||Integer.valueOf(entrada)<1||Integer.valueOf(entrada)>2) {
                System.out.println("Entrada inválida. Ingrese un número entero:");
            }else {
                opcion = Integer.valueOf(entrada);
            }
        }
        switch (opcion) {
            case 1: //CONTINUAR
                ValidadorHuesped.validar(pasajero);
                pasajeroImp.agregarPasajero(pasajero);
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
                                    return null;

                                case 2: //NO
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
                    System.out.println("Opción no válida. Intente nuevamente.\n");
                    sc.close();
                    break;
            }


        reader.close();

                // Guardar el nuevo pasajero en la base de datos
                // pasajeroImp.agregarPasajero(pasajero); lo comento porque no esta implementado
                
        System.out.println("Pasajero agregado exitosamente.");

        return pasajero;
    }


    public boolean modificarPasajero(PasajeroDTO pasajero, Scanner sc) throws IOException {
        String documento = pasajero.getNroDocumento();
        System.out.println("Seleccione una de las siguientes opciones:");
        System.out.println("1. Siguiente (Modificar pasajero)");
        System.out.println("2. Cancelar");
        System.out.println("3. Borrar pasajero");
        System.out.println("------------------------------");
        
        String entrada;
        Integer opcion = null;
        // leer hasta que el usuario ingrese un entero válido
        while (opcion == null) {
            entrada= sc.nextLine();
                     
            if (entrada.isEmpty()||Integer.valueOf(entrada)<0||Integer.valueOf(entrada)>3) {
                System.out.println("Entrada inválida:  1-Modificar.   2-Cancelar.   3-Borrar pasajero");
            }else {
                opcion = Integer.valueOf(entrada);
            }
        }
        switch (opcion) {
            case 1:
                break;
            case 2:
                System.out.println("Modificación cancelada por el usuario.");
                return false;
            case 3:
                if(pasajeroImp.borrarPasajero(documento)){
                    System.out.println("Pasajero borrado con éxito.");
                }
                return true;
            default:
                System.out.println("Opción inválida. Modificación cancelada.");
                return false;
        }
        PasajeroDTO nuevo = new PasajeroDTO();
        System.out.println("Ingrese los nuevos datos del pasajero (deje en blanco para no modificar un campo):");
        String input = null;

        nuevo.setNombres(cargarDatos("Nombres", pasajero.getNombres(), input, sc));
        nuevo.setApellido(cargarDatos("Apellido", pasajero.getApellido(), input, sc));
        nuevo.setTipoDocumento(cargarDatos("Tipo de Documento", pasajero.getTipoDocumento(), input, sc));
        nuevo.setNroDocumento(cargarDatos("Número de Documento", pasajero.getNroDocumento(), input, sc));
        nuevo.setPosIVA(cargarDatos("Posición IVA", pasajero.getPosIVA(), input, sc));
        nuevo.setCUIT(cargarDatos("CUIT", pasajero.getCUIT(), input, sc));
        nuevo.setEmail(cargarDatos("Email", pasajero.getEmail(), input, sc));
        nuevo.setTelefono(cargarDatos("Teléfono", pasajero.getTelefono(), input, sc));
        nuevo.setOcupacion(cargarDatos("Ocupación", pasajero.getOcupacion(), input, sc));
        nuevo.setNacionalidad(cargarDatos("Nacionalidad", pasajero.getNacionalidad(), input, sc));
        nuevo.setFechaDeNacimiento(cargarDatos("Fecha de nacimiento", pasajero.getFechaDeNacimientoAsString(), input, sc));
        nuevo.setPais(cargarDatos("Pais", pasajero.getPais(), input, sc));
        nuevo.setProvincia(cargarDatos("Provincia", pasajero.getProvincia(), input, sc));
        nuevo.setCiudad(cargarDatos("Ciudad", pasajero.getCiudad(), input, sc));
        nuevo.setNroCalle(cargarDatos("Número de Calle", pasajero.getNroCalleAsString(), input, sc));
        nuevo.setCalle(cargarDatos("Calle", "", input, sc));
        nuevo.setPiso(cargarDatos("Piso", pasajero.getPisoAsString(), input, sc));
        nuevo.setNroDepartamento(cargarDatos("Número de Departamento", pasajero.getNroDepartamentoAsString(), input, sc));
        nuevo.setCodigoPostal(cargarDatos("Código Postal", pasajero.getCodigoPostalAsString(), input, sc));


        pasajeroImp.modificarPasajero(documento, nuevo);


        return true;
    }
    
    public String cargarDatos (String desc, String viejo, String input, Scanner scanner) {
        System.out.print(desc + " (" + viejo + "): -->");
        input = scanner.nextLine();
        System.out.println();
        if (input.trim().isEmpty()) {
            return viejo;
        }
        return input;
        }
    
    public boolean bajaDePasajero (Pasajero pasajero){

        Set<PasajeroDTO> pasajerosTot = new HashSet<PasajeroDTO>(pasajeroImp.buscarPasajeros(new PasajeroDTO()));
        //obtiene todos los pasajeros del sistema
        Set<PasajeroDTO> pasajerosConEstadia = new HashSet<>();
        //obtiene pasajeros con ocupacion
        for (OcupacionDTO ocupacion : ocupacionImp.buscarOcupaciones(new OcupacionDTO())) {  
            if(ocupacion.getResponsble() != null){ //para asegurarme de no metern null al set
                pasajerosConEstadia.add((PasajeroDTO) ocupacion.getResponsble()); 
            }
            pasajerosConEstadia.addAll(ocupacion.getAcompaniantes());
        }
        
        if(pasajerosConEstadia.contains(pasajero)){
            System.out.println("El huesped no puede ser eliminado pues se ha alojado en el Hotel en alguna oportunidad.");
            return false;
        }
        pasajerosTot.remove(pasajero); //actualizo el set local, de re onda
        boolean eliminado = pasajeroImp.borrarPasajero(pasajero.getNroDocumento());  //el error que tira es porque en PasajeroDAO el metodo borrarPasajero necesita un argumento de tipo PasajeroDTO
        
        if(eliminado){
            System.out.println("Los datos del huesped " + pasajero.getNombres() + " " + pasajero.getApellido() + ", " 
                    + pasajero.getTipoDocumento() + " " + pasajero.getNroDocumento() +" han sido eliminados del sistema.");
        }else{
            System.out.println("No se pudo eliminar el huesped.");
        }
        
        return eliminado;
    }
}