
public class TesteAcao {

	public static void main(String[] args) {
		NotaFiscalBuilder builder = new NotaFiscalBuilder();

		builder.adicionaAcao(new EnviadorDeEmail());
		builder.adicionaAcao(new NotaFiscalDAO());
		builder.adicionaAcao(new EnviadorDeSms());
		builder.adicionaAcao(new Impressora());

		NotaFiscal nf = builder.paraEmpresa("Teste").comCnpj("123").comItem(new ItemDaNota("nome", 100))
				.comObservacoes("obs").naData(null).constroi();
		
		System.out.println(nf.getValorBruto());
	}

}
