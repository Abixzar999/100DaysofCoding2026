import java.util.Scanner;
public class days64 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan angka
        System.out.print("Masukkan angka n : ");
        int n = input.nextInt();

        // Menyimpan hasil faktorial
        int hasil = 1;
        
        // Menghitung faktorial
        for(int i = n; i >= 1;i--){
            hasil = hasil * i;
        }
        
        // Menampilkan hasil
        System.out.println("Hasil faktorial : " + hasil);
    
        // Latihan: Membuat Bilangan Faktorial
    }
}
