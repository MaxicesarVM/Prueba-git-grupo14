
package practicarepasoejercicio4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Evento {
    
    private String nombre;
    private LocalDate fecha;
    private String responsable;

    public Evento(String nombre, LocalDate fecha, String responsable) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.responsable = responsable;
    }

    @Override
    public String toString() {
        return "Evento{" + "nombre=" + nombre + ", fecha=" + fecha + ", responsable=" + responsable + '}';
    }
    
    public static void ordenarPorFecha(ArrayList<Evento> eventos){
        
        
        
        Comparator<Evento> comparadorParaFecha= new Comparator<Evento>(){
            @Override
            public int compare(Evento evento1, Evento evento2){
                return evento2.getFecha().compareTo(evento1.getFecha());

            }
            
            
        };
        
        Collections.sort(eventos, comparadorParaFecha);
        
        
    } 
    
    public static void ordenarParaAlfabeticamente(ArrayList<Evento> eventos){
        
       
        
        Comparator<Evento> comparadorParaAlfabeticamente= new Comparator<Evento>(){
            @Override
            public int compare(Evento evento1, Evento evento2){
                if(evento1.getNombre().equalsIgnoreCase(evento2.getNombre())) return -1;
                if(evento1.getNombre().equalsIgnoreCase(evento2.getNombre())) return 1;
                return 0;
            }
            
            
        };
        
        Collections.sort(eventos, comparadorParaAlfabeticamente);
        
        
    } 
    
    
    
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }
    
    
   
    
    
    
    
    
    
    
    
}

