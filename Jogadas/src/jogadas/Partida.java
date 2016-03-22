/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogadas;

import java.util.Random;

/**
 *
 * @author usuario
 */
public class Partida {
    
    public static void main(String[] args) {
        
        Jogador jog1 = new Jogador("Ze Wilson");
        Jogador jog2 = new Jogador("Thales");
        Jogador jog3 = new Jogador("Joao Pedro");
        Jogador jog4 = new Jogador("Jesobinha");
        Jogador vencedor = new Jogador(-999);
        Random rand = new Random();
        
        int[] jogs = {0, 0, 0, 0};
        
        
        //-- 10 jogadas:
        for (int i=0; i<10; i++) {   
            int jogador = rand.nextInt(4);
            switch( jogador ) {
                case 0:
                    jog1.jogar();
                    jogs[0]++;
                    break;
                case 1: 
                    jog2.jogar();
                    jogs[1]++;
                    break;
                case 2:
                    jog3.jogar();
                    jogs[2]++;
                    break;
                case 3:
                    jog4.jogar();
                    jogs[3]++;
                    break;                
            }
        }
        
        //-- checa quem venceu: 
        if (jog1.getPontos() > vencedor.getPontos()) {
            vencedor = jog1;
        }
        if (jog2.getPontos() > vencedor.getPontos()) {
            vencedor = jog2;
        }
        if (jog3.getPontos() > vencedor.getPontos()) {
            vencedor = jog3;
        }
        if (jog4.getPontos() > vencedor.getPontos()) {
            vencedor = jog4;
        }
        
        System.out.println(vencedor.getPontos());
        System.out.println(vencedor.getNome());
              
    }
    
    
    
}
