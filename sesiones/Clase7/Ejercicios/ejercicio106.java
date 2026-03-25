package sesiones.Clase7.Ejercicios;

import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class ejercicio106 {
    public static void main(String[] args) {

        Stack<Integer> pila = new Stack<>();
        Queue<Integer> cola = new LinkedList<>();
        Stack<Integer> aux = new Stack<>();

        pila.push(10);
        pila.push(7);
        pila.push(4);
        pila.push(3);

        while (!pila.isEmpty()) {
            int x = pila.pop();

            if (x % 2 == 0) { // aqui asignamos los valores que son pares a la cola 
                cola.add(x);
            }

            aux.push(x);
        }

        // Restaurar la pila original
        while (!aux.isEmpty()) {
            pila.push(aux.pop());
        }

        System.out.println("\n--- RESULTADO ---");
        System.out.println("Pila original: " + pila);
        System.out.println("Numeros pares en la cola: " + cola);
    }
}