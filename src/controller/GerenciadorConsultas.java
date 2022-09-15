package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import model.Consultas;
import model.Usuario;
import java.lang.*;

public class GerenciadorConsultas {
	
	public void CriaConsulta (Consultas novaConsulta, Usuario usuarioSessao) 
    { 
        try 
        {
        	
        	FileWriter f = new FileWriter(usuarioSessao.getNome()+".txt", true);
            
            f.write
            (
                "\n Medico: "+novaConsulta.getMedico()
                +"\n Especialidade "+novaConsulta.getEspecialidade()
                +"\n"+"Diagnostico : nenhum diagnostico registrado"
                +"\n"+"Prescricao : nenhuma prescricao registrada"
                +"\n"+"Laudo : nenhum laudo registrado "
            );
            
            f.close();
            
        } 
        
        catch (IOException e) 
        {
            System.out.println("Erro no agendamento da consulta");
            e.printStackTrace();
        }
        
    }


	public static boolean ExisteDado(String nome)
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
	

	
	public class ArmazenaString {
	  
	    {
	  	        StringBuffer sbf1 = new StringBuffer("We are geeks and its really ");
	        System.out.println("Input: " + sbf1);
	  
	        // Appending the boolean value
	        sbf1.append(true);
	        System.out.println("Output: " + sbf1);
	  
	        System.out.println();
	  
	        StringBuffer sbf2 = new StringBuffer("We are lost - ");
	        System.out.println("Input: " + sbf2);
	  
	        // Appending the boolean value
	        sbf2.append(false);
	        System.out.println("Output: " + sbf2);
	    
	}
	    
	public static void AdicionaDadoConsulta(String campo,String info,Usuario usuarioSessao)
	{ 
	    //Tenta abrir o arquivo para leitura
		
	    try (BufferedReader br = new BufferedReader(new FileReader(usuarioSessao.getNome()+".txt"))) 
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
	
}
