package tooty1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class Mur {
	private static final int Colonnes = 5;
	private static final int Lignes = 20;
	private static final String Casedefaut = "";
	ArrayList<ArrayList> carreaux  = new ArrayList<ArrayList>();
	
		public Mur() {
			carreaux.add(new ArrayList<String>());
			carreaux.get(0).add(" ");
			for(int i = 1; i < 6; ++i) {
				carreaux.add(new ArrayList<String>());
				carreaux.get(i).add(i+"");
			}
		}
		
		public void stamp() {
			for(int i = 0; i < 6; ++i) {
				Collections.reverse(carreaux.get(i));
			}
			Iterator<String> it0 = carreaux.get(0).iterator();
			Iterator<String> it1 = carreaux.get(1).iterator();
			Iterator<String> it2 = carreaux.get(2).iterator();
			Iterator<String> it3 = carreaux.get(3).iterator();
			Iterator<String> it4 = carreaux.get(4).iterator();
			Iterator<String> it5 = carreaux.get(5).iterator();
			/*System.out.println(carreaux.get(0));//试验用,之后删除
			System.out.println(carreaux.get(1));
			System.out.println(carreaux.get(2));
			System.out.println(carreaux.get(3));
			System.out.println(carreaux.get(4));
			System.out.println(carreaux.get(5));
			System.out.println(it0.hasNext());	//到这里为止*/
			System.out.println("-----------");
			for(; it0.hasNext();) {
				System.out.print(it0.next()+" ");
				System.out.print(it1.next()+" ");
				System.out.print(it2.next()+" ");
				System.out.print(it3.next()+" ");
				System.out.print(it4.next()+" ");
				System.out.print(it5.next()+" ");
				System.out.println();
			}
			System.out.println("-----------");
			for(int i = 0; i < 6; ++i) {
				Collections.reverse(carreaux.get(i));
			}
		}
		
		
		public void Start() {
			Random r = new Random();
			int num = r.nextInt(4)+1;
			switch(num) {
			case 1:
				carreaux.get(1).add("x");
				carreaux.get(2).add("x");
				carreaux.get(3).add("x");
				for(int i = 0; i < 2; ++i)carreaux.get(0).add(i+1+"");				
				break;
			case 2:
				carreaux.get(1).add("x");
				carreaux.get(1).add("x");
				carreaux.get(1).add("x");
				for(int i = 0; i < 4; ++i)carreaux.get(0).add(i+1+"");
				break;
			case 3:
				carreaux.get(3).add("x");
				carreaux.get(4).add("x");
				carreaux.get(5).add("x");
				for(int i = 0; i < 2; ++i)carreaux.get(0).add(i+1+"");
				break;
			case 4:
				carreaux.get(5).add("x");
				carreaux.get(5).add("x");
				carreaux.get(5).add("x");
				for(int i = 0; i < 4; ++i)carreaux.get(0).add(i+1+"");
				break;
			default:;
			}
		}
		
		public void verify() {
			ArrayList<Integer> sizeOfCarreaux = new ArrayList<Integer>();
			for(ArrayList i: carreaux)sizeOfCarreaux.add(i.size());
			Collections.sort(sizeOfCarreaux);
			int diff = sizeOfCarreaux.get(sizeOfCarreaux.size()-1) - sizeOfCarreaux.get(0);
			if(diff!=0)
				for(ArrayList i: carreaux)
					for(;i.size()<sizeOfCarreaux.get(sizeOfCarreaux.size()-1);)
						i.add(" ");
		}
	
	
	
}
