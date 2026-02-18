package sesiones.Clase3;

public class ejecutarMoto {
    public static void main(String[] args) {

        // Creacion del arreglo de motos de tamaño 8.
        Moto[] m = new Moto[8];

        // Creacion de los objectos de tipo moto y almacenados en cada posicion del
        // arreglo.
        m[0] = new Moto(2024, "Yamaha", "Rojo", 250, 1250.0);
        m[1] = new Moto(2023, "Honda", "Negro", 150, 9000.0);
        m[2] = new Moto(2022, "Suzuki", "Azul", 300, 15000.0);
        m[3] = new Moto(2021, "AKT", "Blanco", 125, 7000.0);
        m[4] = new Moto(2020, "Bajaj", "Gris", 200, 8500.0);
        m[5] = new Moto(2019, "KTM", "Naranja", 390, 2000.0);
        m[6] = new Moto(2024, "Hero", "Rojo", 160, 8000.0);
        m[7] = new Moto(2023, "TVS", "Negro", 180, 9500.0);

        // Operaciones con los obejectos del arreglo.

        // Obtener el promedio de los modelos de la motos del arreglo
        double promedio = 0.0;
        int suma = 0;
        for (int i = 0; i < m.length; i++) {
            suma += m[i].getModelo();
        }
        System.out.println("El promedio de los modelos dela motos del arreglo es : " + (suma / m.length));

        // Obtener las motos que puedo comprar con un presupuesto de 20000 dólares.
        String cad = "\n ";
        for (int i = 0; i < m.length; i++) {
            if (m[i].getPrecio() <= 20000.0) {
                cad += "-" + m[i].getMarca() + " " + m[i].getPrecio() + " \n";
            }
        }
        System.out.println("Las motos que puedo comprar con 20000.0US son:  " + cad);

    }
}
