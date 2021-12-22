/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Dimos
 */
public class Item {
    private int ID;
    private String name;
    private int price;
    private String image;
    
    public Item(int ID, String name, int price, String image) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.image = image;
    }
    
    public int getID() {
        return ID;
    }
    public String getName() {
        return name;
    }       
    public int getPrice() {
        return price;
    }
    public String getImage() {
        return image;
    }
    
    @Override
    public String toString() {
        return name + " " + price;
    }
}


