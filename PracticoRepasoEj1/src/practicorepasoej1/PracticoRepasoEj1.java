
package practicorepasoej1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class PracticoRepasoEj1 {

    
    public static void main(String[] args) {
        
        Oficina oficinaEmpleados = new Oficina();
        Scanner sc = new Scanner(System.in);
        boolean respuesta;
        ArrayList<Empleado> lista = new ArrayList<>();
        
        
        
        try{
            
            
            
            
            do{
                System.out.println("Bienvenido al sistema..");
                System.out.println("Ingrese nombre del empleado:");
                String nombreEmpleado = sc.nextLine();
                System.out.println("Ingrese legajo del empleado:");
                int legajoEmpleado = sc.nextInt();
                sc.nextLine();
                System.out.println("Ingrese sueldo del empleado:");
                double sueldoEmpleado = sc.nextDouble();
                sc.nextLine();
                
                Empleado empleado = new Empleado(nombreEmpleado, legajoEmpleado, sueldoEmpleado);
                oficinaEmpleados.agregarEmpleado(empleado);
                lista.add(empleado);
                
                System.out.println("Quiere agregar otro empleado? (ponga si o no)");
                String respuestaPregunta = sc.nextLine();
                
                
                if(respuestaPregunta.equalsIgnoreCase("si")){
                    respuesta = true;
                } else{
                    respuesta = false;
                }
                
            }
            while(respuesta == true);
            
            oficinaEmpleados.mostrarEmpleados();
            
            Iterator<Empleado> it = lista.iterator();
            
            
            System.out.println("Ingrese el legajo del empleado a buscar: ");
            int legajoIngresado = sc.nextInt();
            sc.nextLine();
            
            while(it.hasNext()){
                if(it.next().getLegajo() == legajoIngresado){
                    it.remove();
                } else{
                    System.out.println("No existe el legajo indicado...");
                }
                
            }
            
            for(Empleado empleadoLista: lista){
                System.out.println(empleadoLista);
            }
            
            Oficina.ordenarPorNombreFormaAscendente(lista);
            
            System.out.println("---------------");
            System.out.println("Lista de empleados Ordenados: ");
            
            for(Empleado empleadoLista: lista){
                System.out.println(empleadoLista);
            }
            
            Oficina.ordenarPorSueldo(lista);
            System.out.println("----------");
            System.out.println("Lista de empleados Ordenados por sueldo: ");
            
            for(Empleado empleadoLista: lista){
                System.out.println(empleadoLista);
            }
            
            
        }
        catch(Exception e){
            
        }
        
        
        
        
        
        
        
        
        
    }
    
}
