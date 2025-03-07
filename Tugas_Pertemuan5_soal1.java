package Tugas_Tugas;
import java.util.Scanner;

public class Tugas_Pertemuan5_soal1 {
    public static void myMethod(int angka) {
        if (angka >= 1000 && angka <= 9999) {
            System.out.println("Bilangan " + angka + " Merupakan Ribuan");
        } else {
            System.out.println("Bilangan " + angka + " Bukan Merupakan Ribuan");
        }
    }
    public static void main(String[] args) {
        Scanner soal_1 = new Scanner(System.in);
        int jumlahBilangan = 3;
        
        for (int i = 1; i <= jumlahBilangan; i++) {
            System.out.print("Masukkan Bilangan Ke-" + i + " : ");
            int angka = soal_1.nextInt();
            myMethod(angka);
        }
        
    }
}
