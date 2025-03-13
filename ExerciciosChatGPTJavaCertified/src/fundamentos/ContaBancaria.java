package fundamentos;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private static int totalContas = 0;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
        ContaBancaria.totalContas++;
    }

    public void depositar(double valor) {
    	int [] corredor;
    	corredor.size();
        this.saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso na conta de " + this.titular);
    }

    public void sacar(double valor) {
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente para saque de R$ " + valor + " na conta de " + this.titular);
        } else {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso na conta de " + this.titular);
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual da conta de " + this.titular + ": R$ " + this.saldo);
    }
    
    public static int exibirTotalContas() {
    	return ContaBancaria.totalContas;
    }
    
    public void transferir(double valor, ContaBancaria destino) {
    	if(this.saldo >= valor) {
    		this.sacar(valor);
    		destino.depositar(valor);
    		System.out.println("Transferência de R$ "+  valor + " realizada com sucesso da conta de " + this.titular + " para " + destino.titular + ".");
    		this.exibirSaldo();
    		destino.exibirSaldo();
    	} else {
    		System.out.println("Para transferir, sua conta deve ter ao menos o valor da transferencia.");
    	}
    }

    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria("Mateus", 100.00);
        ContaBancaria c2 = new ContaBancaria("Dayelle", 200.00);
        c1.depositar(50);
        c1.sacar(30);
        c1.exibirSaldo();
        c2.depositar(50);
        c2.sacar(300);
        c2.exibirSaldo();
        System.out.println("Total de contas criadas: " + ContaBancaria.exibirTotalContas());
        c2.transferir(50, c1);
        
    }
}
