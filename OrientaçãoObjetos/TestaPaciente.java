package Questões;

import java.util.Scanner;

public class TestaPaciente {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		Paciente paciente1 = new Paciente (" Maria Luiza ", "dor de cabeça e naúsea", " 36 graus ", "SulAmérica");
		Paciente paciente2 = new Paciente (" José Luiz ", "febre e cansaço", "38 graus", "Amil");

		 System.out.println("Paciente," + paciente1.getnomeP() + "apresenta os sintomas de " + paciente1.getsintomas()
         + " com temperatura corporal de" + paciente1.gettemperatura() + "e está utilizando o convênio " + paciente1.getconvênio() + ".");
		 
		 System.out.println("Paciente," + paciente2.getnomeP() + "apresenta os sintomas de " + paciente2.getsintomas()
         + " com temperatura corporal de " + paciente2.gettemperatura() + " utilizando o convênio " + paciente2.getconvênio() + ".");

	  scan.close();     
	}

}
