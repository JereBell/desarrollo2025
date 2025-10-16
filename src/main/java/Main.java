import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dto.PasajeroDTO;
import negocio.GestorConserje;
import negocio.GestorPasajero;

public class Main {
   public static void main(String[] args) throws IOException {
      GestorConserje gestorConserje = new GestorConserje();
      GestorPasajero gestorPasajero = new GestorPasajero();



      Scanner scanner = new Scanner(System.in);
      try {
         System.out.println("Ingrese un número de caso de uso a ejecutar:");
         Integer numero = scanner.nextInt();

         switch (numero) {
            case 1:
               System.out.println("Caso de uso 1 seleccionado.");
               gestorConserje.autenticarUsuario();

               break;
            case 2:
               System.out.println("Caso de uso 2 seleccionado.");
               List<PasajeroDTO> pasajeros = new ArrayList<>();

               pasajeros = gestorPasajero.buscarPasajero();
               if(pasajeros != null && !pasajeros.isEmpty()){
                  for(PasajeroDTO pasajero : pasajeros){
                     System.out.println("Pasajero encontrado: " + pasajero.getNombres() + " " + pasajero.getApellido());
                  }
               }
               else{
                  System.out.println("No se encontraron pasajeros con esas caracteristicas.");
               }

               break;
            case 9:
               //ingresar los datos
               System.out.println("Caso de uso 9 seleccionado.");
               //validar los datos
               

                  //solicitar reingreso
               //si toca cancelar
                  //botones si y no
               //verificar que no exista el dni
                  //corregir
               PasajeroDTO pasajero = gestorPasajero.agregarPasajero();
               break;

            default:
               System.out.println("Caso de uso no válido.");
               break;
         }
      } finally {
         scanner.close();
      }
   }


   }


