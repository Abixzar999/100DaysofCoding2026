import java.util.Scanner;
public class days74 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // Memasukkan nama
        System.out.print("Masukkan nama : ");
        String nama = input.nextLine();

        // Menghitung jumlah karakter
        System.out.println("Panjang nama : " + nama.length());
        // Mengubah semua huruf menjadi kapital
        System.out.println("Huruf kapital : " + nama.toUpperCase());
        // Mengubah semua huruf menjadi kecil
        System.out.println("Huruf kecil : " + nama.toLowerCase());
        
        // Method String Dasar (length(), toUpperCase(), toLowerCase()).
    }
}
