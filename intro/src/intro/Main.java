package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world !");
		
		String ortaMetin = "Ilginizi cekebilir";
		String altMetin = "Vade S�resi";
		
		System.out.println(ortaMetin);
		
		int vade = 12;
		
		double dolarD�n = 17.85;
		double dolarBug�n = 17.6;		
		boolean dolarDustuMu = false;
		
		if(dolarBug�n < dolarD�n) {
			dolarDustuMu = true;
		}
		
		if(dolarDustuMu) {
			System.out.println("Dolar d�st�.");
		}
		else {
			System.out.println("Dolar y�kseldi.");
		}

	}

}
