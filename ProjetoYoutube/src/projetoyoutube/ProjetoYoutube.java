package projetoyoutube;
public class ProjetoYoutube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Sobre LudoViajante");
        v[1] = new Video("Aula 12 de Java");
        v[2] = new Video("Ultima aula de Java");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Rian", 20, "M", "rianndojava");
        g[1] = new Gafanhoto("Julinha", 19, "F", "Julha");
        //System.out.println(g[0].toString());
        
        //System.out.println(v[0].toString());
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]); //Rian assiste Ultima aula de Java
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        vis[1] = new Visualizacao(g[0], v[0]); //Rian assiste a LudoViajante
        vis[0].avaliar(87.0f);
        System.out.println(vis[0].toString());
    }
    
}
