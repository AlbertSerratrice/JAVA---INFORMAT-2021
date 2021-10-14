package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    List<String> citysFav = new ArrayList<>();

    cargarCiudades(citysFav);

    imprimirCiudades(citysFav);
  }

  private static void imprimirCiudades(List<String> citysFav) {
    System.out.println("Tus ciudades favoritas son:");

    int cont = 1;
    for (String ciudad : citysFav) {
      System.out.println(String.format("#%d - %s", cont, ciudad));
      cont++;
    }
  }

  private static void cargarCiudades(List<String> citysFav) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Ingresar el nombre de tu 1er ciudad favorita de Argentina:");
      citysFav.add(scan.nextLine());

    System.out.println("Ingresar el nombre de tu 2da ciudad favorita de Argentina:");
      citysFav.add(scan.nextLine());

      System.out.println("Ingresar el nombre de tu 3er ciudad favorita de Argentina:");
      citysFav.add(scan.nextLine());

    scan.close();
  }
}