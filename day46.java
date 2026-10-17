import java.util.Scanner;
public class days46 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Membuat tampuilan menu
        System.out.println("1. Jus jeruk");
        System.out.println("2. jus alpukat");
        System.out.println("3. Jus sirsak");
        System.out.println("4. Es teh");
        
        System.out.println("Silahkan pilih salah satu menu ( 1 - 4 )\n");
        
        // Memasukkan angka untuk menu
        System.out.print("Pilih salah satu (1 - 4) mau apa : ");
        int pilih = input.nextInt();

        // Memeriksa pilihan menggunakan switch
        switch(pilih) {
            case 1 :
            System.out.println("Jus jeruk");
            break; // Menghentikan switch

            case 2 :
            System.out.println("Jus alpukat");
            break;

            case 3 :
            System.out.println("Jus sirsak");
            break;

            case 4 :
            System.out.println("Es teh");
            break;

            default : //
            System.out.println("Belum ada pilihannya, silahkan pilih 1 - 4");

        }

        // Latihan: Membuat Menu Menggunakan Switch-case
    }
}

