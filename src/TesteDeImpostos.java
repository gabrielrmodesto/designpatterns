
public class TesteDeImpostos {

	public static void main(String[] args) {
		Imposto imposto = new ImpostoMuitoAlto(new ICMS());
		
		Orcamento orcamento = new Orcamento(500);
		
		double valor = imposto.calcula(orcamento);
		
		System.out.println(valor);
	}

}
