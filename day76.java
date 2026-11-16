import java.util.Scanner;
public class days76 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Memasukkan nama
        System.out.print("Masukkan nama : ");
        String nama = input.nextLine();

        // Mengambil sebagian teks mulai posisi 0 sampai sebelum posisi 3
        System.out.println("Substring : " + nama .substring(0, 3));

        // Mengganti huruf A menjadi B
        System.out.println("Replace : " + nama.replace("A", "B"));

        // Menghapus spasi di awal dan akhir teks
        System.out.println("Trim : " + nama.trim());

        // Method String untuk Manipulasi (substring(), replace(), trim()).
    }
}
