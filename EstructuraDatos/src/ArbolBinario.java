public class ArbolBinario {
    private NodoArbol raiz;

    public void agregar(int valor) {
        raiz = agregarRecursivo(raiz, valor);
    }

    private NodoArbol agregarRecursivo(NodoArbol actual, int valor) {
        if (actual == null) {
            return new NodoArbol(valor);
        }

        if (valor < actual.getValor()) {
            actual.setNodoIzquierda(agregarRecursivo(actual.getNodoIzquierda(), valor));
        } else if (valor > actual.getValor()) {
            actual.setNodoDerecha(agregarRecursivo(actual.getNodoDerecha(), valor));
        } else {
            // El valor ya existe
            return actual;
        }

        return actual;
    }

    public void recorrerInorden() {
        recorrerInordenRecursivo(raiz);
    }

    private void recorrerInordenRecursivo(NodoArbol nodo) {
        if (nodo != null) {
            recorrerInordenRecursivo(nodo.getNodoIzquierda());
            System.out.print(nodo.getValor() + " ");
            recorrerInordenRecursivo(nodo.getNodoDerecha());
        }
    }
}
