package negocio;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

import dao.daoImp.PasajeroImp;
import dto.PasajeroDTO;


public class GestorPasajero {
    private PasajeroImp pasajeroImp;


    public GestorPasajero() {
        this.pasajeroImp = new PasajeroImp();
    }


    //metodos
    public PasajeroDTO buscarPasajero() throws IOException {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Ingrese el nombre del pasajero a buscar:");
            String nombre = scanner.nextLine();
            return pasajeroImp.buscarPasajeros(nombre);
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

        System.out.println("Ingrese el Número de documento del pasajero:");
        pasajero.setNroDocumento(reader.readLine());

        System.out.println("Ingrese el teléfono del pasajero:");
        pasajero.setTelefono(reader.readLine());

        System.out.println("Ingrese el correo electrónico del pasajero:");
        pasajero.setEmail(reader.readLine());

        // Aquí podrías agregar validaciones adicionales según sea necesario

        // Guardar el nuevo pasajero en la base de datos
        pasajeroImp.agregarPasajero(pasajero);
        System.out.println("Pasajero agregado exitosamente.");

        return pasajero;
    }
}
