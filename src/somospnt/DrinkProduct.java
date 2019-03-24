/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somospnt;

/**
 *
 * @author Sergio
 */
public class DrinkProduct extends Product {
    private float liters;

    public float getLiters() {
        return liters;
    }

    public void setLiters(float liters) {
        this.liters = liters;
    }
    
    public DrinkProduct(String name, int price, float liters) {
        super(name, price);
        this.liters = liters;
    }

    @Override
    public String toString() {
        return "Nombre: " + getName() + ": /// Litros: " + getLiters() + " /// Precio: $" + getPrice();
    }
    
}
