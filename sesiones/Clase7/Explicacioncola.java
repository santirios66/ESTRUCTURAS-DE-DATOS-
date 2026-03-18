package sesiones.Clase7;

import java.util.LinkedList;
import java.util.Queue;

public class Explicacioncola {
    public static void main(String[] args) {

        Queue<Integer> objCola = new LinkedList<>();

        // Agregar elemnetos ala cola
        objCola.add(29);
        objCola.add(16);
        objCola.offer(18);
        objCola.offer(34);

        // Mostrar los elementos de la cola

        System.out.println(objCola);

        // Mostrar la cabeza de la cola (element(), peek()).
        System.out.println("Cabeza de la cola (Element): " + objCola.element());// 29
        System.out.println("Cabeza de la cola (peek) : " + objCola.peek()); // 29

        // Eliminar de la cabeza de la cola (poll(), remove())

        System.out.println("Elemento eliminado con poll : " + objCola.poll()); // 29 
        System.out.println("Elemento eliminado con remove : " + objCola.remove());
        System.out.println(objCola);

        // mostrar el tamaño de la cola  con el size().
        System.out.println("Tamaño de la cola : " + objCola.size()); // 2

    }
}
