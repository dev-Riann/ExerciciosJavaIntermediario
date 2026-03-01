package projetoyoutube;
public class Gafanhoto extends Pessoa {
    //Atributos
    private String login;
    private int totAssistido;
 
    //Métodos Especiais
    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.setLogin(login);
        this.setTotAssistido(0);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "{login=" + login + ", totAssistido=" + totAssistido + '}';
    }
    
    
    
    
    
}
