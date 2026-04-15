package sesiones.Clase8.Momento2;

public class Patio {

    private Contenedor[][] matriz;
    private int filas;
    private int columnas;

    // creamos la matriz vacia
    public Patio(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.matriz = new Contenedor[filas][columnas];
    }

    // buscamos la primera celda null y ponemos el contenedor ahi
    public boolean ubicarContenedor(Contenedor c) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] == null) {
                    matriz[i][j] = c;
                    System.out.println(c.getId() + " -> [" + i + "][" + j + "]");
                    return true;
                }
            }
        }
        // si no encontro espacio
        System.out.println("PUERTO SATURADO, no cabe " + c.getId());
        return false;
    }

    // imprimimos la matriz
    public void mostrarPatio() {
        System.out.println("\n================  PATIO =================");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] == null)
                    System.out.print("[   VACÍO   ] ");
                else
                    System.out.print("[ " + matriz[i][j].getId() + " ] ");
            }
            System.out.println();
        }

        System.out.println("============================================");
    }

    public Contenedor[][] getMatriz() {
        return matriz;
    }
}
