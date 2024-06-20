public class ListaEnlazada extends Lista {
    private NodoLista cabeza;

    @Override
    public void recorrer() {
        NodoLista actual = cabeza;
        while (actual != null) {
            System.out.print(actual.getValor() + " ");
            actual = actual.getNodoSiguiente();
        }
    }

    @Override
    public void agregarInicio(int valor) {
        NodoLista nuevoNodo = new NodoLista(valor);
        nuevoNodo.setNodoSiguiente(cabeza);
        cabeza = nuevoNodo;
    }

    @Override
    public void agregarFin(int valor) {
        NodoLista nuevoNodo = new NodoLista(valor);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            NodoLista actual = cabeza;
            while (actual.getNodoSiguiente() != null) {
                actual = actual.getNodoSiguiente();
            }
            actual.setNodoSiguiente(nuevoNodo);
        }
    }

    @Override
    public void agregarNodos() {
        // Implementación del método agregarNodos
    }
}
