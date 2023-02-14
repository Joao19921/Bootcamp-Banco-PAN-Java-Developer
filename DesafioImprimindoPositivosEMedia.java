import java.util.Scanner;
import  java.util.Locale;
public class DesafioImprimindoPositivosEMedia {

        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner scanner = new Scanner(System.in);
            int countPositive = 0;
            double sumPositive = 0;

            for (int i = 1; i <= 6; i++) {
                double number = scanner.nextDouble();

                if (number > 0) {
                    countPositive++;
                    sumPositive += number;
                }
            }

            System.out.println(countPositive + " valores positivos");

            if (countPositive > 0) {
                double average = sumPositive / countPositive;
                System.out.printf("%.1f", average);
            }
        }
    }

