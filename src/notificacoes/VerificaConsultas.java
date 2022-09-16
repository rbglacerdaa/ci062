package notificacoes;

import java.util.TimerTask;

public class VerificaConsultas extends TimerTask{
	
	 public void VerificaConsultas(){
	     //constructor 
	   }

	   @Override
	   public void run() {
	     // OUTRA OPCAO AO INVES DO CRON É QUE ESSA FUNCAO SEJA CHAMADA QUANDO É CLICADO PRA IR PARA A TELA DE NOTIFICACOES
		   // pegar a lista de consultas cadastradas
		   // Compara as datas com as datas que já passaram ou estão no dia
		   // Caso exista uma consultas com a data expirada 
		   		// crie uma notificao de consulta experirada
		   				// enviei para tela de modificao dessa consulta
		   //Caso a consulta seja no dia
		   		// Apenas avisar
	   }
}
