package aula007;

import java.util.Random;

public class Luta{
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //Métodos Especiais
    public Lutador getDesafiado(){
        return this.desafiado;
    }
    public void setDesafiado(Lutador desafiado){
        this.desafiado = desafiado;
    }
    
    public Lutador getDesafiante(){
        return this.desafiante;
    }
    public void setDesafiante(Lutador desafiante){
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return this.rounds;
    }
    public void setRounds(int rounds){
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return this.aprovada;
    }
    public void setAprovada(boolean aprovada){
        this.aprovada = aprovada;
    }
    
    
    
    //Métodos Públicos
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && (l1 != l2)) {
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    
    public void desmarcarLuta(){
        
    }
    
    public void lutar(){
        if (this.getAprovada()) {
            System.out.println("### DESAFIADO ###");
            this.getDesafiado().apresentar();
            System.out.println("### DESAFIANTE ###");
            this.getDesafiante().apresentar();
            
            Random aleatorio = new Random();         //Instanciando um objeto chamado aleatorio
            int vencedor = aleatorio.nextInt(3);     //vencedor vai receber um valor aleatorio inteiro do objeto aleatorio de 0 a 2
            System.out.println("====== RESULTADO DA LUTA ======");
            switch(vencedor){
                case 0: //Empate
                    System.out.println("Empatou!");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                    break;
                    
                case 1: //Desafiado vence
                    System.out.println(this.desafiado.getNome() + " Venceu!");
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                    break;
                    
                case 2: //Desafiante vence
                    System.out.println(this.desafiante.getNome() + " Venceu!");
                    this.getDesafiante().ganharLuta();
                    this.getDesafiado().perderLuta();
                    break;
            }
            System.out.println("==============================");
            
        } else {
            System.out.println("Luta nao pode acontecer");
        }
    }
}
