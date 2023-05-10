public class Method {
    String matkul = "Pemrograman Lanjut";

    void tampil(){
        System.out.println("Welcome..!");
    }

    void detail(String matakuliah) {
        matkul = matakuliah;

        System.out.println("Matakuliah " + matakuliah);
    }
}
