import java.math.BigDecimal;
import java.math.RoundingMode;

public class LFT {

	public static double calcCelic(double taxa) {
		// TODO Auto-generated method stub
		double x = (taxa/100)+1;
		double w = 0.003968254;
		double y = Math.pow(x,w);
		return y-1;
	}

	public static double calcC(double... celic) {
		double result = 1;
		
		for(double i : celic){
			result = result*(i+1);
		}
		Double celicR = BigDecimal.valueOf(result)
			    .setScale(8, RoundingMode.FLOOR)
			    .doubleValue();
		return celicR;
	}

	public static double calcLFT(double d, int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
