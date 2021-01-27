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
public class NonVoid {
    String Nama, Lahir, Kelamin, Alamat, Darah, Kelurahan, Kecamatan, Agama, Perkawinan, Pekerjaan, Kewarganegaraan;
    int NIK, Rt,Rw;
    
    void input(){
        System.out.println("Kartu Tanda Penduduk");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nama : ");
      Nama = sc.nextLine();
      System.out.print("Lahir : ");
      Lahir = sc.nextLine();
      System.out.print("Jenis Kelamin : ");
      Kelamin = sc.nextLine();
      System.out.print("Alamat : ");
      Alamat = sc.nextLine();
      System.out.print("Gol Darah : ");
      Darah = sc.nextLine();
      System.out.print("Kelurahan : ");
      Kelurahan = sc.nextLine();
      System.out.print("Kecamatan : ");
      Kecamatan = sc.nextLine();
      System.out.print("Agama : ");
      Agama = sc.nextLine();
      System.out.print("Status Perkawinan : ");
      Perkawinan = sc.nextLine();
      System.out.print("Pekerjaan : ");
      Pekerjaan = sc.nextLine();
      System.out.print("Kewarganegaraan : ");
      Kewarganegaraan = sc.nextLine();
       System.out.print("NIK : ");
      NIK=sc.nextInt();
      System.out.print("Rt : ");
      Rt = sc.nextInt();
      System.out.print("Rw : ");
      Rw = sc.nextInt();
      
      
    }
  String a(){
      return Nama;
  }
  String b(){
      return Lahir;
  }
  String c(){
      return Kelamin;
  }
  String d(){
      return Alamat;
  }
  String e(){
      return Darah;
  }
  String f(){
      return Kelurahan;
  }
  String g(){
      return Kecamatan;
  }
  String h(){
      return Agama;
  }
  String i(){
      return Perkawinan;
  }
  String j(){
      return Pekerjaan;
  }
  String k(){
      return Kewarganegaraan;
  }
  int l(){
      return NIK;
  }
  int m(){
      return Rt;
  }
  int n(){
      return Rw;
  }
}
