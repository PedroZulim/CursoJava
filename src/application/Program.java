package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		double[] vet = new double[n];

		double soma = 0;

		for (int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextDouble();
		}

		System.out.print("Valores: ");
		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i] + " ");
			soma += vet[i];

		}
		System.out.println();
		System.out.println("SOMA = " + soma);
		System.out.println("MEDIA = " + soma / vet.length);

		sc.close();
	}

}
