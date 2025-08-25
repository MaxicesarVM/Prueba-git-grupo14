package practicarepasoejercicio4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class PracticaRepasoEjercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Evento> listaEventos = new ArrayList();
        boolean condicionBucle = true;
        System.out.println("Bienvenido al sistema de gestion de eventos");

        try {

            do {

                System.out.println("Ingrese nombre del evento: ");
                String nombreEvento = sc.nextLine();
                System.out.println("Ingrese la fecha del evento en formato (dia/mes/ano)");

                String fechaEvento = sc.nextLine();
                DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate fecha = LocalDate.parse(fechaEvento, format);

                System.out.println("Ingrese responsable del evento: ");
                String responsableEvento = sc.nextLine();

                Evento eventoCreado = new Evento(nombreEvento, fecha, responsableEvento);
                listaEventos.add(eventoCreado);

                System.out.println("Quiere ingresar otro evento? (si/no)");
                String respuesta = sc.nextLine();
                if(respuesta.equalsIgnoreCase("si")){
                    condicionBucle = true;
                } else{
                    condicionBucle = false;
                }
                
            } while (condicionBucle == true);

            System.out.println("Lista de todos los eventos: ");
            for (Evento evento : listaEventos) {
                System.out.println(evento);
            }

            System.out.println("------------");
            
            Evento.ordenarPorFecha(listaEventos);
            System.out.println("Eventos Ordenados por fecha: ");

            for (Evento evento : listaEventos) {
                System.out.println(evento);
            }

            System.out.println("------------");
            
            Evento.ordenarParaAlfabeticamente(listaEventos);
            System.out.println("Eventos Ordenados Alfabeticamente: ");

            for (Evento evento : listaEventos) {
                System.out.println(evento);
            }

        } catch (java.time.format.DateTimeParseException e) {
            System.out.println(e);
            System.out.println("Error en la carga de la fecha...");

        } 

    }

}
