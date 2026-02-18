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

        /*
         * 6. Una agencia administradora de inmuebles ha decidido guardar en un arreglo
         * lineal de
         * n posiciones los alquileres que cobran mensualmente a N viviendas que
         * actualmente
         * administran. En otro arreglo de igual número de posiciones guardan los
         * porcentajes de
         * ganancia por cada vivienda. Crear un nuevo arreglo con las ganancias por cada
         * vivienda.
         */

        System.out.println("Por favor ingrese la cantidad de viviendas : ");
        int vivienda = sc.nextInt();

        double[] alquileres = new double[vivienda];
        double[] porcentajes = new double[vivienda];
        double[] ganancias = new double[vivienda];

        // alquileres
        for (int i = 0; i < vivienda; i++) {
            System.out.println("Alquiler vivienda " + (i + 1) + ": ");
            alquileres[i] = sc.nextDouble();
        }

        // porcentajes
        for (int i = 0; i < vivienda; i++) {
            System.out.print("Porcentaje ganancia vivienda " + (i + 1) + ": ");
            porcentajes[i] = sc.nextDouble();
        }

        // ganancias

        for (int i = 0; i < vivienda; i++) {
            ganancias[i] = alquileres[i] * porcentajes[i] / 100;

        }

        for (int i = 0; i < vivienda; i++) {
            System.out.println("Vivienda " + (i + 1) + ": $" + ganancias[i]);
        }

        /*
         * 7. Obten er dos arreglos tal que sus elementos sean los números pares y
         * números
         * impares del arreglo A de 10 elementos.
         */

        int[] A7 = { 4, 5, 6, 1, 8, 9, 0, 8, 5, 20 };

        // 1. contar
        int pares = 0, impares7 = 0;
        for (int n : A7) {
            if (n % 2 == 0) {
                pares++;
            } else {
                impares7++;
            }
        }

        // 2. crear arreglos
        int[] par7 = new int[pares];
        int[] impar7 = new int[impares7];

        // 3. llenar
        int p = 0, im = 0;
        for (int n : A7) {
            if (n % 2 == 0) {
                par7[p++] = n;
            } else {
                impar7[im++] = n;
            }
        }

        // 4. mostrar
        System.out.print("Pares: ");
        for (int n : par7) {
            System.out.print(n + " ");
        }

        System.out.print("\nImpares: ");
        for (int n : impar7) {
            System.out.print(n + " ");
        }

        /*
         * 8. Elaborar un programa que lea 30 números y que imprima el número mayor,
         * menor y el
         * número de veces que se repiten ambos.
         */

        int[] numeros = { 4, 7, 2, 9, 7, 2, 5, 9, 1, 3,
                8, 6, 4, 1, 9, 2, 7, 5, 3, 8,
                6, 4, 2, 1, 9, 7, 5, 3, 8, 6 };

        int mayor1 = numeros[0];
        int menor = numeros[0];
        int contMayor = 0;
        int contMenor = 0;

        for (int n : numeros) {
            if (n > mayor1) {
                mayor1 = n;
            } else if (n < menor) {
                menor = n;
            }

        }

        for (int n : numeros) {
            if (n == mayor1) {
                contMayor++;
            } else if (n == menor) {
                contMenor++;
            }
        }

        System.out.println("Mayor: " + mayor1 + " se repite " + contMayor);
        System.out.println("Menor: " + menor + " se repite " + contMenor);

        /*
         * 9. Codifique un programa tal, que dado como entrada un arreglo unidimensional
         * de
         * enteros y un número entero, determine cuántas veces se encuentra este número
         * dentro del arreglo.
         */

        int[] arreglo = { 4, 7, 2, 7, 9, 7, 1 };

        int buscar = 7;
        int contador = 0;

        for (int n : arreglo) {
            if (n == buscar) {
                contador++;
            }
        }

        System.out.println("El número " + buscar +
                " aparece " + contador + " veces");

        /*
         * 10. Dado un arreglo A de N elementos se desea crear otro arreglo, tal que
         * cada uno de sus
         * elementos sea la suma de los opuestos en el arreglo dado.
         * Ejemplo: Arreglo dado A = (8,5,3,10,2,8,1)
         * Arreglo resultante B=(10,13,5,10)
         */

        int[] A10 = { 8, 5, 3, 10, 2, 8, 1 };

        int n = A10.length;
        int tamB = (n + 1) / 2; // tamaño del nuevo arreglo
        int[] B10 = new int[tamB];

        for (int i = 0; i < tamB; i++) {
            B10[i] = A10[i] + A10[n - 1 - i];
        }

        for (int x : B10) {
            System.out.print(x + " ");

        }

        /*
         * 11. Dado un arreglo A de N elementos se desea generar tres arreglos que
         * contengan los
         * elementos negativos, cero y positivos de arreglo inicial.
         */

        int[] Arreglo11 = { 0, 3, -4, -5, 6, 7, 3 };
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        int contador0 = 0;

        for (int i = 0; i < Arreglo11.length; i++) {
            if (Arreglo11[i] > 0) {
                contadorPositivos++;

            } else if (Arreglo11[i] == 0) {
                contador0++;
            } else {
                contadorNegativos++;
            }
        }
        // CREAR ARREGLOS
        int[] positivos = new int[contadorPositivos];
        int[] negativos = new int[contadorNegativos];
        int[] ceros = new int[contador0];

        // LLENAR
        int iPos = 0;
        int iNeg = 0;
        int iCero = 0;

        for (int i = 0; i < Arreglo11.length; i++) {

            if (Arreglo11[i] > 0) {
                positivos[iPos] = Arreglo11[i];
                iPos++;

            } else if (Arreglo11[i] == 0) {
                ceros[iCero] = Arreglo11[i];
                iCero++;

            } else {
                negativos[iNeg] = Arreglo11[i];
                iNeg++;
            }
        }

        for (int i = 0; i < positivos.length; i++) {
            System.out.print(positivos[i] + " ");
        }

        for (int i = 0; i < negativos.length; i++) {
            System.out.print(negativos[i] + " ");
        }

        for (int i = 0; i < ceros.length; i++) {
            System.out.print(ceros[i] + " ");
        }

        /*
         * 12. Dado un arreglo A de N elementos se quiere generar otro arreglo que
         * contenga las
         * posiciones de los elementos del arreglo dado que sean iguales a un valor x
         * dado.
         * Ejemplo: Arreglo dado A=(4,6,8,2,6,9,6,1)
         * X=6
         * Arreglo resultante B=(2,5,7)
         */

        int[] A12 = { 4, 6, 8, 2, 6, 9, 6, 1 };
        int X = 6;

        // contar
        int contador12 = 0;
        for (int i = 0; i < A12.length; i++) {
            if (A12[i] == X){
                contador12++;
            }
        }

        // crear arreglo
        int[] B12 = new int[contador12];

        // guardar posiciones
        int j = 0;
        for (int i = 0; i < A12.length; i++) {
            if (A12[i] == X) {
                B12[j] = i + 1; // +1 para posición humana
                j++;
            }
        }

        // mostrar
        System.out.print("Posiciones: ");
        for (int i = 0; i < B12.length; i++){
            System.out.print(B12[i] + " ");
        }


        sc.close();
    }

}
