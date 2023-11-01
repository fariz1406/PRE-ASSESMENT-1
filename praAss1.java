package Latihan;

import java.util.Scanner ;
    public class praAss1 {
        public static void main(String[] args){
            Scanner masuk = new Scanner(System.in);
            int angka1,angka2,angka3;
            angka1 = masuk.nextInt();
            angka2 = masuk.nextInt();
            angka3 = masuk.nextInt();

            enkripsi(angka1);
            enkripsi(angka2);
            enkripsi(angka3);
        
        }
        private static void enkripsi(int angka) {
            String konversi = String.valueOf(angka);
            int digit1 = 
        Integer.valueOf(konversi.substring(0, 1));
            int digit2 = 
        Integer.valueOf(konversi.substring(1, 2));
            int digit3 =
        Integer.valueOf(konversi.substring(2, 3));
            int digit4 = 
        Integer.valueOf(konversi.substring(3, 4));

            int hasilDigit1 = konversi(digit1);
            int hasilDigit2 = konversi(digit2);
            int hasilDigit3 = konversi(digit3);
            int hasilDigit4 = konversi(digit4);
        System.out.printf("%d%d%d%d\n" , hasilDigit1 , hasilDigit4 , hasilDigit3 , hasilDigit2);
        }
        private static int konversi(int digit) {
            int jumlah = (digit + 5) % 10;
            return jumlah;
        }
    }