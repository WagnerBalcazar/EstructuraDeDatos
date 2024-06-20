public abstract class Grafo extends EstructuraDato {
    protected int vertice;
    protected int arista;

    public abstract void agregarVertice();
    public abstract void agregarArista();
    public abstract void eliminarVertice();
    public abstract void eliminarArista();

    @Override
    public void agregarNodos() {
        // Implementación del método agregarNodos (si es necesario)
    }
}
