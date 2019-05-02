
public class A05tirandoFallos {
	//Delegar el tratamiento defensivo
	public int divideByZero() throws Exception{
		return 25 / 0;
	}
	public static void main(String[] args) {
		A05tirandoFallos instancia=new A05tirandoFallos();
		try {
			instancia.otra();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int otra() throws Exception {
		return divideByZero();
	}
}
