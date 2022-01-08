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
    
    public Client(String name, ArrayList<Item> items) {
        this.name = name;
        this.items = items;
    }
    
    public void addItem(Item item) {
        items.add(item);
    }
    
    public void removeItem(int index) {
        items.remove(index);
    }
    
    public ArrayList<Item> getItems(){
        return items;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
