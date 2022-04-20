/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cretional.prototype;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Oguzhan
 */
public class GenelEntityService {
    public BelgeTuru findBelgeTuruById(Long id){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(GenelEntityService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        BelgeTuru belgeTuru = new BelgeTuru();
        belgeTuru.setId(id);
        String adi;
        
        if(id.compareTo(1L)==0){
            adi="kişisel";
        }
        else if(id.compareTo(2L)==0){
            adi="kurumsal";
        }
        else{
            adi="Genel";
        }
        belgeTuru.setAdi(adi);
        return belgeTuru;
    }
    
     public Kategori findKategoriById(Long id){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(GenelEntityService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Kategori kategori = new Kategori();
        kategori.setId(id);
        
        String adi;
        if(id.compareTo(1L)==0){
            adi="özel";
        }
        else if(id.compareTo(2L)==0){
            adi="iş";
        }
        else{
            adi="Genel";
        }
        kategori.setAdi(adi);
        
        return kategori;
    }
    
       public Belge findBelgeById(Long id){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(GenelEntityService.class.getName()).log(Level.SEVERE, null, ex);
        }
        Belge belge = new Belge();
        belge.setId(id);
        belge.setBelgeTuru(findBelgeTuruById(id));
        belge.setKategori(findKategoriById(id));
        
        String adi;
        String veri;
        if(id.compareTo(1L)==0){
            adi="mektup";
            veri="sevgili dostum ahmet";
        }
        else if(id.compareTo(2L)==0){
            adi="rapor";
            veri="bu rapor genel müdüre verilmek üzere hazırlanmıştır";
        }
        else{
            adi="trafik kuralları";
            veri="Saga dönüşte yaya yol ver";
        }
        belge.setAdi(adi);
        belge.setVeri(veri);
        
        return belge;
        
       } 
    
}
