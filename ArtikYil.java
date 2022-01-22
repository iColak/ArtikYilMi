package kosulluIfadeler;
import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.print("Yılı giriniz: ");
        year = input.nextInt();

        boolean artikYilmi = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        System.out.println(year + " yılı artık yıldır: " + artikYilmi );

    }
}
