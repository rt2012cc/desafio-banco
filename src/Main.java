

public class Main {

	public static void main(String[] args) {
		
		Cliente renan = new Cliente();
		renan.setNome("renan");
		
		Conta cc = new ContaCorrente(renan);
		cc.depositar(100);
		
		
		Conta cp = new ContaPoupanca(renan);
		
		cc.transferir(100, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

}
