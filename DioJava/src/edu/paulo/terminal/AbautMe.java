package edu.paulo.terminal;

import java.util.Locale;
import java.util.Scanner;

public class AbautMe {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
			System.out.println("Digite seu Nome: ");
			String nome = scanner.next();
			System.out.println("Digite seu Sobrenome: ");
			String sobrenome = scanner.next();
			System.out.println("Digite sua idade: ");
			int idade = scanner.nextInt();
			System.out.println("Digite sua altura: ");
			double altura = scanner.nextDouble();
			
			
			System.out.println("Olá sou " + nome +" "+ sobrenome);
			System.out.println("Tenho " + idade + " anos de idade");
			System.out.println("Meu tamanho é " + altura + "m");
		}
	}
}
