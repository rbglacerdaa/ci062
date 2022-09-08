import java.io.*;

public class InfoUsuario extends GerenciaArquivos {
  public InfoUsuario() {
  }
 
      public void TelefoneEmergencia(String fileId,String telefone) {
        try {
          FileWriter f = new FileWriter(fileId+".txt", true);
          f.write("Telefone:"+telefone+"\n");
          f.close();
          System.out.println("Novo telefone inserido");
        } catch (IOException e) {
          System.out.println("Erro,tente novamente");
          e.printStackTrace();
        }
    
      }
      public void RetornarDado(String file,String nome)throws Exception{ // busca no arquivo f se o nome ja existe 
        File f=new File(file+".txt");
  
        try (BufferedReader br = new BufferedReader(new FileReader(file+".txt"))) { // open file foobar.txt
        String line;
        while ((line = br.readLine()) != null) { //read file line by line in a loop
           if(line.contains(nome)) { // check if line contain that word then prints the line
                System.out.println(line);
            } 
          }
      }
    }

      public void RetornaDadosCadastrais(String file)throws Exception{
          
        RetornarDado(file,"Nome");
        RetornarDado(file, "Endereco");
        RetornarDado(file, "Email");

      }
  }