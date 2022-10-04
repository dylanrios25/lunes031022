package metodos;
import java.util.*;
public class EjemploMetodos {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		//MetodoA guiare datos de entrada y no devuelve valor
		MetodoA();
		//MetodoB guiare datos de entrada y no devuelve valor
	    MetodoB(3.2,5.0,8);
	   double a = 9.3,b = 7.5 ;
	   int c = 5;
	   MetodoB(a,b,c);
	   System.out.println("a =");
	   a = lector.nextDouble();
	   System.out.println("b =");
	   b = lector.nextDouble();
	   System.out.println("c =");
	   c = lector.nextInt();
	   MetodoB(a,b,c);
		//MetodoC guiare datos de entrada y devuelve un valor double
	   double resultado = MetodoC();
	   System.out.println("el resultado es ="+ resultado);
	}

	//definicion de metodos
	private static void MetodoA() {
		int valorA=7, valorB=8;
		System.out.println("la suma de "+ valorA+ " y "+ valorB + " es " + (valorA+valorB));
		
	}
	private static void MetodoB(double varA,double varB,int varC) {
	 double resultado=(varA + varB)/(1 + varC);
	 System.out.println("el resultado es ="+ resultado);
 }

	private static double MetodoC() {
       double varDouble1 =1.0, varDouble2 = 2.0;
       int varInt1 = 5, varInt2 = 9;
       double resultado = 1+(varDouble1*varDouble2)-varInt1/varInt2;
	 return resultado;

}
}