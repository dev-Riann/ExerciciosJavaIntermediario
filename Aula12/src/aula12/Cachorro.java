package aula12;
public class Cachorro extends Mamifero {
    
    //Métodos Cachorro
    public void enterrarOsso(){
        System.out.println("Enterrando Osso...");
    }
    
    public void abanarRabo(){
        System.out.println("Abanando rabo.");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("AU AU");
    }
}
