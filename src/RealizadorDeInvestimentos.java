
public class RealizadorDeInvestimentos {
	public void realiza(Conta conta, Investimento investimento) {
		double resultado = investimento.calcula(conta);
		
		System.out.println("Novo saldo: " + conta.getSaldo());
	}
}
