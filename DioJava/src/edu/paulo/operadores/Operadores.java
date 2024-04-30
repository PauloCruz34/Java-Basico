package edu.paulo.operadores;

public class Operadores {

	public static void main(String[] args) {
		String nome = "Paulo"+" Afonso";
		System.out.println(nome);
						
		//qual o resultado das expressoes abaixo?
		
		String concatenacao ="?"; 
		concatenacao = 1+1+1+"1";    // soma os numeros e concatena a string
		System.out.println(concatenacao);
		concatenacao = 1+"1"+1+1; //concatena todos
		System.out.println(concatenacao);
		concatenacao = 1+"1"+1+"1"; //concatena todos
		System.out.println(concatenacao);
		concatenacao = "1"+1+1+1; //concatena todos
		System.out.println(concatenacao);
		concatenacao = "1"+(1+1+1); // somou somente o que esta em evidencia
		System.out.println(concatenacao);
		
		System.out.println("operador unário");
		int numero = 5;
		System.out.println(-numero); // operador de negação
		System.out.println(numero);
		numero = -numero;
		System.out.println(numero);
		numero = -numero;
		System.out.println(numero);
		
		System.out.println("repetiçao");
		numero = numero + 5;
		System.out.println(numero); // incremento
		
		boolean variavel = true;
		System.out.println(variavel);
		System.out.println(!variavel);
		variavel = !variavel;
		System.out.println(variavel);
		variavel = !variavel;
		System.out.println(variavel);
		
		System.out.println("Operador ternario");
		
		int a,b;
		a = 5;
		b = 6;
		String resultado = a==b ? "Verdadeiro":"falso";		
		System.out.println(resultado);
		if(a == b)
			resultado = "verdadeiro";
		else
			resultado = "falso";
		System.out.println(resultado);
		
		
		
	}
	
}



