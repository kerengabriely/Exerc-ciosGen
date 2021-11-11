package Java;

import java.util.Scanner;

public class PJava1 {
	
	public static void main(String[] args) {
		
		double pontos[] = new double [5]; 
		double maior = 0.0;
		int i;
		
		Scanner leia = new Scanner (System.in);
		
		for(i = 0; i <= 4; i++) {
			System.out.println("Digite sua pontuação: ");
			pontos[i] = leia.nextInt();
			
			
		if(maior < pontos[i]) {
			maior = pontos[i];
		}
			
	}
		
		System.out.println("Maior pontuação é: " +maior);
	}

}
