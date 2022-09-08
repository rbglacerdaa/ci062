//import package
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.util.Scanner;

import model.*;


public class App {
    public static void main(String[] args) throws Exception {
        Calendar data = Calendar.getInstance();
        String descricao = null;
        ArrayList<String> imagensArray = new ArrayList<String>();
        ArrayList<String> videosArray = new ArrayList<String>();
        imagensArray.add(null);
        videosArray.add("videos/video1.mp4");

        //exemplo de exame
        Exames exame = new Exames("Colonoscopia", "deu boa",data, descricao, imagensArray, videosArray);
    
        System.out.println(exame.getExameInfos());

    }
}
