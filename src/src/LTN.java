package src;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class LTN {

	public double calcLTN(double n) {
		// TODO Auto-generated method stub
		double result = 1000/(Math.pow(1+n,0.003968254));
		Double ltn = BigDecimal.valueOf(result)
			    .setScale(6, RoundingMode.FLOOR)
			    .doubleValue();
		return ltn;
	}

}
