package sesiones.Clase9.MapAndLink;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Arrays;

public class SystemOrdens {
    public static void main(String[] args) {

        HashMap<String, LinkedList<String>> pedidos = new HashMap<>();

        // Agregamos los prodcutos en diferentes linkenlist pro nomrbe de usuario junto
        // con una Arrys para agragar lo produtos

        // Pedido de Ana
        LinkedList<String> proAna = new LinkedList<>(Arrays.asList("Camisa", "Pantalón"));
        pedidos.put("Ana", proAna);
        System.out.println("Pedido de ana : " + pedidos.get("Ana"));

        // Pedido de Luis
        LinkedList<String> proluis = new LinkedList<>(Arrays.asList("Zapatos"));
        pedidos.put("Luis", proluis);
        System.out.println("Pedido de Luis  : " + pedidos.get("Luis"));

        if (pedidos.containsKey("Ana")) {
            System.out.println("Total de productos de Ana: " + pedidos.get("Ana").size());
        }

        pedidos.get("Luis").add("Camisa");
        System.out.println("Pedido de Luis  : " + pedidos.get("Luis"));

        pedidos.forEach((cliente, lista) -> {
            System.out.println("Cliente: " + cliente);
            lista.forEach(producto -> System.out.println(" - " + producto));
        });
        
    }
}
