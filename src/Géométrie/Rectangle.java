package Géométrie;

public class Rectangle extends Forme implements Transformable  {
	double longueur; 
	double largeur;
	double facteur; 
	//String type;
	
	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur; 
		this.largeur = largeur; 
		
	}
	


	@Override
	public double calculerAire() {
		
		return longueur * largeur;
	}
	@Override
	public double calculerPerimetre() {
		
		return calculerAire()*2;
	}

	@Override
	public void agrandir() {
		// TODO Auto-generated method stub
		this.largeur *= facteur; 
		this.longueur *= facteur; 
	}

	@Override
	public void reduire() {
		// TODO Auto-generated method stub
		this.longueur /= facteur; 
		this.largeur /= facteur; 
		
	}
	
	
}
