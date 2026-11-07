import java.util.Scanner;
public class days67 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Meminta ukuran persegi
        System.out.print("Masukkan ukuran persegi : ");
        int n = input.nextInt();

        // Perulangan baris
        for(int i = 1; i <= n;i++){
            // Perulangan kolom
            for (int j = 1; j <= n;j++) {
                System.out.print("* ");
            }
            // Pindah ke baris berikutnya
            System.out.println();
        }

        // Latihan: Membuat Pola Persegi

    }
}
