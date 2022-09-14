package viewText;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
//import controller.*;
public class TelaCadastro {
	
	protected static void limpaTela()
	{
		for (int i = 0; i < 50; ++i) System.out.println();;
	}
	
	public static void telaBoasVindas()
	{
		Scanner teclado = new Scanner(System.in);
		HashMap<String, String> contatoEmergencia = new HashMap<String, String>();
		System.out.println("Seja bem-vindo, cadastre seu usuário. ");
		System.out.println("Qual seu nome?");
		String nome = teclado.next();
		System.out.println("Digite seu endereço:");
		String endereco = teclado.next();
		System.out.println("Possui algum informação de emergencia (alergias)?");
		String informacaoEmergencia = teclado.next();
		System.out.println("Digite um contatos de emergencia");
		System.out.println("nome do familiar:");
		String familiarNome = teclado.next();
		System.out.println("Telefone de contato do familiar");
		String familiarTelefone = teclado.next();
		contatoEmergencia.put(familiarNome, familiarTelefone);
		
		GerenciadorArquivo.criaUsuario(nome, endereco, informacaoEmergencia, contatoEmergencia);
	}
	

}
