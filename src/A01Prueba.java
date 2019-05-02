import java.util.InputMismatchException;
import java.util.Scanner;

public class A01Prueba {
	public void agarraExcepcion() {
		Scanner leer = new Scanner(System.in);
		int cosa;
		// La gran mayoria de las excepciones vienen dadas por
		// errores de usuario
		System.out.println("introduce un numero ");
		try {
			cosa = leer.nextInt();
		} catch (InputMismatchException e) {
			cosa = 0;
			e.printStackTrace();
		}
		
		try {
			System.out.println("La division es " + 56 / cosa);
		} catch (ArithmeticException e) {
			cosa = 1;
		}
		System.out.println("La division es " + 56 / cosa);
	}

	public static void main(String[] args) {
		A01Prueba instancia = new A01Prueba();
		instancia.agarraExcepcion();
	}
}
