import java.io.*;

public class IdNome extends GerenciaArquivos 
{
    public IdNome() {}

    public String CriaNovoID (String nome, String ID) 
    {
        try 
        {
            FileWriter ida = new FileWriter("ID.txt", true);
            ida.write(ID + " " + nome + "\n ");
            ida.close();
            return "Novo Usuario Criado"; //Retorna para a interface gráfica
        } 
        
        catch (IOException e) 
        {
            System.out.println("Erro ocorreu na hora de criar o Usuario ");
            e.printStackTrace();
        }

        return null;
    }

    // busca no arquivo id se o nome ja existe 
    public boolean UsuarioExiste (String nome)throws Exception 
    { 
        FileReader id = new FileReader("ID.txt");

        //Abre o ID.txt
        try (BufferedReader br = new BufferedReader(id)) 
        {
            String line="";
            
            //Leitura do arquivo linha por linha no laço
            while ((line = br.readLine()) != null) 
            { 
                //Verifica se a linha contém a palavra e então printa
                if(line.contains(nome))  
                    return true; 
            }
        }

        catch (Exception e)
        {
            System.out.println("Erro na leitura do arquivo");
            e.printStackTrace();
        }

        return false;
    }
}

