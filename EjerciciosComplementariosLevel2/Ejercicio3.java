package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        List<String> listCards = new ArrayList<String>(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "12", "12", "13"));
        
        List<String> listReversa = new ArrayList<>(listCards);
        Collections.reverse(listReversa);
        
        List<String> listRandom = new ArrayList<>(listCards);
        Collections.shuffle(listRandom);

        System.out.print("Cartas en Orden: ");
        for(int i=0; i< listCards.size(); i++){
           System.out.print(listCards.get(i) + " ");
        }
        System.out.print("Cartas en Orden Inverso: ");
        for(int i=0; i< listCards.size(); i++){
            System.out.print(listReversa.get(i) + " ");
        }
        System.out.print("cartas Mezcladas: ");
        for(int i=0; i< listCards.size(); i++){
            System.out.print(listRandom.get(i) + " ");
        }
    }
}    