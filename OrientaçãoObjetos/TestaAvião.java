package Quest�es;

import java.util.Scanner;

public class TestaAvi�o {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		Avi�o avi�o1 = new Avi�o(); 
		Avi�o avi�o2 = new Avi�o();
		
		avi�o1.setcompanhia("LATAM");
		avi�o1.setcor("Vermelho");
		avi�o1.setquantidadeP(55);
		avi�o1.setvelocidadeA(180);
		
		avi�o2.setcompanhia("AZUL");
		avi�o2.setcor("Branco");
		avi�o2.setquantidadeP(62);
		avi�o2.setvelocidadeA(200);
		
		System.out.println(avi�o1.getcompanhia());
		System.out.println(avi�o1.getcor());
		System.out.println(avi�o1.getqunatidadeP());
		System.out.println(avi�o1.getvelocidadeA());
		avi�o1.decolagem();
		
		System.out.println();
		
		System.out.println(avi�o2.getcompanhia());
		System.out.println(avi�o2.getcor());
		System.out.println(avi�o2.getqunatidadeP());
		System.out.println(avi�o2.getvelocidadeA());
		avi�o1.n�oDecolagem();
		
		System.out.println();
	
		scan.close();
	}
}
