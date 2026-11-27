import java.util.Scanner;
public class days87 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[] angka = {10, 20, 30, 40, 50}; 


        // Menampilkan isi array awal
        System.out.println("Data awal : ");
        for(int i = 0; i < angka.length; i++){
            System.out.println("Indeks " + i + ": " + angka[i]);
        }
    
        // Meminta indeks yang ingin diubah
        System.out.print("Masukkan indeks yang ingin diubah : ");
        int indeks = input.nextInt();

        // Meminta angka baru
        System.out.print("Masukkan angka baru : ");
        int angkabaru = input.nextInt();

        // Mengubah isi array
        if (indeks >= 0 && indeks < angka.length){
            angka[indeks] = angkabaru;
            System.out.println("Data berhasil diubah");
        } else {
            System.out.println("Indeks tidak valid");
        }

        // Menampilkan isi array setelah diubah
        System.out.println("Data setelah diubah");
        for(int i = 0; i < angka.length;i++){
            System.out.println("Indeks " + i + ": " + angka[i]);
        }
    
        // Latihan: Manipulasi data dalam array
    }
}
