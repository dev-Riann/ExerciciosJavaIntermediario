package aula007;
public class Lutador {
    //Atributos
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;

    
    public Lutador(String n, String na, int i, float alt, float p, int v, int d, int e){
        this.setNome(n);
        this.setNacionalidade(na);
        this.setIdade(i);
        this.setAltura(alt);
        this.setPeso(p);
        this.setVitorias(v);
        this.setDerrotas(d);
        this.setEmpates(e);
    }
    //Métodos Especiais|Acessores
    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String n) {
        this.nacionalidade = n;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float a) {
        this.altura = a;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float p) {
        this.peso = p;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.getPeso() < 52.2){
            this.categoria = "Invalido";
        } else if(getPeso() <= 70.3){
            this.categoria = "Peso Leve";
        } else if (getPeso() <= 83.9){
            this.categoria = "Medio";
        } else if (getPeso() < 120.2){
            this.categoria = "Pesado";
        } else {
            this.categoria = "Invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int v) {
        this.vitorias = v;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int d) {
        this.derrotas = d;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int e) {
        this.empates = e;
    }
    
    
    //Métodos Públicos
    public void apresentar(){
        System.out.println("------------------------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(this.getIdade() + " Anos");
        System.out.println(this.getAltura() + "m de altura");
        System.out.println("Pesando " + this.getPeso() + "Kg");
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpates());
        System.out.println("------------------------------");
    }
    
    public void status(){
        System.out.println("");
        System.out.println(getNome());
        System.out.println(this.getNome() + " Eh um peso " + getCategoria());
        System.out.println(getVitorias() + " vitorias");
        System.out.println(getDerrotas() + " derrotas");
        System.out.println(getEmpates() + " empates");
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    
    
}
