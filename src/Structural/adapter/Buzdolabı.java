/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structural.adapter;

/**
 *
 * @author Oguzhan
 */
public class Buzdolabı implements ElektrikliEvAletleri{

    private int volt;

    public Buzdolabı() {
        this.volt=220;
    }
    @Override
    public int prizeTakVeCalistir() {
        System.out.println("Buzdolabı calışıyor...");
        return volt;
    }
    
}
