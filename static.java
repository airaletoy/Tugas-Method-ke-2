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
public class statik {
    
    static void uhuy(){
     String jawab, nama, lahir, alamat;
     int  pilihan, TM, TP, tanggal;
     double uang;
     System.out.println("Selamat Datang di Primasema Golf Inside");
     System.out.println("Berikut merupakan pilihan tipe-tipe rumah");   
    
     Scanner sc = new Scanner(System.in);
     String[] kavling = {"A1", "A2", "B5", "C1", "C2", "C3"};
     int[] harga = {497000000, 485000000, 700000000, 450000000, 465000000, 485000000};
     
     for(int i=1; i < kavling.length; i++){
              System.out.println(i+". "+kavling[i]+" = Rp "+harga[i]);
            }  
              System.out.println("Tipe manakah yang anda ingin beli?");
              System.out.print("Jawab = ");
              pilihan = sc.nextInt();
              
              System.out.println("Total Pembayaran = "+harga[pilihan]);
              System.out.println("Apakah anda yakin ingin membeli rumah tersebut? (iya/tidak)");
              jawab = sc.next();
              
              
              if(jawab.equalsIgnoreCase("iya")){
                  boolean a = true;
                  while(a){
                     System.out.println("Masukkan uang anda = ");
                      uang = sc.nextDouble();
                      
                      System.out.println("Silahkan isi formulir ini! ");
                      System.out.println("---------------------------------");
                      System.out.print("Nama = ");
                      nama = sc.nextLine();
                      System.out.print("Tempat tanggal lahir = ");
                      lahir = sc.nextLine();
                      System.out.print("Alamat lengkap sesuai KTP = ");
                      alamat = sc.nextLine();
                      System.out.print("Nomor telepon rumah = ");
                      TM = sc.nextInt();
                      System.out.print("Nomor telepon pribadi = ");
                      TP = sc.nextInt();
                      System.out.print("Pembelian pada tanggal = ");
                      tanggal = sc.nextInt();
                      
                      System.out.println("Selanjutnya, untuk surat tanah dan lain-lain nya menyusul");
                      System.out.println("Terima kasih, anda sudah membeli rumah ini");
                      System.out.println("--- Semoga Harimu Menyenangkan --- ");
                           
                  }
              }else if (jawab.equalsIgnoreCase("tidak")){
                          System.out.println("Terima kasih atas kunjungan anda");  
    
}

    }
    }