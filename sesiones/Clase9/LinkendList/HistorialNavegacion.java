package sesiones.Clase9.LinkendList;
import java.util.LinkedList; 

public class HistorialNavegacion {
    
    public static void main(String[] args) {

        // Version 1 algo basico 
        
        LinkedList<String> historial = new LinkedList<>();

        historial.add("google.com");
        historial.add("github.com");
        historial.add("stackoverflow.com");

        System.out.println("Pagina actual " + historial.getLast());

        System.out.println("Funcion Atras llamada " + historial.removeLast());

        System.out.println("Nueva página actual tras 'Atrás': " + historial.getLast());

        for (String Url : historial) {
            System.out.println("- " + Url);
            
        }

    }
}
