import java.util.Scanner;
public class days88 {
    
    // Membuat method void bernama sapa
    static void sapa(){
        
        // Membuat Scanner untuk menerima input
        Scanner input = new Scanner(System.in);
        
        // Memasukkan nama
        System.out.print("Masukkan nama : ");
        String nama = input.nextLine();

        // Menampilkan inputan
        System.out.println("Halo, " + nama + "!");
        System.out.println("Selamat datang");
    
        input.close();
    
    }


public static void main(String[] args) {
    // Memanggil method sapa agar perintah di dalamnya dijalankan
    sapa();

    //  Method void

    }
}
