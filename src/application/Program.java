package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Peoples;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();

		Peoples[] vet = new Peoples[n];

		double soma = 0;
		double soma2 = 0;

		for (int i = 0; i < vet.length; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa: ");
			sc.nextLine();
			String nome = sc.nextLine();
			int idade = sc.nextInt();
			double altura = sc.nextDouble();
			vet[i] = new Peoples(nome, idade, altura);
		}

		for (int i = 0; i < vet.length; i++) {
			soma+=vet[i].getAltura();
			if(vet[i].getIdade()<16) {
				soma2++;
			}
		}
		System.out.println();
		System.out.println("Altura média: " + soma / vet.length);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%n", (soma2 / vet.length) * 100.0);
		
		for (int i = 0; i < vet.length; i++) {
			if(vet[i].getIdade()<16) {
				System.out.println(vet[i].getNome());
			}
		}

		sc.close();
	}

}
