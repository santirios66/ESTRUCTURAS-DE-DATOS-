package sesiones.Clase7.Ejercicios.EJercicio103;

public class Main {
    public static void main(String[] args) {

        Bicola b = new Bicola();

        // Insertar datos
        b.insertarFrente(10);
        b.insertarFinal(20);
        b.insertarFrente(5);
        b.insertarFinal(30);

        System.out.println("Bicola:");
        b.mostrar();

        // Eliminar del frente
        b.eliminarFrente();
        System.out.println("Después de eliminar frente:");
        b.mostrar();

        // Eliminar del final
        b.eliminarFinal();
        System.out.println("Después de eliminar final:");
        b.mostrar();
    }
}
