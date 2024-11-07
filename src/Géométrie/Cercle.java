package Géométrie;

public class Cercle extends Forme implements Transformable {
	double rayon; 
	double facteur;
	
	public Cercle(double rayon) {
		this.rayon = rayon;
		
	}

	

	@Override
	public double calculerAire() {
		return Math.PI *(Math.pow(rayon, 2));
	}

	@Override
	public double calculerPerimetre() {
		return 2 * Math.PI*rayon;
	}

	@Override
	public void agrandir() {
		// TODO Auto-generated method stub
		this.rayon *= facteur;
	}



	@Override
	public void reduire() {
		// TODO Auto-generated method stub
		this.rayon /= facteur; 
	}

	
	
}
