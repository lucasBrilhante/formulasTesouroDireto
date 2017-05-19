
public class NTNA1 extends PrecisaoHelper {

	public double calculaAmortizacao(double ussa, double ussb, int vl) {
		double valorAmortizacao = (ussa / ussb) * vl;
		return definirPrecisao(valorAmortizacao, PRECISAO_6);
	}

	public double calculaJuros(int puam, String dtp, String dtup, int i) {
		double fatorJuros = calculaFator(dtp, dtup, i);
		double juros = puam * fatorJuros;
		return definirPrecisao(juros, PRECISAO_6);
	}

	private double calculaFator(String dtp, String dtup, double i) {
		int diferencaDias = (DataHelper.calculaDiferencaDias(dtup, dtp));
		double fatorJuros = (diferencaDias / 360.0) * (i / 100.0);
		return definirPrecisao(fatorJuros, PRECISAO_8);
	}
}
