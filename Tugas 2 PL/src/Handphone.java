public class Handphone {

    String merk;
    String brand;
    String proc;
    String estimasi;
    String informasiToko;
    String garansi;

    int tahunProduksi;
    int harga;
    int stok;


    Handphone(){
        merk = "Poco X3 NFC";
        brand = "Xiaomi";
        proc = "Snapdragon 732";
        tahunProduksi = 2020;
        harga = 3000000;
        stok = 3;
        estimasi = "Pengiriman 1 minggu";
        informasiToko = "Dijual dan dikirim oleh NAFMAF, Jawa Tengah";
        garansi = "15 Months Local Authorized Service Center Warranty";
    }

    Handphone(int x, int y){
        System.out.println(x+y);
    }

    void detail () {
        System.out.println("---Info Handphone---");
        System.out.println("Merk HP = " + merk);
        System.out.println("Brand = " + brand);
        System.out.println("Proccessor = " + proc);
        System.out.println("Tahun Produksi = " + tahunProduksi);
    }

    void infoToko(){
        System.out.println("---Toko---");
        System.out.println("Informasi Toko = " + informasiToko);
        System.out.println("Garansi = " +garansi);
    }

    void pembelian(){
        System.out.println("---Info Pemesanan---");
        System.out.println("Merk = " + merk);
        System.out.println("Harga = " + harga);
        System.out.println("Stok = " + stok);
        System.out.println("Estimasi = " + estimasi);
    }
}

    class DemoHandphone{
        public static void main (String[] args){

            Handphone hp = new Handphone();

            hp.detail();
            hp.infoToko();
            hp.pembelian();
        }
}



