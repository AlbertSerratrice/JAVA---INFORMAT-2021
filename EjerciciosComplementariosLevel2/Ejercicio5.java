package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio5 {
    public static void main(String[] args) {
      List<Integer> hsTrabajadas = new ArrayList<>(Arrays.asList(6, 7, 8, 4, 5));
      List<Integer> valorXhora = new ArrayList<>(Arrays.asList(350, 345, 550, 600, 320));

      List<Integer> totXdia = new ArrayList<>();
    
      int totXsemana = 0;
      for(int i = 0; i<5; i++){
          totXdia.add(i, (hsTrabajadas.get(i) * valorXhora.get(i)));
          totXsemana += totXdia.get(i);
      }
        System.out.println(totXdia);
        
        System.out.println("Total final: $" + totXsemana);   
    }    
}