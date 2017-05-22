package src;

public class LFTA extends LFT{

	public double calcVNa(double c, double ve, double tacr, int du, int dut, int P, int N) {
		double result;
		result = c*ve;
		double x;
		double y;
		x = 1+ tacr/100;
		x = Math.pow(x,du/dut);
		y = 1+ tacr;
		y = Math.pow(y,du/dut)*(1/(P-N));
		return result*(x-y);
	}
}
