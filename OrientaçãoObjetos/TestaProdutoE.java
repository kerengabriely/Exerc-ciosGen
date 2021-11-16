package Questões;

import java.util.Scanner;

public class TestaProdutoE {
	
public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		ProdutoE produtoE1 = new ProdutoE();
		ProdutoE produtoE2 = new ProdutoE();
		
		produtoE1.setmarca("Apple");
		produtoE1.setmodelo("8 plus");
		produtoE1.setcor("Preto");
		produtoE1.setmemóriaI(64);
		
		produtoE2.setmarca("Apple");
		produtoE2.setmodelo("5S");
		produtoE2.setcor("Branco");
		produtoE2.setmemóriaI(32);
		
		System.out.println(produtoE1.getmarca());
		System.out.println(produtoE1.getmodelo());
		System.out.println(produtoE1.getcor());
		System.out.println(produtoE1.getmemória());
		produtoE1.bomCelular();
		
		System.out.println();
		
		System.out.println(produtoE2.getmarca());
		System.out.println(produtoE2.getmodelo());
		System.out.println(produtoE2.getcor());
		System.out.println(produtoE2.getmemória());
		produtoE1.ruimCelular();
		
		System.out.println();
		
		scan.close();
	}

}
