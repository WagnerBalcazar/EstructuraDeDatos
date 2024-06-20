public class Main {
    public static void main(String[] args) {
        // Crear y operar sobre un árbol binario
        ArbolBinario arbol = new ArbolBinario();
        arbol.agregar(5);
        arbol.agregar(3);
        arbol.agregar(7);
        arbol.agregar(1);
        arbol.agregar(4);

        System.out.print("Recorrido Inorden del Árbol Binario: ");
        arbol.recorrerInorden();
        System.out.println();

        // Crear y operar sobre una lista enlazada
        ListaEnlazada lista = new ListaEnlazada();
        lista.agregarInicio(1);
        lista.agregarInicio(2);
        lista.agregarFin(3);
        lista.agregarFin(4);

        System.out.print("Recorrido de la Lista Enlazada: ");
        lista.recorrer();
        System.out.println();
    }
}
