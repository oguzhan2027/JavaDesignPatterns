/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structural.adapter;

/**
 *
 * @author Oguzhan
 */
public class Priz {
    public void elektrikVer(ElektrikliEvAletleri elektrikliEvAletleri){
        int volt = elektrikliEvAletleri.prizeTakVeCalistir();
        System.out.println("Prizden : "+volt+" volt alınıyor");
        
    }
    
}
