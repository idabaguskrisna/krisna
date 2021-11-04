public class Anggota {
    String noAnggota;
    String nama;
    String telpon;
    String alamat;
    String periode;

    Anggota(String nama, String noAnggota, String periode){
        this.nama = nama;
        this.noAnggota = noAnggota;
        this.periode = periode;
    }
    
    Anggota(String nama, String noAnggota){
        this.nama = nama;
        this.noAnggota = noAnggota;
    }

    void display(){
        System.out.println("Nama: "+ this.nama + "\nNo Anggota: "+ this.noAnggota);
    }

    void melihatJadwal(){
        System.out.println("melihat jadwal");
    }

    void melihatPekerjaan(){
        System.out.println("melihat pekerjaan");
    }

    void melihatLaporan(){
        System.out.println("melihat laporan");
    }

    void melihatAnggaran(){
        System.out.println("melihat anggaran");
    }

    void melihatAnggota(){
        System.out.println("melihat anggota");
    }

    void melihatKegiatan(){
        System.out.println("melihat kegiatan");
    }
}