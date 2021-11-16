package Questões;

import java.util.Scanner;

public class TestaConta {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();

		conta1.setnome("Rita Barca");
		conta1.settipoC("Corrente");
		conta1.setbanco("Itaú");
		conta1.setsaldo(2000);
		
		conta2.setnome("Evelyn Macedo");
		conta2.settipoC("Poupança");
		conta2.setbanco("Santander");
		conta2.setsaldo(-1000);
		
		System.out.println(conta1.getnome());
		System.out.println(conta1.gettipoC());
	    System.out.println(conta1.getbanco());
	    System.out.println(conta1.getsaldo());
	    conta1.positivoS();
	    
	    System.out.println();
	    
	    System.out.println(conta2.getnome());
		System.out.println(conta2.gettipoC());
	    System.out.println(conta2.getbanco());
	    System.out.println(conta2.getsaldo());
	    conta1.negativoS();
	    
	    scan.close();
}	
	
}
