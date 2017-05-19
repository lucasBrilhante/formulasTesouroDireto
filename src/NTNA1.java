
public class NTNA1 {

	public double getAmortizacao(double ussa, double ussb, int vl) {
		return (ussa / ussb) * vl;
	}

	public double getJuros(int puam, String dtp, String dtup, int i) {
		return puam * calculaFator(dtp, dtup, i);
	}

	private double calculaFator(String dtp, String dtup, double i) {
		return (DataHelper.calculaDiferencaDias(dtup, dtp) / 360.0) * (i / 100.0);
	}
}
