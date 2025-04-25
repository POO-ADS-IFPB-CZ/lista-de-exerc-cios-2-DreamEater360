package questao3;

public class Main {

    public static void main(String[] args){
        Produto produto1 = new Produto(101, "Mouse Gamer", 149.99, 50);

        produto1.exibirInfo();

        produto1.setPreco(-20.0);
        produto1.exibirInfo();
        produto1.setPreco(129.90);
        produto1.exibirInfo();

    }
}
