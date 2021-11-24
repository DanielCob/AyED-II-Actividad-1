
package DataStructures;
import java.util.Arrays;

public class Sorted {
    
    public static String[] Lugares ={"Oriental","San Nicolás", "Aguas Calientes", "Guadalupe", 
        "Dulce Nombre", "Tres Ríos", "Cachí", "Orosi", "Paraiso","Santiago","Tejar",
        "Cervantes", "Juan Viñas", "Concepción", "Carmen", "Corralillo", "Tierra Blanca", "Llano Grande","Occidental"};

    
  
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
