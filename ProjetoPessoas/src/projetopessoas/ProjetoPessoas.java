package projetopessoas;
public class ProjetoPessoas {
    public static void main(String[] args) {
        //Programa Principal
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");
        
        p1.setSexo("Masculino");
        p1.setIdade(20);
        p2.setSexo("Feminino");
        p2.setIdade(22);
        p3.setSexo("Masculino");
        p3.setIdade(19);
        p4.setIdade(18);
        p4.setSexo("Feminino");
        
        p2.setCurso("Engenharia");
        p3.setSalario(3000f);
        p4.setSetor("Estoque");
        p3.receberAum(350f);
        
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
    
}
