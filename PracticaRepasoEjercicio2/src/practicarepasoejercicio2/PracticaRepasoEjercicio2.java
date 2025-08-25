package practicarepasoejercicio2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PracticaRepasoEjercicio2 {

    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Pepe", "Lopez", 7);
        Estudiante estudiante2 = new Estudiante("Sofia", "Rodriguez", 5);
        String dni1 = "45642124";
        String dni2 = "14124124";

        Scanner sc = new Scanner(System.in);
        Map<String, Estudiante> registroEstudiantes = new HashMap();

        try {

            System.out.println("Ingrese nombre estudiante:");
            String nombre = sc.nextLine();
            System.out.println("Ingrese apellido estudiante:");
            String apellido = sc.nextLine();
            System.out.println("Ingrese promedio estudiante:");
            int promedio = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese Dni estudiante: ");
            String dni = sc.nextLine();

            Estudiante estudianteCreado = new Estudiante(nombre, apellido, promedio);
            registroEstudiantes.put(dni, estudianteCreado);

            System.out.println("Ingrese dni estudiante para cambiar promedio: ");
            String respuesta = sc.nextLine();
            if (registroEstudiantes.containsKey(respuesta)) {
                System.out.println("Modifique el nuevo promedio:");
                int promedioModificado = sc.nextInt();
                sc.nextLine();
                registroEstudiantes.get(dni).setPromedio(promedioModificado);
            } else {
                throw new Error("ERROR"); 

            }

            System.out.println("Ingrese dni estudiante para eliminar: ");
            String respuestaEliminacion = sc.nextLine();
            if (registroEstudiantes.containsKey(respuestaEliminacion)) {
                registroEstudiantes.remove(respuestaEliminacion);
            } else {
                throw new Error("ERROR"); 
            }

            System.out.println("----------");
            System.out.println("Lista de estudiantes: ");
            for (Map.Entry<String, Estudiante> x : registroEstudiantes.entrySet()) {
                System.out.println(x);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println(e);
            System.out.println("No puede ingresar letras en el promedio, el programa finalizara..");
        } catch (java.lang.Error e2){
            System.out.println(e2);
            System.out.println("Error al modificar o eliminar un estudiante debido a un dni incorrecto...");
        }
        
            
        
        
        
    }

}
