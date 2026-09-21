import java.util.Scanner;
public class days20 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Memasukkan umur menggunakan tipe data int
    System.out.print("Masukkan umur: ");
    int umur = input.nextInt();

    // Memasukkan Tahun lahir menggunakan tipe data short
    System.out.print("Tahun Lahir: ");
    short tahunlahir = input.nextShort();

    // Memasukkan tinggi badan menggunakan tipe data float
    System.out.print("Tinggi badan: ");
    float tinggi = input.nextFloat();

    // Memasukkan berat badan menggunakan tipe data double
    System.out.print("Berat badan: ");
    double berat = input.nextDouble();

    // Konversi tipe data ke String
    String intstring = String.valueOf(umur);
    String shortstring = String.valueOf (tahunlahir);
    String floatstring = String.valueOf(tinggi);
    String doublestring = String.valueOf(berat);


    //menampilkan hasil konversi
    System.out.println("Umur dalam bentuk String: " + intstring);
    System.out.println("Tahun lahir dalam bentuk String: " + shortstring);
    System.out.println("Tinggi badan dalam bentuk String: " + floatstring);
    System.out.println("Berat badan dalam bentuk String: " + doublestring);

    //Mengubah Tipe Data Primitif menjadi String.


    





    }


}
