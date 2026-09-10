package data_klub;

public class Pelatih {
    private String nama;
    private String spesialisasi;
    private int pengalaman;
    
    public Pelatih(String nama, String spesialisasi, int pengalaman) {
        setNama(nama);
        setSpesialisasi(spesialisasi);
        setPengalaman(pengalaman);
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getSpesialisasi(){
        return spesialisasi;
    }
    
    public int getPengalaman(){
        return pengalaman;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setSpesialisasi(String spesialisasi){
        this.spesialisasi = spesialisasi;
    }
    
    public void setPengalaman(int pengalaman){
        if (pengalaman >= 0 && pengalaman <= 50) {
            this.pengalaman = pengalaman;
        }
        else {
            this.pengalaman = 0;
            System.out.println("Tahun Pengalaman tidak valid, diset ke 0");
        }
    }

    public void tampilkanInfo() {
         System.out.println("Nama        :" + nama);
         System.out.println("Spesialisasi:" + spesialisasi);
         System.out.println("Pengalaman  :" + pengalaman + "tahun");
         System.out.println("--------------------------");
    }
}