package diginamic;

public class DeclarationApp {
	public static void main(String[] args) {
		byte b=1;
		short s=2;
		int nb=45;
		long l =100000;
		float f =5.5F;
		double d  =4455.255D;
		char c='é';
		boolean bool = true;
		String string="toto";
		
		System.out.println(d);
		
		String randomString="Voici le resultat d'un caclul : 1+5=6\n"+6;
		System.out.println(randomString);
		
		String [] tabStrings= {"toto","tata","java"};
		//construction
		for(int i=0; i<tabStrings.length;i++) {

			System.out.println(tabStrings[i]);
		}
		
	}
}
