package model;
import java.util.ArrayList;
import java.util.HashMap;

public class Usuario {

    private String nome;
    private String endereco;
    private String foto;
    private String informacoesEmergencia;
    private HashMap<String, String> contatosEmergencia;  //(familiar, telefone)
    
    public Usuario(String nome, String endereco, String foto, String informacoesEmergencia, HashMap<String, String> contatosEmergencia) {
        this.nome = nome;
        this.endereco = endereco;
        this.informacoesEmergencia = informacoesEmergencia;
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
    public void informacoesEmergencia() {
        this.informacoesEmergencia = informacoesEmergencia;
    }

    // seta os contatos de emergencia do usuario
    public void setContatosEmergencia(HashMap<String, String> contatosEmergencia) {
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
    public String getInformacoesEmergencia() {
        return informacoesEmergencia;
    }

    // Retorna lisa de contatos de emergencia
    public HashMap<String, String> getContatosEmergencia() {
        return contatosEmergencia;
    }

}
