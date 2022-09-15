package model;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;

public class Exames extends Agendamentos{
    private String nome;
    private String resultado;

    public Exames(String nome, String resultado, Calendar data, String descricao, ArrayList<String> imagens, ArrayList<String> videos) {
        super(data, descricao, imagens, videos);
        this.nome = nome;
        this.resultado = resultado;
    }

    //get exame infos
    public ArrayList<String> getExameInfos(){
        //retorna um array com as informações do exame
        ArrayList<String> infos = new ArrayList<String>();
        infos.add("Nome: " + this.nome);
        infos.add("Resultado: " + this.resultado);
        infos.add("Data: " + this.data.getTime());
        infos.add("Descrição: " + this.descricao);
        infos.add("Imagens: " + this.imagens);
        infos.add("Videos: " + this.videos);
        return infos;
    }
    

}
