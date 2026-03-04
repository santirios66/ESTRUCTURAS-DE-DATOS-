package sesiones.Clase5.OrganizacionDeContenedores;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Puerto puerto = new Puerto(); 

        int opcion = 0;

        // El ciclo se mantiene hasta que el usuario decida salir.
        // Agregué una opción para llenar automáticamente porque
        // manualmente sería muy pesado llenar las 100 posiciones.

        while (opcion != 6) {

            System.out.println("\n===== SISTEMA DE ORGANIZACIÓN DE CONTENEDORES =====");
            System.out.println("1. Registro de buques");
            System.out.println("2. Registro de contenedores");
            System.out.println("3. Mostrar peso total de los contenedores");
            System.out.println("4. Listar contenedores agrupados");
            System.out.println("5. Llenar área automáticamente");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    puerto.registrarBuque();
                    break;

                case 2:
                    puerto.mostrarArea();
                    puerto.registrarContenedor();
                    break;

                case 3:
                    puerto.calcularPesoTotal();
                    break;

                case 4:
                    puerto.listarContenedores();
                    break;

                case 5:
                    System.out.print("¿Cuántos contenedores desea generar automáticamente?: ");
                    int cantidad = scanner.nextInt();
                    puerto.llenarAreaAutomaticamente(cantidad);
                    puerto.mostrarArea(); // lo muestro para verificar visualmente cómo quedó
                    break;

                case 6:
                    System.out.println("Aplicación finalizada.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        }

        scanner.close();
    }
}