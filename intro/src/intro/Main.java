package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world !");
		
		String ortaMetin = "Ilginizi cekebilir";
		String altMetin = "Vade Süresi";
		
		System.out.println(ortaMetin);
		
		int vade = 12;
		
		double dolarDün = 17.85;
		double dolarBugün = 17.6;		
		boolean dolarDustuMu = false;
		
		if(dolarBugün < dolarDün) {
			dolarDustuMu = true;
		}
		
		if(dolarDustuMu) {
			System.out.println("Dolar düstü.");
		}
		else {
			System.out.println("Dolar yükseldi.");
		}

	}

}
