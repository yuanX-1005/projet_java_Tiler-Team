package tooty1;

import java.util.ArrayList;

public class PaquetDeCarreaux {
	ArrayList<Carreaux> carreaux  = new ArrayList<Carreaux>();
	
	public PaquetDeCarreaux(){
	}
	
	public void créerCarreau() {
		carreaux.add(new Carreaux(1,1,'a'));
		carreaux.add(new Carreaux(2,1,'b'));
		carreaux.add(new Carreaux(1,2,'c'));
		carreaux.add(new Carreaux(2,2,'d'));
		carreaux.add(new Carreaux(3,1,'e'));
		carreaux.add(new Carreaux(1,3,'f'));
		carreaux.add(new Carreaux(3,2,'g'));
		carreaux.add(new Carreaux(2,3,'h'));
		carreaux.add(new Carreaux(3,3,'i'));
		carreaux.add(new Carreaux(1,1,'A'));
		carreaux.add(new Carreaux(2,1,'B'));
		carreaux.add(new Carreaux(1,2,'C'));
		carreaux.add(new Carreaux(2,2,'D'));
		carreaux.add(new Carreaux(3,1,'E'));
		carreaux.add(new Carreaux(1,3,'F'));
		carreaux.add(new Carreaux(3,2,'G'));
		carreaux.add(new Carreaux(2,3,'H'));
		carreaux.add(new Carreaux(3,3,'I'));
		//System.out.print("=");
		//System.out.println(2+2+3+3+2+4+3+4+4+2+3+3+2+4+3+4+2+3+3);
	}
	
	public void getTile() {
		for(int i = 0; i<carreaux.size();++i) {
			carreaux.get(i).getCarreaux(); 
		}
	}
	

	
	
}
