package aula13;
public abstract class Animal {
    //Atributos
    protected float peso;
    protected int idade;
    protected int membros;
    
    //Métodos Especiais
    public float getPeso(){
        return this.peso;
    }
    public void setPeso(int p){
        this.peso = p;
    }
    
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int i){
        this.idade = i;
    }
    
    public int getMembros(){
        return this.membros;
    }
    public void setMembros(int m){
        this.membros = m;
    }
    
    //Métodos Internos
    public abstract void emitirSom();

}

