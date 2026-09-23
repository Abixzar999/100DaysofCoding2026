import java.util.Scanner;
public class days22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Memasukkan nilai a
        System.out.print("Masukkan angka data a: ");
        int a = input.nextInt();

        // Memasukkan nilai b
        System.out.print("Masukkan angka data b: ");
        int b = input.nextInt();

        // Menyimpan nilai a ke variabel sementara tukar
        int tukar = a;

        // Memasukkan nilai b ke variabel a
        a = b;

        // Memasukkan nilai tukar ke variabel b
        b = tukar;

        // Menampilkan hasil pertukaran nilai
        System.out.println("Nilai a setelah ditukar: " + a);
        System.out.println("Nilai b setelah ditukar: " + b);

        // Latihan: Program untuk menukar nilai dua variabel.

    }
}
