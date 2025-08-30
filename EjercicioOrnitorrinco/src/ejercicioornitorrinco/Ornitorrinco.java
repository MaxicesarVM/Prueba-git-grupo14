package ejercicioornitorrinco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ornitorrinco extends Castor implements MamaPata {

    public Ornitorrinco(String longitudCola, double velocidad) {
        super(longitudCola, velocidad);
    }
    public void datosOrnitorrinco(Ornitorrinco o1){
        System.out.println("Soy el Ornitorrinco con la cola de "+ getLongitudCola()+ " y velocidad "+ getVelocidad());
    }
            
    @Override
    public void tocarOrgano() {

        System.out.println("Do re mi");

    }

    @Override
    public void tocarGuitarra() {

        System.out.println("Toca cuerda 3");

    }

    @Override
    public void nadar() {

        System.out.println("Se propulsa");

    }
//Acá se aplicó el comparador de quién es más rápido
    public static void comparadorDeNadador(ArrayList<Ornitorrinco> veloz) {
        Comparator<Ornitorrinco> comparadorporNadador = new Comparator<Ornitorrinco>() {
            @Override
            public int compare(Ornitorrinco orni1, Ornitorrinco orni2) {
                if (orni1.getVelocidad() > orni2.getVelocidad()) {
                    return -1;
                }
                if (orni1.getVelocidad() < orni2.getVelocidad()) {
                    return 1;
                }
                return 0;
            }
        };
        
        
        Collections.sort(veloz, comparadorporNadador);
        
                       
    }

}
