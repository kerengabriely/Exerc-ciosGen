package Quest�es;

import java.util.Scanner;

public class Ex5 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int num = 0, soma = 0;
		
		while(num >= 0){
			System.out.println("Digite um n�mero: ");
			num = leia.nextInt();
			
			soma = soma + num;
	
	    if(num == 0) {
	    	break;
		}
	    
     }
	    
	    System.out.println("A soma dos n�meros �: " + soma);
	   
		}  
	}
