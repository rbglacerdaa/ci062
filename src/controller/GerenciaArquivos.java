import java.io.*;
import java.util.*;
public class GerenciaArquivos{
    public GerenciaArquivos(){
    }
    public void CriaArquivo(String file) { // create a file with the name you want 
        File f = new File(file+".txt"); 
        try {
          f.createNewFile();
          System.out.print("Arquivo criado com sucesso!");
    
        } catch (IOException e) {
          e.printStackTrace();
    
        }
      }

      public void LeArquivo(String file) {
        try {
          File f = new File(file+".txt");
          Scanner myReader = new Scanner(f);
          while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
          }
          myReader.close();
        } catch (FileNotFoundException e) {
          System.out.println("Erro na criacao, tente mais tarde");
          e.printStackTrace();
        }
      }
   
}