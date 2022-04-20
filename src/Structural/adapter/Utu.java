/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structural.adapter;

/**
 *
 * @author Oguzhan
 */
public class Utu implements ElektrikliEvAletleri{

    private int volt;

    public Utu() {
        this.volt=220;
    }
    
    @Override
    public int prizeTakVeCalistir() {
        System.out.println("Utu calışıyor...");
        return volt;
    }
    
}
