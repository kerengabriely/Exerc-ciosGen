package Questões;

import java.util.Scanner;

public class TestaPatinete {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		Patinete patinete1 = new Patinete();
		Patinete patinete2 = new Patinete();
		
		patinete1.setmarca("Atrio");
		patinete1.setcor("Azul");
		patinete1.setvelocidade(20);
		patinete1.setrodas(2);
		
		patinete2.setmarca("Dvoks");
		patinete2.setcor("Roxo");
		patinete2.setvelocidade(17);
		patinete2.setrodas(3);
		
		System.out.println(patinete1.getmarca());
		System.out.println(patinete1.getcor());
		System.out.println(patinete1.getvelocidade());
		System.out.println(patinete1.getrodas());
				
		System.out.println();
		
		System.out.println(patinete2.getmarca());
		System.out.println(patinete2.getcor());
		System.out.println(patinete2.getvelocidade());
		System.out.println(patinete2.getrodas());
		
		System.out.println();
		
		scan.close();
		
	}

}
