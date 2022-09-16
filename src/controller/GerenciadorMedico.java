package controller;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import model.ContatoMedico;

public class GerenciadorMedico 
{
	public static boolean cadastraMedico (String nome, String telefone, String endereco, String especialidade)
	{
		try 
		{
			ContatoMedico medico = new ContatoMedico(nome, telefone, endereco, especialidade);
			
			FileWriter f = new FileWriter("medicos.txt", true);
            
            f.write
            (
                ""+medico.getNome() //Duas quebras de linha para formar outro bloco 
                +"\n"+medico.getTelefone()
                +"\n"+medico.getEndereco()
                +"\n"+medico.getEspecialidade()
                +"\n"
            );
            
            f.close();
            
            return true;
		}
		
        catch (IOException e) 
        {
            System.out.println("Erro na gravação do contato médico");
            e.printStackTrace();
        }
        
        return false;
	}
	
	public static List<String> exibeMedicos ()
	{
		
		Path path = Paths.get("medicos.txt");
		List<String> linhas;
		
		try 
		{
			linhas = Files.readAllLines(path);
			return linhas;
		}
		
		catch (Exception e)
		{
			System.out.println("Erro ao tentar exibir medicos");
			e.printStackTrace();
		}
		
		return null;
	}

}
