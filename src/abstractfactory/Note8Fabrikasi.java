/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

/**
 *
 * @author Oguzhan
 */
public class Note8Fabrikasi implements TelefonFactory{

    @Override
    public Telefon getTelefon(String model, String batarya, int en, int boy) {
         return new Note8(model,batarya,en,boy);
    }
    
}
