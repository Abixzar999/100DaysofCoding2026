import java.util.Scanner;
public class days85{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] angka = new int[5];

        // Mengisi array
        for (int i = 0; i < angka.length;i++){
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }


        // Menganggap angka pertama sebagai angka terkecil
        int min = angka[0];

        // Mencari angka terkecil
        for (int i = 1; i < angka.length;i++){
            if (angka[i] < min)
            min = angka[i];
        }

        // Menampilkan hasil
        System.out.println("Angka terkecil : " + min);

        // Latihan: Menentukan Angka Minimal Array

    }
}
