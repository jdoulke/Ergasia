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
import java.awt.Image;
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
        Image tempImage = new ImageIcon(getClass().getResource(item.getImage() + ".jpg"))
                            .getImage()
                            .getScaledInstance(128, 128, Image.SCALE_DEFAULT);
        icon.setIcon(new ImageIcon(tempImage));
        name.setText(item.getName());
        price.setText("Price: " + Integer.toString(item.getPrice()) + "€");
        price.setForeground(Color.blue);
 
        return this;
    }
}
