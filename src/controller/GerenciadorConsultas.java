package controller;


import java.util.Scanner;

import model.Consultas;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.lang.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.*;


public class GerenciadorConsultas{
	static int id=0;
	public static boolean CriaConsulta (String medico, String especialidade, String data, String descricao) 
	    { 
	      try 
	        {  	
	        	String diagnostico = null;
	        	String prescricao = null;
	        	String laudo = null;
	            Consultas consulta = new Consultas(medico, especialidade, diagnostico,prescricao, laudo, data, descricao);
	            ++id;
	        	FileWriter f = new FileWriter("/Users/ronaldbatista/ricardo/ci062/consultas/consulta_"+ id + ".txt", true);
	            
	            f.write
	            (
	                ""+"medico:"+consulta.getMedico()
	                +"\n"+"especialidade:"+consulta.getEspecialidade()
	                +"\n"+"diagnostico:"+consulta.getDiagnostico()
	                +"\n"+"prescricao:"+consulta.getPrescricao()
	                +"\n"+"laudo:"+consulta.getLaudo()
	                +"\n"+"data:"+consulta.getData()
	                +"\n"+"descricao:"+consulta.getDescricao()
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


	    
	/*public static void AdicionaDadoConsulta(String campo,String info)
	{ 
	    //Tenta abrir o arquivo para leitura
		
	    try (BufferedReader br = new BufferedReader(new FileReader("Consultas.txt"))) 
	    { 
	        String line="";
	        
	        //Leitura de linha por linha no laço
	        while ((line = br.readLine()) != null) 
	        { 
	            //Verifica se a linha contém o nome, se sim, imprime a linha
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
	    
	
}*/

	public static void exibeConsultas()
	{
		File pasta = new File("/Users/ronaldbatista/ricardo/ci062/consultas"); 
		int contador = -1; // POR CAUSA DO .DS_STORE É PRECISO COMEÇAR DE -1, SE O ARQUIVO NAO ESTIVER NA PASTA PODE COMEÇAR DE ZERO.
		
		File[] lista = pasta.listFiles();

		for (File file : lista) 
		{
		    if (file.isFile()) {
		        contador ++;
		    }
		}
		try 
		{
			for (int i=0; i<contador; i++)
			{
				Path path = Paths.get("/Users/ronaldbatista/ricardo/ci062/consultas/consulta_" + contador + ".txt");
				List<String> linhas;
				linhas = Files.readAllLines(path);
				System.out.println("----------------------");
				System.out.println(linhas.get(0).toString());
				System.out.println(linhas.get(1).toString());
				System.out.println(linhas.get(2).toString());
				System.out.println(linhas.get(3).toString());
				System.out.println(linhas.get(4).toString());
				System.out.println(linhas.get(5).toString());
				System.out.println(linhas.get(6).toString());
				System.out.println("----------------------");
			}
		}
		
		catch (Exception e)
		{
			System.out.println("Erro ao tentar exibir Consultas");
			e.printStackTrace();
		}	
	}

}
	    
	


