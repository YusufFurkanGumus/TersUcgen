import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Basamak sayısını girin: ");
        int basamak = input.nextInt();

        for (int i = basamak; i >= 1; i--) {
            // Boşlukları yazdır
            for (int j = 0; j < basamak - i; j++) {
                System.out.print(" ");
            }

            // Yıldızları yazdır
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Bir alt satıra geç
            System.out.println();
        }

        input.close();
    }
}
