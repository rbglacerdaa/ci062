package viewText;
import java.util.HashMap;
import java.util.Scanner;

import controller.Cadastros;
import controller.GerenciadorUsuario;
//import controller.*;
public class TelaCadastro 
{
	
	protected static void limpaTela()
	{
		for (int i = 0; i < 50; ++i) System.out.println();;
	}
	
	//Tentei criar essa funçãozinha para limpar o buffer mas não funciona
	public static void limpaBuffer (Scanner teclado)
	{
		String c = "";
		Boolean contem = false;
		
		c = teclado.next();
		contem = c.contains("\n");
		
		while (!contem) 
		{
			c = teclado.next();
			contem = c.contains("\n");
		}
	}
	
	public static void main (String[] args)
	{
		try (Scanner teclado = new Scanner(System.in))
		{
			//Precisa encontrar um método de passar as strings inteiras através do teclado.next();
			//Ex: Digitar o nome "Ricardo Farias" grava apenas o nome "Ricardo"
			
			HashMap<String, String> contatoEmergencia = new HashMap<String, String>();
			/*
			String nome="", endereco="", informacaoEmergencia="", familiarNome="", familiarTelefone="";
			
			System.out.println("Seja bem-vindo, cadastre seu usuario!\n");
			
			System.out.println("Qual seu nome?");
			nome = teclado.next();
			
			System.out.println("Digite seu endereço:");
			endereco = teclado.next();
			
			System.out.println("Possui algum informação de emergencia (alergias)?");
			informacaoEmergencia = teclado.next();
			
			System.out.println("Contatos de Emergência -> Familiar:");
			familiarNome = teclado.next();
			
			System.out.println("Contatos de Emergência -> Telefone do familiar:");
			familiarTelefone = teclado.next();
			
			*/
			contatoEmergencia.put("Reginalda", "+257 12 3745 5598");
			
			GerenciadorUsuario.CriaUsuario("Ricardo", "Rua Luiz Leao", "Tenho asma", contatoEmergencia);
			Cadastros.cadastraMedico("Jorge Amado", "+78 12 1125 2233", "Rua Palestina");
			
			//GerenciadorUsuario.editaUsuario(1); //1 edita nome
			//GerenciadorUsuario.editaUsuario(2); //2 edita endereço
			//GerenciadorUsuario.editaUsuario(3); //3 edita info emergencia
			//GerenciadorUsuario.editaUsuario(4); //4 edita hashmap
		}
		
		catch (Exception e)
		{
			System.out.println("Erro!");
		}
	}
}
