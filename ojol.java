import java.util.Scanner;

public class ojol {
    private String username;
    private int password;

    public static void main(String[] args){
        String user = "deamelyaa";
        int pass = 1234;

        class user {
            String username;
            String no_hp;

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public String getNo_hp() {
                return no_hp;
            }

            public void setNo_hp(String no_hp) {
                this.no_hp = no_hp;
            }
        }

        user Dea = new user();
        Dea.setUsername("Dea");
        Dea.setNo_hp("08123456789");

        Scanner input = new Scanner(System.in);
        System.out.println("================================");
        System.out.println("         Selamat Datang");
        System.out.println("          Program Grab");
        System.out.println("================================");
        System.out.print("Masukkan username : ");
        String username = input.nextLine();
        System.out.print("\nMasukkan password : ");
        int password = input.nextInt();

        int menu;

        if(username.equals(user) && password==pass){
            System.out.println("\nUsername : " + Dea.getUsername());
            System.out.println("No. Hp : " + Dea.getNo_hp());
            do {
                System.out.println("\nMENU");
                System.out.println("1. Food");
                System.out.println("2. Ride");
                System.out.println("3. Send");
                System.out.println("0. Exit");
                System.out.print("\nMasukkan pilihan : ");
                menu = input.nextInt();

                switch(menu){
                    case 1:
                        System.out.println("\n GRAB FOOD");
                        System.out.println("1. Ayam Geprek           Rp. 14.000");
                        System.out.println("2. Nasi Goreng           Rp. 14.000");
                        System.out.println("3. Bakso                 Rp. 10.000");
                        System.out.println("4. Soto Ayam             Rp. 7.000");
                        System.out.println("5. Nasi Ayam Rica-Rica   Rp. 14.000");
                        System.out.print("\n Masukkan pilihan : ");
                        int menu1=input.nextInt();

                        if(menu1 == 1){
                            grabfood pil1 = new grabfood("Ayam Geprek", 14000);
                            pil1.displaygrabfood();
                            break;
                        } else if (menu1 == 2) {
                            grabfood pil2 = new grabfood("Nasi Goreng", 14000);
                            pil2.displaygrabfood();
                            break;
                        } else if (menu1 == 3) {
                            grabfood pil3 = new grabfood("Bakso", 10000);
                            pil3.displaygrabfood();
                            break;
                        }
                        else if (menu1 == 4){
                            grabfood pil4 = new grabfood("Soto Ayam", 7000);
                            pil4.displaygrabfood();
                            break;
                        } else if (menu1 == 5) {
                            grabfood pil5 = new grabfood("Nasi Ayam Rica-Rica", 14000);
                            pil5.displaygrabfood();
                            break;
                        }
                        break;

                    case 2:
                        System.out.println("\n GRAB RIDE");
                        System.out.println("1. Bantul - Sleman");
                        System.out.println("2. Bantul - Gunung Kidul");
                        System.out.println("3. Bantul - Kulon Progo");
                        System.out.println("4. Bantul - Kota Yogyakarta");
                        System.out.println("5. Sleman - Gunung Kidul");
                        System.out.println("6. Sleman - Kulon Progo");
                        System.out.println("7. Sleman - Kota Yogyakarta");
                        System.out.println("8. Gunung Kidul - Kulon Progo");
                        System.out.println("9. Gunung Kidul - Kota Yogyakarta");
                        System.out.println("10. Kulon Progo - Kota Yogyakarta");
                        System.out.print("\n Masukkan pilihan : ");
                        int menu2=input.nextInt();
                        switch (menu2){
                            case 1:
                                grabride pil1 = new grabride("Bantul", "Sleman", 2000, 22);
                                pil1.displaygrabride();
                                break;
                            case 2:
                                grabride pil2 = new grabride("Bantul", "Gunung Kidul", 2000, 50 );
                                pil2.displaygrabride();
                                break;
                            case 3:
                                grabride pil3 = new grabride("Bantul", "Kulon Progo", 2000, 30);
                                pil3.displaygrabride();
                                break;
                            case 4:
                                grabride pil4 = new grabride("Bantul", "Kota Yogyakarta", 2000, 12);
                                pil4.displaygrabride();
                                break;
                            case 5:
                                grabride pil5 = new grabride("Sleman", "Gunung Kidul", 2000, 56);
                                pil5.displaygrabride();
                                break;
                            case 6:
                                grabride pil6 = new grabride("Sleman", "Kulon Progo", 2000, 37);
                                pil6.displaygrabride();
                                break;
                            case 7:
                                grabride pil7 = new grabride("Sleman", "Kota Yogyakarta", 2000, 13);
                                pil7.displaygrabride();
                                break;
                            case 8:
                                grabride pil8 = new grabride("Gunung Kidul", "Kulon Progo", 2000, 78);
                                pil8.displaygrabride();
                                break;
                            case 9:
                                grabride pil9 = new grabride("Gunung Kidul", "Kota Yogyakarta", 2000, 49);
                                pil9.displaygrabride();
                                break;
                            case 10:
                                grabride pil10 = new grabride("Kulon Progo", "Kota Yogyakarta", 2000, 28);
                                pil10.displaygrabride();
                                break;
                        }
                        break;

                    case 3:
                        System.out.println("\n GRAB SEND");
                        System.out.println("1. Bahan kain");
                        System.out.println("2. Bahan kaca");
                        System.out.println("3. Bahan plastik");
                        System.out.print("\n Masukkan pilihan : ");
                        int menu3=input.nextInt();

                        switch (menu3){
                            case 1:
                                grabsend pil1 = new grabsend("Bahan kain", 5.3, 1.2);
                                pil1.displaygrabsend();
                                break;
                            case 2:
                                grabsend pil2 = new grabsend("Bahan kaca", 12.8, 21.9);
                                pil2.displaygrabsend();
                                break;
                            case 3:
                                grabsend pil3 = new grabsend("Bahan plastik", 4.7, 7.9);
                                pil3.displaygrabsend();
                                break;
                        }
                        break;
                }
            } while (menu != 0);

        }
        else {
            System.out.println("\n Username atau password anda salah");
        }
    }
}
