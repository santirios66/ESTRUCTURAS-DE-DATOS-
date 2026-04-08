package sesiones.Ejercicosindividiales.Pilas;

import java.util.Stack;

public class Eje1 {

    public static void main(String[] args) {

        // Creacion de la pila.
        Stack<Integer> numbers = new Stack<>();

        // Mostramos la pila.
        System.out.println("Elemntos de la pila : " + numbers);

        // Agregamos ala pila los siguiente elementos 10, 20, 30, 40, 50.

        numbers.push(10); // la sentencia push nos ayuda a agregar elementos ala pila.
        numbers.push(20);
        numbers.push(30);
        numbers.push(40);
        numbers.push(50);

        System.out.println("Elementos de la pila : " + numbers);
        System.out.println("Pico de la pila : " + numbers.peek()); // La sentencia peek nos ayuda a msotrar el elemntos
                                                                   // pico de la pila osea el ultimo en entrar.

        // Sacar o elimnar el tope de la pila con pop

        numbers.pop(); // La sentencia pop sirve para eleminar el ultiimo elementos de la pila siu
                       // tenmos 3 elemnto por ejemplo 12 23 56 en un pilas se elimina elimina el 56.

        System.out.println("Elementos de la pila : " + numbers);

        // Verficar si la pila esta vacia

        System.out.println("La pila esta vacia : " + numbers.isEmpty()); // Esta sentencia es de tipo boolean en la cual
                                                                         // confirma si la pila esta vacia, si esta
                                                                         // vacia es true y si tiene elementos es false,

        while (!numbers.isEmpty()) { // Aqui hacemso un condicion en la cual si numbers es diferente a vacio se
                                     // ejecuta lo que est dentro del while
            System.out.println("Pico de la pila : " + numbers.pop()); // lo que hcamoes aqui mostrasr el pico de la pila
                                                                      // y eliminarlo y asi hasta que este vacia la
                                                                      // pila.
        }

    }
}
