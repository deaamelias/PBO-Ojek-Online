public class grabfood {
    private String makanan;
    private int harga;
    private int total;
    private int ongkir = 2000;

    grabfood(String makanan1, int harga1){
        this.makanan = makanan1;
        this.harga = harga1;
        total = harga + ongkir;
    }

    void displaygrabfood(){
        System.out.println("Anda memilih : " + makanan);
        System.out.println("Total order : " + total);
    }
}
