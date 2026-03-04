package sesiones.Clase5.OrganizacionDeContenedores;

import java.util.Scanner;
import java.util.Random;

/**
 * Clase que administra el sistema del puerto.
 * Contiene:
 * - Un arreglo de 10 buques.
 * - Una matriz 10x10 para organizar contenedores.
 * 
 * Permite registrar manualmente o llenar automáticamente
 * el área respetando el apilamiento.
 */
public class Puerto {

    private Buque[] buques = new Buque[10];
    private Contenedor[][] areaContenedores = new Contenedor[10][10];
    private int totalBuques;
    private String[] paises = {
            "Colombia",
            "México",
            "Chile",
            "Perú",
            "Argentina",
            "Brasil",
            "España",
            "Panamá",
            "Estados Unidos",
            "Japón"
    };

    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();

    public Puerto() {
        totalBuques = 0;
    }

    public void registrarBuque() {

        if (totalBuques == 10) {
            System.out.println("No hay espacio para más buques.");
            return;
        }

        System.out.print("Código del buque: ");
        String codigo = scanner.next();

        System.out.print("Nombre del buque: ");
        String nombre = scanner.next();

        System.out.print("Capacidad: ");
        int capacidad = scanner.nextInt();

        buques[totalBuques] = new Buque(codigo, nombre, capacidad);
        totalBuques++;

        System.out.println("Buque registrado correctamente.");
    }

    public void registrarContenedor() {

        System.out.print("Columna donde desea agregar (0-9): ");
        int columna = scanner.nextInt();

        if (columna < 0 || columna > 9) {
            System.out.println("Columna inválida.");
            return;
        }

        int fila = buscarFilaDisponible(columna);

        if (fila == -1) {
            System.out.println("Columna llena. No se puede agregar el contenedor.");
            return;
        }

        System.out.print("Código del contenedor: ");
        String codigo = scanner.next();

        System.out.print("Peso: ");
        double peso = scanner.nextDouble();

        System.out.print("Origen: ");
        String origen = scanner.next();

        areaContenedores[fila][columna] = new Contenedor(codigo, peso, origen);

        System.out.println("Contenedor agregado en fila " + fila + ", columna " + columna);
    }

    /**
     * Método interno que busca la primera posición libre
     * empezando desde abajo para respetar el apilamiento.
     */
    private int buscarFilaDisponible(int columna) {

        for (int i = 9; i >= 0; i--) {
            if (areaContenedores[i][columna] == null) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Llena automáticamente el área con contenedores
     * generados aleatoriamente para pruebas.
     */
    public void llenarAreaAutomaticamente(int cantidad) {

        int agregados = 0;

        while (agregados < cantidad && !matrizLlena()) {

            int columna = random.nextInt(10);
            int fila = buscarFilaDisponible(columna);

            if (fila != -1) {

                String codigo = "C" + random.nextInt(1000);
                double peso = 1 + random.nextDouble() * 9;
                String origen = paises[random.nextInt(paises.length)];

                areaContenedores[fila][columna] = new Contenedor(codigo, peso, origen);

                agregados++;
            }
        }

        System.out.println("Se agregaron " + agregados + " contenedores automáticamente.");
    }

    /**
     * Verifica si toda la matriz está llena.
     */
    private boolean matrizLlena() {

        for (int j = 0; j < 10; j++) {
            if (buscarFilaDisponible(j) != -1) {
                return false;
            }
        }
        return true;
    }

    public void calcularPesoTotal() {

        double total = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                if (areaContenedores[i][j] != null) {
                    total += areaContenedores[i][j].getPeso();
                }
            }
        }

        System.out.printf("Peso total de los contenedores: %.2f toneladas\n", total);
    }

    public void listarContenedores() {

        System.out.println("Listado de contenedores (abajo hacia arriba):");

        for (int columna = 0; columna < 10; columna++) {

            System.out.println("Columna " + columna + ":");

            for (int fila = 9; fila >= 0; fila--) {

                if (areaContenedores[fila][columna] != null) {

                    System.out.println("Código: "
                            + areaContenedores[fila][columna].getCodigo()
                            + " | Peso: "
                            + areaContenedores[fila][columna].getPeso()
                            + " | Origen: "
                            + areaContenedores[fila][columna].getOrigen());
                }
            }
        }
    }

    public void mostrarArea() {

        System.out.println("\nEstado actual del área de contenedores:");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                if (areaContenedores[i][j] == null) {
                    System.out.print("[ ] ");
                } else {
                    System.out.print("[X] ");
                }
            }
            System.out.println();
        }
    }
}