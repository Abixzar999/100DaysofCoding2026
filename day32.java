import java.util.Scanner;

public class days32 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        // Memasukkan nama
        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();

        // Memasukkan umur
        System.out.print("Masukkan Umur : ");
        int umur = input.nextInt();
        
        // Memasukkan angka
        System.out.print("Masukkan Angka Pertama : ");
        int a = input.nextInt();
        
        // Memasukkan angka
        System.out.print("Masukkan Angka Kedua : ");
        int b = input.nextInt();

        // Operator Aritmatika
        System.out.println("Penjumlahan : " + (a + b));
        System.out.println("Pengurangan : " + (a - b));
        System.out.println("Perkalian : " + (a * b));
        System.out.println("Pembagian : " + (a / b));
        System.out.println("Sisa Bagi : " + (a % b));

        // Operator Perbandingan
        System.out.println(a + " Lebih dari " + b + " : " + (a > b));
        System.out.println(a + " Kurang dari " + b + " : " + (a < b));
        System.out.println(a + " Lebih dari sama dengan " + b + " : " + (a >= b));
        System.out.println(a + " Kurang dari sama dengan " + b + " : " + (a <= b));
        System.out.println(a + " Sama dengan " + b + " : " + (a == b));
        System.out.println(a + " Tidak sama dengan " + b + " : " + (a != b));

        // Operator Logika
        System.out.println("Umur 18 - 30 : " + (umur >= 18 && umur <= 30 ));
        System.out.println("Umur diluar : " + (umur < 18 || umur > 30));
        System.out.println(a + " Lebih dari sama dengan " + b + " : " + !(a >= b));
    
        // Latihan: Mengkombinasikan berbagai operator.


    }
}
