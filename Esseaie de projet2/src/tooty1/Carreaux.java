package tooty1;

public class Carreaux {
	private int LONGEUR;
	private int HAUTEUR;
	private char lettre;
	private char[][] carreau;
	
	
	public Carreaux(int longeur, int hauteur, char a){
		this.LONGEUR = longeur;
		this.HAUTEUR = hauteur;
		this.lettre = a;
		this.carreau = new char[this.HAUTEUR][this.LONGEUR];
		for(int i = 0; i< this.HAUTEUR;i++) {
			for(int j = 0; j<this.LONGEUR; j++) {
				this.carreau[i][j] = this.lettre;
			}
		}
	}
	
	/*public cr¨¦erCarreau() {
		carreau = new char[this.LONGEUR][this.HAUTEUR];
		for(int i = 0; i< this.LONGEUR;i++) {
			for(int j = 0; j<this.HAUTEUR; j++) {
				carreau[i][j] = lettre;
			}
		}
	}*/
	
	public String getCarreaux(String s, int n){
		if(n > this.HAUTEUR) {
			for(int i = 0; i < this.carreau[0].length; ++i){
				s += " ";
			}
		}else {
			for(int i = 0; i < this.carreau[0].length; ++i){
				s += this.carreau[n-1][i];
			}
		}
		s += " ";
		return s;
	}
	
	public int getLongeur() {
		return this.LONGEUR;
	}
	
	public int getHauteur() {
		return this.HAUTEUR;
	}
	
	public char getLettre() {
		return this.lettre;
	}
	
	
	
	
}
