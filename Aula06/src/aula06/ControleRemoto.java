package aula06;
public class ControleRemoto implements Controlador {
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //Métodos Especiais
    public ControleRemoto(){
        this.setVolume(0);
        this.setLigado(false);
        this.setTocando(false);
    }
    
    private int getVolume(){
        return this.volume;
    }
    private void setVolume(int v){
        this.volume = v;
    }
    
    private boolean getLigado(){
        return this.ligado;
    }
    private void setLigado(boolean l){
        this.ligado = l;
    }
    
    private boolean getTocando(){
        return this.tocando;
    }
    private void setTocando(boolean t){
        this.tocando = t;
    }
   
    //Métodos Abstratos

    @Override
    public void ligar() {
        this.setVolume(50);
        if (this.getLigado() == false){
            this.setLigado(true);
        }
    }

    @Override
    public void desligar() {
        if (this.getLigado() == true){
           this.setLigado(false);
        }
    }

    @Override
    public void abrirMenu() {
        System.out.println("----- MENU -----");
        System.out.println("Esta ligado? " + this.getLigado());
        System.out.println("Esta tocando? " + this.getTocando());
        System.out.println(getTocando());
        System.out.println("Volume: " + this.getVolume());
        for (int i = 0; i < this.getVolume(); i+= 10){
            System.out.print("|");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado() && this.getVolume() <= 90){
            this.setVolume(this.getVolume() + 10);
        } else if (this.getLigado() && this.getVolume() >= 100){
            System.out.println("ERRO!VOLUME MAXIMO");
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado() && this.getVolume() >= 10){
            this.setVolume(this.getVolume() - 10);
        } else if(this.getLigado() && this.getVolume() < 10){
            System.out.println("ERRO! Sem Som.");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        } else if (this.getLigado() == false){
            System.out.println("ERRO! TV Desligada.");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        } else if (this.getLigado() == false){
            System.out.println("ERRO! TV Desligada.");
        }
    }
    

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        } else if (this.getLigado() == false) {
            System.out.println("ERRO! TV Desligada.");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()){
            this.setTocando(false);
        } else if (this.getLigado() == false){
            System.out.println("ERRO! TV Desligada.");
        }
    }
    
}
