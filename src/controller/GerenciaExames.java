package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;

import model.Exames;
import model.Usuario;

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
    

    public void AdicionaDadoExame(String nome, String resultado, Calendar data, String descricao, ArrayList<String> imagens, ArrayList<String> videos,Usuario usuarioSessao)
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
