/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan49.biayaemaskawin;

import model.EmasKawin;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini merupakan program untuk menghitung total harga
 * dari mas kawin yang dibeli
 */
public class PBOIF210119064Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EmasKawin emasKawin = new EmasKawin(15.7, 570000);
        
        emasKawin.tampil(emasKawin.getTotalGram(), emasKawin.getHargaPerGram());
    }
    
}
