import java.util.ArrayList;

public class ReporteFaltas extends Reporte {

    public ReporteFaltas() {
        super();
    }

    @Override
    public String generarReporte(int indice,ArrayList<Alumno> alumnos){
    
        String infoAlumnos = "";
        for(Alumno a: alumnos){
            if(a.verAsistencia(indice) == 'f'){
                infoAlumnos =  infoAlumnos + a.mandarInformacion();
                infoAlumnos = infoAlumnos + "tiene falta\n" + "___________________________________________________________" + "\n";
            }
          
           
    }
    return infoAlumnos;
}
    
}
