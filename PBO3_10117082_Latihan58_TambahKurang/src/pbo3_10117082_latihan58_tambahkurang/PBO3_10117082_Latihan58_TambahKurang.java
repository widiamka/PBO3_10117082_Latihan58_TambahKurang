/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan58_tambahkurang;

/**
 *
 * Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan hasil 
* penjumlahan dan hasil selisih dengan inputan yg sudah ditentukan dengan konsep
* inheritance
 */
public class PBO3_10117082_Latihan58_TambahKurang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JumlahBilangan jb = new JumlahBilangan();
        SelisihBilangan sb = new SelisihBilangan();

        jb.tampilHasilJumlah();
        sb.tampilHasilSelisih();
    }
    
}
