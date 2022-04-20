/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cretional.singleton;

/**
 *
 * @author Oguzhan
 */
public class Singleton {

    private static Singleton singleton;

    private static int sayi = 0;

    private Singleton() {
        System.out.println("ben oluştum");
    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        sayi++;
        System.out.println(sayi);
        return singleton;
    }

}
