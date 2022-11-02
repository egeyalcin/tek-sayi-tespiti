import java.util.Scanner;

public class TekSayiTespiti {
    public static void main(String[] args) {
        int sayi,sum = 0;
        while (true) {
            Scanner inp = new Scanner(System.in);
            System.out.println("Sayi giriniz : ");
            sayi = inp.nextInt();
            if (sayi % 2 == 1) {
                break;
            }
            else if (sayi % 2 == 0 && sayi % 4 == 0) {
                sum += sayi;
            }
        }
        System.out.println("Toplam :"+sum);
    }

}
