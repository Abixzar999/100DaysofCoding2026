import java.util.Scanner;
public class days72 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    
        // Menyimpan hasil penjumlahan
        int total = 0;

         // Menyimpan angka yang dimasukkan 
        int angka = 0;

        // Selama angka tidak negatif, perulangan berjalan
        while (angka >= 0){

            // Meminta pengguna memasukkan angka
            System.out.print("Masukkan angka : ");
            angka = input.nextInt();
            
             // Jika angka tidak negatif, tambahkan ke total
            if (angka >= 0){
                total = total + angka;
            }
        }
        
        
                // Menampilkan hasil penjumlahan
                System.out.println("Total penjumlahan : " + total);
    

                // Latihan: Penjumlahan Angka (berhenti ketika menginputkan angka negatif)
    }
}
