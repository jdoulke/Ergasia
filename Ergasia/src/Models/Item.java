/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import javax.swing.ImageIcon;

/**
 *
 * @author Dimos
 */
public class Item {
    
    private String model;
    private float price;
    private int posotita;
    private ImageIcon image;
    
    public Item(String model, float price,int posotita, ImageIcon image) {
        this.model = model;
        this.price = price;
        this.posotita = posotita;
        this.image = image;
    }
    
    public String getName() {
        return model;
    }       
    public float getPrice() {
        return price;
    }
    public int getPosotita() {
        return posotita;
    }
    public void setPosotita(int posotita) {
        this.posotita = posotita;
    }
    public ImageIcon getImage() {
        return image;
    }
    
    @Override
    public String toString() {
        return model + " " + price;
    }
    public String Save(){
        return model + ";" + price + ";"+ posotita + ";" + image;
    }
}


