package Quest�es;

import java.util.Scanner;

public class Ex6 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		 int num, media = 0, multi = 0;
		 double mediA = 0.0;
		 
		 do {
		 System.out.println("Digite n�mero: ");
		 num = leia.nextInt();
		 
		if(num % 3 == 0 && num != 0) { 
		   multi++;
		   media = media + num;
		}
		    
	 }
		 while(num != 0);
		 
         mediA = media / multi;
		    
		    System.out.println("Os n�meros mult�plos de 3 s�o: " + mediA);
	}
  }
