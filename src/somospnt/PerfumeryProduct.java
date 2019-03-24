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
public class PerfumeryProduct extends Product {
    private int content;
    public PerfumeryProduct(String name, int content, int price) {
        super(name, price);
        this.content = content;
    }

    @Override
    public String toString() {
        return "Nombre: " + getName() + " /// Contenido: " + getContent() + "ml " + "/// Precio: $" + getPrice();
    }

    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }
    
}
