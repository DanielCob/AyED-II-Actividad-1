package DataStructures;

// CLASE PARA CREAR LOS NODOS
public class Node {    
   //ATRIBUTO NOMBRE DEL NODO
   private  int nombre;
   
   //ATRIBUTO VISITADO DEL NODO
   private boolean visitado;
   
   //ATRIBUTO ETIQUETA DEL NODO
   private boolean etiqueta;
   
   //ATRIBUTO ACUMULADO DEL NODO
   private double acumulado; 
   
   //ATRIBUTO PREDECESOR DEL NODO
   private Node Predecesor;
   
   //MÉTODO QUE SETEA LOS NODOS MEDIANTE GETTERS Y SETTERS
   public Node(){
       this.nombre =-1;
       this.visitado = false;
       this.etiqueta = false;
       this.Predecesor = null;
       this.acumulado = 0;
   }

     public int getNombre() {
        return nombre;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public boolean isEtiqueta() {
        return etiqueta;
    }

    public double getAcumulado() {
        return acumulado;
    }

    public Node getPredecesor() {
        return Predecesor;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public void setEtiqueta(boolean etiqueta) {
        this.etiqueta = etiqueta;
    }

    public void setAcumulado(double acomulado) {
        this.acumulado = acomulado;
    }

    public void setPredecesor(Node Predecesor) {
        this.Predecesor = Predecesor;
    }
}
