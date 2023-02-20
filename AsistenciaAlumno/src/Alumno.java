import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private String matricula;
    private ArrayList<Character> asistencia = new ArrayList<>();
    public Alumno(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }

    public void agregarAsistencia(char a){
          asistencia.add(a);
    }

    public String mandarInformacion(){
        return "Nombre del alumno: " + nombre + "\n" + "matricula: " + matricula + "\n";
    }

    public char verAsistencia(int indice){
       return asistencia.get(indice);
    }

}
