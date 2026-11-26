import java.util.Scanner;
public class days86 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[] angka = new int[5];

        // Mengisi array
        for(int i = 0; i < angka.length;i++){
            System.out.print("Masukkan angka ke-"+ (i + 1) + ":" );
            angka[i] = input.nextInt();
        }

        // Meminta angka yang ingin dicari
        System.out.print("Angka yang ingin dicari : ");
        int cari = input.nextInt();

        // Mencari angka dalam array
        boolean ditemukan = false;


        for (int i = 0; i < angka.length;i++){
            if (angka[i] == cari) {
                ditemukan = true;
                break;
            }

        }
            // Menampilkan hasil
            if (ditemukan){
                System.out.println("Angka ditemukan");
            } else {
                System.out.println("Angka tidak ditemukan");
            }

            // Latihan: Mencari Elemen pada Array

        }

    }


