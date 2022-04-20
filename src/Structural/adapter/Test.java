/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structural.adapter;

/**
 *
 * @author Oguzhan
 */
public class Test {
    public static void main(String[] args) {
        
        Priz priz = new Priz();
        Utu utu= new Utu();
        Buzdolabı buzdolabı = new Buzdolabı();
        SamsungTelefon samsungTelefon = new SamsungTelefon();
        TelefonEEAAdapter adapter = new TelefonEEAAdapter(samsungTelefon);
        
        priz.elektrikVer(utu);
        priz.elektrikVer(buzdolabı);
        priz.elektrikVer(adapter);
        
    }
    
}
