package controller;

import java.io.FileWriter;
import java.io.IOException;

import model.*;

public class Cadastros 
{
	//Cadastrar médicos
	public static boolean cadastraMedico (String nome, String telefone, String endereco)
	{
		try 
		{
			ContatoMedico medico = new ContatoMedico(nome, telefone, endereco);
			
			FileWriter f = new FileWriter("usuario.txt", true);
            
            f.write
            (
                "\n\n"+medico.getNome() //Duas quebras de linha para formar outro bloco 
                +"\n"+medico.getTelefone()
                +"\n"+medico.getEndereco()
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
}
