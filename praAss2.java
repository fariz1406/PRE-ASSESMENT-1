package Latihan;

import java.util.Scanner;

public class praAss2 {
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int angka1,angka2;
    angka1 = input.nextInt();
    angka2 = input.nextInt();

    String konversi = String.valueOf(angka1 + angka2);

    int baris1 = Integer.valueOf(konversi.substring(0,1));
    int baris2 = Integer.valueOf(konversi.substring(1,2));
    int baris3 = Integer.valueOf(konversi.substring(2,3));

    String lisan1 = lisan(baris1);
    String lisan2 = lisan(baris2);
    String lisan3 = lisan(baris3);

    System.out.printf("%s ratus %s puluh %s", lisan1 , lisan2 , lisan3);
}
private static String lisan (int angka) {
    String lisan ="";
    switch(angka){
        case 1:
        lisan = "satu";
        break;
        case 2:
        lisan = "dua";
        break;
        case 3:
        lisan = "tiga";
        break;
        case 4 :
        lisan = "empat";
        break;
        case 5:
        lisan = "lima";
        break;
        case 6:
        lisan = "enam";
        break;
        case 7:
        lisan ="tujuh";
        break;
        case 8:
        lisan = "delapan";
        break;
        case 9 :
        lisan ="sembilan";
        break;
    }
    return lisan;
}
}