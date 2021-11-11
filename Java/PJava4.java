package Java;

import java.util.Scanner;

public class PJava4 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double[][] m = new double [3][3];
	    double valor = 0.0, soma = 0.0, somad = 0.0;
	    
	    for(int i = 0; i < 3; i++) {
	    	for(int c = 0; c < 3; c++) {
	    		System.out.println("Valor: ");
	    		m[i][c] = leia.nextInt();
	    		
	    		soma += m[i][c];
	    	}
	    }
	    
	    for(int i = 0; i < 3; i++) {
	    	somad += m[i][i];
	    }
	    
	    System.out.println("Som da matriz: " +soma);
	    System.out.println("Soma da diagonal principal: " + somad);
		
	}

}
