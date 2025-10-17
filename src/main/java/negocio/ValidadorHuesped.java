package negocio;

import dto.PasajeroDTO;
import java.util.Date;
import java.util.Scanner;

public class ValidadorHuesped {

    // Valida un DTO completo
    public static void validar(PasajeroDTO huesped) throws IllegalArgumentException {
        if (huesped == null) throw new IllegalArgumentException("El huésped no puede ser nulo.");
        boolean esValido = true;
        Scanner sc = new Scanner(System.in);
        do {
            if (!validarNombre(huesped.getNombres())) {
                esValido = false;
                System.out.print("Ingrese un nombre válido: ");
                String nombre = sc.nextLine();
                huesped.setNombres(nombre);
            }
            if (!validarApellido(huesped.getApellido())) {
                esValido = false;
                System.out.print("Ingrese un apellido válido: ");
                String apellido = sc.nextLine();
                huesped.setApellido(apellido);
            }
            if (!validarTipoDocumento(huesped.getTipoDocumento())) {
                esValido = false;
                System.out.print("Ingrese un tipo de documento válido: ");
                String tipoDoc = sc.nextLine();
                huesped.setTipoDocumento(tipoDoc);
            }
            if (!validarDni(huesped.getNroDocumento())) {
                esValido = false;
                System.out.print("Ingrese un DNI válido (7 u 8 dígitos): ");
                String dni = sc.nextLine();
                huesped.setNroDocumento(dni);
            }
            
            if (!validarEmail(huesped.getEmail())) {
                esValido = false;
                System.out.print("Ingrese un email válido: ");
                String email = sc.nextLine();
                huesped.setEmail(email);
            }
            if (!validarTelefono(huesped.getTelefono())) {
                esValido = false;
                System.out.print("Ingrese un teléfono válido (6 a 15 dígitos): ");
                String telefono = sc.nextLine();
                huesped.setTelefono(telefono);
            }
            if(!validarOcupacion(huesped.getOcupacion())) {
                esValido = false;
                System.out.print("Ingrese una ocupación válida: ");
                String ocupacion = sc.nextLine();
                huesped.setOcupacion(ocupacion);
            }
            if(!validarNacionalidad(huesped.getNacionalidad())) {
                esValido = false;
                System.out.print("Ingrese una nacionalidad válida: ");
                String nacionalidad = sc.nextLine();
                huesped.setNacionalidad(nacionalidad);
            }
            if(!validarCUIT(huesped.getCUIT())){
                esValido = false;
                System.out.print("Ingrese un CUIT válido (11 dígitos): ");
                String cuit = sc.nextLine();
                huesped.setCUIT(cuit);
            }
            if(!validarPosIVA(huesped.getPosIVA())){
                esValido = false;
                System.out.print("Ingrese una posición de IVA válida: ");
                String posIVA = sc.nextLine();
                huesped.setPosIVA(posIVA);
            }
            if(!validarCiudad(huesped.getCiudad())){
                esValido = false;
                System.out.print("Ingrese una ciudad válida: ");
                String ciudad = sc.nextLine();
                huesped.setCiudad(ciudad);
            }
            if(!validarProvincia(huesped.getProvincia())){
                esValido = false;
                System.out.print("Ingrese una provincia válida: ");
                String provincia = sc.nextLine();
                huesped.setProvincia(provincia);
            }
            if(!validarPais(huesped.getPais())){
                esValido = false;
                System.out.print("Ingrese un país válido: ");
                String pais = sc.nextLine();
                huesped.setPais(pais);
            }
            if(!validarDomicilio(huesped.getCalle())){
                esValido = false;
                System.out.print("Ingrese un domicilio válido: ");
                String domicilio = sc.nextLine();
                huesped.setCalle(domicilio);
            }
            if(!validarCodigoPostal(huesped.getCodigoPostal())){
                esValido = false;
                System.out.print("Ingrese un código postal válido (número positivo): ");
                Integer codigoPostal = Integer.parseInt(sc.nextLine());
                huesped.setCodigoPostal(codigoPostal);
            }
            if(!validarNumeroCalle(huesped.getNroCalle())){
                esValido = false;
                System.out.print("Ingrese un número de calle válido (número positivo): ");
                Integer nroCalle = Integer.parseInt(sc.nextLine());
                huesped.setNroCalle(nroCalle);
            }
            if(!validarPiso(huesped.getPiso())){
                esValido = false;
                System.out.print("Ingrese un piso válido (número no negativo): ");
                Integer piso = Integer.parseInt(sc.nextLine());
                huesped.setPiso(piso);
            }
            if(!validarNroDpto(huesped.getNroDepartamento())){
                esValido = false;
                System.out.print("Ingrese un número de departamento válido (número no negativo): ");
                Integer nroDpto = Integer.parseInt(sc.nextLine());
                huesped.setNroDepartamento(nroDpto);
            }


        }while (!esValido);
        sc.close();
    }

    // --- Validaciones individuales ---

    public static boolean validarNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()){
            System.out.println("El nombre no puede estar vacío.");
            return false;
        }
        return true;
    }

    public static boolean validarApellido(String apellido) {
        if (apellido == null || apellido.trim().isEmpty()) {
            System.out.println("El apellido no puede estar vacío.");
            return false;
        }
        return true;
    }

    public static boolean validarDni(String dni) {
        if (dni == null || !dni.matches("\\d{7,8}"))
            System.out.println("El DNI debe tener 7 u 8 dígitos numéricos.");
        return true;
    }

    public static boolean validarEmail(String email) {
        if (email == null || email.trim().isEmpty()){
            System.out.println("El email no puede estar vacío.");
            return false;
        }
        if (!email.matches("^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")){
            System.out.println("El formato del email no es válido.");
            return false;
        }
        return true;
    }

    public static boolean validarTelefono(String telefono) {
        if (telefono == null || telefono.trim().isEmpty()) {
            System.out.println("El teléfono no puede estar vacío.");
            return false;
        }
        if (!telefono.matches("\\d{6,15}")) {
            System.out.println("El teléfono debe tener entre 6 y 15 dígitos.");
            return false;
        }
        return true;
    }



    public static boolean validarTipoDocumento(String tipoDoc) {
        if (tipoDoc == null || tipoDoc.trim().isEmpty()) {
            System.out.println("El tipo de documento no puede estar vacío.");
            return false;
        }
        return true;
    }



    public static boolean validarProvincia(String nombreProvincia) {
        if (nombreProvincia == null || nombreProvincia.trim().isEmpty()) {
            System.out.println("El nombre de la provincia no puede estar vacío.");
            return false;
        }
        return true;
    }


    public static boolean validarPais(String nombrePais) {
        if (nombrePais == null || nombrePais.trim().isEmpty()) {
            System.out.println("El nombre del país no puede estar vacío.");
            return false;
        }
        return true;
    }


    public static boolean validarCiudad(String nombreCiudad) {
        if (nombreCiudad == null || nombreCiudad.trim().isEmpty()) {
            System.out.println("El nombre de la ciudad no puede estar vacío.");
            return false;
        }
        return true;
    }

    public static boolean validarDomicilio(String domicilio) {
        if (domicilio == null || domicilio.trim().isEmpty()) {
            System.out.println("El domicilio no puede estar vacío.");
            return false;
        }
        return true;
    }

    public static boolean validarCodigoPostal(Integer codigoPostal) {
        if (codigoPostal == null || codigoPostal <= 0) {
            System.out.println("El código postal debe ser un número positivo.");
            return false;
        }
        return true;
    }


    public static boolean validarCUIT(String CUIT) {
        if (CUIT == null || !CUIT.matches("\\d{11}")) {
            System.out.println("El CUIT debe tener 11 dígitos numéricos.");
            return false;
        }
        return true;
    }

    public static boolean validarPosIVA(String posIVA) {
        if (posIVA == null || posIVA.trim().isEmpty()) {
            System.out.println("La posición de IVA no puede estar vacía.");
            return false;
        }
        return true;
    }

    public static boolean validarFechaDeNacimiento(Date fecha) {
        /*if (fecha == null || !fecha.matches("\\d{2}/\\d{2}/\\d{4}"))
            throw new IllegalArgumentException("La fecha de nacimiento debe tener el formato dd/mm/aaaa.");
            */
          //  System.out.println("Validar fecha de nacimiento: " + fecha);
            return true;
    }

    public static boolean validarNacionalidad(String nacionalidad) {
        if (nacionalidad == null || nacionalidad.trim().isEmpty()) {
            System.out.println("La nacionalidad no puede estar vacía.");
            return false;
        }
        return true;
    }

    public static boolean validarOcupacion(String ocupacion) {
        if (ocupacion == null || ocupacion.trim().isEmpty()) {
            System.out.println("La ocupación no puede estar vacía.");
            return false;
        }
        return true;
    }

    public static boolean validarNumeroCalle(Integer nroCalle) {
        if (nroCalle == null || nroCalle <= 0) {
            System.out.println("El número de calle debe ser un número positivo.");
            return false;
        }
        return true;
    }

    public static boolean validarPiso(Integer piso) {
        if (piso == null || piso < 0) {
            System.out.println("El piso debe ser un número no negativo.");
            return false;
        }
        return true;
    }

    public static boolean validarNroDpto(Integer nroDpto) {
        if (nroDpto == null || nroDpto < 0) {
            System.out.println("El número de departamento debe ser un número no negativo.");
            return false;
        }
        return true;
    }

    
}
