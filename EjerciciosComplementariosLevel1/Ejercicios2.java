package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicios2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Ingrese el valor de 2 números enteros:");
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    scan.close();

    System.out.println(String.format("%d + %d = %d", num1, num2, (num1 + num2)));
    System.out.println(String.format("%d - %d = %d", num1, num2, (num1 - num2)));
    System.out.println(String.format("%d * %d = %d", num1, num2, (num1 * num2)));
    System.out.println(String.format("%d / %d = %d", num1, num2, (num1 / num2)));
    System.out.println( num1 + " % " + num2 + " = " + (num1%num2));
  }
}
