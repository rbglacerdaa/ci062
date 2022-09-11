import java.io.*;
import java.util.*;
import java.awt.*;
import java.net.URL;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
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

      public void LeArquivo(String file) { // le arquivo 
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
   public void  guardaImagem(String fileid,String urlImage){
    
    BufferedImage image = null;
    try {
       
        URL url = new URL(urlImage);
        image = ImageIO.read(url);
         
        ImageIO.write(image, "jpg",new File("id.jpg"));
        ImageIO.write(image, "gif",new File("id.gif"));
        ImageIO.write(image, "png",new File("id.png"));
         
    } catch (IOException e) {
        e.printStackTrace();
    }
    System.out.println("Imagem salva");
    }
   }
