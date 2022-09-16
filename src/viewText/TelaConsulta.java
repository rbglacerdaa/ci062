package model;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controller.GerenciadorConsultas;
import controller.GerenciadorMedico;

import java.io.*;
public class TelaConsulta{

		protected static void limpaTela()
		{
			for (int i = 0; i < 50; ++i) System.out.println();;
		}
		
		
		public static void telaConsulta()
		{
			limpaTela();
			Scanner teclado = new Scanner(System.in);
			System.out.println("Digite 1 para visualizar consulta");
			System.out.println("Digite 2 para agendar consulta");
			System.out.println("Digite 3 para modificar uma consulta");
			System.out.println("Digite 0 para voltar ao Menu Principal");
			int opcao = teclado.nextInt();
			switch (opcao) {
				case 0:
					//TelaMenu.telaMenu();
					break;
				case 1:
					//telaVisualizarConsulta();
					break;
				case 2:
					telaAgendarConsulta();
					break;
				case 3:
					//telaModificarConsulta();
					break;

			}
		}
	

		
		public static void telaAgendarConsulta()
		{
			limpaTela();
			Scanner teclado = new Scanner(System.in);

			System.out.println("Vamos agendar uma nova consulta");
			System.out.println("Digite o nome do médico:");
			String nomeMedico = teclado.nextLine();
			System.out.println("Digite a especialidade do medico");
			String especialidade = teclado.nextLine();
			System.out.println("Digite uma descricao sobre a consulta:");
			String descricao = teclado.nextLine();
			System.out.println("Digite a data da consulta: (DIA/MES/ANO)");
			String data = teclado.nextLine();
			System.out.println("");
			System.out.println("");
			System.out.println("Digite 0 para voltar ao Menu");
			
			GerenciadorConsultas.CriaConsulta(nomeMedico, especialidade, data, descricao);
			int opcao = teclado.nextInt();
			
			if (opcao == 0) {
				TelaMenu.telaMenu();
			}
		}
		
	
		public static void telaVisualizarConsulta ()throws IOException 
		{
			limpaTela();
			Scanner teclado = new Scanner(System.in);
			// Receber dados do usuario e guardar em uma variavel data
			int quantidadeContatos = data.size(); 
			System.out.println("Suas Consultas");
			for (int i = 0; i < quantidadeContatos-3; i++) {
				System.out.println("-----------------");
				System.out.println("Nome: " + data);
				System.out.println("telefone: " + data);
				System.out.println("endereco: " + data);
				System.out.println("especialidade: " + data);
				System.out.println("-----------------");
			}
			System.out.println("");
			System.out.println("");
			System.out.println("Digite 0 para voltar ao Menu");
			int opcao = teclado.nextInt();
			switch (opcao) {
				case 0:
					TelaMenu.telaMenu();
					break;
					
			}
			GerenciadorConsultas.leitor();
			
		}
		
}	
	/*	public static void telaCriarContatoMedico()
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
		
		*/

	

