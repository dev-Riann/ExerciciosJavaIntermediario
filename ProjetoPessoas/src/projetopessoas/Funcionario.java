package projetopessoas;
public class Funcionario extends Pessoa {
    //Atributos
    private String setor;
    private boolean trabalhando;
    
    //Métodos Especiais
    public String getSetor(){
        return this.setor;
    }
    public void setSetor(String s){
        this.setor = s;
    }
    
    public boolean getTrabalhando(){
        return this.trabalhando;
    }
    public void setTrabalhando(boolean tr){
        this.trabalhando = tr;
    }
    
    //Métodos Intérnos
    public void mudaTrabalho(){
        this.setTrabalhando(!this.getTrabalhando()); //O contrario de se ta trabalhando ou não
    }
}
