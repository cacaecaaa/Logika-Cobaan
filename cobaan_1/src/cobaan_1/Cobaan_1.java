/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobaan_1;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Cobaan_1 {
    public static void main(String[] args) {
    Scanner cobaan = new Scanner(System.in);
    
    int bilangan_1, bilangan_2;
    
        System.out.print("Masukkan Bilangan 1 = ");
        bilangan_1 = cobaan.nextInt();
        
        System.out.print("Masukkan Bilangan 2 = ");
        bilangan_2 = cobaan.nextInt();
        
        if (bilangan_1 > bilangan_2){
            System.out.print("Bilangan yang lebih besar = "+bilangan_2);
        }else {
            System.out.print("Bilangan yang lebih besar = "+bilangan_2);
        }
    }   
}
