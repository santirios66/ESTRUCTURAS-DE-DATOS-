package sesiones.Clase7;

import java.util.Stack;

public class ExplicacionPilas {

    public static void main(String[] args) {

        // Creacion del Objecto pila
        Stack<String> objPilas = new Stack<>();

        // Ingresar elemnetos ala pila
        objPilas.push("Santiago");
        objPilas.push("aslin");
        objPilas.push("samuel");
        objPilas.push("Stefany");
        objPilas.push("Rios");

        // Mostar los elementos de la pila
        System.out.println(objPilas); // [Santiago, aslin, samuel, Stefany, Rios]

        // Mostrar sin remover el tope de la fila
        System.out.println("tope de la pila " + objPilas.peek()); // Rios

        // Validar si la pila esta llena o vacia

        System.out.println("Pila vacia : " + objPilas.empty()); // False

        // Eliminar el elemento del tope de la pila.
        System.out.println("Elemento removido : " + objPilas.pop()); // Rios
        System.out.println(objPilas); // [Santiago, aslin, samuel, Stefany]

        // Posiciones de los elemntos con respecto al tope de la pila
        System.out.println("Posicion " + objPilas.search("Santiago")); // 4
        System.out.println("Posicion " + objPilas.search("samuel")); // 2
        System.out.println("Posicion " + objPilas.search("aslin"));// 3
        System.out.println("Posicion " + objPilas.search("Stefany"));// 1

    }

}
