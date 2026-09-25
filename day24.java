import java.util.Scanner;

public class days24 {
    public static void main(String[] args) {
        System.out.println("Hello World");
    
        Scanner input = new Scanner(System.in);

        // Memasukkan panjang
        System.out.print("Masukkan panjang : ");
        int panjang = input.nextInt();

        // Memasukkan lebar
        System.out.print("Masukkan lebar : ");
        int lebar = input.nextInt();

        // Menghitung luas persegi panjang
        int luas = panjang * lebar;

        // Menampilkan hasil luas
        System.out.println("Luas persegi panjang : " + luas);

        // Latihan: Program Menghitung Luas Persegi Panjang.
    }

}
