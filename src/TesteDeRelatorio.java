import java.util.ArrayList;
import java.util.List;

public class TesteDeRelatorio {

	public static void main(String[] args) {
		List<Conta> contas = new ArrayList<Conta>();
		RelatorioComplexo relatorio = new RelatorioComplexo();
	
		
		relatorio.cabecalho();
		relatorio.corpo(contas);
		relatorio.rodape();

	}

}
