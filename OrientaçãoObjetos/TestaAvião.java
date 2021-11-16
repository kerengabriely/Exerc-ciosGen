package Questões;

import java.util.Scanner;

public class TestaAvião {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		Avião avião1 = new Avião(); 
		Avião avião2 = new Avião();
		
		avião1.setcompanhia("LATAM");
		avião1.setcor("Vermelho");
		avião1.setquantidadeP(55);
		avião1.setvelocidadeA(180);
		
		avião2.setcompanhia("AZUL");
		avião2.setcor("Branco");
		avião2.setquantidadeP(62);
		avião2.setvelocidadeA(200);
		
		System.out.println(avião1.getcompanhia());
		System.out.println(avião1.getcor());
		System.out.println(avião1.getqunatidadeP());
		System.out.println(avião1.getvelocidadeA());
		avião1.decolagem();
		
		System.out.println();
		
		System.out.println(avião2.getcompanhia());
		System.out.println(avião2.getcor());
		System.out.println(avião2.getqunatidadeP());
		System.out.println(avião2.getvelocidadeA());
		avião1.nãoDecolagem();
		
		System.out.println();
	
		scan.close();
	}
}
