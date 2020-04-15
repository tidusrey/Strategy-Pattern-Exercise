/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypatternexercise.cloth;

public class Context {

    PaymentStrategy paymentStrategy;

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public Context(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    
   public String executeStrategy(){
       return paymentStrategy.paymentMethod();
   }

    @Override
    public String toString() {
        return "You have paid with  " + paymentStrategy ;
    }
   
}
