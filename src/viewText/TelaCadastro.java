package viewText;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import controller.*;
public class TelaCadastro {
	
	protected static void limpaTela()
	{
		for (int i = 0; i < 50; ++i) System.out.println();;
	}
	

	public static void telaDadosPessoais() 
	{
		Scanner teclado = new Scanner(System.in);
		//TODO: Controller deve criar uma funcao para retornar as informações do usuario.
		System.out.println("Seus dados pessoais");
		System.out.println("Nome: " + nome);
		System.out.println("Endereço: " + endereco);
		System.out.println("Informações de emergencia: " + infoEmergencia);
		System.out.println("Nome do contato de emergencia: " + nomeContatoEmergencia);
		System.out.println("Telefone do contato de emergencia: " + telefoneContatoEmergencia);
		System.out.println("");
		System.out.println("");
		System.out.println("Digite 1 para alterar seus dados");
		System.out.println("Digite 0 para voltar ao Menu");
		int opcao = teclado.nextInt();
		switch (opcao) {
			case 1:
				telaAlterarDadosPessoais();
			case 2:
				TelaMenu.telaMenu();
		}

	}
	
	public static void telaAlterarDadosPessoais()
	{
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escolha qual campo deseja alterar");
		System.out.println("(1) - Nome");
		System.out.println("(2) - Endereço");
		System.out.println("(3) - Informações de emergencia");
		System.out.println("(4) - Contato de emergencia");
		int opcao = teclado.nextInt();
		switch (opcao)
		{
			case 1:
				System.out.println("Escolha o novo nome do usuario");
				String novoNome = teclado.next();
				// TODO: Criar método para alterar Nome
				break;
			case 2:
				System.out.println("Digite seu novo endereço:");
				String novoEndereco = teclado.next();
				// TODO: Criar método para alterar endereco
				break;
			case 3:
				System.out.println("Adicione novas informações de emergencia");
				String novoInformacoesEmergencia = teclado.next();
				// TODO: Criar método para alterar informacoes de emergencia
				break;
			case 4:
				System.out.println("Digite o nome do seu contato de emergencia");
				String novoNomeConatoEmergencia = teclado.next();
				String novoTelefoneContatoEmergencia = teclado.next();
				// TODO: Criar método para alterar contato de emergencia
				break;
		}
		System.out.println("Alterações concluidas!");
		System.out.println("Digite 0 para voltar ao Menu");
		int opt = teclado.nextInt();
		if (opt == 0)
				TelaMenu.telaMenu();
		
	}
	
}
