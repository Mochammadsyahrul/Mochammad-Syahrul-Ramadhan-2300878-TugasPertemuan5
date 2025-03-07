package Tugas_Tugas;

import java.util.Scanner;

public class Tugas_Pertemuan5_soal2 {
    public static boolean prima(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }   
    public static void cetakBilanganPrima(int awal, int akhir) {
        for (int i = awal; i <= akhir; i++) {
            if (prima(i)) {
                System.out.print(i + " ");
            }
        }
    } 
    public static void cetakBilanganKomposit(int awal, int akhir) {
        for (int i = awal; i <= akhir; i++) {
            if (!prima(i) && i > 1) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner soal_2 = new Scanner(System.in);
        
        System.out.print("Masukkan batas awal: ");
        int batasAwal = soal_2.nextInt();
        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = soal_2.nextInt();
        
        if (batasAwal < 1 || batasAkhir > 100 || batasAwal > batasAkhir) {
            System.out.println("Batas tidak valid. Masukkan angka antara 1 hingga 100 dengan batas awal <= batas akhir.");
            return;
        }
        
        System.out.print("Bilangan prima: ");
        cetakBilanganPrima(batasAwal, batasAkhir);
        
        System.out.print("\nBilangan komposit: ");
        cetakBilanganKomposit(batasAwal, batasAkhir);
    }
}
