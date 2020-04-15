/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypatternexercise.size;


public enum Size {
     XS(15), 
     S(12),
     M(7),
     L(11), 
     XL(19), 
     XXL(22), 
     XXXL(45);

public int value;

    private Size(int value) {
        this.value = value;
    }

   
  
}

