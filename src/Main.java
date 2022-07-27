
public class Main {

	public static void main(String[] args) {
		Cliente Francisco = new Cliente();
		Francisco.setNome("Francisco Leandro");
		
		Conta cc = new ContaCorrente(Francisco);
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(Francisco);
		
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
