package sesiones.Ejercicosindividiales.Pilas;

import java.util.Stack;
import java.util.Scanner;

public class Eje2palíndromo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // creamos un scanner para que el user digite la palabra

        System.out.println("Ingresa la palabra : ");
        String charat = scanner.nextLine(); // ingresa la palabra

        Stack<Character> palindromo = new Stack<>(); // Pila creaeda

        String palabraAlreves = ""; // creamos un contenedor para guarda la palabra al reves
        for (int i = 0; i < charat.length(); i++) { // recorremod la palabra
            palindromo.push(charat.charAt(i)); // El charAt saca cada lertra por posicion y la agrega ala pila
        }

        while (!palindromo.isEmpty()) { // si la pila es diferente a vacio entoces ejecuta
            palabraAlreves += palindromo.pop();// coge el pico de la pila yh se agrupa en el contenedor cada letra
        }

        if (charat.equals(palabraAlreves)) { // se utiliza equals para comprar si es igaul ala palabraes igual al reves
            System.out.println("La palabra dada es un palindromo : " + charat);
        } else {
            System.out.println("La palabra no es un polindromo : " + charat);
        }

    }
}
