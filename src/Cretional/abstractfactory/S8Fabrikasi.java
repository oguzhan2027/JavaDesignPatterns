/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cretional.abstractfactory;

/**
 *
 * @author Oguzhan
 */
public class S8Fabrikasi implements TelefonFactory{

    @Override
    public Telefon getTelefon(String model, String batarya, int en, int boy) {
        return new S8(model,batarya,en,boy);
    }
    
}
