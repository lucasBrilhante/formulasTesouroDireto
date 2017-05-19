
public class NTNA1 {

	public double getAmortizacao(double ussa, double ussb, int vl) {
		return (ussa / ussb) * vl;
	}

	public double getJuros(int puam, String dtp, String dtup, int i) {
		return puam * calculaFator(dtp, dtup, i);
	}

	private double calculaFator(String dtp, String dtup, double i) {
		return (calculaDiferencaDias(dtup, dtp) / 360.0) * (i / 100.0);
	}

	private int calculaDiferencaDias(String dataInicial, String dataFinal) {
		String dataInicio[] = dataInicial.split("/");
		int diaInicio = Integer.parseInt(dataInicio[0]);
		int mesInicio = Integer.parseInt(dataInicio[1]);
		int anoInicio = Integer.parseInt(dataInicio[2]);
		int totalHorasInicio = (diaInicio*24) + (mesInicio*30*24) + (anoInicio*360*24);

		String dataFim[] = dataFinal.split("/");
		int diaFim = Integer.parseInt(dataFim[0]);
		int mesFim = Integer.parseInt(dataFim[1]);
		int anoFim = Integer.parseInt(dataFim[2]);
		int totalHorasFim = (diaFim*24) + (mesFim*30*24) + (anoFim*360*24);

		return (totalHorasFim - totalHorasInicio) / 24;
	}
}
