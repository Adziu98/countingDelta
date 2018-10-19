package pl.piechowicz.adam;

public class DeltaDesigns {
	
	public double countingDelta(double a, double b, double c) {
		double delta = b * b - (4 * a * c);
		return delta;
	}
	
	public double countingX0(double x, double y) {
		double x0 = (-y)/(x*x);
		return Math.round(x0);
	}
	
	public double countingX1(double x, double y, double z) {
		double delta = y * y - (4 * x * z);
		double x1 = (-y - Math.sqrt(delta))/(2*x);
		return x1;
	}
	
	public double countingX2(double x, double y, double z) {
		double delta = y * y - (4 * x * z);
		double x2 = (-y + Math.sqrt(delta))/(x*x);
		return x2;
	}
}
