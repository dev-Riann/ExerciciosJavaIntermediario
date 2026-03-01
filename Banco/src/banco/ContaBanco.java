package banco;
public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Métodos Especiais 
    public ContaBanco(){
        this.setStatus(false);
        this.setSaldo(0f);
    }
    
    public int getNumConta(){
        return this.numConta;
    }
    public void setNumConta(int n){
        this.numConta = n;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String t){
        this.tipo = t;
    }
    
    public String getDono(){
        return this.dono;
    }
    public void setDono(String d){
        this.dono = d;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float s){
        this.saldo = s;
    }
    
    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean s){
        this.status = s;
    }
    
    //Métodos Personalizados
    public void estadoAtual(){
        System.out.println("========================");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t.equals("CC")) {
            this.setSaldo(50);
        } else if (t.equals("CP")) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("ERRO! Você ainda possui dinheiro na conta.");
        } else if (this.getSaldo() < 0) {
            System.out.println("ERRO! Você ainda possui débitos pendentes.");
        } else {
            this.setStatus(false);
            System.out.println("Conta encerrada com sucesso!");
        }
    }
    
    public void depositar(float v){
        if (getStatus() == false){
            System.out.println("ERRO! Não existe conta.");
        } else {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta de " + this.getDono());
        }
    }
    
    public void sacar(float v){
        if (this.getStatus() == true){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque de "+ v +" realizado na conta de " + this.getDono());
            } else {
                System.out.println("ERRO! Você não possui dinheiro suficiente.");
            }
        } else {
            System.out.println("ERRO! Não existe conta.");
        }
    }
    
    public void pagarMensal(){
        float v = 0;
        if (this.getTipo() == "CC"){
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.getStatus() == true){
            if (this.getSaldo() > v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga com sucesso por " + this.getDono());
            } else {
                System.out.println("ERRO! Sem Dinheiro.");
            }
        } else{
            System.out.println("ERRO! Conta Inexistente.");
        }
    }   
}
