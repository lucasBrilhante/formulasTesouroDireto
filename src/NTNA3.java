
public class NTNA3 extends PrecisaoHelper {

	public double calcularValorNominal(double ussa, double ussb) {
		double valorNominal = (ussa / ussb) * 1000;
		return definirPrecisao(valorNominal, PRECISAO_6);
	}

	public double calcularJuros(double vna, double i, int n) {
		return vna * ((i / 100.0) * (n / 12.0));
	}
}
