package sesiones.Clase9.Map;

import java.util.HashMap;
import java.util.Map;

public class producto {
    public static void main(String[] args) {

        HashMap<Integer, String> productos = new HashMap<>();

        productos.put(101, "Laptop");
        productos.put(102, "Mouse");
        productos.put(103, "Teclado");

        System.out.println("El producto 102 exisite : " + productos.containsKey(102));

        productos.put(101, "Audifonos"); // se repmalza el valor Laptop por Audifonos 

        System.out.println("El producto 102 existe : " + productos.get(101));

        for (Map.Entry<Integer, String> entrada : productos.entrySet()) {

            System.out.println("Código: " + entrada.getKey() +
                    " -> Producto: " + entrada.getValue());

        }

    }
}
