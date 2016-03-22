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
public class Dado {
    
    private static final int[] faces = { 0, 1, -2, 3, 4, -5};
    
    static int lançar() {
        
        Random rand = new Random();
        int i = rand.nextInt(6);
        return faces[i];
    }
    
}
