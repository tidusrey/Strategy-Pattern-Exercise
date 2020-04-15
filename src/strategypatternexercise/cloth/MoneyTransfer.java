/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypatternexercise.cloth;


public class MoneyTransfer implements PaymentStrategy {

  

    @Override
    public String paymentMethod() {

        return  "You ve payed with Money transfer";
    }

    @Override
    public String toString() {
        return "MoneyTransfer ";
    }
    
}
