import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dto.PasajeroDTO;
import negocio.GestorConserje;
import negocio.GestorPasajero;

public class Main {
   private static Scanner sc = new Scanner(System.in);
   public static void main(String[] args) throws IOException {
      GestorConserje gestorConserje = new GestorConserje();
      GestorPasajero gestorPasajero = new GestorPasajero();



      try {
         System.out.print("Ingrese un número de caso de uso a ejecutar:");
         Integer numero = ((Integer.parseInt(sc.nextLine())));

         switch (numero) {
            case 1:
               System.out.println("Caso de uso 1 seleccionado.");
               gestorConserje.autenticarUsuario();

               break;
            case 2:
               System.out.println("Caso de uso 2 seleccionado.");
               List<PasajeroDTO> pasajeros = new ArrayList<>();

               pasajeros = gestorPasajero.buscarPasajero(sc);

               if(pasajeros.size()>1){
                  System.out.println("Se encontraron " + pasajeros.size() + " pasajeros con esas caracteristicas.");
                  System.out.println();
                  int i=1;
                  for(PasajeroDTO pasajero : pasajeros){
                     System.out.println(i + ". " + pasajero.getNombres() + " " + pasajero.getApellido()+" - " + pasajero.getTipoDocumento() + ": " + pasajero.getNroDocumento());
                     i++;
                  }
                  System.out.println();
                  System.out.print("Ingrese el numero de un pasajero para modificar, 0 para cancelar:");


                  Integer seleccion = null;
                   // leer hasta que el usuario ingrese un entero válido
                  while (seleccion == null) {
                     seleccion= Integer.parseInt(sc.nextLine());

                     if (seleccion.toString().isEmpty()) {
                           System.out.println("Entrada inválida. Ingrese un número entero:");
                           continue;
                       }
                   }
                  if(seleccion!=0){
                     PasajeroDTO pasajeroSeleccionado = pasajeros.get(seleccion-1);
                     if(gestorPasajero.modificarPasajero(pasajeroSeleccionado, sc)){
                        System.out.println("Modificación realizada con éxito.");
                     }
                  }else{
                     System.out.println("Modificación cancelada por el usuario.");
                  }
               }else if(pasajeros.size()==1){
                  PasajeroDTO pasajero = pasajeros.get(0);
                  System.out.println(". " + pasajero.getNombres() + " " + pasajero.getApellido()+" - " + pasajero.getTipoDocumento() + ": " + pasajero.getNroDocumento());
                  System.out.println();
                  System.out.println("Ingrese 1 para modificar este pasajero, 0 para cancelar:");
                  Integer seleccion = sc.nextInt();
                  while(seleccion<0||seleccion>1){
                     System.out.println("Selección inválida. Ingrese 1 para modificar, 0 para cancelar:");
                     seleccion = sc.nextInt();
                  }
                  if(seleccion==1){
                     if(gestorPasajero.modificarPasajero(pasajero, sc)){
                        System.out.println("Modificación realizada con éxito.");
                     }
                  }else{
                     System.out.println("Modificación cancelada por el usuario.");
                  }
               }else{
                  System.out.println("No se encontraron pasajeros con esas caracteristicas.");
               }

               break;
            case 9:
               System.out.println("Caso de uso 9 seleccionado.");

               PasajeroDTO pasajero = gestorPasajero.agregarPasajero();
               break;

            default:
               System.out.println("Caso de uso no válido.");
               break;
         }
      } finally {
         sc.close();
      }
   }


   }


