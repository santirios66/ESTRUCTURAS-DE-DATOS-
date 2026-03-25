package sesiones.Clase7.Ejercicios.EJercicio103;

public class Bicola {

    class Nodo {
        int dato;
        Nodo siguiente;
        Nodo anterior;

        public Nodo(int dato) {
            this.dato = dato;
        }
    }

    Nodo frente;
    Nodo fin;

    public Bicola() {
        frente = null;
        fin = null;
    }

    // Insertar al frente
    public void insertarFrente(int dato) {
        Nodo nuevo = new Nodo(dato);

        if (frente == null) {
            frente = fin = nuevo;
        } else {
            nuevo.siguiente = frente;
            frente.anterior = nuevo;
            frente = nuevo;
        }
    }

    // Insertar al final
    public void insertarFinal(int dato) {
        Nodo nuevo = new Nodo(dato);

        if (fin == null) {
            frente = fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            nuevo.anterior = fin;
            fin = nuevo;
        }
    }

    // Eliminar del frente
    public void eliminarFrente() {
        if (frente == null) {
            System.out.println("Bicola vacía");
            return;
        }

        frente = frente.siguiente;

        if (frente != null) {
            frente.anterior = null;
        } else {
            fin = null;
        }
    }

    // Eliminar del final
    public void eliminarFinal() {
        if (fin == null) {
            System.out.println("Bicola vacía");
            return;
        }

        fin = fin.anterior;

        if (fin != null) {
            fin.siguiente = null;
        } else {
            frente = null;
        }
    }

    // Mostrar
    public void mostrar() {
        Nodo aux = frente;

        while (aux != null) {
            System.out.print(aux.dato + " <-> ");
            aux = aux.siguiente;
        }

        System.out.println("null");
    }
}