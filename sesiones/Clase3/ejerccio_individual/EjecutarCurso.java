package sesiones.Clase3.ejerccio_individual;

public class EjecutarCurso {
    public static void main(String[] args) {
        
        Curso[] cursos = new Curso[5];

        cursos[0] = new Curso(1, "Matemáticas", "Carlos", 25);
        cursos[1] = new Curso(2, "Programación", "Ana", 30);
        cursos[2] = new Curso(3, "Física", "Luis", 20);
        cursos[3] = new Curso(4, "Inglés", "Marta", 15);
        cursos[4] = new Curso(5, "calculo", "jhon haide cano", 80);

        int totalEstudiantes = 0;

        for (int i = 0; i < cursos.length; i++) {
            totalEstudiantes += cursos[i].getCantStudents();
        }

        System.out.println("Total de estudiantes en todos los cursos: " + totalEstudiantes);
    }
}