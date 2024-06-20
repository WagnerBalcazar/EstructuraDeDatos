public class NodoArbol extends Nodo {
    private NodoArbol nodoIzquierda;
    private NodoArbol nodoDerecha;

    public NodoArbol(int valor) {
        this.valor = valor;
    }

    @Override
    public void agregar() {
        // Implementación del método agregar
    }

    @Override
    public void eliminar() {
        // Implementación del método eliminar
    }

    public int getValor() {
        return valor;
    }

    public NodoArbol getNodoIzquierda() {
        return nodoIzquierda;
    }

    public void setNodoIzquierda(NodoArbol nodoIzquierda) {
        this.nodoIzquierda = nodoIzquierda;
    }

    public NodoArbol getNodoDerecha() {
        return nodoDerecha;
    }

    public void setNodoDerecha(NodoArbol nodoDerecha) {
        this.nodoDerecha = nodoDerecha;
    }
}

