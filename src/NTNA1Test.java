import org.junit.Assert;
import org.junit.Test;

public class NTNA1Test {

	private static final double PRECISAO_6 = 0.000001;
	private static final double PRECISAO_8 = 0.00000001;
	
	@Test
	public void valorDolarAtualizacaoIgualDolarBase() {
		NTNA1 ntna1 = new NTNA1();
		double amortizacao = ntna1.getAmortizacao(3.45, 3.45, 5000);
		Assert.assertEquals(5000.0, amortizacao, PRECISAO_6);
	}
	
	@Test
	public void valorDolarAtualizacaoMaiorDolarBase() {
		NTNA1 ntna1 = new NTNA1();
		double amortizacao = ntna1.getAmortizacao(3.5, 3.45, 5000);
		Assert.assertEquals(5072.463768116, amortizacao, PRECISAO_6);
	}
	
	@Test
	public void valorDolarAtualizacaoMenorDolarBase() {
		NTNA1 ntna1 = new NTNA1();
		double amortizacao = ntna1.getAmortizacao(3.3, 3.45, 5000);
		Assert.assertEquals(4782.608695652, amortizacao, PRECISAO_6);
	}
	
	@Test
	public void deveRetornarJuros() {
		NTNA1 ntna1 = new NTNA1();
		double juros = ntna1.getJuros(3000, "03/05/2017", "04/04/2017", 15);
		Assert.assertEquals(36.25, juros, PRECISAO_6);
	}
}
