import java.io.*;
import java.util.*;
import java.net.URL;
import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;

public class GerenciaArquivos
{
    public GerenciaArquivos () {}

    //Cria o arquivo com o nome que você quer
    public void CriaArquivo (String file) 
    { 
        File f = new File(file+".txt"); 

        try
        {
            f.createNewFile();
            System.out.print("Arquivo criado com sucesso!");
        } 
        
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }

    //Lê arquivo e retorna o conteúdo 
    public String LeArquivo (String file) 
    { 
        String conteudoArquivo="";
        
        try 
        {
            File f = new File(file+".txt");

            Scanner myReader = new Scanner(f);
            
            while (myReader.hasNextLine()) 
            {
                String data = myReader.nextLine();
                conteudoArquivo.concat(data+"\n"); //Outra modificação levando em consideração que os dados devem voltar para a interface gráfica, e não para o terminal
            }

            myReader.close();
            return conteudoArquivo;
        } 
        
        catch (FileNotFoundException e) 
        {
            System.out.println("Erro na criacao, tente mais tarde");
            e.printStackTrace();
        }

        return null;
    }

    //Devolve o resultado da gravação da imagem no formato texto
    public String guardaImagem (String fileid, String urlImage)
    {
        BufferedImage image = null;
        
        try 
        {
            URL url = new URL(urlImage);
            image = ImageIO.read(url);
            
            ImageIO.write(image, "jpg", new File(fileid+".jpg"));
            ImageIO.write(image, "gif", new File(fileid+".gif"));
            ImageIO.write(image, "png", new File(fileid+".png"));
            
            return "Imagem salva com sucesso!";
        } 

        catch (IOException e) 
        {
            e.printStackTrace();
        }
        
        return "Problema ao salvar a imagem!";
    }
}
