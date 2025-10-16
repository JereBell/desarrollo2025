package negocio;

import dto.PasajeroDTO;

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
}
