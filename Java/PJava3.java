package Java;

import java.util.Scanner;

public class PJava3 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
        int[][] n1 = new int [2][3];
        int[][] n2 = new int [2][3];
        int[][] m1 = new int [2][3];
        int[][] m2 = new int [2][3];
        int i, c;
        
		//==Impressão da Matriz==//
		for( i = 0; i < n1.length; i++) {//caminhar nas linhas
			for( c = 0; c < n2[i].length; c++) {//caminhar nas colunas
				
				System.out.println("Digite os valores de n1: ");
				n1[i][c] = leia.nextInt();
				
				System.out.println("Digite os valores de n2: ");
				n2[i][c] = leia.nextInt();
				
				m1[i][c] = n1[i][c] + n2[i][c];
				m2[i][c] = n1[i][c] - n2[i][c];
				
			}
		}
			
			for(i = 0; i < m1.length; i++) {
				for(c = 0; c < m2.length; c++) {
			
			System.out.println("Matriz M1: " + m1[i][c]);
			System.out.println("Matriz M2: " + m2[i][c]);
		}
	  }
			leia.close();	
    }
   }