
package ejercicioornitorrinco;

import java.util.ArrayList;


public class EjercicioOrnitorrinco {

    
    public static void main(String[] args) {
        
        Ornitorrinco orniVerde = new Ornitorrinco("2.5", 30);
        Ornitorrinco orniAzul = new Ornitorrinco("3.5", 45);
        Ornitorrinco orniAzul2 = new Ornitorrinco("3.5", 45);
        
        orniVerde.nadar();
        orniVerde.tocarOrgano();
        orniVerde.tocarGuitarra();
        
        orniAzul.nadar();
        orniAzul.tocarOrgano();
        orniAzul.tocarGuitarra();
        
        orniAzul2.nadar();
        orniAzul2.tocarOrgano();
        orniAzul2.tocarGuitarra();
        
        Ornitorrinco[] ornitorrincos = new Ornitorrinco [2];
        
        
        
        try{
        
            ornitorrincos[0] = orniAzul;
            ornitorrincos[1] = orniVerde;
            ornitorrincos[2] = orniAzul2;
            
            
            
            
        } catch(ArrayIndexOutOfBoundsException e){
            
            System.out.println(e);
            
        } finally{
            System.out.println("Los ornitorrincos juntos al fin...");
        }
        
        
        ArrayList<Ornitorrinco> nadadores = new ArrayList();
        
        for(int i = 0; i < ornitorrincos.length; i++){
            
            if(ornitorrincos[i] instanceOf )
        }
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
