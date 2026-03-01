package projetopessoas;
public class Professor extends Pessoa {
    //Atributos
    private String especialidade;
    private float salario;
    
    //Métodos Especiais
    public String getEspecialidade(){
        return this.especialidade;
    }
    public void setEspecialidade(String esp){
        this.especialidade = esp;
    }
    
    public float getSalario(){
        return this.salario;
    }
    public void setSalario(float s){
        this.salario = s;
    }
    
    //Métodos Intérnos
    public void receberAum(float aum){
        this.setSalario(getSalario() + aum);
    }
}
