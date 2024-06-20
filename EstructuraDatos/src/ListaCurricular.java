public class ListaCurricular extends Lista {
    private NodoLista cabeza;

    @Override
    public void recorrer() {
        NodoLista actual = cabeza;
        do {
            System.out.print(actual.getValor() + " ");
            actual = actual.getNodoSiguiente();
        } while (actual != cabeza);
    }

    @Override
    public void agregarInicio(int valor) {
        NodoLista nuevoNodo = new NodoLista(valor);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cabeza.setNodoSiguiente(cabeza);
        } else {
            NodoLista actual = cabeza;
            while (actual.getNodoSiguiente() != cabeza) {
                actual = actual.getNodoSiguiente();
            }
            nuevoNodo.setNodoSiguiente(cabeza);
            actual.setNodoSiguiente(nuevoNodo);
            cabeza = nuevoNodo;
        }
    }

    @Override
    public void agregarFin(int valor) {
        NodoLista nuevoNodo = new NodoLista(valor);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cabeza.setNodoSiguiente(cabeza);
        } else {
            NodoLista actual = cabeza;
            while (actual.getNodoSiguiente() != cabeza) {
                actual = actual.getNodoSiguiente();
            }
            actual.setNodoSiguiente(nuevoNodo);
            nuevoNodo.setNodoSiguiente(cabeza);
        }
    }

    @Override
    public void agregarNodos() {
        // Implementación del método agregarNodos
    }
}
