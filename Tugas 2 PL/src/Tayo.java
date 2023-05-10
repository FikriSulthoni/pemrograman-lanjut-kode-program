public class Tayo {

    String warna = "Biru";
    String plat = "BM 1234 TIF";
    int jumlahroda = 6;
    int kecepatan = 60;
    int waktu = 2;

    void detailkendaraan(){

        System.out.println("**| Detail Kendaraan |**");
        System.out.println("Warna Mobil : " + warna);
        System.out.println("No. Plat : " + plat);
        System.out.println("Jumlah Roda : " + jumlahroda);
        System.out.println("Kecepatan Kendaraan : " + kecepatan + " km/jam");
        System.out.println("Waktu Tempuh Kendaraan : " + waktu + " jam");
    }

    void jaraktempuh(){

        int jarak = kecepatan * waktu;
        System.out.println("Jarak tempuh yang dilalui oleh kendaraan : " + jarak + " km/jam");
    }
}
