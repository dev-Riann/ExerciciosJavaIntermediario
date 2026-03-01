package aula12;
public class Aula12 {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        m.locomover();
        
        System.out.println("");
        
        Canguru c1 = new Canguru();
        c1.locomover();
        c1.usarBolsa();
        c1.emitirSom();
        
        System.out.println("");
        
        Cachorro k1 = new Cachorro();
        k1.locomover();
        k1.enterrarOsso();
        k1.emitirSom();
        
        
    }
    
}
