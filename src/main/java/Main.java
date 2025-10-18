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
               if(pasajeros.size()>1){
                  System.out.println("Se encontraron " + pasajeros.size() + " pasajeros con esas caracteristicas.");
                  System.out.println();
                  int i=1;
                  for(PasajeroDTO pasajero : pasajeros){
                     System.out.println(i + ". " + pasajero.getNombres() + " " + pasajero.getApellido()+" - " + pasajero.getTipoDocumento() + ": " + pasajero.getNroDocumento());
                     i++;
                  }
                  System.out.println();
                  System.out.println("Ingrese el numero de un pasajero para modificar, 0 para cancelar:");
                  int seleccion = scanner.nextInt();

                  while(seleccion>pasajeros.size()||seleccion<0){
                     System.out.println("Selección inválida. Por favor, ingrese un número acorde a la cantidad de pasajeros:");
                     seleccion = scanner.nextInt();
                  }
                  if(seleccion!=0){
                     PasajeroDTO pasajeroSeleccionado = pasajeros.get(seleccion-1);
                     if(gestorPasajero.modificarPasajero(pasajeroSeleccionado)){
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
                  int seleccion = scanner.nextInt();
                  while(seleccion<0||seleccion>1){
                     System.out.println("Selección inválida. Ingrese 1 para modificar, 0 para cancelar:");
                     seleccion = scanner.nextInt();
                  }
                  if(seleccion==1){
                     if(gestorPasajero.modificarPasajero(pasajero)){
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
         scanner.close();
      }
   }


   }


