/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg10118080.latihan5.kambingglobal;

/**
 *
 * @author 
 * Nama :Taufiq Rizky
 * NIM  :10118080
 * Deskripsi Program    : program menampilkan jumlah kambing dengan variable global
 */
public class PBO10118080Latihan5KambingGlobal {
   int jmlKambing=85;
    public void tambahKambing(){
        
        jmlKambing = jmlKambing +5;
        System.out.println("Jumlah kambing setelah ditambah : "+jmlKambing);
    }
     public void getJumlahKambing(){
         System.out.println("Jumlah Kambing"+jmlKambing );
     }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PBO10118080Latihan5KambingGlobal kambingSusu = new PBO10118080Latihan5KambingGlobal();
        
        kambingSusu.getJumlahKambing();
        kambingSusu.tambahKambing();
        kambingSusu.getJumlahKambing();
    }
    
}
