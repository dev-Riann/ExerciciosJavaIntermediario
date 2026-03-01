package aula011;
public abstract class Pessoa {
    //Atributos
    protected String nome;
    protected int idade;
    protected String sexo;
    
    //Métodos Especiais
    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome = n;
    }
    
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int i){
        this.idade = i;
    }
    
    public String getSexo(){
        return this.sexo;
    }
    
    public void setSexo(String s){
        this.sexo = s;
    }
    
    //Métodos Internos
    public void fazerAniver(){
        this.setIdade(getIdade() + 1);
    }

    @Override
    public String toString() {
        return "Dados {" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
    
}
