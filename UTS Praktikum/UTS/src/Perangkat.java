public class Perangkat extends Anggota {
    // String periode;
    String tanggalMenjabat;
    String tanggalSelesai;
    
    Perangkat(String nama, String noAnggota, String periode) {
        super(nama, noAnggota, periode);
        //TODO Auto-generated constructor stub
    }
    Perangkat(String nama, String noAnggota) {
        super(nama, noAnggota);
        //TODO Auto-generated constructor stub
    }
    void membuatLaporan(){
        System.out.println("membuat laporan");
    }         
    void menghapusLaporan(){
        System.out.println("menghapus laporan");
    }         
}