import java.io.*;
import javax.swing.ImageIcon;

public class DevolveDadosUser extends GerenciaArquivos 
{
    public DevolveDadosUser () {}

    //Busca no arquivo f se o nome ja existe
    public void RetornarDado (String file, String nome) throws Exception 
    { 
        //Tenta abrir o arquivo para leitura
        try (BufferedReader br = new BufferedReader(new FileReader(file + ".txt"))) 
        { 
            String line="";
            
            //Leitura de linha por linha no laço
            while ((line = br.readLine()) != null) 
            { 
                //Verifica se a linha contém o nome, se sim, imprime a linha
                if (line.contains(nome))
                    System.out.println(line); //Modificado pois era necessário devolver o dado para a interface gráfica
            }
        }

        catch (Exception e)
        {
            System.out.println("Erro na leitura do arquivo");
            e.printStackTrace();
        }
    }

    //Busca no arquivo f se o nome ja existe
    public ImageIcon Retornafoto (String caminhoFoto) throws Exception 
    { 
        try 
        {
            ImageIcon foto = new ImageIcon(caminhoFoto);
            return foto;
        } 
        
        catch (java.lang.NullPointerException e) 
        {
            System.out.println("Erro na leitura da foto");
            e.printStackTrace();
        }

        return null;
    }

    //Retorna as informações básicas do usuário por campo
    public void RetornaDadoPorCampo (String file, String campo) throws Exception 
    {
        RetornarDado(file, campo);

        // Retorna foto -> criar funçao -> função será chamada a parte, pois precisa
        // retornar o arquivo de foto para a interface gráfica
    }
}