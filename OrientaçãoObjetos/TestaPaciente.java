package Quest�es;

import java.util.Scanner;

public class TestaPaciente {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		Paciente paciente1 = new Paciente (" Maria Luiza ", "dor de cabe�a e na�sea", " 36 graus ", "SulAm�rica");
		Paciente paciente2 = new Paciente (" Jos� Luiz ", "febre e cansa�o", "38 graus", "Amil");

		 System.out.println("Paciente," + paciente1.getnomeP() + "apresenta os sintomas de " + paciente1.getsintomas()
         + " com temperatura corporal de" + paciente1.gettemperatura() + "e est� utilizando o conv�nio " + paciente1.getconv�nio() + ".");
		 
		 System.out.println("Paciente," + paciente2.getnomeP() + "apresenta os sintomas de " + paciente2.getsintomas()
         + " com temperatura corporal de " + paciente2.gettemperatura() + " utilizando o conv�nio " + paciente2.getconv�nio() + ".");

	  scan.close();     
	}

}
