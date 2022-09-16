package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import model.Exames;
import model.Usuario;
import viewText.TelaMenu;

public class GerenciaExames {
	
    public static boolean CriaExame(Exames exame, Usuario usuarioSessao) 
    { 
        try 
        {
            
        	
        	FileWriter f = new FileWriter("usuarioExame.txt", true);
            
            f.write
            (
                //exame.getExamesInfo();
            );
            
            f.close();
            
            return true;
        } 
        
        catch (IOException e) 
        {
            System.out.println("Erro no agendamento da consulta");
            e.printStackTrace();
        }
        
        return false;
    }
    

    public void AdicionaDadoExame(String nome, String resultado, Calendar data, String descricao, ArrayList<String> imagens, ArrayList<String> videos,Usuario usuarioSessao,String campo,String info)
	{ 
	    //Tenta abrir o arquivo para leitura
		
	    try (BufferedReader br = new BufferedReader(new FileReader("usuarioExames.txt"))) 
	    { 
	        String line="";
	        
	        
	        while ((line = br.readLine()) != null) 
	        { 
	          
	            if (line.contains(campo))
	            {
	            	
	            	StringBuffer infoConsulta= new StringBuffer(line);
	            	infoConsulta.append(info) ;
	            
	            	
	            }
	        }
	        
	       
	        
	    }
	
	
	    catch (Exception e)
	    {
	        System.out.println("Erro na leitura do arquivo");
	        e.printStackTrace();
	    }
	    
	
}
	

	public static void leitor()
	{ 
		BufferedReader buffRead = new BufferedReader(new FileReader("Consultas.txt"));
		String linha = "";
		while (true) {
			if (linha != null) {
				System.out.println(linha);

			} else
				break;
			linha = buffRead.readLine();
		}
		buffRead.close();
	        
	    }

	public static void telaVisualizarConsulta ()throws IOException 
	{
		limpaTela();
	
		GerenciadorConsultas.leitor();
		
	}
	
	public static String retornaDado (int campoParaRetornar)
	{
		Path path = Paths.get("Exame.txt");
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
					separadorUm = hashMap.indexOf("{") + 1;
					separadorDois = hashMap.indexOf("=");
					return linhas.get(3).substring(separadorUm, separadorDois);
				}
				
				//Retornar Telefone do contato de emergencia do HashMap
				case 5: 
				{
					hashMap = linhas.get(3).toString();
					separadorUm = hashMap.indexOf("=") + 1;
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


