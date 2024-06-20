public class NodoLista extends Nodo {
    private NodoLista nodoSiguiente;
    private NodoLista nodoAnterior;

    public NodoLista(int valor) {
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

    public NodoLista getNodoSiguiente() {
        return nodoSiguiente;
    }

    public void setNodoSiguiente(NodoLista nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }

    public NodoLista getNodoAnterior() {
        return nodoAnterior;
    }

    public void setNodoAnterior(NodoLista nodoAnterior) {
        this.nodoAnterior = nodoAnterior;
    }
}
