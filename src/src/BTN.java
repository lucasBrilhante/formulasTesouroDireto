package src;

public class BTN extends PrecisaoHelper {

	public double calculoPrecoUnitario(double pu, double tr) {
		double precoUnitario = pu * (tr + 1);
		return definirPrecisao(precoUnitario, PRECISAO_6);
	}

	public double ObterFj(double juros, double meses) {
		double fj = (juros/100) + 1;
		return (Math.pow(fj,(meses/12)) -1);
	}

	public double ObterJuros(double d, double i) {
		return d*i;
	}

	public double ObterPrincipal(double pu, double qtd) {
		return pu*qtd;
	}
}
