
import java.util.ArrayList;

public class Usuario {

    private String nome;
    private String endereco;
    private String foto;
    private ArrayList<String> informacoesEmergencia;
    private ArrayList<String> familiares;
    private ArrayList<String> contatosEmergencia;

    public Usuario(String nome, String endereco, String foto, ArrayList<String> informacoesEmergencia, ArrayList<String> familiares, ArrayList<String> contatosEmergencia) {
        this.nome = nome;
        this.endereco = endereco;
        this.foto = foto;
        this.informacoesEmergencia = informacoesEmergencia;
        this.familiares = familiares;
        this.contatosEmergencia = contatosEmergencia;
    }

    // seta o nome do usuario
    public void setNome(String nome) {
        this.nome = nome;
    }

    // seta o endereco do usuario
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // seta a foto do usuario
    public void setFoto(String foto) {
        this.foto = foto;
    }

    // seta informacoes de emergencia do usuario
    public void setInformacoesEmergencia(ArrayList<String> informacoesEmergencia) {
        this.informacoesEmergencia = informacoesEmergencia;
    }

    // seta os familiares do usuario
    public void setFamiliares(ArrayList<String> familiares) {
        this.familiares = familiares;
    }

    // seta os contatos de emergencia do usuario
    public void setContatosEmergencia(ArrayList<String> contatosEmergencia) {
        this.contatosEmergencia = contatosEmergencia;
    }



    // Retorna o nome do usuário
    public String getNome() {
        return nome;
    }

    // Retorna o endereço do usuário
    public String getEndereco() {
        return endereco;
    }

    // Retorna o endereço da foto do usuário
    public String getFoto() {
        return foto;
    }

    // Retorna as informações de emergência do usuário
    public ArrayList<String> getInformacoesEmergencia() {
        return informacoesEmergencia;
    }

    // Retorna lista de familiares
    public ArrayList<String> getFamiliares() {
        return familiares;
    }

    // Retorna lisa de contatos de emergencia
    public ArrayList<String> getContatosEmergencia() {
        return contatosEmergencia;
    }


}
