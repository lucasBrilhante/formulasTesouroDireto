package src;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PrecisaoHelper {

	public static final int PRECISAO_4 = 4;
	public static final int PRECISAO_6 = 6;
	public static final int PRECISAO_8 = 8;

	public double definirPrecisao(double valor, int precisao) {
		Double valorOriginal = new Double(valor);
		Double valorFormatado = BigDecimal.valueOf(valorOriginal)
				.setScale(precisao, RoundingMode.HALF_UP)
				.doubleValue();
		return valorFormatado;
	}
}
