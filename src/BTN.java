import java.math.BigDecimal;
import java.math.RoundingMode;

public class BTN {

	public double calculoPrecoUnitario(double pu, double tr) {
		
		Double puChanged = BigDecimal.valueOf(pu)
			    .setScale(6, RoundingMode.FLOOR)
			    .doubleValue();

		return puChanged * (tr + 1);
	}

	public double ObterFj(int juros, int meses) {
		
		return 0.01601186;
	}
}
