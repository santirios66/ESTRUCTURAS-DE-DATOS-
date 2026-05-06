package sesiones.Clase8.Momento2;

public class Main {
public static void main(String[] args) {

        // registramos los contenedores que llegan en el camion
        Manifiesto manifiesto = new Manifiesto(4);
        manifiesto.leerDatos();
        manifiesto.mostrarResumen();

        // movemos los contenedores al patio y los que son prioridad van a inspeccion
        Patio patio = new Patio(2, 3);
        Puerto puerto = new Puerto();
        manifiesto.distribuir(patio, puerto);

        patio.mostrarPatio();
        puerto.procesarInspeccion();

        // apilamos los contenedores en el buque
        manifiesto.estibar(puerto);
        puerto.mostrarBuque();

        // retiramos el contenedor dañiado del fondo
        puerto.retirarContenedorDaniado("CONT-001");
        puerto.mostrarBuque();
    }
}
