package sesiones.Clase2;

import java.util.Scanner;

public class Ejercicios_practico {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese la cantidad de nuemros (N) : ");
        int N = sc.nextInt();

        int[] arry = new int[N];
        int suma = 0;

        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese el nuemro " + (i + 1) + ":  ");
            arry[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            suma += arry[i];
        }

        System.out.println("la suma de los " + N + " numeros es : " + suma);

        sc.close();

    }
}
