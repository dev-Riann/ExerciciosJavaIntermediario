package aula12;
public class Ave extends Animal {
    //Atributos
    private String corPena;
    
    //Métodos Especiais
    public String getCorPena(){
        return this.corPena;
    }
    public void setCorPena(String cp){
        this.corPena = cp;
    }
    
    //Métodos Abstratos
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo fruta...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Piu Piu...");
    }
    
    //Métodos Ave
    public void fazerNinho(){
        System.out.println("Fazendo ninho...");
    }
    
}
