/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Models.Item;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Dimos
 */
public class ItemRenderer extends JPanel implements ListCellRenderer<Item>{
    
    private JLabel icon = new JLabel();
    private JLabel name = new JLabel();
    private JLabel price = new JLabel();
    
    public ItemRenderer() {
        setLayout(new BorderLayout(5, 5));
        
        JPanel panelText = new JPanel(new GridLayout(0, 1));
        panelText.add(name);
        panelText.add(price);
        add(icon, BorderLayout.WEST);
        add(panelText, BorderLayout.CENTER); 
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends Item> list, Item item, int index, boolean isSelected, boolean cellHasFocus) {
        //System.out.println(getClass().getResource("").getPath());
        icon.setIcon(new ImageIcon("" + item.getImage() + ".jpg"));
        name.setText(item.getName());
        price.setText(Integer.toString(item.getPrice()));
        price.setForeground(Color.blue);
 
        return this;
    }
}
