package sesiones.Clase8.Momento2;

public class Contenedor {


// ATRIBUTOS 
    private String id;        // Ej: "CONT-001"
    private double peso;      // Ej: 15.5 (toneladas)
    private int prioridad;    // Ej: 1 = alta, 2 = media, 3 = baja

    // CONSTRUCTOR 
    public Contenedor(String id, double peso, int prioridad) {
        this.id = id;
        this.peso = peso;
        this.prioridad = prioridad;
    }

    // GETTERS 
    public String getId()        { return id; }
    public double getPeso()      { return peso; }
    public int getPrioridad()    { return prioridad; }

    // SETTERS 
    public void setId(String id)             { this.id = id; }
    public void setPeso(double peso)         { this.peso = peso; }
    public void setPrioridad(int prioridad)  { this.prioridad = prioridad; }

    // toString (
    @Override
    public String toString() {
        return "ID: " + id + " | Peso: " + peso + "t | Prioridad: " + prioridad;
    }
}
