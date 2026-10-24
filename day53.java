
import java.util.Scanner;

public class days53 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mau berapa kali? : ");
        int batas = input.nextInt();
        
        int i = 1;
        
        
        // Perulangan do-while
        do { 
            System.out.println(i +".kali");
            i++;
        } while (i <= batas);
        

    }
}
