package sesiones.Clase2;

import java.util.Scanner;

public class Ejercicios_practico {
    public static void main(String[] args) {

        /*
         * 1. Se tiene un arreglo lineal de N números. Hallar la suma de los N números
         * (N es ingresado por el usuario)
         */

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

        /*
         * 2. Se tienen N empleados de una compañía y se ha ideado llenar un arreglo
         * lineal A con
         * sueldos de los empleados, un arreglo B con las asignaciones totales de cada
         * empleado,
         * un arreglo C con las deducciones de cada uno. Crear un arreglo T que contenga
         * el neto
         * a pagar a cada empleado. (Neto a pagar= sueldo + asignaciones - deducciones)
         */

        System.out.println("Ingrese la cantidad de empleados (N) : ");
        int Ne = sc.nextInt();

        double[] A = new double[Ne]; // Suldos
        double[] B = new double[Ne]; // Asignaciones
        double[] C = new double[Ne]; // Deducciones
        double[] T = new double[Ne]; // Neto a pagar

        // aqui lleno los arrglos
        for (int i = 0; i < Ne; i++) {
            System.out.println("\n Empleado " + (i + 1));

            System.out.println("Sueldo : ");
            A[i] = sc.nextInt();

            //
            System.out.println("Asignacion : ");
            B[i] = sc.nextInt();

            System.out.println("Deducciones : ");
            C[i] = sc.nextInt();

        }

        for (int i = 0; i < Ne; i++) {
            T[i] = A[i] + B[i] - C[i];
        }

        System.out.println(" Neto a pagar por empleado ");
        for (int i = 0; i < Ne; i++) {
            System.out.println("Empleado " + (i + 1) + ": " + T[i]);
        }

        /*
         * 3. Dado un arreglo lineal de números, sumar separadamente los números pares y
         * los
         * números impares.
         */

        int[] a = { 2, 6 };
        int par = 0;
        int impares = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                par += a[i];
            } else {
                impares += a[i];
            }
        }
        System.out
                .println("la suma de los pares del arreglo es : " + par + " y la sumna de los impares es : " + impares);

        /*
         * 4. Se tienen dos arreglos unidimensionales que guardan las edades de un grupo
         * de
         * personas, se pide hallar el mayor valor
         */

        int[] age1 = { 4, 5, 7, 33, 9 };
        int[] age2 = { 41, 52, 51, 55, 7 };

        int mayor = age1[0];

        for (int i = 0; i < age1.length; i++) {
            if (age1[i] > mayor) {
                mayor = age1[i];
            }
        }

        for (int i = 0; i < age2.length; i++) {
            if (age2[i] > mayor) {
                mayor = age2[i];
            }
        }

        System.out.println("El valor mayor de los arrgleos son  : " + mayor);

        /*
         * 5. Se tiene tres arreglos unidimensionales que guardan los precios unitarios
         * (PU) las
         * cantidades compradas (CC) y la descripción respectivamente de N productos
         * distintos.
         * Se Pide:
         * a. Crear un arreglo con el total gastado en compras por producto (TG=PU*CC)
         * b. Calcular el total general de todas las compras.
         * c. Mostrar la descripción y el total del producto que obtuvo mayor gasto
         */

        double[] PU = { 1200, 3500, 800, 1560 };
        int[] CC = { 3, 2, 5, 4 };
        String[] descripción = { "cuarderno", "audifones", "Lapiz", "Mouse" };

        int Ns = PU.length;
        double[] TG = new double[Ns];
        double totalGeneral = 0;
        double mayorGasto = 0;
        String productoMayor = "";

        for (int i = 0; i < Ns; i++) {
            TG[i] = PU[i] * CC[i]; // aqui se hace el totlal por producto
            totalGeneral += TG[i];
            if (TG[i] > mayorGasto) {
                mayorGasto = TG[i];
                productoMayor = descripción[i];
            }
        }
        System.out.println("Total general de compras: " + totalGeneral);
        System.out.println("Producto con mayor gasto: " + productoMayor);
        System.out.println("Gasto mayor: " + mayorGasto);

        sc.close();
    }

}
