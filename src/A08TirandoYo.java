
public class A08TirandoYo {
	int divisor = 0;

	public void viendoFallo() {
		if (divisor == 0)		
			throw new ArithmeticException("El divisor vale cero");
	}

	public static void main(String[] args) {
		A08TirandoYo instancia = new A08TirandoYo();
		try {
			instancia.viendoFallo();
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			instancia.divisor=1;
			System.out.println(27/instancia.divisor);
		}
		System.out.println("sin try todo falla");
		
	}
}
