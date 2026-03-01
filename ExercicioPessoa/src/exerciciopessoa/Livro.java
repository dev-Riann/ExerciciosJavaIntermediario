package exerciciopessoa;
public class Livro implements Publicacao {
    //Atributos
    private String titulo;
    private Pessoa autor, leitor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;

    //Métodos Especiais
    public Livro(String ttl, Pessoa aut, int ttPag, Pessoa leit){
        this.setTitulo(ttl);
        this.setAutor(aut);
        this.setTotPaginas(ttPag);
        this.setLeitor(leit);
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Pessoa getAutor() {
        return autor;
    }

    public void setAutor(Pessoa autor) {
        this.autor = autor;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    
    public void detalhes(){
        System.out.println("------------------------------");
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor: " + this.autor.getNome());
        System.out.println("Qnt de Pag. " + this.getTotPaginas());
        System.out.println("Pag. Atual: " + this.getPagAtual());
        if (this.getAberto()) {
            System.out.println("O livro esta aberto.");
        } else {
            System.out.println("O livro esta fechado.");
        }
        System.out.println(this.leitor.getNome() + " Ira ler.");
        System.out.println("------------------------------");

    }

    @Override
    public void abrir() {
        if (this.getAberto() == false) {
            this.setAberto(true);
            this.setPagAtual(1);
        } else {
            System.out.println("Ja aberto!");
        }
    }

    @Override
    public void fechar() {
        if (this.getAberto()) {
            this.setAberto(this.getAberto() == false);
        } else {
            System.out.println("Ja esta fechado.");
        }
    }

    @Override
    public void folhear(int p) {
        if (this.getAberto()){
            if(p <= this.getTotPaginas()){
                this.setPagAtual(p);
            } else {
                this.setPagAtual(200);
                System.out.println("ERRO, o livro nao tem tudo isso de pagina.");
            }
        } else {
            System.out.println("Livro nao esta aberto.");
        }
    }

    @Override
    public void avancarPag() {
        if (this.getAberto()) {
            this.setPagAtual(this.getPagAtual() + 1);
        } else {
            System.out.println("Livro esta fechado.");
        }
    }

    @Override
    public void voltarPag() {
        if (this.getAberto()) {
            this.setPagAtual(this.getPagAtual() - 1);
        } else {
            System.out.println("Livro esta fechado.");
        }
    }
    
    
}
