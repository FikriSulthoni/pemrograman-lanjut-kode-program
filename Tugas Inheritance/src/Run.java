import java.time.*;

public class Run {

    public static void main(String[] args) {
        // contoh obyek data pegawai
        Pegawai p1 = new Pegawai("P01", "Fahri Saputra", 2, LocalDate.of(1994, 9, 1));
        p1.printPegawai();

        // contoh obyek data pegawai dosen
        Dosen p2 = new Dosen("P02", "Karina Fitri", 1, LocalDate.of(1999, 9, 17), "8888");
        p2.printPegawai();

        // contoh obyek data pegawai nondosen
        NonDosen p3 = new NonDosen("P03", "Muhammad Sumbul", 1, LocalDate.of(1967, 1, 25));
        p3.printPegawai();
    }

}