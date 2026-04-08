package sesiones.Ejercicosindividiales.Colas;

import java.util.LinkedList;
import java.util.Queue;

public class Ejer1 {
    public static void main(String[] args) {

        // EJE1 Crea una cola, mete estos 5 nombres: "Ana", "Carlos", "Luis", "Maria",
        // "Pedro" y luego imprime el frente

        Queue<String> names = new LinkedList<>(); // Creacion de la cola

        // Se utiliza la sentecia offer para agregar elementos ala cola.
        names.offer("Ana");
        names.offer("Carlos");
        names.offer("Luis");
        names.offer("Maria");
        names.offer("Pedro");

        // SE utiliza el peek casi igual que la pila solo que esta vez imprime el valor
        // que entro primero
        System.out.println("Frente de la cola : " + names.peek());

        System.out.println("Elementos de la cola : " + names);
        System.out.println("Se saca el frente de la cola : " + names.poll());// El poll se utiliza para sacar el frente
                                                                             // de la cola.
        System.out.println("Elementos de la cola : " + names);

        System.out.println("La cola esta vacia : " + names.isEmpty()); // Igual que la pila verifica si la cola esta
                                                                       // vaio si si es true si no es false.

        while (!names.isEmpty()) { // decimos si la cola es diferente a vacio ejecute lo que esta dentro del programa ya cuando esta vacio se cierre el bucle.
            System.out.println("Elemento de la cola : " + names.poll());
        }
        
        System.out.println("La cola esta vacia : " + names.isEmpty()); // verificamos que sta vacia 
    }
}
