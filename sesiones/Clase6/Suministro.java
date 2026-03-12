package sesiones.Clase6;



public class Suministro {
    private String id;//(C-fila-columna)
    private int nivelEnergia; 
    private String prioridad;// estandar o alta 

    public Suministro(String id, int nivelEnergia, String prioridad) {
        this.id = id;
        this.nivelEnergia = nivelEnergia;
        this.prioridad = prioridad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public void setNivelEnergia(int nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "Suministro [id=" + id + ", nivelEnergia=" + nivelEnergia + ", prioridad=" + prioridad + "]";
    }

    
    

}

    


