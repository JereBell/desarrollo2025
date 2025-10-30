
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import dto.PasajeroDTO;
import negocio.GestorConserje;
import negocio.GestorPasajero;
import exceptions.HuespedInvalidoException;

public class Main {
   private static Scanner sc = new Scanner(System.in);
   public static void main(String[] args) throws IOException {
      GestorConserje gestorConserje = new GestorConserje();
      GestorPasajero gestorPasajero = new GestorPasajero();



      try {
         System.out.println("Ingrese un número de caso de uso a ejecutar: ");
         System.out.println("1: Autenticar usuario");
         System.out.println("2: Buscar huesped");
         System.out.println("9: Dar de alta huesped");
         String entrada;
         Integer seleccion =null;
         List<Integer> opciones = new ArrayList<>(Arrays.asList(1, 2, 9));
         
         while(seleccion == null){
            System.out.print("->");

            entrada=sc.nextLine();
            System.out.println();

            if(!entrada.isEmpty() && entrada.matches("\\d+") ){
               if(Integer.parseInt(entrada) >= 0 && opciones.contains(Integer.parseInt(entrada))){
               seleccion= Integer.parseInt(entrada);
            }}else{
               System.out.print("Opcion invalida. Ingrese un numero caso valido");
            }
         }
         System.out.println("-------------------------------");

         switch (seleccion) {
            case 1:
               System.out.println("Caso de uso 1 seleccionado.");
               gestorConserje.autenticarUsuario();
               break;
            case 2:
               System.out.println("Caso de uso 2 seleccionado.");
               List<PasajeroDTO> pasajeros = new ArrayList<>();

               pasajeros = gestorPasajero.buscarPasajero(sc);
               System.out.println();

               if(pasajeros.size()>1){
                  System.out.println("Se encontraron " + pasajeros.size() + " pasajeros.");
                  System.out.println();
                  int i=1;
                  for(PasajeroDTO pasajero : pasajeros){
                     System.out.println("    "+i + ". " + pasajero.getNombres() + " " + pasajero.getApellido()+" - " + pasajero.getTipoDocumento() + ": " + pasajero.getNroDocumento());
                     i++;
                  }
                  System.out.println();
                  System.out.print("Ingrese el numero de un pasajero para modificar, 0 para cancelar: ");


                  seleccion = null;

                  // leer hasta que el usuario ingrese un entero válido
                  while (seleccion == null) {
                     entrada = sc.nextLine();

                     try {
                        int valor = Integer.parseInt(entrada);

                        if (valor < 0 || valor > pasajeros.size()) {
                              System.out.println("Número fuera de rango. Ingrese un número válido:");
                        } else {
                              seleccion = valor;
                        }

                     } catch (NumberFormatException e) {
                        // Si el usuario ingresó texto o algo no numérico
                        System.out.println("Entrada inválida. Ingrese un número entero:");
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

                  seleccion = null;

                  // leer hasta que el usuario ingrese un entero válido
                  while (seleccion == null) {
                     entrada = sc.nextLine();

                     try {
                        int valor = Integer.parseInt(entrada);

                        if (valor < 0 || valor > pasajeros.size()) {
                              System.out.println("Número fuera de rango. Ingrese un número válido:");
                        } else {
                              seleccion = valor;
                        }

                     } catch (NumberFormatException e) {
                        // Si el usuario ingresó texto o algo no numérico
                        System.out.println("Entrada inválida. Ingrese un número entero:");
                     }
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
      } catch (HuespedInvalidoException e){
          System.out.println("Error: " + e.getMessage());
      }
        finally {
         sc.close();
      }
   }
   }



