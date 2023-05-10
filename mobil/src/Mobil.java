public class Mobil {

    String type = "E";
    int Jlhroda = 8;
    int TahunProduksi;
    String warna;
    String noPolisi;

    Mobil() {

        type = "Tidak teridentifikasi";
        noPolisi = "Tidak teridentifikasi";
        System.out.println(type +" "+ noPolisi);
    }
    Mobil(String tipe , String nopol, int produksi ){

        type = tipe;
        noPolisi = nopol;
        TahunProduksi = produksi;

        System.out.println(tipe +", " + nopol +", "+ produksi );

    }
}