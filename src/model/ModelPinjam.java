/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ACE
 */
public class ModelPinjam {
    int id;
    String nama,barang;

    public void setId(int id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setBarang(String barang) {
        this.barang = barang;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getBarang() {
        return barang;
    }
    
    
}
