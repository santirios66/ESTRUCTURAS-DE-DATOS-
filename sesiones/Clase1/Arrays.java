
public class Arrays {

    public static void main(String[] args) {

        // Creacion del arreglo/array/vector
        int[] a = { 2, 6, 8, 1, 20, 40, 7, 3, 5 };

        System.out.println("a[4] = " + a[4]); // 20
        System.out.println("a[7] = " + a[7]); // 3
        System.out.println("a[5] = " + a[5]); // 40
        System.out.println("a[8] = " + a[8]); // 5
        System.out.println("a[1] = " + a[1]); // 6
        /* System.out.println("a[9] = " + a[9]); // Error bounds exception */

        // para saber la longitud o tamaño del arreglo.
        System.out.println("Tamaño del arreglo : " + a.length);

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }

        // Ejerccio sumar todos los elementos del arreglo.
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            suma += a[i];
        }

        System.out.println(" la suma de todos  los numeros del arreglo es : " + suma);

        // 1. obtenr la sunma delos pares y la suma de lo numeros imparec

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

        // 2. Mostrar los elementos que están en las posiciones pares del arreglo

        String pares = "";
        String imparess = "";

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                pares += a[i] + " ";

            } else {
                imparess += a[i] + " ";
            }
        }
        System.out.println("los pares del arrglo son : " + pares);
        System.out.println("Impares: " + imparess);

        /*
         * Prubea de escritorio paso a paso 
         * i     i<a.lenght    i++  total += a[i]
         * 0     0<9  true     1    total += 2     total 2 
         * 0     1<9  true     2    total += 6     total = 8
         * 0     2<9  true     3    total += 8     total = 16
         * 0     3<9  true     4    total += 1     total = 17
         * 0     4<9  true     5    total += 20    total = 37 
         * 0     5<9  true     6    total += 40    total = 77
         * 0     6<9  true     7    total += 7     total = 84
         */

    }
}
