package aula011;
public class Aluno extends Pessoa {
    //Atributos
    private int matricula;
    private String curso;
    
    //Métodos Especiais
    public int getMatricula(){
        return this.matricula;
    }
    public void setMatricula(int m){
        this.matricula = m;
    }
    
    public String getCurso(){
        return this.curso;
    }
    public void setCurso(String c){
        this.curso = c;
    }
    
    //Métodos Internos
    public void pagarMensal(){
        System.out.println("Pagando Mensalidade de " + this.nome);
    }
}
