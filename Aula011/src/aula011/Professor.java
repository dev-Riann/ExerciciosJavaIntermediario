package aula011;
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
    
    //Métodos Internos
    public void receberAumento(float a){
        this.setSalario(getSalario() + a);
    }
}
