package Desafio;
import java.util.*;

public class DesafioQuitandaDoSeuZe {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int morangos = input.nextInt();
        int macas = input.nextInt();
        double tot1 = 0;
        double tot2 = 0;
        double valor = 0;
        double kilo = 0;
        double desc = 0;
        if (morangos <= 5) {
            tot1 = morangos * 2.50;
        }else {
            tot1 = morangos * 2.20;
        }

        if (macas <= 5) {
            tot2 = macas * 1.80;
        }else {
            tot2 = macas * 1.50;
        }
        kilo = morangos + macas;
        valor = tot1 + tot2;

        if(valor > 25.00 || kilo > 8){
            desc = valor * 10 /100;
            System.out.println(valor-desc);
        }else {
            System.out.println(valor);
        }
        input.close();
    }
}
