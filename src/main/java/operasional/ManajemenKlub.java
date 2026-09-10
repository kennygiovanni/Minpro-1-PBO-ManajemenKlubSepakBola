package operasional;

import java.util.ArrayList;
import data_klub.Pemain;
import data_klub.Pelatih;

public class ManajemenKlub {
    private ArrayList<Pemain> daftarPemain;
    private ArrayList<Pelatih> daftarPelatih;
    private ArrayList<Pertandingan> daftarPertandingan;
    
    public ManajemenKlub() {
        daftarPemain = new ArrayList<Pemain>();
        daftarPelatih = new ArrayList<Pelatih>();
        daftarPertandingan = new ArrayList<Pertandingan>();
        
    }
    
    public void tambahPemain(Pemain p) {
        daftarPemain.add(p);
    }
    
    public void tampilkanSemuaPemain(){
        if (daftarPemain.isEmpty()){
            System.out.println("Belum Ada data pemain.");
            return;
        }
        System.out.println("=== DAFTAR PEMAIN ===");
        for (Pemain p : daftarPemain){
            p.tampilkanInfo();
        }
    }
    
    public void updateStatusPemain(String nama, String statusBaru){
        boolean ditemukan = false;
        for (Pemain p :daftarPemain){
            if (p.getNama().equalsIgnoreCase(nama)){
                p.setStatusKesehatan(statusBaru);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan){
            System.out.println("Pemain dengan nama tersebut tidak ada.");
        }
    }
    
    public void hapusPemain(String nama){
        Pemain ditemukan = null;
        for (Pemain p : daftarPemain){
            if (p.getNama().equalsIgnoreCase(nama)){
            ditemukan = p;
            break;
            }
        }
        if (ditemukan != null){
            daftarPemain.remove(ditemukan);
        }
        else {
            System.out.println("Pemain dengan nama tersebut tidak ada.");
        }
    }
    
    public void tambahPelatih(Pelatih p){
        daftarPelatih.add(p);
    }
    
    public void tampilkanSemuaPelatih(){
        if (daftarPelatih.isEmpty()){
            System.out.println("Belum ada data pelatih.");
            return;
        }
        System.out.println("=== DAFTAR PELATIH ===");
        for (Pelatih p : daftarPelatih){
            p.tampilkanInfo();
        }
    }
    
    public void tambahPertandingan(Pertandingan p){
        daftarPertandingan.add(p);
    }
    
    public void tampilkanRiwayatPertandingan(){
        if (daftarPertandingan.isEmpty()){
            System.out.println("Belum ada data pertandingan");
            return;
        }
        for (Pertandingan p : daftarPertandingan){
            p.tampilkanInfo();
        }
    }
    
    public ArrayList<Pemain> getDaftarPemain(){
        return daftarPemain;
    }
    
    public ArrayList<Pelatih> getDaftarPelatih(){
        return daftarPelatih;
    }
    
    public ArrayList<Pertandingan> grtanDaftarPertandingan(){
        return daftarPertandingan;
    }
}      