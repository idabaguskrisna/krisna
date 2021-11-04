public class App {
    public static void main(String[] args) throws Exception {
        // a. 1 instance yang hanya anggota (isikan nama dan noAnggota)
        Anggota ida = new Anggota("ida", "01");
        ida.display();
        System.out.println("#################################");
        // b. 1 instance ketua pengurus (isikan nama, noAnggota dan periode kepengurusan)
        Ketua bagus = new Ketua("bagus", "02", "2019 / 2020");
        bagus.display();
        
        System.out.println("#################################");
        // c. 1 instance ketua panitia (isikan nama, noAnggota dan periode kepengurusan)
        KetuaPanitia krisna = new KetuaPanitia("krisna", "03", "2020 / 2021");
        krisna.display();
    }
}