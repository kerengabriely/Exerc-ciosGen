package Quest�es;

import java.util.Scanner;

public class TestaFuncion�rio {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		Funcion�rio funcion�rio1 = new Funcion�rio();
		Funcion�rio funcion�rio2 = new Funcion�rio();
		
		funcion�rio1.setnome("Gabriel Gomes");
		funcion�rio1.setsetor("Escrit�rio");
		funcion�rio1.setcargo("Auxiliar");
		funcion�rio1.setqualidadeT("�timo");
		funcion�rio1.setperiodoT(12);
		
		funcion�rio2.setnome("Daniel Oliveira");
		funcion�rio2.setsetor("Escrit�rio");
		funcion�rio2.setcargo("Secretario");
		funcion�rio2.setqualidadeT("Mediano");
		funcion�rio2.setperiodoT(8);
		
		System.out.println(funcion�rio1.getnome());
		System.out.println(funcion�rio1.getsetor());
		System.out.println(funcion�rio1.getcargo());
		System.out.println(funcion�rio1.getqualidadeT());
		System.out.println(funcion�rio1.getperiodoT());
		funcion�rio1.promo��o();
		
		System.out.println();
		
		System.out.println(funcion�rio2.getnome());
		System.out.println(funcion�rio2.getsetor());
		System.out.println(funcion�rio2.getcargo());
		System.out.println(funcion�rio2.getqualidadeT());
		System.out.println(funcion�rio2.getperiodoT());
		funcion�rio1.n�oPromo��o();
		
		System.out.println();
		
		scan.close();
		
	}

}
