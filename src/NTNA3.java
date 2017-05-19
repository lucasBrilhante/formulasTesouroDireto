
public class NTNA3 extends PrecisaoHelper {

	public double calcularValorNominal(double ussa, double ussb) {
		double valorNominal = (ussa / ussb) * 1000;
		return definirPrecisao(valorNominal, PRECISAO_6);
	}

	public double calcularJuros(double vna, double i, int n) {
		double fatorJuros = calcularFator(i, n);
		double juros = vna * fatorJuros;
		return definirPrecisao(juros, PRECISAO_6);
	}

	private double calcularFator(double i, int n) {
		double fatorJuros = (i / 100.0) * (n / 12.0);
		return definirPrecisao(fatorJuros, PRECISAO_8);
	}
}
