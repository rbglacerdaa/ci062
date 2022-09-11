import java.io.*;
//import java.nio.file.attribute.usuarioPrincipalLookupService; Qual o uso?

public class ArmazenaInformacoesPessoais
{ 
    //Cria usuario e armazena os arquivos dele 
    public static void CriaUsuario (String fileId, Usuario usuario) 
    { 
        try 
        {
            FileWriter f = new FileWriter(fileId+".txt", true);
            
            f.write
            (
                "Nome:"+usuario.getNome() 
                +"\nEndereco:" +usuario.getEndereco() 
                +"\nEmail: "+usuario.getEmail() 
                +"\nInformacoes de Emergencia: "+usuario.getInformacoesEmergencia() 
                +"\nFamiliares: "+usuario.getFamiliares() 
                +"\nContatos de Emergencia: "+usuario.getContatosEmergencia()
                +"\nFoto: "+usuario.getFoto()
                +"\n"
            );

            f.close();
            System.out.println("Novo Usuario Criado"); //Retonar string para ser usada na interface gráfica
        } 
        
        catch (IOException e) 
        {
            System.out.println("Erro na criacao do novo usuario");
            e.printStackTrace();
        }
    }

    //Cria usuario e armazena os arquivos dele   
    public static void addInformacoesEmergencia (String fileId, Usuario usuario) 
    { 
        try 
        {
            FileWriter f = new FileWriter(fileId+".txt", true);
            f.write("InformacoesEmergencia:"+usuario.getInformacoesEmergencia());
        
            f.close();
            System.out.println("Informacoes de emergencia adicionadas");
        } 

        catch (IOException e) 
        {
            System.out.println("Erro na insercao das informacoes de emergencia");
            e.printStackTrace();
        }
    
    }

    // cria usuario e armazena os arquivos dele 
    public static void addFamiliares(String fileId,Usuario usuario) {
        try 
        {
            FileWriter f = new FileWriter(fileId+".txt", true);
            
            f.write("Familiares:"+usuario.getFamiliares()+"\n");
        
            f.close();
            System.out.println("Familiares adicionadas");
        } 
        
        catch (IOException e) 
        {
            System.out.println("Erro na insercao de familiares");
            e.printStackTrace();
        }
      }

    // cria usuario e armazena os arquivos dele 
    public static void add(String fileId,Usuario usuario) 
    { 
        try 
        {
            FileWriter f = new FileWriter(fileId+".txt", true);
            
            f.write("Contatos Emergencia:"+usuario.getContatosEmergencia()+"\n");

            f.close();
            System.out.println("Contatos de Emergencia adicionado");
        } 
        
        catch (IOException e) 
        {
            System.out.println("Erro ocorreu na hora de adicionar os contatos");
            e.printStackTrace();
        }
    }

    //procura se o usuario ja existe , se não existir 
    public static void buscausuarioName (String fileId, Usuario usuario) throws Exception
    { 
        IdNome id = new IdNome();

        if (id.UsuarioExiste(usuario.getNome()) == true)
            System.out.println("Usuario ja existe");
        
        else
            CriaUsuario(fileId,usuario);
    }
}

