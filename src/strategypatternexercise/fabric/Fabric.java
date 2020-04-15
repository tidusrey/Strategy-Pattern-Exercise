/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypatternexercise.fabric;


public enum Fabric {
    WOOL(12), 
    COTTON(7),  
    POLYESTER(11),  
    RAYON(23),  
    LINEN(75),  
    CASHMERE(33),  
    SILK(9);

public int value;

    private Fabric(int value) {
        this.value = value;
    }

   
}

