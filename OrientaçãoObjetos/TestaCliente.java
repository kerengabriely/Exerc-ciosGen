package Questões;

import java.util.Scanner;

public class TestaCliente {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		
		cliente1.setnome("Maria");
		cliente1.setsexo("Feminino");
		cliente1.setidade(32);
		
		cliente2.setnome("Matheus");
		cliente2.setsexo("Masculino");
		cliente2.setidade(19);
		
		System.out.println(cliente1.getnome());
		System.out.println(cliente1.getsexo());
		System.out.println(cliente1.getidade());
		cliente1.olhando();

		System.out.println();

		System.out.println(cliente2.getnome());
		System.out.println(cliente2.getsexo());
		System.out.println(cliente2.getidade());
		cliente2.comprou();

		scan.close();
	}		
}