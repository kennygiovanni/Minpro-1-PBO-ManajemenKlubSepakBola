package com.mycompany.mini_project;

import java.util.Scanner;
import data_klub.Pemain;
import data_klub.Pelatih;
import operasional.Pertandingan;
import operasional.ManajemenKlub;

public class Mini_Project {

    public static void main(String[] args) {
        
      Scanner scanner = new Scanner (System.in);
      ManajemenKlub klub = new ManajemenKlub();
      int pilihan;
        
      System.out.println("=== SISTEM MANAJEMEN KLUB SEPAK BOLA ===");
      System.out.println("Selamat Datang, Manajer");
        
      do {
            System.out.println("=== MENU ===");
            System.out.println("1. Tambah Pemain");
            System.out.println("2. Lihat Semua Pemain");
            System.out.println("3. Hapus Pemain");
            System.out.println("4. Update Status Pemain");
            System.out.println("5. Tambah Pertandingan");
            System.out.println("6. Lihat Riwayat Pertandingan");
            System.out.println("7. Tambah Pelatih");
            System.out.println("8. Lihat Semua Pelatih");
            System.out.println("9. Keluar");
            System.out.print("Pilih Menu: ");
           
            
      while (!scanner.hasNextInt()) {
            System.out.println("Input harus angka. Silahkan coba lagi.");
            scanner.next();
        }
        pilihan = scanner.nextInt();
        scanner.nextLine();
        
      switch (pilihan){
        case 1:
            System.out.print("Nama Pemain: ");
            String namaPemain = scanner.nextLine();
            
            System.out.print("Posisi (GK/CB/LB/RB/CDM/CM/CAM/LW/RW/ST: ");
            String posisi = scanner.nextLine();
            
            System.out.print("Nomor Punggung (1-99): ");
            while (!scanner.hasNextInt()) {
                System.out.print("Harus berupa angka");
                scanner.next();
            }
            int nomor = scanner.nextInt();
            
            System.out.print("Usia: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Harus berupa angka");
                scanner.next();
            }
            int usia = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Status Kesehatan (Tersedia/Cedera): ");
            String status = scanner.nextLine();
            
            Pemain pemainBaru = new Pemain(namaPemain, posisi, nomor, usia, status);
            klub.tambahPemain(pemainBaru);
            System.out.println("Pemain Berhasil Ditambahkan");
            break;
        
        case 2:
            klub.tampilkanSemuaPemain();
            System.out.print("Tekan Enter untuk kembali ke menu.");
            scanner.nextLine();
            break;
        
        case 3:
            System.out.print("Masukkan Nama Pemain: ");
            String namaHapus = scanner.nextLine();
            klub.hapusPemain(namaHapus);
            System.out.println("Pemain Sudah Dihapus");
            break;
            
        case 4:
            System.out.print("Masukkan Nama Pemain: ");
            String namaUpdate = scanner.nextLine();
            System.out.print("Status Kesehatan Baru (Tersedia/Cedera: ");
            String statusBaru = scanner.nextLine();
            klub.updateStatusPemain(namaUpdate, statusBaru);
            System.out.println("Update Status Pemain Berhasil");
            break;
            
        case 5:
            System.out.print("Masukkan Nama Tim Lawan: ");
            String lawan = scanner.nextLine();
            
            System.out.print("Tanggal (dd-mm-yy): ");
            String tanggal = scanner.nextLine();
            
            System.out.print("Kompetisi: ");
            String kompetisi = scanner.nextLine();
            
            System.out.print("Skor Klub Kita: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Harus Berupa Angka ");
                scanner.next();
            }
            int skorKlub = scanner.nextInt();
            
            System.out.print("Skor Klub Lawan: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Harus Berupa Angka ");
                scanner.next();
            }
            int skorLawan = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Lokasi (Kandang/Tandang): ");
            String lokasi = scanner.nextLine();
            
            Pertandingan p = new Pertandingan(lawan, tanggal, kompetisi, skorKlub, skorLawan, lokasi);
            
            klub.tambahPertandingan(p);
            System.out.println("Pertandingan Berhasil Ditambahkan ");
            break;
            
        case 6:
            klub.tampilkanRiwayatPertandingan();
            System.out.print("Tekan Enter untuk kembali ke menu.");
            scanner.nextLine();
            break;
        
        case 7:
            System.out.print("Nama Pelatih: ");
            String namaPelatih = scanner.nextLine();
            
            System.out.print("Spesialisasi: ");
            String spesialisasi = scanner.nextLine();
            
            System.out.print("Pengalaman (tahun): ");
            while (!scanner.hasNextInt()) {
                System.out.print("Harus Berupa Angka ");
                scanner.next();
            }
            int pengalaman = scanner.nextInt();
            scanner.nextLine();
                    
            Pelatih pelatihBaru = new Pelatih(namaPelatih, spesialisasi, pengalaman);
            klub.tambahPelatih(pelatihBaru);
            System.out.println("Pelatih Berhasil Ditambahkan");
            break;
            
        case 8:
            klub.tampilkanSemuaPelatih();
            System.out.print("Tekan Enter untuk kembali ke menu.");
            scanner.nextLine();
            break;
            
        case 9:
            System.out.println("Sampai Jumpa");
            break;
            
        default:
            System.out.println("Pilihan Hanya 1-9");
        }
     } 
       while (pilihan != 9);
     scanner.close();
   }
}
    
            
        
            
            
        
            
                      

            
