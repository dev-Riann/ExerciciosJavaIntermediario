package exerciciopessoa;
public class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private String sexo;
    
    //Métodos Especiais
    public Pessoa(String no, int id, String se){
        this.setNome(no);
        this.setIdade(id);
        this.setSexo(se);
    }
    
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
    
    //Métodos públicos
    public void fazerAniver(){
        this.setIdade(getIdade() + 1);
        System.out.println("Parabens! Hoje voce completa " + this.getIdade());
    }
}
