package projetopessoas;
public class Aluno extends Pessoa {
    //Atributos
    private int matr;
    private String curso;
    
    //Métodos Especiais
    public int getMatr(){
        return this.matr;
    }
    public void setMatr(int m){
        this.matr = m;
    }
    
    public String getCurso(){
        return this.curso;
    }
    public void setCurso(String c){
        this.curso = c;
    }
    
    //Métodos Internos
    public void cancelarMatr(){
        System.out.println("Matricula sera cancelada.");
    }
}
