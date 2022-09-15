package model;

import java.util.ArrayList;
import java.util.Calendar; //https://www.devmedia.com.br/trabalhando-com-as-classes-date-calendar-e-simpledateformat-em-java/27401
import java.util.Date;
import java.text.DateFormat;

public class Agendamentos {
    protected Calendar data;
    protected String descricao;
    protected ArrayList<String> imagens;
    protected ArrayList<String> videos;

    public Agendamentos(Calendar data, String descricao, ArrayList<String> imagens, ArrayList<String> videos) {
        this.data = data;
        this.descricao = descricao;
        this.imagens = imagens != null ? imagens : null;
        this.videos = videos != null ? videos : null;
    }

    public ArrayList<String> getAgendamentoInfos(){
        //retorna um array com as informações do agendamento
        ArrayList<String> infos = new ArrayList<String>();
        infos.add("Data: " + data.getTime());
        infos.add("Descrição: " + descricao);
        infos.add("Imagens: " + imagens);
        infos.add("Videos: " + videos);
        return infos;
    }


}
