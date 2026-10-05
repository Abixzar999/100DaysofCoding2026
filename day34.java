import java.util.Scanner;
public class days34 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Memasukkan nilai
    System.out.print("Masukkan nilai : ");
    int nilai = input.nextInt();

    // mengecek nilai dari yang terbesar ke yang terkecil
    if (nilai >= 90) {
        System.out.println("A");
    } else if (nilai >= 80){
        System.out.println("B");
    } else if (nilai >= 70){
       System.out.println("C");
    } else if (nilai >= 60){
        System.out.println("D");
    } else {
        System.out.println("E");
    }

     // Percabangan ( if-else if-else )

    input.close();
    }
}
