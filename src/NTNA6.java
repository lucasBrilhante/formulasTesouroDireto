
public class NTNA6 extends PrecisaoHelper {

	public double calcularValorNominalAtualizado(double ussa, double ussb, double ve) {
		return (ussa / ussb) * ve;
	}

	public double calcularJuros(double vna, String dtp, String dtup, double i) {
		int diferencaDias = DataHelper.calculaDiferencaDias(dtp, dtup);
		double fatorJuros = (diferencaDias / 360.0) * (i / 100.0);
		double juros = vna * fatorJuros;
		return definirPrecisao(juros, PRECISAO_6);
	}
}
