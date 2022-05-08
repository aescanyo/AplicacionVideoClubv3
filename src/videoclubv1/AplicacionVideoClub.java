/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoclubv1;


import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import videoclubv1.clases.Alquiler;
import videoclubv1.clases.Categoria;
import videoclubv1.clases.Pelicula;
import videoclubv1.clases.Cliente;
import videoclubv1.clases.VideoClub;

/**
 *
 * @author masquy
 */
public class AplicacionVideoClub {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int teclado;
      do {
      
      System.out.println("Menu Videoclub");
      System.out.println("1. Añadir cliente ");
      System.out.println("2. Borrar cliente ");
      System.out.println("3. Añadir pelicula ");
      System.out.println("4. Borrar pelicula ");
      System.out.println("5. Alquilar pelicula ");
      System.out.println("6. Devolver pelicula");
      System.out.println("7. Mostrar informe cliente");
      System.out.println("8. Salir");
      
      teclado = sc.nextInt();

          switch (teclado) {
              case '1':
                  Cliente nuevo = new Cliente("Pepe");
                  break;
              case '2':
                  
                  break;
              case '3':
                  
                  break;
              default:
                  System.out.println("Saliendo.");
                  break;
          }
          
     } while (teclado !=8);
}
//main

//  private static void mostrarArrayGenerico(Object[] array) {
//    for (Object obj : array) {
//      String mensaje;
//      //if (obj != null) {
//        mensaje = obj.toString();
//        System.out.println(mensaje);
//      //}
//    }
//  }
//  
  
  
} //class

//ejercicio 4
//conjuntos para listas ordenadas usa internamente compare

//hacer  tostring , hash, iguals, compare (para añadir) 