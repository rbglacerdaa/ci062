import java.io.*;
import java.nio.file.attribute.UserPrincipalLookupService;
public class ArmazenaInformacoesPessoais{ 


    public void CriaUsuario(String fileId,Usuario user) { /// cria usuario e armaszena os arquivos dele 
        try {
          FileWriter f = new FileWriter(fileId+".txt", true);
          f.write(" Nome:"+user.getNome()+ "\n Endereco:" +user.getEndereco() + "\n");
          f.close();
          System.out.println("Novo Usuario Criado");
        } catch (IOException e) {
          System.out.println("Erro ocorreu na hora de criar o Usuario ");
          e.printStackTrace();
        }
    
      }

      public void addInformacoesEmergencia(String fileId,Usuario user) { /// cria usuario e armaszena os arquivos dele 
        try {
          FileWriter f = new FileWriter(fileId+".txt", true);
          
          f.write("InformacoesEmergencia:"+user.getInformacoesEmergencia());
      
          f.close();
          System.out.println("Informacoes de emergencia adicionadas");
        } catch (IOException e) {
          System.out.println("Erro ocorreu na hora de adicionar informacoes ");
          e.printStackTrace();
        }
    
      }

      public void addFamiliares(String fileId,Usuario user) { /// cria usuario e armaszena os arquivos dele 
        try {
          FileWriter f = new FileWriter(fileId+".txt", true);
          
          f.write("Familiares:"+user.getFamiliares()+"\n");
       
          f.close();
          System.out.println("familiares adicionadas");
        } catch (IOException e) {
          System.out.println("Erro ocorreu na hora de adicionar familiares");
          e.printStackTrace();
        }
    
      }
      public void add(String fileId,Usuario user) { /// cria usuario e armaszena os arquivos dele 
        try {
          FileWriter f = new FileWriter(fileId+".txt", true);
         
          f.write("Contatos Emergencia:"+user.getContatosEmergencia()+"\n");

          f.close();
          System.out.println("Contatos de Emergencia adicionado");
        } catch (IOException e) {
          System.out.println("Erro ocorreu na hora de adicionar os contatos");
          e.printStackTrace();
        }
    
      }

 
    public void buscaUserName(String fileId,Usuario user) throws Exception{ //procura se o usuario ja existe , se não existir 
        IdNome id = new IdNome();
        if(id.UsuarioExiste(user.getNome()) == true){
            System.out.println("User ja existe");
        }
        else{
        CriaUsuario(fileId,user);
        }
    }

}

