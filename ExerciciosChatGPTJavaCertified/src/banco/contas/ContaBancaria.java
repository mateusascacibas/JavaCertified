package banco.contas;

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
    
    public double getSaldo() {
    	return this.saldo;
    }
}
