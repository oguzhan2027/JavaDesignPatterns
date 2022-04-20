/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cretional.prototype;

/**
 *
 * @author Oguzhan
 */
public class Kategori implements Cloneable {
    private Long id;
    private String adi;

    public Kategori() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    @Override
    public String toString() {
        return adi;
    }

    @Override
    protected Kategori clone() throws CloneNotSupportedException {
        return (Kategori) super.clone(); 
    }
    
    
}
