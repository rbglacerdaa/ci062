package controller;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import model.Consultas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.lang.*;
import java.io.*;


public class GerenciadorConsultas{
	
	  public static boolean CriaConsulta (String medico, String especialidade, String data, String descricao) 
	    { 
	        try 
	        {
	        	String diagnostico = null;
	        	String prescricao = null;
	        	String laudo = null;
	            Consultas consulta = new Consultas(medico, especialidade, diagnostico,prescricao, laudo, data, descricao);
	        	FileWriter f = new FileWriter("Consultas.txt", true);
	            
	            
	            f.write
	            (
	                ""+"medico:"+consulta.getMedico()
	                +"\n"+"especialidade:"+consulta.getEspecialidade()
	                +"\n"+"diagnostico:"+consulta.getDiagnostico()
	                +"\n"+"pescricao:"+consulta.getPrescricao()
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


	    
	public static void AdicionaDadoConsulta(String campo,String info)
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
	    
	
}

	public static ArrayList<String> leitor()
	{
		try{

			BufferedReader buffRead = new BufferedReader(new FileReader("Consultas.txt"));
			String linha = "";
			ArrayList<String> retorno = new ArrayList<String>();
			while (true) {
				if (linha != null) {
					retorno.add(linha);
	
				} else
					break;
				linha = buffRead.readLine();
			}
			buffRead.close();
			return retorno;
				
		}
		catch (Exception e)
	    {
	        System.out.println("Erro na leitura do arquivo");
	        e.printStackTrace();
	    }
		return null;
	}

}
	    
	


