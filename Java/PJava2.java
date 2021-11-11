package Java;

import java.util.Scanner;

public class PJava2 {
	
	public static void main(String[] args) {
		
		double maior = 0.0, soma = 0.0, media = 0.0;
		double dado[] = new double [10];
		int i = 0, jogadas = 0; 
		
		Scanner leia = new Scanner (System.in);
		
		for(i = 0; i <= 9; i++){
			
			System.out.println("Digita o " + (i+1) + " Lançamento do dado: ");
			dado[i] = leia.nextDouble();
			
			soma += dado[i];
			
			if(maior < dado[i]){
				maior = dado[i];
			}
			
			media = soma / 10; 
		}
		
		System.out.println("Soma " + soma);
		System.out.println("Média " + media);
        System.out.println("Maior " + maior);		
		
		
	}

}
