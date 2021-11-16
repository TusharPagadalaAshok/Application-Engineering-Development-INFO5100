/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

/**
 *
 * @author patus
 */
public class Menu {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }
    private String name;
    private String price;
    private String ingredients;

    public Menu(String name, String price, String ingredients) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }
     @Override
    public String toString() {
        return name;
    }
    
}
