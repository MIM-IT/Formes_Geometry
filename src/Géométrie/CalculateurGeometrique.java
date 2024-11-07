package Géométrie;

import java.util.ArrayList;

public class CalculateurGeometrique extends Polygone {
	
	public CalculateurGeometrique(int nombreCote) {
		super(nombreCote);
		
	}

	ArrayList<Forme> formes = new ArrayList<>();

	@Override
	public double calculerAire() {
		// TODO Auto-generated method stub
		return nombreCote;
	}

	@Override
	public double calculerPerimetre() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

	
}
