/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypatternexercise;

import strategypatternexercise.cloth.Cash;
import strategypatternexercise.cloth.Context;
import strategypatternexercise.cloth.CreditCard;
import strategypatternexercise.cloth.MoneyTransfer;
import strategypatternexercise.cloth.Tshirt;
import strategypatternexercise.color.Colors;
import strategypatternexercise.fabric.Fabric;
import strategypatternexercise.size.Size;

/**
 *
 * @author Μαρια
 */
public class StrategyPatternExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Tshirt tshirt=new Tshirt();
   tshirt.setColor(Colors.YELLOW);
   tshirt.setSize(Size.XL);
   tshirt.setFabric(Fabric.RAYON);
   tshirt.setContext(new Context(new Cash()));
   
        System.out.println(tshirt);
        
        
    Tshirt tshirt1=new Tshirt();   
    tshirt1.setSize(Size.S);
    tshirt1.setFabric(Fabric.POLYESTER);
    tshirt1.setColor(Colors.PINK);
    tshirt1.setContext(new Context(new CreditCard()));
        
    System.out.println(tshirt1);
        
       
    Tshirt tshirt3=new Tshirt();
    tshirt3.setSize(Size.XXL);
    tshirt3.setFabric(Fabric.RAYON);
    tshirt3.setColor(Colors.WHITE);
    tshirt3.setContext(new Context(new MoneyTransfer()));
        
        System.out.println(tshirt3);
    }
   
    
}
