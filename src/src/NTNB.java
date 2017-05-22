package src;

public class NTNB extends PrecisaoHelper {

	public double calcularValorNominal(double ipcat, double ipcat0, double ipcat1, double vn, int dc, int dct) {
		double fator = calcularFator(ipcat0, ipcat1, dc, dct);
		double valorNominal = fator * (ipcat / ipcat0) * vn;
		return definirPrecisao(valorNominal, PRECISAO_6);
	}

	private double calcularFator(double ipcat0, double ipcat1, int dc, int dct) {
		double base = ipcat1 / ipcat0;
		double expoente = (double) dc / dct;
		double fator = Math.pow(base, expoente);
		return definirPrecisao(fator, PRECISAO_6);
	}

	public double calcularJuros(double vna, int dcp, int dct, int n, double i) {
		double fatorJuros = calcularFatorJuros(dcp, dct, n, i);
		double juros = vna * (fatorJuros - 1);
		return definirPrecisao(juros, PRECISAO_6);
	}

	private double calcularFatorJuros(int dcp, int dct, int n, double i) {
		double base = (i / 100.0) + 1;
		base = Math.pow(base, (double) n / 12);
		double expoente = (double) dcp / dct;
		double fator = Math.pow(base, expoente);
		return definirPrecisao(fator, PRECISAO_8);
	}
}
