package sesiones.Clase8.Momento2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Puerto {
    // cola para inspeccion y pila para el buque
    private Queue<Contenedor> inspeccion = new LinkedList<>();
    private Stack<Contenedor> buque = new Stack<>();

    // solo entran los de prioridad 1
    public void agregarInspeccion(Contenedor c) {
        if (c.getPrioridad() <= 2) {
            inspeccion.add(c);
            System.out.println(c.getId() + " a inspeccion");
        }
    }

    // sacamos uno por uno en orden de llegada 

    public void procesarInspeccion() {
    System.out.println("\n================  INSPECCIÓN =================");

    int i = 1;
    while (!inspeccion.isEmpty()) {
        Contenedor c = inspeccion.poll();
        System.out.println("Contenedor #" + i++);
        System.out.println("→ ID: " + c.getId() +
                           " | Peso: " + c.getPeso() +
                           "t | Prioridad: " + c.getPrioridad());
    }

    System.out.println("===============================================");
}

    // apilamos normal
    public void estibarContenedor(Contenedor c) {
        buque.push(c);
        System.out.println(c.getId() + " apilado");
    }

    // retiramos el dañiado usando pila auxiliar
    public void retirarContenedorDaniado(String idDaniado) {
        Stack<Contenedor> aux = new Stack<>();

        // pasamos todo a la auxiliar menos el dañiado
        while (!buque.isEmpty()) {
            Contenedor c = buque.pop();
            if (!c.getId().equals(idDaniado))
                aux.push(c);
            else
                System.out.println("Retirado: " + c);
        }

        // devolvemos al buque en el mismo orden
        while (!aux.isEmpty())
            buque.push(aux.pop());
    }

    // bono: solo apila si pesa menos o igual que el tope
    public void estibarSeguro(Contenedor c) {
        if (buque.isEmpty() || c.getPeso() <= buque.peek().getPeso()) {
            buque.push(c);
            System.out.println(c.getId() + " apilado ok");
        } else {
            System.out.println(c.getId() + " rechazado, pesa mas que el tope");
        }
    }

    // mostramos la pila de arriba a abajo
    public void mostrarBuque() {
    System.out.println("\n================  BUQUE =================");
    System.out.println("        (Vista desde el TOPE )\n");

    Stack<Contenedor> temp = new Stack<>();
    temp.addAll(buque);

    int i = 1;
    while (!temp.isEmpty()) {
        Contenedor c = temp.pop();

        System.out.println("Contenedor #" + i++);
        System.out.println("┌──────────────────────────────┐");
        System.out.println("  │ ID: " + c.getId());
        System.out.println("  │ Peso: " + c.getPeso() + " t");
        System.out.println("  │ Prioridad: " + c.getPrioridad());
        System.out.println("└──────────────────────────────┘");
    }

    System.out.println("===========================================");
}

    public Stack<Contenedor> getBuque()      { return buque; }
    public Queue<Contenedor> getInspeccion() { return inspeccion; }
}