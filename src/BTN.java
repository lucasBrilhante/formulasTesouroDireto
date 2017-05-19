import java.math.BigDecimal;
import java.math.RoundingMode;

public class BTN {

	public double calculoPrecoUnitario(double pu, double tr) {
		
		Double puChanged = BigDecimal.valueOf(pu)
			    .setScale(6, RoundingMode.FLOOR)
			    .doubleValue();

		return puChanged * (tr + 1);
	}

	public double ObterFj(double juros, double meses) {
		double fj = (juros/100) + 1;
		return (Math.pow(fj,(meses/12)) -1);
	}

	public double ObterJuros(double d, double i) {
		return d*i;
	}

	public double ObterPrincipal(double pu, double qtd) {
		return pu*qtd;
	}
}
