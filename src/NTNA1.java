
public class NTNA1 {

	public double calculaAmortizacao(double ussa, double ussb, int vl) {
		return (ussa / ussb) * vl;
	}

	public double calculaJuros(int puam, String dtp, String dtup, int i) {
		double fatorJuros = calculaFator(dtp, dtup, i);
		return puam * fatorJuros;
	}

	private double calculaFator(String dtp, String dtup, double i) {
		int diferencaDias = (DataHelper.calculaDiferencaDias(dtup, dtp));
		return (diferencaDias / 360.0) * (i / 100.0);
	}
}
