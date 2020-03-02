package br.fai.projeto01;

public class Main {

	public static void main(String[] args) {
		
		Main app = new Main();
		
		app.start();

	}

	private void start() {
		
		int idade = 0;
		
		System.out.println("Aidade é de " + idade + " anos.");
		
		idade +=5;
		idade *= 2;
		
		System.out.println("resultado 1: " + idade);
		
		idade -=5;
		
		System.out.println("resultado 2: " + idade);
	}

}
