package questao4;

public class ContaCorrente {
    private int numero;
    private String titular;
    private float saldo;

    public ContaCorrente(int numero, String titular, float saldo){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;

    }

    public void sacar(float valor) {
        if (valor > 10000 || valor < 0) {
            System.out.println("Valor invalido!!!");

        } else {
            if (saldo >= valor) {
                saldo -= valor;
            } else {
                System.out.println("Saldo insuficiente!!!");
            }

        }
    }

    public void depositar(float valor){
        if (valor > 10000 || valor < 0) {
            System.out.println("Valor invalido!!!");

        } else {
            saldo += valor;

        }
    }

    public float consultarSaldo(){
        return saldo;
    }

}
