import java.util.Scanner;
import java.io.*;

class Main{
    public static void main(String [] args) throws Exception{
    Paciente paciente = new Paciente();
    IdNome IdList = new IdNome();
    InfoUsuario usuario = new InfoUsuario();
    IdList.CriaArquivo("ID");
    int numeroCadastro = 1;
    paciente.buscaUserName("000001"); // cria usuario se o nome não existir
    usuario.RetornaDadosCadastrais("000001"); // retorna dados cadastrais

}
}