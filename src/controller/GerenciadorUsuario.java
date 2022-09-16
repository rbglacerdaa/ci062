package controller;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import model.*;

public class GerenciadorUsuario
{ 
	//Cria usuario e armazena os arquivos dele 
    public static boolean CriaUsuario (String nome, String endereco, String informacoesEmergencia, HashMap<String, String> contatosEmergencia) 
    { 
        try 
        {
            Usuario usuario = new Usuario(nome, endereco, informacoesEmergencia, contatosEmergencia);
        	
        	FileWriter f = new FileWriter("usuario.txt", true);
            
            f.write
            (
                ""+usuario.getNome() 
                +"\n"+usuario.getEndereco()
                +"\n"+usuario.getInformacoesEmergencia()
                +"\n"+usuario.getContatosEmergencia()
            );
            
            f.close();
            
            return true;
        } 
        
        catch (IOException e) 
        {
            System.out.println("Erro na criacao do novo usuario");
            e.printStackTrace();
        }
        
        return false;
    }


	public static boolean ExisteUsuario (String nome)
	{ 
	    //Tenta abrir o arquivo para leitura
	    try (BufferedReader br = new BufferedReader(new FileReader(nome+".txt"))) 
	    { 
	        String line="";
	        
	        //Leitura de linha por linha no laço
	        while ((line = br.readLine()) != null) 
	        { 
	            //Verifica se a linha contém o nome, se sim, imprime a linha
	            if (line.contains(nome))
	                return true;
	        }
	        
	        return false;
	    }
	
	    catch (Exception e)
	    {
	        System.out.println("Erro na leitura do arquivo");
	        e.printStackTrace();
	    }
	    
	    return false;
	}
	
	public static void editaUsuario (int campoDeAlteracao)
	{
		try (Scanner tecladoLocal = new Scanner(System.in)) 
		{
			Path path = Paths.get("usuario.txt");
			List<String> linhas;
			
			switch (campoDeAlteracao)
			{
				case 1:
					//Editar nome	
					String novoNome = "";
					
					System.out.println("Digite o novo nome:");
					novoNome = tecladoLocal.next();
					
					linhas = Files.readAllLines(path);
					
					linhas.remove(0);
					
					linhas.add(0, novoNome);

			        Files.write(path, linhas);
				break;
				
				case 2:
					//Editar endereço
					String novoEndereco = "";
					
					System.out.println("Digite o novo endereço:");
					novoEndereco = tecladoLocal.next();

					linhas = Files.readAllLines(path);
					
					linhas.remove(1);
			        
					linhas.add(1, novoEndereco);

			        Files.write(path, linhas);
				break;
				
				case 3:
					//Editar informações de emergência
					String novaInfoEmergencia = "";
					
					System.out.println("Digite o novo endereço:");
					novaInfoEmergencia = tecladoLocal.next();
					
					linhas = Files.readAllLines(path);
					
					linhas.remove(2);
					
			        linhas.add(2, novaInfoEmergencia);

			        Files.write(path, linhas);
				break;
				
				case 4:
					//Editar contatos de emergência
					HashMap<String, String> novoContatoEmergencia = new HashMap<>();
					String novoFamiliar = "", novoFamiliarTelefone = ""; 
					
					System.out.println("Digite o nome do novo familiar:");
					novoFamiliar = tecladoLocal.next();
					
					System.out.println("Digite o contato deste novo familiar:");
					novoFamiliarTelefone = tecladoLocal.next();
					
					novoContatoEmergencia.put(novoFamiliar, novoFamiliarTelefone);
					
					linhas = Files.readAllLines(path);
					
					linhas.remove(3);
					
			        linhas.add(3, novoContatoEmergencia.toString());

			        Files.write(path, linhas);
				break;
			}
		}
		
		catch (Exception e)
		{
			System.out.println("Erro na edição do arquivo");
		}
	}
	
	public static String retornaDado (int campoParaRetornar)
	{
		Path path = Paths.get("usuario.txt");
		List<String> linhas;
		String hashMap = "";
		int separadorUm = 0, separadorDois = 0;
		
		try 
		{
			linhas = Files.readAllLines(path);
			
			switch (campoParaRetornar)
			{
				case 1: return linhas.get(0).toString(); //Retornar nome	
				case 2: return linhas.get(1).toString(); //Retornar endereço	
				case 3: return linhas.get(2).toString(); //Retornar infoEmergencia
				
				//Retornar Nome do contato de emergencia
				case 4:
				{
					hashMap = linhas.get(3).toString();
					separadorUm = hashMap.indexOf("{");
					separadorDois = hashMap.indexOf("=");
					return linhas.get(3).substring(separadorUm, separadorDois);
				}
				
				//Retornar Telefone do contato de emergencia do HashMap
				case 5: 
				{
					hashMap = linhas.get(3).toString();
					separadorUm = hashMap.indexOf("=");
					separadorDois = hashMap.indexOf("}");
					return linhas.get(3).substring(separadorUm, separadorDois);
				}
			}
		}
		
		catch (Exception e) 
		{
			System.out.println("Erro ao retornar dado do usuario");
			e.printStackTrace();
		}
		
		return null;
	}
}

