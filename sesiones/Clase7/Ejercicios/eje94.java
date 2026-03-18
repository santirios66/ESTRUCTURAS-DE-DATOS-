package sesiones.Clase7.Ejercicios;

import java.util.Scanner;
import java.util.Stack;

public class eje94 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        Stack<Integer> p1 = new Stack<>();
        Stack<Integer> p2 = new Stack<>();
        Stack<Integer> p3 = new Stack<>();
        Stack<Integer> p4 = new Stack<>();
        Stack<Integer> p5 = new Stack<>();

        while (true) {
            System.out.print("Introduce i (pila)  ");
            int i = lector.nextInt();

            if (i == 0)
                break; // Si i es 0, terminamos el programa

            System.out.println("Introduce j (valor)");
            int j = lector.nextInt(); // El valor a meter o sacar
            int numPila = Math.abs(i); // Esto quita el signo menos (ej: -2 se vuelve 2)

            // 1. Decidir en qué pila trabajar
            Stack<Integer> pilaActual;
            if (numPila == 1)
                pilaActual = p1;
            else if (numPila == 2)
                pilaActual = p2;
            else if (numPila == 3)
                pilaActual = p3;
            else if (numPila == 4)
                pilaActual = p4;
            else
                pilaActual = p5;

            // 2. Decidir qué hacer según el signo de i
            if (i > 0) {
                pilaActual.push(j); 
                System.out.println("Metimos " + j + " en la Pila " + numPila);
            } else {
                if (!pilaActual.isEmpty()) {
                    pilaActual.pop(); // POP = Sacar
                    System.out.println("Sacamos un elemento de la Pila " + numPila);
                }
            }
        }

        // Al final imprimimos todo
        System.out.println("\n--- RESULTADO FINAL ---");
        System.out.println("Pila 1: " + p1);
        System.out.println("Pila 2: " + p2);
        System.out.println("Pila 3: " + p3);
        System.out.println("Pila 4: " + p4);
        System.out.println("Pila 5: " + p5);
    }
}
