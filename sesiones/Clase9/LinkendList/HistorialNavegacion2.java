package sesiones.Clase9.LinkendList;

import java.util.LinkedList;

public class HistorialNavegacion2 {
    public static void main(String[] args) {

        LinkedList<String> historial = new LinkedList<>();

        // Agregar páginas
        agregarPaginas(historial);

        // Mostrar página actual
        mostrarPaginaActual(historial);

        // Función atrás
        atras(historial);

        // Mostrar nueva página actual
        mostrarPaginaActual(historial);

        // Mostrar historial completo
        mostrarHistorial(historial);
    }

    // este metodo es para agregar la paginas
    public static void agregarPaginas(LinkedList<String> historial) {

        historial.add("google.com");
        historial.add("github.com");
        historial.add("stackoverflow.com");
    }

    // Este metdo muestra la ultima pagina
    public static void mostrarPaginaActual(LinkedList<String> historial) {
        System.out.println("Página actual: " + historial.getLast());
    }

    public static void atras(LinkedList<String> historial) {
        historial.removeLast();
        System.out.println("Se presionó 'Atrás'");
    }

    public static void mostrarHistorial(LinkedList<String> historial) {
        System.out.println("Historial restante:");
        for (String Url : historial) {
            System.out.println("- " + Url);

        }
    }

}
