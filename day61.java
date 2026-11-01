import java.util.Scanner;

public class days61 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan angka N
        System.out.print("Masukkan angka N : ");
        int n = input.nextInt();

        // Menyimpan hasil perkalian
        int total = 1;
        
        // Mengalikan angka dari 1 sampai N
        for (int i = 1; i <= n;i++){
            total = total * i;
        }


        
        // Menampilkan hasil
        System.out.println("hasil : " + total);
        
        // Latihan: Mengalikan angka 1-N

    }
}
