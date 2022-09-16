package viewText;

import java.util.HashMap;
import java.util.Scanner;

import controller.GerenciadorUsuario;

public class TelaMenu {
	
	protected static void limpaTela()
	{
		for (int i = 0; i < 50; ++i) System.out.println();;
	}
	

	public static void telaBoasVindas()
	{
		Scanner teclado = new Scanner(System.in);
		HashMap<String, String> contatoEmergencia = new HashMap<String, String>();
		System.out.println("Seja bem-vindo, cadastre seu usu�rio. ");
		System.out.println("Qual seu nome?");
		String nome = teclado.next();
		System.out.println("Digite seu endereço:");
		String endereco = teclado.next();
		System.out.println("Possui algum informa��o de emergencia (alergias)?");
		String informacaoEmergencia = teclado.next();
		System.out.println("Digite um contatos de emergencia");
		System.out.println("nome do familiar:");
		String familiarNome = teclado.next();
		System.out.println("Telefone de contato do familiar");
		String familiarTelefone = teclado.next();
		contatoEmergencia.put(familiarNome, familiarTelefone);
		
		GerenciadorUsuario.CriaUsuario(nome, endereco, informacaoEmergencia, contatoEmergencia);
	}
	
	
	public static void telaMenu()
	{
		limpaTela();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escolha uma opção:");
		System.out.println("(1) - Meus dados pessoais");
		System.out.println("(2) - Contatos médicos");
		System.out.println("(3) - Consultas");
		System.out.println("(4) - Exames");
		int opcao = teclado.nextInt();
		switch (opcao) {
			case 1:
				TelaCadastro.telaDadosPessoais();
				break;
			case 2:
				TelaContatosMedicos.telaContatosMedicos();
				break;
			case 3:
				// tela de consultas
				break;
			case 4:
				// tela de exames
				break;
		}
	}
	
}
