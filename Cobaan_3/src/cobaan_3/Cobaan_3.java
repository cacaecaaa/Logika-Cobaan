/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobaan_3;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Cobaan_3 {
    public static void main(String[] args) {
    Scanner cobaan = new Scanner(System.in);
    int angka;
    int jumlah = 0;
    
    System.out.println("Masukkan nilai = "); 
    angka = cobaan.nextInt();
    
    for (int b = 1; b <= angka; b++){
        jumlah += b;
        System.out.println("Hasil "+jumlah);
    }
  }
}
