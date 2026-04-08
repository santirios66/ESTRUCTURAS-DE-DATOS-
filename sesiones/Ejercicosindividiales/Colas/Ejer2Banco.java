package sesiones.Ejercicosindividiales.Colas;


import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Ejer2Banco {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Queue<String> usuarios = new LinkedList<>(); // creamos la cola 

        while (true) {
            // Creamos el MUNU
            System.out.println("╔══════════════════════════════════════╗");
            System.out.println("║   Bienvenido al Sistema de Turnos    ║");
            System.out.println("╠══════════════════════════════════════╣");
            System.out.println("║  1. Agregar persona a la fila        ║");
            System.out.println("║  2. Atender siguiente persona        ║");
            System.out.println("║  3. Salir                            ║");
            System.out.println("╚══════════════════════════════════════╝");
            System.out.print("Elige una opcion: ");
            Integer opc = scanner.nextInt();

            switch (opc) { //  aqui se ejecuta el caso en cual el usuario elejia
                case 1:
                    System.out.println("Ingrese el nombre del usuario : ");
                    String names = scanner.next(); // aqui agrega el nombre del usuario ala cola 
                    usuarios.offer(names);
                    System.out.println("Usuario agregado : " + names);
                    break;
                case 2:
                    String atendido = usuarios.poll(); // aqui  creamos un contenedor diciendole que se saca el cliente y se lo asigne a atendido 

                    if (atendido != null) {
                        System.out.println("Cliente atendido : " + atendido);
                    } else {
                        System.out.println("No hay clientes en la fila");
                    }
                    break;

                case 3:
                    System.out.println(" Gracias por usarnos. :) "); // Elejiendo el 3 se cierra el progrma 
                    System.exit(0); // esto cierra el programa
                    break;
            }
        }
    }
}
