package Latihan;

import java.util.Scanner;

public class praAss3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int berat;
    double tinggi,hasil;

    System.out.print("masukkan Kelamin : ");
    String kelamin = input.nextLine();
    System.out.print("masukkan berat badan : ");
    berat = input.nextInt();
    System.out.print("masukkan tinggi badan : ");
    tinggi = input.nextDouble()/ 100;

    hasil = berat / (tinggi * tinggi);

    String kategori = "";



  switch (kelamin) {
    case "pria":
      if (hasil > 0 && hasil <= 20.50){
      kategori = ", kurus";
      }else if (hasil > 20.51 && hasil < 26.99){
      kategori = ", Ideal";
      }else if (hasil > 27){
      kategori = ", Gemuk";
    }
    break;
    case "wanita":
      if (hasil > 0 && hasil <= 18.50){
      kategori = ", kurus";
    }else if (hasil > 18.51 && hasil < 24.99){
      kategori = ", Ideal";
    }else if (hasil > 25){
      kategori = ", Gemuk";
    }
  }

  System.out.printf("%.2f, %s", hasil, kategori(kategori,hasil));

  }
  
}
