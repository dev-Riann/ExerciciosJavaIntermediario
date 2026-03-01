package aula011;
public class Tecnico extends Aluno {
    //Atributos
    private int registroProfiss;
    
    //Métodos Especiais
    public int getRegistroProfiss(){
        return this.registroProfiss;
    }
    public void setRegistroProfiss(int rp){
        this.registroProfiss = rp;
    }
    
    //Métodos Internos
    public void praticar(){
        System.out.println("Praticando...");
    }
}
