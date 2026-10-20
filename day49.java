
import java.util.Scanner;

public class days49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan Umur
        System.out.print("Masukkan umur : ");
        int umur = input.nextInt();

        // Jika umur >= 18, statusnya "Dewasa"
        // Jika tidak, statusnya "Belum dewasa"
        String status = (umur >= 18) ? "Dewasa" : "Belum dewasa";

        // Menampilkan hasil yang sudah ditentukan
        System.out.println("Status : " + status);


        // Operator Ternary


    }
}
