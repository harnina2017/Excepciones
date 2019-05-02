import java.util.InputMismatchException;
import java.util.Scanner;

public class A02Prueba {
	public void agarraExcepcion(){
		Scanner leer=new Scanner(System.in);
		int cosa = 0;
		float resultado = 0;
		//La gran mayoria de las excepciones vienen dadas por 
		//errores de usuario
		System.out.println("introduce un numero ");
		try {
			cosa=leer.nextInt();
			resultado=56/cosa;
		}catch (InputMismatchException e) {
			System.out.println("error de numero");
		}catch (ArithmeticException e) {
			System.out.println("division por cero");
		}
		System.out.println("La division es "+resultado);
	}
	public static void main(String[] args) {
		A02Prueba instancia=new A02Prueba();
		instancia.agarraExcepcion();
	}
}
