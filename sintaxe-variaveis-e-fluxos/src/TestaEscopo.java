
public class TestaEscopo {

	public static void main(String[] args) {
		System.out.println("Testando Condicionais");
		int idade = 19;
		int quantidadePessoas = 3;
		//boolean acompanhado = quantidadePessoas >=2;
		boolean acompanhado; //não tem valor padrão
			
		if(quantidadePessoas >=2) {
			acompanhado = true;//se declaram a boolean aqui ela vai parar de existir nas próximas linhas
		} else {
			acompanhado = false;
		}
		System.out.println("Valor de acompanhado é: "+acompanhado);
		
		if (idade >= 18 && acompanhado) {
			System.out.println("seja bem vindo");
		} else {
				System.out.println("infelizmente você não pode entrar");
			}
			
	}
}
