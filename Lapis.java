public class Lapis {

    // material madeira
    // por dentro o recheio é de grafite
    // 10cm 
    // 30g 
    // cor
    // nome/marca
    // maciez

    private String material;
    private String recheio;
    private String corRecheio;
    public int tamanho; 
    public double peso;
    private String estampa;
    public String nome; 
    public double maciez;

    //Método que gera um desenho e reduz a quantidade de grafite no lápis.  
    public void desenhar() { 
        System.out.print("Desenhei");
    }    

    //Quebrar o lápis
    public void quebrar() { 
        System.out.println("Quebrei!");
    }  

    //Machucar
    public void machucar(String alvo) {
        System.out.println(this.nome + " machucou " + alvo);
    }     

    //Apontado
    public void apontar(int quantidade) { 
        this.tamanho = this.tamanho - quantidade;
        System.out.println("o tamanho do lapis diminuiu em " + quantidade + "cm. Agora o lápis possui " + this.tamanho + "cm.");
    }       

    public static void main( String[] args ) {

        
        Lapis faber = new Lapis();
        faber.material = "madeira";
        faber.recheio = "grafite";
        faber.nome = "Faber";
        faber.machucar("Robson");

        Lapis leoleo = new Lapis();
        leoleo.material = "borracha";
        leoleo.quebrar();
        leoleo.nome = "Lápis Ninja";
        leoleo.machucar("Joana Vitória");
        leoleo.tamanho = 12;
        leoleo.apontar(3);


        Lapis belum = new Lapis();
        belum.material = "plastico";
        belum.tamanho = 10;
        belum.apontar(2);
        belum.apontar(2);
        belum.apontar(2);

    }
}