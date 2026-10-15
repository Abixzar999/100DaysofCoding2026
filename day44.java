import java.util.Scanner;

public class days44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan nilai
        System.out.print("Masukkan Nilai : ");
        int nilai = input.nextInt();

        // Menentukan predikat nilai
        if (nilai < 0 || nilai > 100) {
            System.out.println("Nilai tidak valid");
        } else if (nilai >= 85) {
            System.out.println("Predikat : A");
        } else if (nilai >= 75) {
            System.out.println("Predikat B");
        } else if (nilai >= 65) {
            System.out.println("Predikat C");
        } else if (nilai >= 50) {
            System.out.println("Predikat D");
        } else {
            System.out.println("Predikat E");
        }

        // Latihan: Program Predikat Nilai (A,B,C,D,E)
        



    }
}
