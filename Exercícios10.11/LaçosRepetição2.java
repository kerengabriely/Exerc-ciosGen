package Quest�es;

public class Ex2 {

     public static void main(String[] args) {

	int i = 1, par = 0, impar = 0; 

	for (i = 1; i <= 10; i++){
		System.out.println(i);
		
		if (i % 2 == 0) {
			par++;
		}
		
		else {
			impar++;	
		}
		
		System.out.println("N�mero pares: " + par);
		System.out.println("N�meros impares: " + impar);
   }
 }
}
