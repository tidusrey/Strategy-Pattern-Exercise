/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypatternexercise.cloth;

import strategypatternexercise.color.Colors;
import strategypatternexercise.fabric.Fabric;
import strategypatternexercise.size.Size;


public class Tshirt {
    private Size size;
    private Fabric fabric;
    private Colors color;
    private Context context;

    public Tshirt(Size size, Fabric fabric, Colors color, Context context) {
        this.size = size;
        this.fabric = fabric;
        this.color = color;
        this.context = context;
    }

    public Tshirt() {
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Fabric getFabric() {
        return fabric;
    }

    public void setFabric(Fabric fabric) {
        this.fabric = fabric;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public String toString() {
        int total=color.value+size.value+color.value;
        return "You have bought a  Tshirt " + "which  size is " + size + ",the quality of fabric is " + fabric + ",and the  color is " + color + ", " + context + total+ " euro";
    }
    
}
