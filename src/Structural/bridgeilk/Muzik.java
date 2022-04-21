/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structural.bridgeilk;

/**
 *
 * @author Oguzhan
 */
public class Muzik {
    private String adi;
    private String ses;

    public Muzik(String adi, String ses) {
        this.adi = adi;
        this.ses = ses;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSes() {
        return ses;
    }

    public void setSes(String ses) {
        this.ses = ses;
    }

    @Override
    public String toString() {
        return adi;
    }
    
    
    
}
