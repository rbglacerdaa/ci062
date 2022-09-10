import java.io.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class DevolveDadosUser extends GerenciaArquivos {
  public DevolveDadosUser() {
  }

  public void RetornarDado(String file, String nome) throws Exception { // busca no arquivo f se o nome ja existe
    File f = new File(file + ".txt");

    try (BufferedReader br = new BufferedReader(new FileReader(file + ".txt"))) { // open file foobar.txt
      String line;
      while ((line = br.readLine()) != null) { // read file line by line in a loop
        if (line.contains(nome)) { // check if line contain that word then prints the line
          System.out.println(line);
        }
      }
    }
  }

  public void Retornafoto(String idfile) throws Exception { // busca no arquivo f se o nome ja existe
    try {
      Image picture = ImageIO.read(new File(idfile+".png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void RetornaDadosCadastrais(String file) throws Exception {
    // System.out.println("info basica do usuario");
    RetornarDado(file, "Nome");
    RetornarDado(file, "Endereco");
    
    // Retorna foto ->criar funçao

  }


  public void RetornaDadosInformacoesEmergenciais(String file) throws Exception {

    RetornarDado(file,"InformacoesEmergencia");

  }
  public void RetornaDadosFamiliares(String file) throws Exception {

    RetornarDado(file,"Familiares");
 
  }
  public void RetornaDadosContatosEmergencia(String file) throws Exception {

    RetornarDado(file,"Contatos Emergencia");
 
  }
}