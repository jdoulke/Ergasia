/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jdoul
 */
public class Monitor {
    String company;
    String model;
    double value;
    int posotita;
    
    public Monitor(String company, String model, double value, int posotita){
        this.company = company;
        this.model = model;
        this.value = value;
        this.posotita = posotita;
    }
    
    public void setPosotitaM(int posotita){
        this.posotita = posotita;
    }
    
    public int getPosotitaM(){
        return posotita;
    }
}
