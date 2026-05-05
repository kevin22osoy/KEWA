class ArbolBinario {
    int dato;
    Nodo izquierda, derecha;

    public Nodo(int dato) {
        this.dato = dato;
        izquierda = null;
        derecha = null;
    }
}

public class ArbolBinario {

    Nodo raiz;

    // ================= PREORDEN =================
    public void preOrden(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.dato + " ");
            preOrden(nodo.izquierda);
            preOrden(nodo.derecha);
        }
    }

    // ================= INORDEN =================
    public void inOrden(Nodo nodo) {
        if (nodo != null) {
            inOrden(nodo.izquierda);
            System.out.print(nodo.dato + " ");
            inOrden(nodo.derecha);
        }
    }

    // ================= POSTORDEN =================
    public void postOrden(Nodo nodo) {
        if (nodo != null) {
            postOrden(nodo.izquierda);
            postOrden(nodo.derecha);
            System.out.print(nodo.dato + " ");
        }
    }

    public static void main(String[] args) {

        ArbolBinario arbol = new ArbolBinario();

        // CREACIÓN DEL ÁRBOL
        arbol.raiz = new Nodo(151);

        arbol.raiz.izquierda = new Nodo(79);
        arbol.raiz.derecha = new Nodo(268);

        arbol.raiz.izquierda.izquierda = new Nodo(17);
        arbol.raiz.izquierda.derecha = new Nodo(137);

        arbol.raiz.izquierda.izquierda.izquierda = new Nodo(4);
        arbol.raiz.izquierda.izquierda.derecha = new Nodo(34);

        arbol.raiz.izquierda.izquierda.derecha.derecha = new Nodo(77);

        arbol.raiz.izquierda.derecha.izquierda = new Nodo(104);

        arbol.raiz.derecha.izquierda = new Nodo(180);
        arbol.raiz.derecha.derecha = new Nodo(306);

        arbol.raiz.derecha.izquierda.izquierda = new Nodo(153);
        arbol.raiz.derecha.izquierda.derecha = new Nodo(188);

        arbol.raiz.derecha.derecha.izquierda = new Nodo(292);
        arbol.raiz.derecha.derecha.derecha = new Nodo(331);

        arbol.raiz.derecha.derecha.izquierda.izquierda = new Nodo(278);
        arbol.raiz.derecha.derecha.izquierda.izquierda.izquierda = new Nodo(273);

        arbol.raiz.derecha.derecha.derecha.izquierda = new Nodo(308);
        arbol.raiz.derecha.derecha.derecha.izquierda.derecha = new Nodo(322);

        // ================= RECORRIDOS =================

        System.out.println("RECORRIDO PREORDEN:");
        arbol.preOrden(arbol.raiz);

        System.out.println("\n\nRECORRIDO INORDEN:");
        arbol.inOrden(arbol.raiz);

        System.out.println("\n\nRECORRIDO POSTORDEN:");
        arbol.postOrden(arbol.raiz);
    }
}