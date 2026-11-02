import java.util.Scanner;
public class days62 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Memasukka jumlah baris
        System.out.print("Masukkan jumlah baris : ");
        int baris = input.nextInt();

        // Memasukkan jumlah kolom
        System.out.print("Masukkan jumlah kolom :");
        int kolom = input.nextInt();


        // Perulangan luar untuk mengatur jumlah baris
        for (int i = 1; i <= baris ; i++) {

             // Perulangan dalam untuk mengatur jumlah kolom
            for (int j = 1; j <= kolom;j++) {


                // Menampilkan nilai i dan j
                System.out.print("i : " + i + " " + "j : " + j + " | ");
            }
            // Pindah ke baris berikutnya setelah perulangan kolom selesai
            System.out.println();
        }

        // nested loop
    }
}
