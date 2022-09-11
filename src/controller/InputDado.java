import java.util.Scanner;
public class InputDado{
    String arq; 
    public InputDado(){
    }

    public void setDado(String texto){
        Scanner teclado = new Scanner(System.in);
        System.out.println(texto);
        String d = teclado.next();
        this.arq = d;
    }

    public String getDado() {
        return this.arq;
    }
}