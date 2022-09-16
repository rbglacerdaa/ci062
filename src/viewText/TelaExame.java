package model;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import controller.GerenciadorUsuario;

import java.io.*;
public class TelaExame{


			protected static void limpaTela()
			{
				for (int i = 0; i < 50; ++i) System.out.println();;
			}
			
			
			public static void telaExame()
			{
				limpaTela();
				Scanner teclado = new Scanner(System.in);
				System.out.println("Digite 1 para visualizar Exame");
				System.out.println("Digite 0 para voltar ao Menu Principal");
				int opcao = teclado.nextInt();
				switch (opcao) {
					case 0:
						//telaMenu.telaMenu();
						break;
					case 1:
						telaVisualizarExame();
						break;

				}
			}
		

			public static void telaVizualizarExame()
			{
				limpaTela();
				
				Scanner teclado = new Scanner(System.in);
				System.out.println("Seus dados pessoais");
				System.out.println("Nome: " + GerenciaExame.retornaDado(1));
				System.out.println("Resultado: " + GerenciaExame.retornaDado(2));
				System.out.println("Data: " + GerenciaExame.retornaDado(3));
				System.out.println("Descricao: " + GerenciaExame.retornaDado(4));
				System.out.println("Imagens: " + GerenciaExame.retornaDado(5));
				System.out.println("Video: " + GerenciaExame.retornaDado(6));
				System.out.println("");
				System.out.println("");
				System.out.println("Digite 0 para voltar ao Menu");
				int opcao = teclado.nextInt();
				
				if (opcao == 0) {
					TelaMenu.telaMenu();
				}
			}
			

			
		
			public static void telaVisualizarExame()
			{
				limpaTela();
			
				GerenciaExames.leitor();
				
			}
			
	}

