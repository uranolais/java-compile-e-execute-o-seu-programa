
public class TestaConversao {

	public static void main(String[] args) {
		double salario = 1270.50;
		float pontoFlutuante = 3.14f;
		int valor = (int) salario;
		System.out.println(valor); //fazer o casting
		
		long numeroGrande = 3245698713325488L;
		short valorPequeno = 1234;
		byte b = 127;
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1+valor2;
		System.out.println(total);
	}
}
