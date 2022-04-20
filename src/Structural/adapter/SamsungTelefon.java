/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structural.adapter;

/**
 *
 * @author Oguzhan
 */
public class SamsungTelefon implements Telefon{

    private int calismaVoltaji;
    
    public SamsungTelefon(){
        calismaVoltaji=5;
    }
    
    @Override
    public int sarjEt() {
        System.out.println("Samsung Telefon çalışıyor...");
        return calismaVoltaji;
    }
    
}
