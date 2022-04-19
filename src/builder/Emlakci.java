/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

/**
 *
 * @author Oguzhan
 */
public class Emlakci {
    
    public static void main(String[] args) {
        Ev ev1 = new Ev();
        ev1.setIl("İstanbul");
        ev1.setIlce("Ataşehir");
        ev1.setMahalle("Atatürk");
        ev1.setOdaSayisi(3);
        ev1.setBinaYili(2010);
        ev1.setHasKlima(true);
        
       
        Ev ev2 = new Ev("İstanbul", "Ümraniye", "Tatlısu", 2008, 2, 3, 2, 0, false,
                false, true, true, true, false);

        printEv(ev1);

        printEv(ev2);
        
    }
    public static void printEv(Ev ev){
        System.out.println();
        System.out.println("Ev eklendi :"+ ev );
        System.out.println();
    }
    
}
