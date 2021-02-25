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
		ca.cr閑rCarreau();
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
			/*System.out.println("输入以下按键执行操作:");
			System.out.println("A: 抽卡");
			System.out.println("B: 显示游戏画面");
			System.out.println("C: 结束游戏");*/
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
						System.out.println("卡片已用完,游戏结束");
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
					System.out.println("请输入上面列出的有效按键");
				}*/
			
			}
		}
		scan.close();		
		System.out.println("---------E N D---------");
		
		
	}
	
}
