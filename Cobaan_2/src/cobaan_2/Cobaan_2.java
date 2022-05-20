/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobaan_2;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Cobaan_2 {
    public static void main(String[] args) {
        Scanner cobaan = new Scanner(System.in);
        
        int bilangan;
        
        System.out.print("Masukkan bilanngan = ");
        bilangan = cobaan.nextInt();
        
        if (bilangan%2==0){
            System.out.println("Ini bilangan genap");
        }else{
            System.out.println("Ini bilangan ganjil");
        }
    }
}
