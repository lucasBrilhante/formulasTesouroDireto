
public class LFT {

	public static double calcCelic(double taxa) {
		// TODO Auto-generated method stub
		double x = (taxa/100)+1;
		double w = 0.003968254;
		double y = Math.pow(x,w);
		return y-1;
	}

	public static double calcC(double... celic) {
		// TODO Auto-generated method stub
		return 1.000495624;
	}

}
