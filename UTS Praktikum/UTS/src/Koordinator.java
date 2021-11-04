public class Koordinator extends Panitia {
    Koordinator(String noAnggota, String nama, String periode) {
        super(noAnggota, nama, periode);
        //TODO Auto-generated constructor stub
    }
    void membuatLaporan(){
        System.out.println("membuat laporan");
    }
    void menghapusLaporan(){
        System.out.println("menghapus laporan");
    }
    void membuatPekerjaan(){
        System.out.println("membuat pekerjaan");
    }
    void menghapusPekerjaan(){
        System.out.println("menghapus pekerjaan");
    }
    void membuatJadwal(){
        System.out.println("membuat jadwal");
    }
    void menghapusJadwal(){
        System.out.println("menghapus jadwal");
    }
}
