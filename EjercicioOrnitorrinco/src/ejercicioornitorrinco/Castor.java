
package ejercicioornitorrinco;


public class Castor {
    
    private String longitudCola;
    private double velocidad;

    public Castor(String longitudCola, double velocidad) {
        this.longitudCola = longitudCola;
        this.velocidad = velocidad;
    }

    
    
    
    
    public void nadar(){
        System.out.println("Castor esta nadando!");
        
        
    }
    
    
    public void tocarGuitarra(){
        System.out.println("Castor esta tocando la guitarra");
        
    }
    
    
    
    
    
    public String getLongitudCola() {
        return longitudCola;
    }

    public void setLongitudCola(String longitudCola) {
        this.longitudCola = longitudCola;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
