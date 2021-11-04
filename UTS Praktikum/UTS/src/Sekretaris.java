public class Sekretaris extends Perangkat {
    Sekretaris(String noAnggota, String nama, String periode) {
        super(noAnggota, nama, periode);
        //TODO Auto-generated constructor stub
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
    void menambahAnggota(){
        System.out.println("menambah anggota");
    }
    void menghapusAnggota(){
        System.out.println("menghapus anggota");
    }
    void menambahKegiatan(){
        System.out.println("menambah kegiatan");
    }
    void menghapusKegiatan(){
        System.out.println("menghapus Kegiatan");
    }
}
