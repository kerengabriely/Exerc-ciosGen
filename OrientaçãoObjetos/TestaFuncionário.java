package Questões;

import java.util.Scanner;

public class TestaFuncionário {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		Funcionário funcionário1 = new Funcionário();
		Funcionário funcionário2 = new Funcionário();
		
		funcionário1.setnome("Gabriel Gomes");
		funcionário1.setsetor("Escritório");
		funcionário1.setcargo("Auxiliar");
		funcionário1.setqualidadeT("Ótimo");
		funcionário1.setperiodoT(12);
		
		funcionário2.setnome("Daniel Oliveira");
		funcionário2.setsetor("Escritório");
		funcionário2.setcargo("Secretario");
		funcionário2.setqualidadeT("Mediano");
		funcionário2.setperiodoT(8);
		
		System.out.println(funcionário1.getnome());
		System.out.println(funcionário1.getsetor());
		System.out.println(funcionário1.getcargo());
		System.out.println(funcionário1.getqualidadeT());
		System.out.println(funcionário1.getperiodoT());
		funcionário1.promoção();
		
		System.out.println();
		
		System.out.println(funcionário2.getnome());
		System.out.println(funcionário2.getsetor());
		System.out.println(funcionário2.getcargo());
		System.out.println(funcionário2.getqualidadeT());
		System.out.println(funcionário2.getperiodoT());
		funcionário1.nãoPromoção();
		
		System.out.println();
		
		scan.close();
		
	}

}
