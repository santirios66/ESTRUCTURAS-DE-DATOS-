package sesiones.Clase7.Ejercicios;

import java.util.Stack;

public class Eje93 {
    public static void main(String[] args) {

        Stack<Character> pilaExpresiones = new Stack<>();

        String expresiones = "2*[(a+b)/2.5 + x -7 *y";

        boolean error = false;

        for (int i = 0; i < expresiones.length(); i++) {
            char c = expresiones.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                pilaExpresiones.push(c);
            } else if (c == ')' || c == '}' || c == ']') {

                if (pilaExpresiones.isEmpty()) {
                    error = true;
                    break;
                }

                char tope = pilaExpresiones.peek();

                if ((c == ')' && tope == '(') ||
                        (c == '}' && tope == '{') ||
                        (c == ']' && tope == '[')) {

                    pilaExpresiones.pop();

                } else {
                    error = true;
                    break;
                }
            }
        }

        
        if (!error && pilaExpresiones.isEmpty()) {
            System.out.println("Correcto");
        } else {
            System.out.println("Error");
        }
    }

}
