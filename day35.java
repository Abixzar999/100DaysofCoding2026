import java.util.Scanner;
public class days35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan Umur
        System.out.print("Masukkan umur : ");
        int umur = input.nextInt();

        // Memasukkan status KTP
        System.out.print("Apakah anda punya KTP? (true/false) : ");
        boolean punyaktp = input.nextBoolean();

        // Mengecek umur dan status KTP
        if (umur >= 17) {
            System.out.println("Sudah cukup umur");
            if (punyaktp) {
                System.out.println("Sudah punya KTP");
            } else {
                System.out.println("Belum punya KTP");
            } 
        } else {
            // Hasil jika umur kurang dari 17
            System.out.println("Belum cukup umur");
        }

    
        // Nested if
    }
    
}
