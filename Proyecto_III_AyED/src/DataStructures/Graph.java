package DataStructures;

public class Graph {

    private final double MatrizCoeficiente[][] = new double[51][51]; // Matriz con los pesos de los vertices
    private final int MatrizAdyacencia[][] = new int[51][51]; // Matriz de adyacencia
    private final int cordenadaX[] = new int[51]; //Se intancia las coordenas x de los nodos dentro de la lista que lleva estas coordenadas
    private final int cordenadaY[] = new int[51]; // Se intancia las coordenas y de los nodos dentro de la lista que lleva estas coordenadas
    private final String nombre[] = new String[51]; // Lista que lleva los nombres de los nodos, que al final no la usamnos xd
    private int enArbol[]; // Cantidad de vertices que dentro del grafo

    public Graph() {

    }
    //Get dde la matriz con los pesos de los vertices
    public double getmCoeficiente(int i, int j) {
        return MatrizCoeficiente[i][j];
    }
    // get de la matriz de adyacencia
    public int getmAdyacencia(int i, int j) {
        return MatrizAdyacencia[i][j];
    }
    //get de la coordenada x de los nodos
    public int getCordeX(int i) {
        return cordenadaX[i];
    }
    //get de la coordenada y de los nodos
    public int getCordeY(int i) {
        return cordenadaY[i];
    }
    //get de los nombres de los nodos
    public String getNombre(int i) {
        return nombre[i];
    }
    //Get del nombre de los nodos
    public int getEnArbol(int i) {
        return enArbol[i];
    }
    //Set dde la matriz con los pesos de los vertices
    public void setmCoeficiente(int i, int j, double mCoeficiente) {
        this.MatrizCoeficiente[i][j] = mCoeficiente;
    }
    // Set de la matriz de adyacencia
    public void setmAdyacencia(int i, int j, int mAdyacencia) {
        this.MatrizAdyacencia[i][j] = mAdyacencia;
    }
    //Set de la coordenada x de los nodos
    public void setCordeX(int i, int cordeX) {
        this.cordenadaX[i] = cordeX;
    }
    //Set de la coordenada y de los nodos
    public void setCordeY(int i, int cordeY) {
        this.cordenadaY[i] = cordeY;
    }
    //Set de los nombres de los nodos
    public void setNombre(int i, String nombre) {
        this.nombre[i] = nombre;
    }
    //Set del nombre de los nodos
    public void setEnArbol(int i, int enArbol) {
        this.enArbol[i] = enArbol;
    }
    //Metodo para poder agregar un nuevo camino dentro de la matriz de adyacencia+
    public void crearEnArbol(int i) {
        enArbol = new int[i];
    }

}
