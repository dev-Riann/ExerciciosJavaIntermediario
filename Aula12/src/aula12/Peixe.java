package aula12;
public class Peixe extends Animal {
    //Atributos
    private String corEscama;
    
    //Métodos Especiais
    public String getCorEscama(){
        return this.corEscama;
    }
    public void setCorEscama(String ce){
        this.corEscama = ce;
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Substancias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe nao faz som.");
    }
    
    public void soltarBolha(){
        System.out.println("Soltando bolhas...");
    }
    
}
