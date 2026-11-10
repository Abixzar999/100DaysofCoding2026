import java.util.Scanner;
public class days70 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        // Memasukkan jumlah baris
        System.out.print("Masukkan angka : ");
        int n = input.nextInt();

        // Perulangan untuk mengatur baris
        for(int i = 1; i <= n;i++){
            
            // Perulangan untuk mencetak bintang
            // Dimulai dari nilai i dan berkurang sampai 1
            for(int j = i; j>=1;j--){
                System.out.print("* ");
            }
             // Pindah ke baris berikutnya
            System.out.println();
        }

        // Latihan: Membuat Pola Segi Tiga Siku-siku
    }
}
