package notificacoes;

import java.util.Timer;

public class TimerNotify {

	public static void CronTask()
	{
		Timer timer = new Timer();
		VerificaConsultas consultas = new VerificaConsultas();
		timer.scheduleAtFixedRate(consultas, 10000, 10000);
		
	}
	
	
}
