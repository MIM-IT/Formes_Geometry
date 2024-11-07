package Géométrie;

public class TriangleEquilate extends Triangle {

	public TriangleEquilate(double a) {
		super(a);
		
	}
	@Override
	public double calculerAire() {
		
		double s = 	(coteA + coteB + coteC)/2;
		double aire = Math.sqrt(s * (s-coteA) * (s-coteB) * (s-coteC));
		return aire; 
	}

	@Override
	public double calculerPerimetre() {
		
		return coteA + coteB + coteC ;
	}

}
