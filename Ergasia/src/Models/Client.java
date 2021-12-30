/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.ArrayList;

/**
 *
 * @author Dimos
 */
public class Client {
    
    private String name;
    private ArrayList<Item> items;
    
    public Client(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        items.add(item);
    }
    
    public String getName() {
        return name;
    }
}
