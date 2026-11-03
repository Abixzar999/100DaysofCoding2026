import java.util.Scanner;
public class days63 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Masukkan angka untuk M
        System.out.print("Masukkan angka M : ");
        int m = input.nextInt();
        
        // Masukkan angka untuk N
        System.out.print("Masukkan angka N : ");
        int n = input.nextInt();


        // Menyimpan hasil pangkat
        int hasil = 1;

        
        for(int i = 1; i <= n;i++){
            hasil = hasil * m; 
        }
        System.out.println("hasil : " + hasil);

        // Latihan: Mencetak hasil M pangkat N

    }
}
