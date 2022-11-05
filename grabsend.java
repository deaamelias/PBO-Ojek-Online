public class grabsend {
    private String nama;
    private double jarak,berat,biaya;

    grabsend(String nama1, double jarak1, double berat1){
        this.nama = nama1;
        this.jarak = jarak1;
        this.berat = berat1;
        biaya=(berat*2000)+(jarak*1000)+2000;
    }

    void displaygrabsend(){
        System.out.println("Nama barang : " + nama);
        System.out.println("Berat barang : " + berat + " kg");
        System.out.println("Jarak barang : " + jarak + " km");
        System.out.println("Biaya barang : " + biaya);
    }
}
