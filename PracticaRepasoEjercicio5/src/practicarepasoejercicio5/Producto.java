
package practicarepasoejercicio5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Producto {
    
    private String nombre;
    private String codigo;
    private double precio;
    private LocalDate fechaIngreso;
    private int stock;

    public Producto(String nombre, String codigo, double precio, LocalDate fechaIngreso, int stock) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.fechaIngreso = fechaIngreso;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", codigo=" + codigo + ", precio=" + precio + ", fechaIngreso=" + fechaIngreso + ", stock=" + stock + '}';
    }

    public static void ordenarPorPrecio(ArrayList<Producto> productos){
        
       
        
        Comparator<Producto> comparadorParaPrecio= new Comparator<Producto>(){
            @Override
            public int compare(Producto producto1, Producto producto2){
                if(producto1.getPrecio() > producto2.getPrecio()) return -1;
                if(producto1.getPrecio() < producto2.getPrecio()) return 1;
                return 0;
            }
            
            
        };
        
        Collections.sort(productos, comparadorParaPrecio);
        
        
    } 
    
    public static void ordenarPorFecha(ArrayList<Producto> productos){
        
        
        
        Comparator<Producto> comparadorParaFecha= new Comparator<Producto>(){
            @Override
            public int compare(Producto producto1, Producto producto2){
                return producto2.getFechaIngreso().compareTo(producto1.getFechaIngreso());

            }
            
            
        };
        
        Collections.sort(productos, comparadorParaFecha);
        
        
    } 
    
    
    
    
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
    
    
    
    
    
    
    
    
    
}
