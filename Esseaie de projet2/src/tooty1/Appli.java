package tooty1;

import java.util.Scanner;

public class Appli {
	public static void main(String[] args) {
		boolean game = true;
		PaquetDeCartes p = new PaquetDeCartes();
		p.ajouterCartes();
		p.melangerCartes();
		int calc = 0;
		
		PaquetDeCarreaux ca = new PaquetDeCarreaux();
		ca.cr�erCarreau();
		//ca.getTile();
		
		
		System.out.println("---------Game Start---------");
		Mur m = new Mur();
		m.Start();
		Scanner scan = new Scanner(System.in);
		for(;game;) {
			m.verify();
			m.stamp();
			p.getValue(calc);
			p.comparer(ca,calc);
			++calc;
			/*System.out.println("�������°���ִ�в���:");
			System.out.println("A: �鿨");
			System.out.println("B: ��ʾ��Ϸ����");
			System.out.println("C: ������Ϸ");*/
			if(scan.hasNextLine()) {
				String in = scan.nextLine();
				String[] str = in.split(" ");
				
				/*switch(in) {
				case "A":
					if(calc < 33) {
						p.getValue(calc);
						p.comparer(ca,calc);
						++calc;
					}else {
						game = false;
						System.out.println("��Ƭ������,��Ϸ����");
					}
					break;
				case "B":
					m.verify();
					m.stamp();
					break;
				case "C":
					game = false;
					break;
				default:
					System.out.println("�����������г�����Ч����");
				}*/
			
			}
		}
		scan.close();		
		System.out.println("---------E N D---------");
		
		
	}
	
}
