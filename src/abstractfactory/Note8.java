/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;



/**
 *
 * @author Oguzhan
 */
public class Note8 implements Telefon {
    private String model;
    private String batarya;
    private int en;
    private int boy;

    public Note8(String model, String batarya, int en, int boy) {
        this.model = model;
        this.batarya = batarya;
        this.en = en;
        this.boy = boy;
    }
    
    

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getBatarya() {
        return batarya;
    }

    @Override
    public int getEn() {
        return en;
    }

    @Override
    public int getBoy() {
        return boy;
    }

    @Override
    public String toString() {
        return "Note8{" + "model=" + model + ", batarya=" + batarya + ", en=" + en + ", boy=" + boy + '}';
    }
    
    
    
    
    
}
