package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicios5 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Ingrese dos números enteros:");
    int numero1 = scan.nextInt();
    int numero2 = scan.nextInt();

    int ac = 0;
    for (int i = 0; i < numero2; i++) {
      ac += numero1;
    }

    System.out.println(String.format("%d x %d = %d", numero1, numero2, ac));

    scan.close();
  }

}
