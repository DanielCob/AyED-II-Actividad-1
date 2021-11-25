
package DataStructures;
import java.util.Arrays;

//CLASE PARA ORDENAR EL ARRAY DE LAS CIUDADES
public class Sorted {
    
    //ARRAY DE CIUDADES
    public static String[] Lugares ={"Oriental","San Nicolás", "Aguas Calientes", "Guadalupe", 
        "Dulce Nombre", "Tres Ríos", "Cachí", "Orosi", "Paraiso","Santiago","Tejar",
        "Cervantes", "Juan Viñas", "Concepción", "Carmen", "Corralillo", "Tierra Blanca", "Llano Grande","Occidental"};
    
    //METODO QUE UTILIZA .sort PARA ORDENAS ALFABETICAMENTE EL ARRAY
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
