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
               pasajero = gestorPasajero.agregarPasajero();
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
                                          break;

                                       case 2: //NO 
                                          //No se que hace aca

                                       default:
                                          opcionValidaCancela = false;
                                          System.out.println("Opción no válida. Intente nuevamente.\n");
                                          break;
                                 }
                              } while (!opcionValidaCancela);
                  sc.close();
                  break;

                  default:
                     opcionValida = false;
                     System.out.println("Opción no válida. Intente nuevamente.\n");
                     break;
                  }

               } while (!opcionValida);

               // Guardar el nuevo pasajero en la base de dato s
               // pasajeroImp.agregarPasajero(pasajero); lo comento porque no esta implementado
        
               System.out.println("Pasajero agregado exitosamente.");
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


