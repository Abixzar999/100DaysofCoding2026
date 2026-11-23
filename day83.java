import java.util.Scanner;
public class days83 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    
        int [] angka = new int[5];

        // Mengisi array
        for(int i = 0; i < angka.length;i++){
            System.out.print("Masukkan angka ke-" + (i + 1) + ": " );
            angka[i] = input.nextInt();
        }
    
        // Variabel untuk menyimpan hasil penjumlahan
        int total = 0;

        // Menjumlahkan semua elemen array
        for(int i = 0; i < angka.length; i++ ){
        total = total + angka[i];
        }
        
        // Menampilkan hasil
        System.out.println("Total penjumlahan : " + total );
    
        // Latihan: Menjumlahkan Elemen Array
    }
}
