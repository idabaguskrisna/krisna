public class KetuaPanitia extends Panitia {
    
    KetuaPanitia(String nama, String noAnggota, String periode) {
        super(nama, noAnggota, periode);
        // TODO Auto-generated constructor stub
    }

    void display(){
        System.out.println("nama: "+ this.nama + "\nNo angota: "+ this.noAnggota + "\nPeriode: "+ this.periode);
    }    
    void menyetujuiAnggaran(){
        System.out.println("menyetujui anggran");
    }
    void menyetujuiPekerjaan(){
        System.out.println("menyetujui anggran");
    }
    void menyetujuiJadwal(){
        System.out.println("menyetujui anggran");
    }
}
