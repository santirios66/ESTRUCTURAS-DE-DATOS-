package sesiones.Clase4.distribuidora_de_tecnologıa;

public class ejecutar {

    public static void main(String[] args) {

        Inventario inv = new Inventario(5);

        inv.agregarProducto(new Producto(1, "Laptop", 3000000.0, 4)); // precio en double no entero
        inv.agregarProducto(new Producto(2, "Mouse", 50000.0, 10));
        inv.agregarProducto(new Producto(3, "Teclado", 120000.0, 2));
        inv.agregarProducto(new Producto(4, "Monitor", 800000.0, 6));
        inv.agregarProducto(new Producto(5, "USB", 30000.0, 1));

        System.out.println("Inventario original:");
        inv.mostrarInventario();

        inv.ordenarPorPrecioDescendente();

        System.out.println("\nInventario ordenado:");
        inv.mostrarInventario();

        System.out.printf("\nValor total: %.0f%n", inv.generarInformeValorTotal());

        System.out.println("\nProductos con stock menor a 5:");
        for (Producto p : inv.obtenerProductosAgotados()) {
            System.out.println(p);
        }
    }
}
