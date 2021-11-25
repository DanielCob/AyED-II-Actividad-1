package DataStructures;

import GUI.*;
import static Main.App.PintarFiguras;
import static Main.App.jPanel1;
import java.awt.Color;


public class Dijkstra {

    private final Graph arboles;
    private int subTope;
    private Node Nodoauxiliar = null;
    private double auxiliarAumulado; // es un acumulado auxiliar
    private double subtotalAcomulado;
    private final Node nodo[];
    private final int tope;
    private int Origen;
    private final int nodoFinal;

    public Dijkstra(Graph arboles, int tope, int permanente, int nodoFin) {
        this.arboles = arboles;
        this.tope = tope;
        this.nodo = new Node[tope];
        this.Origen = permanente;
        this.nodoFinal = nodoFin;

    }

    public double getAcumulado() {
        return nodo[nodoFinal].getAcumulado();
    }

    public int getNombre() {
        return nodo[nodoFinal].getNombre();
    }

    public void dijkstra() {
        for (int i = 0; i < tope; i++) // creacion del vector nodo del tamaño del numero de nodos pintados 
        {
            nodo[i] = new Node();
        }
            jPanel1.paint(jPanel1.getGraphics());
            PintarFiguras(tope, arboles);
            ViewGraphics.seleccionNodo(jPanel1.getGraphics(), 
                    arboles.getCordeX(Origen), 
                    arboles.getCordeY(Origen), null, Color.GREEN); // pinta de color el nodo de Origen

            nodo[Origen].setVisitado(true);
            nodo[Origen].setNombre(Origen);

            do {
                subtotalAcomulado = 0;
                auxiliarAumulado = 2000000000; // lo igualamos a esta cifra ya q el acomulado de los nodos, a la que nunca sera mayor 
                nodo[Origen].setEtiqueta(true);
                for (int j = 0; j < tope; j++) {
                    if (arboles.getmAdyacencia(j, Origen) == 1) {
                        subtotalAcomulado = nodo[Origen].getAcumulado() + arboles.getmCoeficiente(j, Origen);
                        
                        if (subtotalAcomulado <= nodo[j].getAcumulado() && nodo[j].isVisitado() == true && nodo[j].isEtiqueta() == false) {
                            nodo[j].setAcumulado(subtotalAcomulado);
                            nodo[j].setVisitado(true);
                            nodo[j].setNombre(j);
                            nodo[j].setPredecesor(nodo[Origen]);
                        }
                    }
                }
                
                //Encontrando Camino mas corto
                for (int i = 0; i < tope; i++) { // buscamos cual de los nodos visitado tiene el acomulado menor par escogerlo como camino
                    if (nodo[i].isVisitado() == true && nodo[i].isEtiqueta() == false) {
                        if (nodo[i].getAcumulado() <= auxiliarAumulado) {
                            Origen = nodo[i].getNombre();
                            auxiliarAumulado = nodo[i].getAcumulado();
                        }
                    }
                }
                subTope++;
            } while (subTope < tope + 1);

            Nodoauxiliar = nodo[nodoFinal];
            
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
