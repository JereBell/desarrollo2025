package negocio;

import dto.PasajeroDTO;
import java.util.Date;

public class ValidadorHuesped {

    // Valida un DTO completo
    public static void validar(PasajeroDTO huesped) throws IllegalArgumentException {
        if (huesped == null)
            throw new IllegalArgumentException("El huésped no puede ser nulo.");

        validarNombre(huesped.getNombres());
        validarApellido(huesped.getApellido());
        validarDni(huesped.getNroDocumento());
        validarEmail(huesped.getEmail());
        validarTelefono(huesped.getTelefono());
    }

    // --- Validaciones individuales ---

    public static void validarNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty())
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
    }

    public static void validarApellido(String apellido) {
        if (apellido == null || apellido.trim().isEmpty())
            throw new IllegalArgumentException("El apellido no puede estar vacío.");
    }

    public static void validarDni(String dni) {
        if (dni == null || !dni.matches("\\d{7,8}"))
            throw new IllegalArgumentException("El DNI debe tener 7 u 8 dígitos numéricos.");
    }

    public static void validarEmail(String email) {
        if (email == null || email.trim().isEmpty())
            return; // opcional
        if (!email.matches("^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$"))
            throw new IllegalArgumentException("El formato del email no es válido.");
    }

    public static void validarTelefono(String telefono) {
        if (telefono == null || telefono.trim().isEmpty())
            return; // opcional
        if (!telefono.matches("\\d{6,15}"))
            throw new IllegalArgumentException("El teléfono debe tener entre 6 y 15 dígitos.");
    }

    public static void validarIdTipoDocumento(String idTipoDoc) {
        if (idTipoDoc == null || !idTipoDoc.matches("\\d+"))
            throw new IllegalArgumentException("El ID del tipo de documento debe ser un número válido.");
    }

    public static void validarTipoDocumento(String tipoDoc) {
        if (tipoDoc == null || tipoDoc.trim().isEmpty())
            throw new IllegalArgumentException("El tipo de documento no puede estar vacío.");
    }

    public static void validarIdProvincia(Integer idProvincia) {
        if (idProvincia == null || idProvincia <= 0)
            throw new IllegalArgumentException("El ID de la provincia debe ser un número positivo.");
    }

    public static void validarProvincia(String nombreProvincia) {
        if (nombreProvincia == null || nombreProvincia.trim().isEmpty())
            throw new IllegalArgumentException("El nombre de la provincia no puede estar vacío.");
    }

    public static void validarIdPais(Integer idPais) {
        if (idPais == null || idPais <= 0)
            throw new IllegalArgumentException("El ID del país debe ser un número positivo.");
    }

    public static void validarPais(String nombrePais) {
        if (nombrePais == null || nombrePais.trim().isEmpty())
            throw new IllegalArgumentException("El nombre del país no puede estar vacío.");
    }

    public static void validarIdCiudad(Integer idCiudad) {
        if (idCiudad == null || idCiudad <= 0)
            throw new IllegalArgumentException("El ID de la ciudad debe ser un número positivo.");
    }

    public static void validarCiudad(String nombreCiudad) {
        if (nombreCiudad == null || nombreCiudad.trim().isEmpty())
            throw new IllegalArgumentException("El nombre de la ciudad no puede estar vacío.");
    }

    public static void validarDomicilio(String domicilio) {
        if (domicilio == null || domicilio.trim().isEmpty())
            throw new IllegalArgumentException("El domicilio no puede estar vacío.");
    }

    public static void validarCodigoPostal(Integer codigoPostal) {
        if (codigoPostal == null || codigoPostal <= 0)
            throw new IllegalArgumentException("El código postal debe ser un número positivo.");
    }

    public static void validarCUIT(String CUIT) {
        if (CUIT == null || !CUIT.matches("\\d{11}"))
            throw new IllegalArgumentException("El CUIT debe tener 11 dígitos numéricos.");
    }

    public static void validarPosIVA(String posIVA) {
        if (posIVA == null || posIVA.trim().isEmpty())
            throw new IllegalArgumentException("La posición de IVA no puede estar vacía.");
    }

    public static void validarFechaDeNacimiento(Date fecha) {
        /*if (fecha == null || !fecha.matches("\\d{2}/\\d{2}/\\d{4}"))
            throw new IllegalArgumentException("La fecha de nacimiento debe tener el formato dd/mm/aaaa.");
            */
            System.out.println("Validar fecha de nacimiento: " + fecha);
    }

    public static void validarNacionalidad(String nacionalidad) {
        if (nacionalidad == null || nacionalidad.trim().isEmpty())
            throw new IllegalArgumentException("La nacionalidad no puede estar vacía.");
    }

    public static void validarOcupacion(String ocupacion) {
        if (ocupacion == null || ocupacion.trim().isEmpty())
            throw new IllegalArgumentException("La ocupación no puede estar vacía.");
    }

    public static void validarNumeroCalle(Integer nroCalle) {
        if (nroCalle == null || nroCalle <= 0)
            throw new IllegalArgumentException("El número de calle debe ser un número positivo.");
    }

    public static void validarPiso(Integer piso) {
        if (piso == null || piso < 0)
            throw new IllegalArgumentException("El piso debe ser un número no negativo.");
    }

    public static void validarNroDpto(Integer nroDpto) {
        if (nroDpto == null || nroDpto < 0)
            throw new IllegalArgumentException("El número de departamento debe ser un número no negativo.");
    }
    
}
