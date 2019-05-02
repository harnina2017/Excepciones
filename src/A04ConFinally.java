import java.util.InputMismatchException;
import java.util.Scanner;

public class A04ConFinally {
	public void agarraExcepcion(){
		Scanner leer=new Scanner(System.in);
//		Scanner leer=null;
		int cosa = 1;
		float resultado = 0;
		//La gran mayoria de las excepciones vienen dadas por 
		//errores de usuario
		System.out.println("introduce un numero ");
		try {
			cosa=leer.nextInt();
			resultado=56/cosa;
		}
		catch (InputMismatchException e) {
			System.out.println("error de numero");
		}catch (ArithmeticException e) {
			System.out.println("division por cero");
		}
		catch (Exception e) {
			System.out.println("algun otro tipo de error");
		}
//		Se ejecuta siempre que de o no de fallo
		finally{
			System.out.println("Se ejecuta en cualquier caso anterior (siempre)");
		}
		System.out.println("La division es "+resultado);
	}
	public static void main(String[] args) {
		A04ConFinally instancia=new A04ConFinally();
		instancia.agarraExcepcion();
	}
}
