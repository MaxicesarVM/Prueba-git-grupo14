
package ejercicioornitorrinco;



public class Ornitorrinco extends Castor implements MamaPata{

    public Ornitorrinco(String longitudCola, double velocidad) {
        super(longitudCola, velocidad);
    }

    @Override
    public void tocarOrgano() {
        
        System.out.println("Do re mi");
        
    }

    @Override
    public void tocarGuitarra(){
        
        System.out.println("Toca cuerda 3");
        
        
    }
    
    @Override
    public void nadar(){
        
        System.out.println("Se propulsa");
        
        
    }
    
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
