package aula13;
public class Mamifero extends Animal {
    //Atributos
    protected String corPelo;
    
    //Métodos Especiais
    public String getCorPelo(){
        return this.corPelo;
    }
    public void setCorPelo(String cp){
        this.corPelo = cp;
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamifero");
    }
    
}
