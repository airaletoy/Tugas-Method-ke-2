/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Void {
    double r, t ;
    double hasil;
    
    void input(){
        System.out.println("Masukkan jari-jari dan tinggi kerucut terlebih dahulu ");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Jari-jari = ");
        r = sc.nextDouble();
        System.out.println("Tinggi = ");
        t = sc.nextDouble();
    }   
    void hitung(){
        hasil = 3.14*r*r*t/3;
        
    }
    void hasil(){
        System.out.println("Hasilnya yaitu = "+hasil);
    }
    }

