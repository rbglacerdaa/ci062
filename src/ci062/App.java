package ci062;
import viewText.TelaCadastro;
import controller.*;
import model.*;
import viewText.TelaCadastro;
import java.lang.*;

public class App 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("App iniciado");
		Usuario usuario = new Usuario();
		
		String nome = "";
		
		GerenciadorConsultas gConsultas = new GerenciadorConsultas();
		//gConsultas.CriaConsulta(novaConsulta, usuario);
		//GerenciadorConsultas.AdicionaDadoConsulta("medico:","luis",usuario);
		
		nome = GerenciadorUsuario.retornaDado(1);
		
		System.out.println("Dado retornado: ");
		
	
		
	}

}
