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
	
	  public static boolean CriaConsulta (String medico, String especialidade, String diagnostico, String prescricao, String laudo, String data, String descricao) 
	    { 
	        try 
	        {
	            Consultas consulta = new Consultas(medico, especialidade, diagnostico,prescricao, laudo, data, descricao);
	        	FileWriter f = new FileWriter("Consulta1.txt", true);
	            
	            
	            f.write
	            (
	                ""+consulta.getMedico()
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
	

}
	    
	


