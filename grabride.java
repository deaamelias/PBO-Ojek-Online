public class grabride {
    private String lokasi;
    private String tujuan;
    private int biaya;
    private int total, jarak;
    private int ongkir = 2000;

    grabride(String lokasi1, String tujuan1, int biaya1, int jarak1){
        this.lokasi = lokasi1;
        this.tujuan = tujuan1;
        this.biaya = biaya1;
        this.jarak = jarak1;
        total = (biaya*jarak) + ongkir;
    }

    void displaygrabride(){
        System.out.println("Lokasi anda : " + lokasi);
        System.out.println("Lokasi tujuan : " + tujuan);
        System.out.println("Biaya order : " + total);
    }
}
