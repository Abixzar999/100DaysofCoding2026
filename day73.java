import java.util.Scanner;
public class days73 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int pilihan; 

        // Memulai perulangan do while
        do {
             // Menampilkan daftar menu
            System.out.println("\n===== MENU =====");
            System.out.println("1. Lihat Profil");
            System.out.println("2. Tentang Program");
            System.out.println("3. Keluar");

            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
        
            if (pilihan == 1) {
                System.out.println("Nama: Abizar");
            } else if (pilihan == 2) {
                System.out.println("Program latihan Java.");
            } else if (pilihan == 3) {
                System.out.println("Terima kasih!");
            } else {
                System.out.println("Pilihan tidak tersedia!");
            }

        // Perulangan akan terus berjalan selama pilihan bukan 3
        } while (pilihan != 3);
    
        // Latihan: do while: Membuat Menu Berulang
    }
}
