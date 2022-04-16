/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package abstractfactory;

/**
 *
 * @author Oguzhan
 */
public interface TelefonFactory {
    Telefon getTelefon(String model,String batarya,int en,int boy);
    
}
