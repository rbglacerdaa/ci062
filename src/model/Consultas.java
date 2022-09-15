package model;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;

public class Consultas extends Agendamentos{
    private String medico;
    private String especialidade; // Ao montar titulo do agendamento, utilizar "Consulta com <Medico> - <Especialidade>"
    private String diagnostico;
    private String prescricao;
    private String laudo;

    
    //Parametros que verificam se são null vc pode passar o parametro com valor null, ou seja, não são obrigatorios de estarem preenchidos, mas são obrigatórios na cria
    public Consultas(String medico, String especialidade, String diagnostico, String prescricao, String laudo, Calendar data, String descricao, ArrayList<String> imagens, ArrayList<String> videos)
    {
    	super(data, descricao,imagens,videos);
    	this.medico = medico; // parametro obrigatorio
    	this.especialidade = especialidade;
    	this.diagnostico = diagnostico != null ? diagnostico : null; // parametro opcional
    	this.prescricao = prescricao != null ? prescricao : null;
    	this.laudo = laudo != null ? laudo : null;
    }
    
    public String  getMedico(){
    	return this.medico;
    	
    }
    public String getEspecialidade(){
    	return this.especialidade;
    	
    }

    public String getDiagnostico(){
    	return this.diagnostico;
    	
    }
    public String getPrecricao(){
    	return this.prescricao;
    	
    }
    public String getLaudo(){
    	return this.laudo;
    	
    }
}
