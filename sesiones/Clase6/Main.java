package sesiones.Clase6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] energiaContenedores = new int[12];
        Random random = new Random();

        for (int i = 0; i < energiaContenedores.length; i++) {
            energiaContenedores[i] = random.nextInt(101) + 50;
        }

        int[] multi10 = new int[12];
        int contador = 0;

        for (int i = 0; i < energiaContenedores.length; i++) {
            if (energiaContenedores[i] % 10 == 0) {
                multi10[contador] = energiaContenedores[i];
                contador++;
            }
        }

        int[][] mapaCarga = new int[3][3];
        int ubicacion = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (ubicacion < contador) {
                    mapaCarga[i][j] = multi10[ubicacion];
                    ubicacion++;
                } else {
                    mapaCarga[i][j] = -1;
                }
            }

        }

        Suministro[] manifiestos = new Suministro[9];
        int sumi = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                int energia = mapaCarga[i][j];
                if (energia != -1) {

                    String prioridad;

                    if (energia > 100) {
                        prioridad = "ALTA";
                    } else {
                        prioridad = "ESTANDAR";
                    }
                    String id = "C-" + i + "-" + j;
                    manifiestos[sumi] = new Suministro(id, energia, prioridad);

                } else {
                    manifiestos[sumi] = null;
                }

                sumi++;

            }

        }
        System.out.println("MANIFIESTO DE VUELO");

        for (int i = 0; i < manifiestos.length; i++) {

            if (manifiestos[i] != null) {
                System.out.println(manifiestos[i]);
            } else {
                System.out.println("Posicion vacia");
            }

        }

    }
}
