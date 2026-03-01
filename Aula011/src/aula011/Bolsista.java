package aula011;
public class Bolsista extends Aluno {
    //Atributos
    private float bolsa;
    
    //Métodos Especiais
    public float getBolsa(){
        return this.bolsa;
    }
    public void setBolsa(float b){
        this.bolsa = b;
    }
    
    //Métodos Internos
    public void renovarBolsa(){
        System.out.println("Renovando a bolsa de " + this.getNome());
    }
    
    @Override
    public void pagarMensal(){
        System.out.println(this.getNome() + " eh Bolsista! Desconto incluso.");
    }
}
