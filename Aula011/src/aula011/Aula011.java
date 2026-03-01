package aula011;
public class Aula011 {
    public static void main(String[] args) {
       /* Visitante v1 = new Visitante();
        v1.setNome("Jose");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());*/
        
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula(1111);
        a1.setCurso("TI");
        a1.setIdade(17);
        a1.setSexo("M");
        a1.pagarMensal();
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1222);
        b1.setNome("jubleu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensal();
        
        Tecnico t1 = new Tecnico();
        t1.setNome("Rian");
        t1.setIdade(20);
        t1.setSexo("Masculino");
        t1.setRegistroProfiss(156352);
        t1.fazerAniver();
        t1.pagarMensal();
        t1.setCurso("Engenharia");
        System.out.println(t1.getCurso());
        System.out.println(t1.toString());
    }
    
}
