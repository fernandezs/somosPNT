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
public class FoodProduct extends Product{
    private String salesUnit;

    public String getSalesUnit() {
        return salesUnit;
    }

    public void setSalesUnit(String salesUnit) {
        this.salesUnit = salesUnit;
    }
    public FoodProduct(String name, int price, String salesUnit) {
        super(name, price);
        this.salesUnit = salesUnit;
    }
    


    @Override
    public String toString() {
        return "Nombre: " + getName() + " /// Precio: $" + getPrice() + " /// Unidad de venta: " + getSalesUnit();
    }


    
}
