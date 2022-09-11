

public class ContatoMedico {
    private String nome;
    private String telefone;
    private String endereco;
    private String foto;

    public ContatoMedico(String nome, String telefone, String endereco, String foto) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getFoto() {
        return foto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
}
