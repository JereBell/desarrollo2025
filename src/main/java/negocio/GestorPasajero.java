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
        System.out.println("Ingrese el nombre del pasajero a buscar:");
        String nombre = scanner.nextLine();
        return pasajeroImp.buscarPasajeros(nombre);
    }
}
