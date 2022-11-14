package personnages;

public class Humain {
	protected String nom;
	private String boisson;
	private int argent;
	
	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}
	
	
	public String getNom() {
		return nom;
	}
	
	public String getBoisson() {
		return boisson;
	}
	
	public int getArgent() {
		return argent;
		
	}
	
	public void parler(String text) {
		System.out.println(text);
	}
	
	public void direBonjour() {
		String phrase = "Bonjour ! Je m'appelle" + getNom() + "et j'aime boire du " + getBoisson();
		parler(phrase);
	}
	
	public void boire() {
		String phrase = "Mmmm, un bon verre de " + getBoisson() + "!  GLOUPS !";
		parler (phrase);
	
	}
	
	public void perdreArgent(int perte) {
		argent -= perte;
		
	}
	
	public void gagnerArgent(int gain) {
		argent += gain;
		
	}
	
	public void acheter(String bien, int prix) {
		int money = getArgent();
		if (money > prix) {
			String phrase = "J'ai " + getArgent() + " sous en poche. Je vais pouvoir m'offrir " + bien + " a " + prix + " sous";
			parler(phrase);
		}
		else{
			String phrase = "Je n'ai plus que " + getArgent() + " sous en poche. Je ne peux meme pas m'offrir " + bien + " a " + prix + " sous";			
			parler(phrase);
		}
		
		perdreArgent(prix);
		
	} 
	
}

