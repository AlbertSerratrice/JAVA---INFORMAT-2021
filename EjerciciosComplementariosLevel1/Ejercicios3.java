package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicios3 {
  public static void main(String[] args) {
    System.out.println("Ingresar un número entero:");

    Scanner scan = new Scanner(System.in);
    int numero = scan.nextInt();
    scan.close();

    mostrarPiramide(numero);
  }

  private static void mostrarPiramide(int numero) {
    String str = "";

    for (int i = 1; i <= numero; i++) {
      str += i;
      System.out.println(str);
    }

  }
}