
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jdoul
 */
public class Monitor {
    String model;
    float value;
    int posotita;
    ImageIcon icon;
    
    public Monitor(String model, float value, int posotita, ImageIcon icon){
        this.model = model;
        this.value = value;
        this.posotita = posotita;
        this.icon = icon;
    }
    
    public void setPosotitaM(int posotita){
        this.posotita = posotita;
    }
    
    public int getPosotitaM(){
        return posotita;
    }
    public ImageIcon getIconM(){
        return icon;
    }
}
