package Géométrie;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Forme> forme = new ArrayList <Forme>(); 
		
		forme.add(new Rectangle(5.0,3.0));
		forme.add(new Triangle(3.0,3.0,3.0));
		forme.add(new Cercle(5.123));
		forme.add(new TriangleEquilate(3.0));
		
		for( Forme fff : forme ) {
			
			String f1 = String.format("Forme : %s", fff.getClass().getSimpleName());
			String f2 = String.format("Aire : %.2f ", fff.calculerAire());
			String f3 = String.format("Périmètre : %.2f ", fff.calculerPerimetre());
			
			System.out.println(f1 );
			System.out.println(f2);
			System.out.println(f3);
			System.out.println("\n");
		}
	}

}
