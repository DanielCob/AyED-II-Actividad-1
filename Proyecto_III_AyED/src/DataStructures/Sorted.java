
package DataStructures;
import java.util.Arrays;

public class Sorted {
    
    String[] Lugares ={"Oriental","San Nicolás", "Aguas Calientes", "Guadalupe", 
        "Dulce Nombre", "Tres Ríos", "Cachí", "Orosi", "Paraiso","Santiago","Tejar",
        "Cervantes", "Juan Viiñas", "Concepción", "Carmen", "Corralillo", "Tierra Blanca", "Llano Grande"};
    
  
    public void Ordenar(){
        
        Arrays.sort(Lugares);
        
        for(String s: Lugares){
            System.out.println(s);
        }
        
    }
    
   public static void main(String[] args) {
       Sorted sorted = new Sorted();
        sorted.Ordenar();
    
    }
    
}
