import java.util.ArrayList;

public class ReporteAsistencia extends Reporte{

    
    public ReporteAsistencia() {
        super();
    }

    @Override
    public String generarReporte(int indice,ArrayList<Alumno> alumnos){
    
        String infoAlumnos = "";
        for(Alumno a: alumnos){
            if(a.verAsistencia(indice) == 'a'){
                infoAlumnos =  infoAlumnos + a.mandarInformacion();
                infoAlumnos = infoAlumnos + "asistio\n" +  "___________________________________________________________" + "\n";
            }
          
           
    }
    return infoAlumnos;
}
}
