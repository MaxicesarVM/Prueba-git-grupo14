
package practicorepasoej1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


public class Oficina {
    
    private ArrayList<Empleado> empleados;

    public Oficina() {
        this.empleados = new ArrayList<>();
    }

    
    
    
    
    public void agregarEmpleado(Empleado empleado){
        
        
        
        empleados.add(empleado);
        
        
        
    }
    
    public void mostrarEmpleados(){
        
        for(Empleado empleadoMostrado: empleados){
            System.out.println(empleadoMostrado);
        }
        
     
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    
    
    
    public static void ordenarPorNombreFormaAscendente(ArrayList<Empleado> empleados){
        
       
        
        Comparator<Empleado> comparadorParaNombreAscendente= new Comparator<Empleado>(){
            @Override
            public int compare(Empleado empleado1, Empleado empleado2){
                if(empleado1.getNombre().toLowerCase().compareTo(empleado2.getNombre().toLowerCase()) > 0) return 1;
                if(empleado1.getNombre().toLowerCase().compareTo(empleado2.getNombre().toLowerCase()) == 0) return 0;
                return -1;
            }
            
            
        };
        
        Collections.sort(empleados, comparadorParaNombreAscendente);
        
        
    }
     
    public static void ordenarPorSueldo(ArrayList<Empleado> empleados){
        
       
        
        Comparator<Empleado> comparadorParaSueldo= new Comparator<Empleado>(){
            @Override
            public int compare(Empleado empleado1, Empleado empleado2){
                if(empleado1.getSueldo() > empleado2.getSueldo()) return 1;
                if(empleado1.getSueldo() < empleado2.getSueldo()) return 0;
                return -1;
            }
            
            
        };
        
        Collections.sort(empleados, comparadorParaSueldo);
        
        
    } 
    
    
}
