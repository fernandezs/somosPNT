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
public abstract class Product implements Comparable<Product>{
    protected String name;
    protected int price;
    
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    
    @Override
    public abstract String toString();
    
    @Override
    public int compareTo(Product p) {
        if (this.price > p.price) {
            return -1;
        }
        else if(this.price < p.price ) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
    
    
    
}
