package practicarepasoejercicio3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class PracticaRepasoEjercicio3 {

    public static void main(String[] args) {

        HashSet<Curso> listaCursos = new HashSet();
        Scanner sc = new Scanner(System.in);
        boolean respuesta = false;
        System.out.println("Bienvenido al sistema de cursos: ");

        do {
            System.out.println("Quiere agregar un curso? (si/no)");
            String respuestaUsuario = sc.nextLine();
            if (respuestaUsuario.equalsIgnoreCase("si")) {
                respuesta = true;
                System.out.println("Ingrese nombre del curso: ");
                String nombreCurso = sc.nextLine();
                System.out.println("Ingrese codigo del curso: ");
                String codigoCurso = sc.nextLine();
                System.out.println("Ingrese fecha de inicio: (dia/mes/año)");
                String fechaCadenaInicio = sc.nextLine();
                DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate fecha = LocalDate.parse(fechaCadenaInicio, format);
                //
                System.out.println("Ingrese fecha de fin: (dia/mes/año)");
                String fechaCadenaFin = sc.nextLine();
                DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate fecha2 = LocalDate.parse(fechaCadenaFin, format2);

                Curso cursoCreado = new Curso(codigoCurso, nombreCurso, fecha, fecha2);
                listaCursos.add(cursoCreado);
                System.out.println("Ingreso correctamente el curso: " + cursoCreado.getNombre());

            } else {
                respuesta = false;
            }

        } while (respuesta == true);

        for (Curso cursos : listaCursos) {
            System.out.println(cursos);
        }

        boolean respuestaEliminacion = false;
        System.out.println("Seccion para eliminar cursos: ");

        do {
            System.out.println("Desea eliminar un curso? (si/no)");
            String respuestaParaEliminar = sc.nextLine();
            if (respuestaParaEliminar.equalsIgnoreCase("si")) {
                System.out.println("Ingrese codigo del curso a eliminar: ");
                String codigoParaEliminar = sc.nextLine();
                boolean codigoEncontrado = false;
                Iterator<Curso> it = listaCursos.iterator();
                while (it.hasNext()) {
                    if (it.next().getCodigo().equalsIgnoreCase(codigoParaEliminar)) { 
                        it.remove();
                        codigoEncontrado = true;
                        break;
                        
                    } 
                    
                }
                if(!codigoEncontrado){
                    System.out.println("No se encontro el curso con ese codigo...");
                }
                         
                
            } else{
                respuestaEliminacion = false;
                
            }

        } while (respuestaEliminacion == true);

        System.out.println("Lista de todos los cursos actuales: ");
        for (Curso cursos : listaCursos) {
            System.out.println(cursos);
        }
        
        System.out.println("Calculo de duracion de cursos: ");
        for (Curso cursoRecorrido : listaCursos) {
            
            System.out.println("Duracion del curso: " + cursoRecorrido.getNombre() + " : ");
            double horasSinCalculo = ChronoUnit.DAYS.between(cursoRecorrido.getInicioCurso(), cursoRecorrido.getFinCurso());
            System.out.println("Horas:" + " " + horasSinCalculo * 24);

            
            
            
        }
        
        
        
        
        
        
        
        
    }

}
