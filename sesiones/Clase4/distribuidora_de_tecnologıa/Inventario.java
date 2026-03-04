package sesiones.Clase4.distribuidora_de_tecnologıa;

public class Inventario {

    private Producto[] productos;

    public Inventario(int tamaño) {
        productos = new Producto[tamaño];
    }

    

    // 1. Agregar producto
    public void agregarProducto(Producto p) {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] == null) {
                productos[i] = p;
                return;
            }
        }
        System.out.println("No hay espacio en el inventario.");
    }

    // 2. Buscar por ID
    public Producto buscarPorId(int id) {
        for (Producto p : productos) {
            if (p != null && p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    // 3. Actualizar stock
    public void actualizarStock(int id, int nuevaCantidad) {
        Producto p = buscarPorId(id);
        if (p != null) {
            p.setCantidadStock(nuevaCantidad);
        } else {
            System.out.println("Producto no encontrado");
        }
    }

    // 4. Valor total
    public double generarInformeValorTotal() {
        double total = 0;
        for (Producto p : productos) {
            if (p != null) {
                total += p.getPrecio() * p.getCantidadStock();
            }
        }
        return total;
    }

    // 5. Productos con stock menor a 5
    public Producto[] obtenerProductosAgotados() {

        int contador = 0;

        for (Producto p : productos) {
            if (p != null && p.getCantidadStock() < 5) {
                contador++;
            }
        }

        Producto[] agotados = new Producto[contador];
        int j = 0;

        for (Producto p : productos) { // ← CORREGIDO
            if (p != null && p.getCantidadStock() < 5) {
                agotados[j++] = p;
            }
        }

        return agotados;
    }

    // 6. Ordenar por precio descendente (Insertion Sort)
    public void ordenarPorPrecioDescendente() {

        for (int i = 1; i < productos.length; i++) {

            Producto actual = productos[i];
            int j = i - 1;

            while (j >= 0 &&
                    productos[j] != null &&
                    actual != null &&
                    productos[j].getPrecio() < actual.getPrecio()) {

                productos[j + 1] = productos[j];
                j--;
            }

            productos[j + 1] = actual;
        }
    }

    // Extra: mostrar inventario
    public void mostrarInventario() {
        for (Producto p : productos) {
            if (p != null) {
                System.out.println(p);
            }
        }
    }



    public Producto[] getProductos() {
        return productos;
    }



    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }
}