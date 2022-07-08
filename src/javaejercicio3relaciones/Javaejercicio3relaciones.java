/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio3relaciones;

import java.util.ArrayList;


/**
 *
 * @author Fabi
 */
public class Javaejercicio3relaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cartas cartamain=new Cartas();
    ArrayList <Cartas> cartasmain=new ArrayList();
    
       Barajas barajauno= new Barajas();
       
        cartamain.CrearCarta(cartasmain);
        
        barajauno.Barajar(cartasmain);
        barajauno.siguienteCarta(cartasmain);
        barajauno.cartasDisponibles(cartasmain);
        barajauno.darCartas(cartasmain);
        barajauno.cartasMonton(cartasmain,barajauno.getPedidas());
        barajauno.mostrarBaraja(cartasmain);
    }
    
}
