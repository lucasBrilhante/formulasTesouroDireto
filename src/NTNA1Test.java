import org.junit.Assert;
import org.junit.Test;

public class NTNA1Test {

	private static final double ERRO = 0.000001;
	
	@Test
	public void valorDolarAtualizacaoIgualDolarBase() {
		NTNA1 ntna1 = new NTNA1();
		double amortizacao = ntna1.getAmortizacao(3.45, 3.45, 5000);
		Assert.assertEquals(5000.0, amortizacao, ERRO);
	}
	
	@Test
	public void valorDolarAtualizacaoMaiorDolarBase() {
		NTNA1 ntna1 = new NTNA1();
		double amortizacao = ntna1.getAmortizacao(3.5, 3.45, 5000);
		Assert.assertEquals(5072.463768116, amortizacao, ERRO);
	}
}
