package sesiones.Clase3.ejerccio_individual;

public class Curso {

    private int id;
    private String nombreCurso;
    private String profesor;
    private int cantStudents;

    public Curso(int id, String nombreCurso, String profesor, int cantStudents) {
        this.id = id;
        this.nombreCurso = nombreCurso;
        this.profesor = profesor;
        this.cantStudents = cantStudents;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public int getCantStudents() {
        return cantStudents;
    }

    public void setCantStudents(int cantStudents) {
        this.cantStudents = cantStudents;
    }

    @Override
    public String toString() {
        return "Curso [id=" + id + ", nombreCurso=" + nombreCurso + ", profesor=" + profesor + ", cantStudents="
                + cantStudents + "]";
    }

    

}
