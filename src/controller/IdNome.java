
import java.io.*;
import java.util.Scanner;

public class IdNome extends GerenciaArquivos {
  public IdNome() {
  }

  public void CriaNovoID(String nome, String ID) {
    try {
      FileWriter ida = new FileWriter("ID.txt", true);
      ida.write(ID + " " + nome + "\n ");
      ida.close();
      System.out.println("Novo Usuario Criado");
    } catch (IOException e) {
      System.out.println("Erro ocorreu na hora de criar o Usuario ");
      e.printStackTrace();
    }

  }

public boolean UsuarioExiste(String nome)throws Exception { // busca no arquivo id se o nome ja existe 
    File id =new File("ID.txt");
    try (BufferedReader br = new BufferedReader(new FileReader("ID.txt"))) { // open file foobar.txt
      String line;
      while ((line = br.readLine()) != null) { //read file line by line in a loop
         if(line.contains(nome)) { // check if line contain that word then prints the line
            return true;
          } 
        }
        return false;
    }
  }
}

