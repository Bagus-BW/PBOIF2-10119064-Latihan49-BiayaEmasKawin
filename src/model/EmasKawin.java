/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini merupakan program untuk menghitung total harga
 * dari mas kawin yang dibeli
 */
public class EmasKawin {
    private double totalGram;
    private double hargaPerGram;
    
    public EmasKawin(double totalGram, double hargaPerGram){
        this.totalGram = totalGram;
        this.hargaPerGram = hargaPerGram;
    }

    public double getTotalGram() {
        return totalGram;
    }

    public double getHargaPerGram() {
        return hargaPerGram;
    }
    
    private double totalBayar(double totalGram, double hargaPerGram){
        return totalGram * hargaPerGram;
    }
    
    public void tampil(double totalGram, double hargaPerGram){
        System.out.println("=====Program Biaya Emas=====");
        System.out.println("Total Mas Kawin : " + totalGram);
        System.out.printf("Harga Mas Kawin Per Gram : Rp. " + "%.0f\n", hargaPerGram);
        System.out.printf("Total Mas Kawin Yang Harus Dibayar : Rp. " + "%.0f\n", totalBayar(totalGram, hargaPerGram));
    }
}
