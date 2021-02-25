package tooty1;

import java.util.ArrayList;
import java.util.Collections;

import tooty1.Couleur.Color;
import tooty1.Taille.Size;

public class PaquetDeCartes {
	private static final int NombreCouleur = 9;
	private static final int NombreTaille = 5;
	ArrayList<Carte> cartes = new ArrayList<Carte>();
	
   
    
	public void ajouterCartes() {
		for(int i = 0; i < NombreTaille; i++) {
			cartes.add(new Carte(Color.UNKNOWN,Size.TAILLE1));
			cartes.add(new Carte(Color.UNKNOWN,Size.TAILLE2));
			cartes.add(new Carte(Color.UNKNOWN,Size.TAILLE3));
		}

		for(int j = 0; j < NombreCouleur; j++) {
			cartes.add(new Carte(Color.BLUE,Size.UNKNOWN));
			cartes.add(new Carte(Color.RED,Size.UNKNOWN));
		}
	}
		
	public void melangerCartes() {
        Collections.shuffle(cartes);
	}
	
	public void getValue(int i) {
		if(cartes.get(i).Taille == Size.UNKNOWN){
			System.out.println(cartes.get(i).Couleur + "--" + i);
		}
		else {
			System.out.println(cartes.get(i).Taille  + "--"+ i);
		}
		
		/*for(int i=0; i<cartes.size();++i) {
			if(cartes.get(i).Taille == Size.UNKNOWN){
				System.out.println(cartes.get(i).Couleur + "--" + i);
			}
			else {
				System.out.println(cartes.get(i).Taille  + "--"+ i);
			}
		}*/
	}
	
	public void comparer(PaquetDeCarreaux pdc, int n) {
		Color c = cartes.get(n).Couleur;
		Size s = cartes.get(n).Taille;
		String s1 = new String();
		String s2 = new String();
		String s3 = new String();
		ArrayList<Character> tile1 = new ArrayList<Character>();
		ArrayList<Character> tile2 = new ArrayList<Character>();
		Collections.addAll(tile1,'a','b','c','d','e','f','g','h','i');
		Collections.addAll(tile2,'A','B','C','D','E','F','G','H','I');
		//System.out.println(pdc.carreaux.size());
		//System.out.println("test1: " + c + "--" + s);
		if(c == Color.UNKNOWN) {
			switch(s){
			case TAILLE1:
				//System.out.println("enter1");
				for(int i = 0; i <  pdc.carreaux.size(); ++i) {
					//System.out.println("enter1-1" + pdc.carreaux.get(i).getHauteur() + " - " + pdc.carreaux.get(i).getLongeur());
					if(pdc.carreaux.get(i).getHauteur() == 1 || pdc.carreaux.get(i).getLongeur() == 1) {
						s1 = pdc.carreaux.get(i).getCarreaux(s1,1);
						s2 = pdc.carreaux.get(i).getCarreaux(s2,2);
						s3 = pdc.carreaux.get(i).getCarreaux(s3,3);
					}
				}
				break;
			case TAILLE2:
				//System.out.println("enter2");
				for(int i = 0; i <  pdc.carreaux.size(); ++i) {
					//System.out.println("enter2-1" + pdc.carreaux.get(i).getHauteur() + " - " + pdc.carreaux.get(i).getLongeur());
					if(pdc.carreaux.get(i).getHauteur() == 2 || pdc.carreaux.get(i).getLongeur() == 2){
						s1 = pdc.carreaux.get(i).getCarreaux(s1,1);
						s2 = pdc.carreaux.get(i).getCarreaux(s2,2);
						s3 = pdc.carreaux.get(i).getCarreaux(s3,3);
					}
				}
				break;
			case TAILLE3:
				//System.out.println("enter3");
				for(int i = 0; i <  pdc.carreaux.size(); ++i) {
					//System.out.println("enter3-1" + pdc.carreaux.get(i).getHauteur() + " - " + pdc.carreaux.get(i).getLongeur());
					if(pdc.carreaux.get(i).getHauteur() == 3 || pdc.carreaux.get(i).getLongeur() == 3) {
						s1 = pdc.carreaux.get(i).getCarreaux(s1,1);
						s2 = pdc.carreaux.get(i).getCarreaux(s2,2);
						s3 = pdc.carreaux.get(i).getCarreaux(s3,3);
					}
				}
				break;
			default:
				//System.out.println("taille isnt 1,2,3");
			}
		}else {
			if (c == Color.BLUE) {
				for(int i = 0; i <  pdc.carreaux.size(); ++i) {
					//System.out.println("enter1-1" + pdc.carreaux.get(i).getHauteur() + " - " + pdc.carreaux.get(i).getLongeur());
					if(tile1.contains(pdc.carreaux.get(i).getLettre())) {
						s1 = pdc.carreaux.get(i).getCarreaux(s1,1);
						s2 = pdc.carreaux.get(i).getCarreaux(s2,2);
						s3 = pdc.carreaux.get(i).getCarreaux(s3,3);
					}else {
						return;
					}
				}
			}else {
				for(int i = 0; i <  pdc.carreaux.size(); ++i) {
					//System.out.println("enter1-1" + pdc.carreaux.get(i).getHauteur() + " - " + pdc.carreaux.get(i).getLongeur());
					if(tile2.contains(pdc.carreaux.get(i).getLettre())) {
						s1 = pdc.carreaux.get(i).getCarreaux(s1,1);
						s2 = pdc.carreaux.get(i).getCarreaux(s2,2);
						s3 = pdc.carreaux.get(i).getCarreaux(s3,3);
					}else {
						return;
					}
				}
			}
		}

		System.out.println(s3);
		System.out.println(s2);
		System.out.println(s1);
	}
}
