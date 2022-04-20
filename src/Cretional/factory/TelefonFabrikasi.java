/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cretional.factory;

/**
 *
 * @author Oguzhan
 */
public class TelefonFabrikasi {
    
    public static Telefon getTelefon(String model, String batarya,int en,int boy){
        Telefon telefon;
        if("S8".equalsIgnoreCase(model)){
            telefon = new S8(model,batarya,en,boy);
        }
        else if("Note8".equalsIgnoreCase(model)){
             telefon = new Note8(model,batarya,en,boy);
        }
        else{
            throw new RuntimeException("Geçerli bir model değildir");
        }
        return telefon;
    }
    
}
