package sesiones.Clase5.OrganizacionDeContenedores;

/**
 * Clase que representa un buque que llega al puerto.
 * Almacena información básica como código, nombre y capacidad.
 */
public class Buque {

    private String codigo; // Código único del buque
    private String nombre; // Nombre del buque
    private int capacidad; // Capacidad máxima de contenedores que puede transportar

    //Constructor

    public Buque(String codigo, String nombre, int capacidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    // Métodos getters y setters...

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Buque [codigo=" + codigo + ", nombre=" + nombre + ", capacidad=" + capacidad + "]";
    }

    

}
