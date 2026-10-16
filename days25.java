import java.util.Scanner;

public class days45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // Menampilkan daftar menu makanan
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Bakso");
        System.out.println("Pilih salah satu Menu 1-3 mau makan apa?\n");

        // Memasukkan pilihan menu
        System.out.print("Silahkan pilih : ");
        int pilih = input.nextInt();


        // Memeriksa pilihan menggunakan switch
        switch (pilih) {
            case 1 :
            System.out.println("Nasi Goreng");
            break; // Menghentikan switch

            case 2 :
            System.out.println("Mie Ayam");
            break;

            case 3 :
            System.out.println("Bakso");
            break;

            default : // Dijalankan jika pilihan bukan 1, 2, atau 3
            System.out.println("Hanya ada 3 menu");

            // Percabangan (switch-case)

        }

    }
}
