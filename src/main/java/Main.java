


import java.io.IOException;
import java.util.Scanner;

import dto.PasajeroDTO;
import negocio.GestorConserje;
import negocio.GestorPasajero;

public class Main {
   public static void main(String[] args) throws IOException {
      GestorConserje gestorConserje = new GestorConserje();
      GestorPasajero gestorPasajero = new GestorPasajero();



      Scanner scanner = new Scanner(System.in);
      System.out.println("Ingrese un número de caso de uso a ejecutar:");
      Integer numero = scanner.nextInt();
      PasajeroDTO pasajero = new PasajeroDTO();

      switch (numero) {
         case 1:
            System.out.println("Caso de uso 1 seleccionado.");
            gestorConserje.autenticarUsuario();

            break;
         case 2:
            System.out.println("Caso de uso 2 seleccionado.");
            pasajero = gestorPasajero.buscarPasajero();
            System.out.println("Pasajero encontrado: " + pasajero.getNombres() + " " + pasajero.getApellido());

            break;
         default:
            System.out.println("Caso de uso no válido.");
            break;
      }
   }


   }


