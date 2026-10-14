import java.util.Scanner;
public class days43 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);


        // Memasukkan angka
        System.out.print("Masukkan Angka : ");
        int angka = input.nextInt();

        // Memeriksa kelipatan 3 dan 5
        if ( angka % 3 == 0 && angka % 5 == 0) {
            System.out.println("Adalah kelipatan 3 dan 5");
        } else if (angka % 3 == 0) {
            System.out.println("Adalah kelipatan 3");
        } else if (angka % 5 == 0) {
            System.out.println("Adalah kelipatan 5");
        } else {
            System.out.println("Bukan kelipatan 3 maupun 5");
        }

        // Latihan: Program Kelipatan 3,5, 3 dan 5

    }
}
