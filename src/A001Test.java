
public class A001Test {
	public static void main(String[] args) {
		
		int a = 10, b = 0, c;
		try {
			System.out.println("antes del fallo");
			System.out.println("el resultado es " + a / b);
			System.out.println("despues del fallo");
		} catch (ArithmeticException e) {
			//un ejemplo de tratamiento
			System.out.println("Error: "+e.getMessage());
//			return;
		}
		System.out.println("No ha habido ningun error");
	}
}
