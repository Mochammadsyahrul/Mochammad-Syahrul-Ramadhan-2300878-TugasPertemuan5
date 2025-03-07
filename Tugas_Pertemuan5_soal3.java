package Tugas_Tugas;
import java.util.Scanner;

public class Tugas_Pertemuan5_soal3 {
    public static void myMethod(int x) {
        if (x < 1 || x > 1000) {
            System.out.println("Nilai N harus antara 1 hingga 1000.");
            return;
        }
        
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner soal_3 = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N (1 - 1000): ");
        int x = soal_3.nextInt();
        
        myMethod(x);
    }
}
