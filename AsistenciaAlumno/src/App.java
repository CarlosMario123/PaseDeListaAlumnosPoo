import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        ArrayList<String> fechas = new ArrayList<>();

        //alumnos definidos
        alumnos.add(new Alumno("carlos mario ruiz pinacho","221220"));
        alumnos.add(new Alumno("Alejandro Diaz Hernandez","223224"));
        alumnos.add(new Alumno("William Rivera Solis","221223"));
        alumnos.add(new Alumno("Bryan de la torre Ruiz","221221"));
        alumnos.add(new Alumno("Mauricio Fernandez torres","223220"));
        alumnos.add(new Alumno("Cesar Ovando Lopez","223221"));
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        
        do{
            System.out.println("************************************");
            System.out.println("*              Menu                *");
            System.out.println("************************************");
            System.out.println("1)Tomar asistencia");
            System.out.println("2)Generar reporte");
            System.out.println("3)Salir");
            System.out.println("************************************");
            opcion = entrada.nextInt();

            switch(opcion){
                case 1:
                registroAsistencia(alumnos, fechas);
                break;
                case 2:
                generarReporte(alumnos, fechas);
                break;
            }
            }while(opcion != 3);
          

    }

    public static void generarReporte(ArrayList<Alumno> alumnos,ArrayList<String> fechas){
        ReporteFaltas reporteFaltas = new ReporteFaltas();
        ReporteAsistencia reporteAsistencia = new ReporteAsistencia();
        ReportePermisos reportePermisos = new ReportePermisos();

        if(!fechas.isEmpty()){
        for(int i = 0;i < fechas.size();i++){
            System.out.println("*******************************************************************");
          System.out.println("Fecha en la que se paso lista: " + fechas.get(i));
          System.out.println("*******************************************************************");
          System.out.println(reporteAsistencia.generarReporte(i, alumnos));
          System.out.println(reporteFaltas.generarReporte(i, alumnos));
          System.out.println(reportePermisos.generarReporte(i, alumnos));
          System.out.println("*******************************************************************");
        
        }
    }else{
        System.out.println("No se ha pasado lista ninguna vez");
    }
    }

    public static void registroAsistencia(ArrayList<Alumno> alumnos,ArrayList<String> fechas){
        LocalDate fecha = LocalDate.now();
        int opcion = 0;
        Scanner entrada = new Scanner(System.in);
        String fecha1 = fecha.plusDays(fechas.size()).toString();
        fechas.add(fecha1);
        System.out.println("____________________________________");
        System.out.println("asistencia del dia: " + fecha1);
        System.out.println("____________________________________");
        System.out.println("Ingrese: ");
        System.out.println("a)si asistio el alumno");
        System.out.println("f)si falto el alumno");
        System.out.println("p)si el alumno tiene permiso");
       
        for(Alumno a:alumnos){
            System.out.println("********************************************");
           System.out.println(a.mandarInformacion());
           System.out.println("******************************");
           System.out.print("ingrese la asistencia: ");
          a.agregarAsistencia(entrada.next().charAt(0));
        }
    System.out.println("___________________________");
    System.out.println("Pase de lista finalizado");
    System.out.println("___________________________");
    }
}