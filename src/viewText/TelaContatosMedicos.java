package viewText;

import java.util.ArrayList;
import java.util.Scanner;

public class TelaContatosMedicos {
	protected static void limpaTela()
	{
		for (int i = 0; i < 50; ++i) System.out.println();;
	}
	
	
	public static void telaContatosMedicos() 
	{
		limpaTela();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite 1 para visualizar seus contatos medicos");
		System.out.println("Digite 2 para criar um novo contato");
		System.out.println("Digite 3 para modificar um contato existente");
		System.out.println("Digite 4 para excluir um contato existente");
		System.out.println("Digite 0 para voltar ao Menu Principal");
		int opcao = teclado.nextInt();
		switch (opcao) {
			case 0:
				TelaMenu.telaMenu();
				break;
			case 1:
				telaVisualizarContatosMedicos();
				break;
			case 2:
				telaCriarContatoMedico();
				break;
			case 3:
				telaModificarContatoMedico();
				break;
			case 4:
				telaExcluirContatoMedico();
				break;
		}
	}
	
	
	public static void telaVisualizarContatosMedicos()
	{
		limpaTela();
		Scanner teclado = new Scanner(System.in);
		ArrayList<String>data = null;
		//TODO: Controller deve criar uma funcao para retornar os contatos medicos arrayList com todos os contatos.
		int quantidadeContatos = 0; // 
		System.out.println("Seus contatos medicos");
		for (int i = 0; i < quantidadeContatos; ) {
			System.out.println("Nome: " + data[i]);
			System.out.println("telefone: " + data[i+1]);
			System.out.println("endereco: " + data[i+2]);
			System.out.println("especialidade: " + data[i+3]);
		}
		System.out.println("");
		System.out.println("");
		System.out.println("Digite 1 para voltar a tela anterior");
		System.out.println("Digite 0 para voltar ao Menu");
		int opcao = teclado.nextInt();
		switch (opcao) {
			case 0:
				TelaMenu.telaMenu();
				break;
			case 1:
				telaContatosMedicos();
				
		}
	}
	
	
	public static void telaCriarContatoMedico()
	{
		limpaTela();
		Scanner teclado = new Scanner(System.in);

		System.out.println("Vamos criar um novo Contato Medico!");
		System.out.println("Qual o nome do seu médico?");
		String nomeMedico = teclado.nextLine();
		System.out.println("Digite o telefone do médico:");
		String telefone = teclado.nextLine();
		System.out.println("Digite o endereco do médico:");
		String endereco = teclado.nextLine();
		System.out.println("Qual a especialidade do médico?");
		String especialidade = teclado.nextLine();
		
		//TODO: Criar método para Cadastrar um novo contato médico
		System.out.println("Digite 0 para voltar ao Menu");
		int opcao = teclado.nextInt();
		
		if (opcao == 0) {
			TelaMenu.telaMenu();
		}
	}
	
	
	public static void telaModificarContatoMedico()
	{
		limpaTela();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escolha qual campo deseja alterar");
		System.out.println("(1) - Nome");
		System.out.println("(2) - Telefone");
		System.out.println("(3) - Endereco");
		System.out.println("(4) - Especialidade");
		int opcao = teclado.nextInt();
		switch (opcao)
		{
			case 1:
				System.out.println("Escolha o novo nome do usuario:");
				String novoNome = teclado.nextLine();
				// TODO: Criar método para alterar Nome
				break;
			case 2:
				System.out.println("Digite um novo telefone:");
				String telefone = teclado.nextLine();
				// TODO: Criar método para alterar telefone
				break;
			case 3:
				System.out.println("Digite um novo endereco:");
				String endereco = teclado.nextLine();
				// TODO: Criar método para alterar endereco 
				break;
			case 4:
				System.out.println("Digite a nova especialidade");
				String especialidade = teclado.nextLine();
				// TODO: Criar método para alterar especialidade
				break;
		}
		System.out.println("Alterações concluidas!");
		System.out.println("Digite 0 para voltar ao Menu");
		int opt = teclado.nextInt();
		if (opt == 0)
			TelaMenu.telaMenu();
	}
	
	
	public static void telaExcluirContatoMedico()
	{
		limpaTela();
		Scanner teclado = new Scanner(System.in);
		//TODO: Reutilizar método de listar contatos medicos
		int quantidadeContatos = 0; // preencher com info vinda do metodo a fazer pelo controller
		String medico = ""; // preencher com info vinda do metodo a fazer pelo controller
		String especialidade =  ""; // preencher com info vinda do metodo a fazer pelo controller
		System.out.println("Escolha um contato médico para excluir:");
		for (int i = 0; i < quantidadeContatos; i++) {
			System.out.println("Digite " + i + " Para excluir - " + medico + " - " + especialidade );
		}
		
		int opcao = teclado.nextInt();
		//metodo para excluir um contato medico selecionado
		int resposta = 0; // deve ser o return do metodo de excluir
				
		if (resposta == 0)
			System.out.println("Contato excluido com sucesso!");
		else
			System.out.println("Erro ao excluir contato médico");
	}
}
