package DataStructures;

import GUI.*;
import static Main.App.PintarFiguras;
import static Main.App.jPanel1;
import java.awt.Color;

// Clase en la cual se encontrará el algoritmo de dijkstra
public class Dijkstra {

    private final Graph arboles; // Matriz de adyazencia
    private int subTope; // Referencia al tope de nodos que se encuentra en la matriz
    private Node Nodoauxiliar = null; // Nodo auxiliar
    private double auxiliarAumulado; // es un acumulado auxiliar
    private double subtotalAcomulado; // Acumulacion del peso de los vertices
    private final Node nodo[]; // Nodo del grafo
    private final int tope; // Cantidad de nodos
    private int Origen; // Nodo de origen o bien el punto de partida
    private final int nodoFinal; // Nodo final o bien el punto de llegada

    // Constructor de la calse Dijkstra
    public Dijkstra(Graph arboles, int tope, int permanente, int nodoFin) {
        this.arboles = arboles;
        this.tope = tope;
        this.nodo = new Node[tope];
        this.Origen = permanente;
        this.nodoFinal = nodoFin;

    }

    // Getter para obtener el valor del peso de los vertices recorridos
    public double getAcumulado() {
        return nodo[nodoFinal].getAcumulado();
    }

    // Getter del nombre de cada uno de los nodos del grafo
    public int getNombre() {
        return nodo[nodoFinal].getNombre();
    }


    // Algoritmo de dijkstra
    public void dijkstra() {
        for (int i = 0; i < tope; i++) // creacion del vector nodo del tamaño del numero de nodos pintados 
        {
            nodo[i] = new Node(); // Se intancia un nodo
        }
            jPanel1.paint(jPanel1.getGraphics()); // Se evalua la posicion en el panel
            PintarFiguras(tope, arboles); // Se pintan las figuras
            ViewGraphics.seleccionNodo(jPanel1.getGraphics(), //Se intancia la clase para dibujar el primer nodo, o sea el de origen
                    arboles.getCordeX(Origen), // Se obtiene la coordenada en x del nodo de origen
                    arboles.getCordeY(Origen), null, Color.GREEN); // pinta de color el nodo de Origen

            nodo[Origen].setVisitado(true);
            nodo[Origen].setNombre(Origen);

            do {
                subtotalAcomulado = 0;// Se inicia el subtotal de acumulacion de de los vertices
                auxiliarAumulado = 2000000000; // lo igualamos a esta cifra ya q el acomulado de los nodos, a la que nunca sera mayor 
                nodo[Origen].setEtiqueta(true);
                for (int j = 0; j < tope; j++) { //Un for para recorrer todas las filas de la matriz
                    if (arboles.getmAdyacencia(j, Origen) == 1) { //Si en la matriz el origen es positivo, o sea que hay camino
                        subtotalAcomulado = nodo[Origen].getAcumulado() + arboles.getmCoeficiente(j, Origen);// El acumulado guarda el peso del vertice
                        
                        if (subtotalAcomulado <= nodo[j].getAcumulado() //Si el subtotal es menor o igual a el valor de los vertices acumulados
                                && nodo[j].isVisitado() == true // Y tengo que mi nodo visitado está seleccionado, lo que significa que ya se recorrio
                                && nodo[j].isEtiqueta() == false) { //Hay mas nodos por recorrer
                            nodo[j].setAcumulado(subtotalAcomulado); // El acumulado se setea
                            nodo[j].setVisitado(true); // Se procede al siguiente nodo
                            nodo[j].setNombre(j);// Se setea el nombre del nodo
                            nodo[j].setPredecesor(nodo[Origen]); //el nodo anterior pasa a ser el origen
                        } else if (nodo[j].isVisitado() == false) { //En caso de que el nodo en el que se está no es visitado, o sea, que no hay camino
                            nodo[j].setAcumulado(subtotalAcomulado); //El acumulado se setea
                            nodo[j].setVisitado(true); //Se pasa por el nodo, o sea que ya se recorrio en la matriz
                            nodo[j].setNombre(j); // Se setea el nombre del nodo
                            nodo[j].setPredecesor(nodo[Origen]); // El nodo anterior pasa a ser el nodo de origen
                        }
                    }
                }
                
                //Encontrando Camino mas corto
                for (int i = 0; i < tope; i++) { // buscamos cual de los nodos visitado tiene el acomulado menor par escogerlo como camino
                    if (nodo[i].isVisitado() == true && nodo[i].isEtiqueta() == false) {// Si en la matriz de adyancencia hay un 1
                        if (nodo[i].getAcumulado() <= auxiliarAumulado) {  //si el acumulado es menor o igual a la vaiable auxiliar que lleva el peso de los vertices
                            Origen = nodo[i].getNombre(); // El nodo de origen pasa a ser el que se acaba de evaluar
                            auxiliarAumulado = nodo[i].getAcumulado(); //y el auxiliar del acumulado pasa a ser el valor de todos los pesos de los vertices que se han evaluado
                        }
                    }
                }
                subTope++; // se aumenta el indice que lleva la cuenta de los nodos
            } while (subTope < tope + 1); //Mientras el indice que lleva a los nodos no sea mayor al tope

            Nodoauxiliar = nodo[nodoFinal]; // El nodo auxiliar pasa a ser el nodo final
            
            //Pintando caminos recorridos
            while (Nodoauxiliar.getPredecesor() != null) {
                ViewGraphics.pinta_Camino(jPanel1.getGraphics(), 
                        arboles.getCordeX(Nodoauxiliar.getNombre()),
                        arboles.getCordeY(Nodoauxiliar.getNombre()),
                        arboles.getCordeX(Nodoauxiliar.getPredecesor().getNombre()), 
                        arboles.getCordeY(Nodoauxiliar.getPredecesor().getNombre()), Color.BLUE);
                
                ViewGraphics.seleccionNodo(jPanel1.getGraphics(), 
                        arboles.getCordeX(Nodoauxiliar.getNombre()), 
                        arboles.getCordeY(Nodoauxiliar.getNombre()), null, Color.BLUE);
                Nodoauxiliar = Nodoauxiliar.getPredecesor();
            }//fin de while Recorriendo caminos
            
            ViewGraphics.seleccionNodo(jPanel1.getGraphics(), 
                    arboles.getCordeX(nodoFinal), 
                    arboles.getCordeY(nodoFinal), null, Color.RED);//Pintando Node del destino
        
    }

}
