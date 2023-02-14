import java.util.Scanner;
public class DesafioSomadeHcomNTermos {

        public static void main(String[] Args) {

            double h = 0;

            Scanner sc = new Scanner(System.in);

            double n = sc.nextDouble();
            h += (double) 1/1;

            for (int i = 1; i <= n; i++) {

                //TODO: Calcule o valor de H de forma que resulte na soma dos termos:

                h = h+ (double) 1/i;

                //
            }

            //TODO: Imprima a soma dos termos, considerando um resultado com duas casas decimais:

            System.out.println((int) h);

    }
}
