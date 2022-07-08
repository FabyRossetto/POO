/*
 * Una carta tiene un número
entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta
clase debe contener un método toString() que retorne el número de carta y el palo.
 */
package javaejercicio3relaciones;



import java.util.ArrayList;

import java.util.Scanner;


/**
 *
 * @author Fabi
 */
public class Cartas {
    
    int numero;
    String palo;
    
    
Scanner Leer=new Scanner(System.in);

    public Cartas() {
    }

    public Cartas(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
       
    }

   

   

    public void setNumero(int numeros) {
        this.numero = numeros;
    }
    public int getNumero() {
        return numero;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public String getPalo() {
        return palo;
    }
    

    
    
    
    public void CrearCarta(ArrayList <Cartas> carta){
        
          for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 4; j++) {
                
                if ((i != 7) && (i != 8)) {
                    Cartas cartauno = new Cartas();
                    cartauno.setNumero(i + 1);

                    if (j == 0) {
                        cartauno.setPalo("de: Oro");
                        carta.add(cartauno);
                    }
                    if (j == 1) {
                        cartauno.setPalo("de: Copa");
                        carta.add(cartauno);
                    }
                    if (j == 2) {
                        cartauno.setPalo("de: Espada");
                        carta.add(cartauno);
                    }
                    if (j == 3) {
                        cartauno.setPalo("de: Basto");
                        carta.add(cartauno);
                    }

                }

            }
        }
    }

//    public void MostrarCartas(ArrayList<Cartas> carta) {
//        System.out.println("LAS CARTAS ORDENADAS SON :");
//        for (Cartas cartauno : carta) {
//            System.out.println(" " + cartauno);
//
//        }

    
            
        
       
        
      
 
              
              
          
      
       
        
       

    @Override
    public String toString() {
        return "Carta{" + " " + numero + " " + palo + '}';
    }

    
    
}
