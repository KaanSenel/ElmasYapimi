import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int number = scanner.nextInt();

        for (int i=0;i<=number;i++) {

            for (int x = 1; x <= i; x++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int k=number-1;k>0;k--) {
            for (int y = k - 1; y > 0; y--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
