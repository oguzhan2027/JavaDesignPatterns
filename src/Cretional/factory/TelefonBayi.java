/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cretional.factory;

/**
 *
 * @author Oguzhan
 */
public class TelefonBayi {
    public static void main(String[] args){
       Telefon S8= TelefonFabrikasi.getTelefon("S8", "2600mh", 4, 7);
       Telefon Note8= TelefonFabrikasi.getTelefon("Note8", "3000mh", 5, 8);
       
        System.out.println("S8 için telefon özellikleri: ");
        System.out.println(S8);
        
        System.out.println("Note8 için telefon özellikleri: ");
        System.out.println(Note8);
        
        
    }
    
}
