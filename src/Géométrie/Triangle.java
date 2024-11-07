package Géométrie;

public  class Triangle extends Forme implements Transformable {
	
	double coteA; 
	double coteB; 
	double coteC; 
	double facteur;
	
	public  Triangle(double coteA,double coteB,double coteC) {
		this.coteA = coteA;
		this.coteB = coteB; 
		this.coteC = coteC;
		
		
	}
	
	public Triangle(double a) {
		this(a,a,a);
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

	@Override
	public void  agrandir() {
		this.coteA *= facteur;
		this.coteB *= facteur; 
		this.coteC *= facteur; 
		
	}

	@Override
	public void reduire() {
		this.coteA /= facteur;
		this.coteB /= facteur; 
		this.coteC /= facteur; 
	}
	
	
	
}
