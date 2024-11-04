/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;

/**
 *NAMA  : IMZY ZULIJAR SETIAWAN
 *NIM   : 23215022
 *PRODI : TEKNIK INFORMATIKA
 * 
 * ini untuk menampilkan rata rata nilai
 */
import java.util.Scanner;
public class rataratanilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Banyaknya Mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();  // Input jumlah mahasiswa
        
        double totalNilai = 0;  // Variabel untuk menyimpan total nilai

        // Loop untuk input nilai setiap mahasiswa
        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + ": ");
            double nilai = input.nextDouble();  // Input nilai mahasiswa
            totalNilai += nilai;  // Tambahkan nilai ke total
        }

        // Hitung rata-rata nilai
        double rataRata = totalNilai / jumlahMahasiswa;
        
        // Tampilkan hasil
        System.out.printf("Maka, Rata-rata Nilainya adalah %.1f%n", rataRata);
        System.out.println("Developed by : Rizki Adam Kurniawan");
    }
}
