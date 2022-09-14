package controller;

import java.io.*;
import java.util.HashMap;

import model.*;

public class GerenciadorUsuario
{ 
    //Cria usuario e armazena os arquivos dele 
    public static boolean CriaUsuario (String nome, String endereco, String informacoesEmergencia, HashMap<String, String> contatosEmergencia) 
    { 
        try 
        {
            Usuario usuario = new Usuario(nome, endereco, informacoesEmergencia, contatosEmergencia);
        	
        	FileWriter f = new FileWriter(usuario.getNome()+".txt", true);
            
            f.write
            (
                "Nome:"+usuario.getNome() 
                +"\nEndereco:" +usuario.getEndereco()
                +"\nInformacoes de Emergencia: "+usuario.getInformacoesEmergencia()
                +"\nContatos de Emergencia: "+usuario.getContatosEmergencia()
                +"\n"
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
	
	public void editaUsuario (int campo)
	{
		switch (campo)
		{
			case 1:
				//Editar Nome
			break;
			
			case 2:
				//Editar endereco
			break;
			
			case 3:
				//Editar infoEmergencia
			break;
		}
	}

}

