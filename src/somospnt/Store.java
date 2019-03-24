/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somospnt;


import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Sergio
 */
public class Store {
    private final ArrayList<Product> products;
    
    public Store() {
        this.products = new ArrayList();
    }
    public void printProducts() {
        if(! products.isEmpty()) {
            products.forEach((product) -> {
                System.out.println(product);
            });
            System.out.println("=============================");
            System.out.println("Producto más caro: " + productMoreExpensive());
            System.out.println("Producto más barato: " + productCheapest());
        }
        
    }
    
    public void addProduct(Product product) {
        this.products.add(product);
    }
    

    public String productMoreExpensive() {
        if(! products.isEmpty()) {
            Collections.sort(products);
            return products.get(0).getName();
        }
        return "Sin productos";
    }
    
    public String productCheapest () {
        if(! products.isEmpty()) {
            Collections.sort(products);
            return products.get(products.size() -1).getName();
        }
        return "Sin productos";
    }
    
    public void loadProducts() {
        addProduct(new DrinkProduct("Coca-Cola Zero", 20, (float) 1.5));
        addProduct(new DrinkProduct("Coca-Cola", 18, (float) 1.5));
        addProduct(new PerfumeryProduct("Shampoo Sedal", 500, 19));
        addProduct(new FoodProduct("Frutillas", 64, "kilo"));
    }
    
    
    /*
      otra forma de retornar el producto sin utilizar ordenamiento con un unico parametro,
      devuelve el producto mas caro o mas barato segun el parametro mayor que (>) o menor que (<)
    */
    public String productAccordingToParameter(Character parameter) {
        if(! products.isEmpty()) {
            Product p = products.get(0);
            if(parameter.equals('>')) {
                for(int i = 0; i < products.size(); i ++) {
                    if(p.compareTo(products.get(i)) > 0) {
                        p = products.get(i);
                    }
                }
            }
            else {
                for(int i = 0; i < products.size(); i ++) {
                    if(p.compareTo(products.get(i)) < 0) {
                        p = products.get(i);
                    }   
                }  
            }
            return p.getName();
        }
        return "No se encontraror productos!";
    }
    
}
