/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structural.adapter;

/**
 *
 * @author Oguzhan
 */
public class TelefonEEAAdapter implements ElektrikliEvAletleri{

    private Telefon telefon;

    public TelefonEEAAdapter(Telefon telefon) {
        this.telefon = telefon;
    }
    
    
    @Override
    public int prizeTakVeCalistir() {
        return telefon.sarjEt();
    }
    
}
