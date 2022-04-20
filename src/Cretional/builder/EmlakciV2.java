/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cretional.builder;

/**
 *
 * @author Oguzhan
 */
public class EmlakciV2 {
    public static void main(String[] args) {
       Ev ev1= EvBuilder.startNormalEvBuild("İstanbul","Ümraniye","tatlısu",2008,3)
                .setHasCocukParki(true)
                .setHasOtopark(true)
                .Build();
      
       Ev ev2= EvBuilder.startHavuzluEvBuild("İstanbul","Ataşehir","Atatürk",2010,4)
                .setHasCocukParki(true)
                .setHasOtopark(true)
                .Build();
                
        printEv(ev1); 
        printEv(ev2);   
        
            }
     public static void printEv(Ev ev){
        System.out.println();
        System.out.println("Ev eklendi :"+ ev );
        System.out.println();
    }
    
}
