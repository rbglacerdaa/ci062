package notificacoes;

import java.util.TimerTask;

public class VerificaConsultas extends TimerTask{
	
	 public void VerificaConsultas(){
	     //constructor 
	   }

	   @Override
	   public void run() {
	     // code
		   System.out.println("CRON TASK");
	   }
}
