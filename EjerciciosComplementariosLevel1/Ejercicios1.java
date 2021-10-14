package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicios1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Por Favor Ingrese su Nombre:");
    String nombre = scan.nextLine();

    System.out.println(String.format("HOLA %s", nombre));

    scan.close();
  }
}