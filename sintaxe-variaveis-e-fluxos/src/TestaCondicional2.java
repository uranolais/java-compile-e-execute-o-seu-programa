
public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("Testando Condicionais");
		int idade = 19;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >=2;
		
		System.out.println("Valor de acompanhado é: "+acompanhado);
		//if(quantidadePessoas >=2) {
		//	acompanhado = true;
		//}else {
		//	acompanhado = false;
		//}
		
		if (idade >= 18 && acompanhado) {
			System.out.println("seja bem vindo");
		} else {
				System.out.println("infelizmente você não pode entrar");
			}
			
	}
}
