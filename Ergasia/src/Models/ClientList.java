/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author Dimos
 */
public class ClientList extends AbstractListModel implements ComboBoxModel {

    private ArrayList<Client> list;
    private Client selected = null;
    
    public ClientList(ArrayList<Client> list) {
        this.list = list;
    }
    
    @Override
    public void setSelectedItem(Object anItem) {
        selected = (Client) anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selected;
    }

    @Override
    public int getSize() {
        return list.size();
    }

    @Override
    public Object getElementAt(int index) {
        return list.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
