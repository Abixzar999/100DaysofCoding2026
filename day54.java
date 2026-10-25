import java.util.Scanner;
public class days54 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

        // Memasukkan nama
        System.out.print("Masukkan nama : ");
        String nama = input.nextLine();

        // Memasukkan umur
        System.out.print("Masukkan umur : ");
        int umur = input.nextInt();
    

        // Menampilkan hasil
        System.out.println("Nama :" + nama);
        System.out.println("Umur :" + umur);
    
    }
}
