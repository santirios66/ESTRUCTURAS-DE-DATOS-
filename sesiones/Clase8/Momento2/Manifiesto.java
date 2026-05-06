package sesiones.Clase8.Momento2;

import java.util.Scanner;

public class Manifiesto {
    // Atributos
    private Contenedor[] contenedores;
    private int n;

    // recibe el tamaño del arreglo
    public Manifiesto(int n) {
        this.n = n;
        this.contenedores = new Contenedor[n];
    }

    // pedimos los datos por teclado
    public void leerDatos() {
        Scanner sc = new Scanner(System.in);

        System.out.println("===============================================");
        System.out.println("         REGISTRO DE CONTENEDORES");
        System.out.println("===============================================");
        System.out.println("ℹ Prioridades:");
        System.out.println("   1 = ALTA (urgente / peligrosa)");
        System.out.println("   2 = MEDIA (requiere revisión)");
        System.out.println("   3 = BAJA (normal)");
        System.out.println("===============================================\n");

        for (int i = 0; i < n; i++) {

            System.out.println(" Contenedor " + (i + 1));

            System.out.print("ID: ");
            String id = sc.next();

            System.out.print("Peso (toneladas): ");
            double peso = sc.nextDouble();

            System.out.print("Prioridad (1-3): ");
            int prioridad = sc.nextInt();

            // explicación dinámica
            String tipo = "";
            if (prioridad == 1)
                tipo = " ALTA - Contenedor crítico";
            else if (prioridad == 2)
                tipo = " MEDIA - Requiere inspección";
            else if (prioridad == 3)
                tipo = " BAJA - Normal";

            System.out.println(" Prioridad asignada: " + tipo);
            System.out.println("-----------------------------------------------");

            contenedores[i] = new Contenedor(id, peso, prioridad);
        }

        sc.close();
    }

    // mostramos todo y sumamos el peso
    public void mostrarResumen() {
        double total = 0;

        System.out.println("\n================  MANIFIESTO =================");
        for (Contenedor c : contenedores) {
            System.out.println("┌──────────────────────────────┐");
            System.out.println("  │ ID: " + c.getId());
            System.out.println("  │ Peso: " + c.getPeso() + " t");
            System.out.println("  │ Prioridad: " + c.getPrioridad());
            System.out.println("└──────────────────────────────┘");
            total += c.getPeso();

        }
        System.out.println(" Peso total de carga: " + total + " t");
        System.out.println("===============================================");
    }

    // reparte los contenedores al patio e inspeccion
    public void distribuir(Patio patio, Puerto puerto) {
        for (Contenedor c : contenedores) {
            patio.ubicarContenedor(c);
            puerto.agregarInspeccion(c);
        }
    }

    // estiba todos en el buque
    public void estibar(Puerto puerto) {
        for (Contenedor c : contenedores) {
            puerto.estibarSeguro(c);
        }
    }

    public Contenedor[] getContenedores() {
        return contenedores;
    }

    
}
