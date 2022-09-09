import java.io.*;
public class InformacoesPessoais{ //i
    String nome;
    String endereco;
    String email;
        // foto
    //Familiares familiares; criar estrutura

    public void CriaUsuario(String fileId,String nome,String endereco,String email) { /// cria usuario e armaszena os arquivos dele 
        try {
          FileWriter f = new FileWriter(fileId+".txt", true);
          f.write(" Nome:"+nome+ "\n Endereco:" +endereco + "\n Email:"+email + "\n");
          f.close();
          System.out.println("Novo Usuario Criado");
        } catch (IOException e) {
          System.out.println("Erro ocorreu na hora de criar o Usuario ");
          e.printStackTrace();
        }
    
      }
    public void setDadosCadastrais(String fileId){ /// da o input de dados cadastrais
          InputDado nome = new InputDado();
          nome.setDado(" Digite nome do paciente");
          this.nome = nome.getDado();
          InputDado end = new InputDado();
          end.setDado(" Digite o endereco");
          this.endereco = end.getDado();
          InputDado email = new InputDado();
          email.setDado(" Digite o email");
          this.email = email.getDado();
          
        }
    public void getDadosCadastrais(){
        System.out.println(this.nome);
        System.out.println(this.endereco);
        System.out.println(this.email);
    }
    public void buscaUserName(String fileId) throws Exception{ //procura se o usuario ja existe , se não existir 
        IdNome id = new IdNome();
        setDadosCadastrais(fileId);
        if(id.UsuarioExiste(this.nome) == true){
            System.out.println("User ja existe");
        }
        else{
        CriaUsuario(fileId, this.nome, this.endereco, this.email);
        }
    }

}

