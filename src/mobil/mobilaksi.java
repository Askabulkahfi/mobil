/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobil;

/**
 *
 * @author Mamed
 */
public class mobilaksi {
    public static void main(String[] args) {
        
        
        
        
        classmobil HRV = new classmobil();
        System.out.println("HRV");
        HRV.merk="honda";
        HRV.harga=150000000;
        HRV.jenis="SUV";
        HRV.type="E";
        HRV.warna="merah";
        HRV.cetakinfo();
        
        classmobil brio = new classmobil();
        System.out.println("brio");
        brio.merk="honda";
        brio.harga=100000000;
        brio.jenis="Sedan";
        brio.type="c";
        brio.warna="merah";
        brio.cetakinfo();
        
        classmobil jazz = new classmobil();
        System.out.println("jazz");
        jazz.merk="honda";
        jazz.harga=120000000;
        jazz.jenis="minicar";
        jazz.type="A";
        jazz.warna="putih";
        jazz.cetakinfo();        
    }
}
