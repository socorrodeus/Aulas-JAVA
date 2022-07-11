public class Garrafa {

    // característica
    public String tampa_formato = "Redondo"; // poderia ser quadrada
    private String tampa_material = "Plastico"; // Poderia ser de Metal?
    public Boolean tampa_rosca = true;
    private String material;
    public int altura;
    public int nome;
    private int largura;
    public int volume_maximo;
    public int volume_atual = 900;
    private String conteudo;
    public double abertura; 
    private String rotulo = "Coca-Cola";
    public Boolean termica = false;

    //Métodos ou Ações. Aquilo que o objeto pode fazer.
    public void beber(){
        System.out.println("Alguem bebeu 150ml de " + this.conteudo);
        this.reduzir(150);
    }

    public void reduzir(int quantidade){
       // this.volume_atual -= quantidade;
        this.volume_atual = this.volume_atual - quantidade;
        System.out.println("A garrafa agora possui " +  this.volume_atual);
    }

    public void armazenar(){
        System.out.println("Essa garrafa possui" + this.conteudo);
    }

    public void conservar_temperatura() {
        if (this.termica == true) {
            System.out.println("Essa garrafa eh termica");
        } else {
            System.out.println("Essa garrafa nao eh termica");
        }
    }

    public void bater(String alvo) {
        System.out.println("Essa garrafa bateu em " + alvo);
    }

    public static void main( String[] args ) {

        Garrafa garrafa_do_gabriel = new Garrafa();
        garrafa_do_gabriel.material = "Alumínio";
        garrafa_do_gabriel.volume_maximo = 750;
        garrafa_do_gabriel.conteudo = "Guarana";
        garrafa_do_gabriel.termica = true;

        Garrafa garrafa_do_leo = new Garrafa();
        garrafa_do_leo.material = "Plastico";
        garrafa_do_leo.conteudo = "agua";
        garrafa_do_leo.termica = false;

        garrafa_do_leo.beber();
        garrafa_do_leo.beber();
        garrafa_do_leo.beber();

    }


}