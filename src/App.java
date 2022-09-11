//import package
import java.util.ArrayList;
import java.util.Scanner;
import model.Usuario;
import view.DadosPessoais;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> familiares = new ArrayList<String>();
        familiares.add("João");
        familiares.add("Jorge");
        ArrayList<String> contatosEmergencia = new ArrayList<String>();
        contatosEmergencia.add("Maria");
        ArrayList<String> informacoesEmergencia = new ArrayList<String>();
        informacoesEmergencia.add("Alergia a penicilina");

        // create a new user
        Usuario usuario = new Usuario("João", "Rua 1", "foto", informacoesEmergencia, familiares, contatosEmergencia);
        System.out.println(usuario.getInformacoesEmergencia());

        new DadosPessoais();  

    }
}
