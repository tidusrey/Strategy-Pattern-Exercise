/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypatternexercise.cloth;

/**
 *
 * @author Μαρια
 */
public class Cash implements PaymentStrategy {

    @Override
    public String  paymentMethod() {
        return "You have pay with Cash";

    }

    @Override
    public String toString() {
        return "Cash ";
    }
    
}
