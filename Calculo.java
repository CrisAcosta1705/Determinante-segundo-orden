package DeterminanteSegundoOrden;
import java.util.Scanner;
public class Calculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc = new Scanner(System.in);
		
		double a; // Reemplazar con el valor de a
		double b;// Reemplazar con el valor de b
		double c; // Reemplazar con el valor de c
		double d; // Reemplazar con el valor de d
		
		System.out.println("Ingrese el valor de A");
		a = tc.nextInt();
		
		System.out.println("Ingrese el valor de B");
		b = tc.nextInt();
		
		System.out.println("Ingrese el valor de C");
		c = tc.nextInt();
		
		System.out.println("Ingrese el valor de D");
		d = tc.nextInt();
		
		double determinante = a*d - b*c;

		System.out.println("El determinante de la matriz es: " + determinante);
	}

}
