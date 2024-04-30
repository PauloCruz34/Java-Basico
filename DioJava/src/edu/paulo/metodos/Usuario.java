package edu.paulo.metodos;



public class Usuario {

	public static void main(String[] args) throws Exception{
		SmartTv smartTv = new SmartTv();
		System.out.println("A Tv está "+ smartTv.ligada);
		System.out.println("A Tv está sintonizada no "+ smartTv.canal);
		System.out.println("A Tv está no volume "+ smartTv.volume);
		
		smartTv.ligar();
		System.out.println("A tv está ligada? "+smartTv.ligada);
		
		smartTv.aumentarVolume();
		System.out.println("A Tv está no volume "+ smartTv.volume);
		smartTv.aumentarVolume();
		System.out.println("A Tv está no volume "+ smartTv.volume);
		smartTv.diminuirVolume();
		System.out.println("A Tv está no volume "+ smartTv.volume);
		
		smartTv.avançarCanal();
		System.out.println("A Tv está sintonizada no "+ smartTv.canal);
		smartTv.voltarCanal();
		System.out.println("A Tv está sintonizada no "+ smartTv.canal);
	}

}
