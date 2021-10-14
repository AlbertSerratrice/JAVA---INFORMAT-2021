package EjerciciosComplementariosLevel2;

import java.util.HashSet;
import java.util.Map;
import java.util.Iterator;
import java.util.HashMap;

class empleado {
    String NombYApell;
    String Dni;
    int hsTrab;
    int valorXHs;
    
    public empleado(String NombYApell, String Dni, int hsTrab, int valorXHs){
        this.NombYApell = NombYApell;
        this.Dni = Dni;   
        this.hsTrab = hsTrab;
        this.valorXHs = valorXHs;
    }
}

public class Ejercicio6 {    
        public static void main (String[] args){
            
            empleado Trab1 = new empleado("Homero Simpson", "13604813", 12, 150);
            empleado Trab2 = new empleado("Carl Carlson", "14696882", 12, 180);                        
            empleado Trab3 = new empleado("Lenny Leonard", "18596777", 8, 200);    
            empleado Trab4 = new empleado("Waylon Smithers", "12500146", 8, 350);    
            
            HashSet<empleado> trabHashSet = new HashSet<>();
            
            trabHashSet.add(Trab1);
            trabHashSet.add(Trab2);
            trabHashSet.add(Trab3);            
            trabHashSet.add(Trab4);            
            
            Map<String, Integer> map = new HashMap<String, Integer>();  
            
            map.put(Trab1.Dni, ((Trab1.hsTrab*Trab1.valorXHs)*30));
            map.put(Trab2.Dni, ((Trab2.hsTrab*Trab2.valorXHs)*30));
            map.put(Trab3.Dni, ((Trab3.hsTrab*Trab3.valorXHs)*30));
            map.put(Trab4.Dni, ((Trab4.hsTrab*Trab4.valorXHs)*30));
                      
            Iterator<String> it = map.keySet().iterator();
            while(it.hasNext()){
                String key = it.next();
                System.out.println(String.format("Dni: %s = Sueldo: %d", key, map.get(key)));
              }            
    }
}

