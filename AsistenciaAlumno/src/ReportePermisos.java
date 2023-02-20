import java.util.ArrayList;

public class ReportePermisos extends Reporte {

    public ReportePermisos() {
        super();
    }
    @Override
    public String generarReporte(int indice,ArrayList<Alumno> alumnos){
    
        String infoAlumnos = "";
        for(Alumno a: alumnos){
            if(a.verAsistencia(indice) == 'p'){
                infoAlumnos =  infoAlumnos + a.mandarInformacion();
                infoAlumnos = infoAlumnos + "tiene permiso\n" +  "___________________________________________________________" + "\n";
            }
          
           
    }
    return infoAlumnos;
}
}
