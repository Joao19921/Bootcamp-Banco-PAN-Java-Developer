package Desafio;

import java.util.*;

public class DesafioQuitandaDoSeuZe {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int morangos = input.nextInt();
		//int macas = input.nextInt();
		morangos = input.nextInt();
		//macas = input.nextInt();

		if (morangos > 5) {
			morangos *= 2.20;
		} else if (morangos <= 5) {
			morangos *= 2.50;
		}

		System.out.println(morangos);

		input.close();

	}
}