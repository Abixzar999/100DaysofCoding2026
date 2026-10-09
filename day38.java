import java.util.Scanner;
public class days38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menampilkan menu
        System.out.println("==== Menu pilihan ====");
        System.out.println("1. Mie ayam");
        System.out.println("2. Nasi goreng");
        System.out.println("3. Mie goreng");
        System.out.println("4. Bakso");

        // Memasukkan input atau memilih pilihan menu
        System.out.print("Mau makan apa? : ");
        int pilih = input.nextInt();

        // Memeriksa pilihan
        if (pilih == 1) {
            System.out.println("Mie ayam");
        } else if (pilih == 2) {
            System.out.println("Nasi goreng");
        } else if (pilih == 3) {
            System.out.println("Mie goreng");
        } else if (pilih == 4) {
            System.out.println("Bakso");
        } else {
            System.out.println("Maaf yh menu cuma ada 4 pilihan");
        }

        // Latihan: Membuat Menu menggunakan if
    }
}
