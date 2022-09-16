package model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
public class TelaExame {

	public class TelaExame{

			protected static void limpaTela()
			{
				for (int i = 0; i < 50; ++i) System.out.println();;
			}
			
			
			public static void TelaExame()
			{
				limpaTela();
				Scanner teclado = new Scanner(System.in);
				System.out.println("Digite 1 para visualizar Exame");
				System.out.println("Digite 0 para voltar ao Menu Principal");
				int opcao = teclado.nextInt();
				switch (opcao) {
					case 0:
						//TelaMenu.telaMenu();
						break;
					case 1:
						telaVisualizarConsulta();
						break;

				}
			}
		

			
		
			public static void telaVisualizarConsulta ()throws IOException 
			{
				limpaTela();
			
				GerenciadorExame.leitor();
				
			}
			
	}
}
