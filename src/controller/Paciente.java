
public class Paciente extends InformacoesPessoais{
    String telefone;
    public Paciente()
    {
    }
    public void setTelefone(String fileId){
            InputDado tel = new InputDado();
            tel.setDado(" Digite o telefone de um médico");
            this.telefone =  tel.getDado();
          }
    

    public String getTelefone(){
        return this.telefone;
    }
}

