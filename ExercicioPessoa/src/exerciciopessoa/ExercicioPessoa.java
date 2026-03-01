package exerciciopessoa;
public class ExercicioPessoa {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[3];
        p[0] = new Pessoa("Rian", 20, "M");
        p[1] = new Pessoa("Joaquina", 18, "F");
        p[2] = new Pessoa("Larissa", 23, "F");
        
        Livro[] l = new Livro[3];
        l[0] = new Livro("Memorias do Subsolo", p[0], 200, p[1]);
        l[1]= new Livro("Diario de um banana", p[0], 300, p[2]);
        
        l[0].abrir();
        l[0].folhear(199);
        l[0].detalhes();
        
        l[1].abrir();
        l[1].detalhes();
        
    }
    
}
