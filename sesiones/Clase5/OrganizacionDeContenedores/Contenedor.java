package sesiones.Clase5.OrganizacionDeContenedores;

/**
 * Clase que representa un contenedor dentro del puerto.
 * Cada contenedor tiene código, peso y país de origen.
 */
public class Contenedor {

    private String codigo; // Identificador del contenedor
    private double peso; // Peso en toneladas
    private String origen; // País de origen

    public Contenedor(String codigo, double peso, String origen) {
        this.codigo = codigo;
        this.peso = peso;
        this.origen = origen;
    }

    // Getters y setters...

    public String getCodigo() {
        return codigo;
    }

    public double getPeso() {
        return peso;
    }

    public String getOrigen() {
        return origen;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {
        return "Contenedor [codigo=" + codigo + ", peso=" + peso + ", origen=" + origen + "]";
    }

    

}
