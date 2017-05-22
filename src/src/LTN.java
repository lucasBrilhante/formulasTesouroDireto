package src;

public class LTN extends PrecisaoHelper {

	public double calcLTN(double n) {
		double result = 1000/(Math.pow(1+n,0.003968254));
		return definirPrecisao(result, PRECISAO_6);
	}
}
