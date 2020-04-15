/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypatternexercise.color;


public enum Colors {
    RED(5), 
    YELLOW(9) ,
    BLACK (7),
    WHITE (22),
    PINK(15);

    public int value;

    private Colors(int value) {
        this.value = value;
    }

   
}
